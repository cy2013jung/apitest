package com.qenergy.servicesImpl;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.rmi.RemoteException;
import java.util.Enumeration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.qenergy.services.SLOService;

import com.hanwha.neo.branch.common.sso.service.NeoSloWsProxy;
import hanwha.neo.slo.SLOCrypt4AES;

import com.hanwha.neo.branch.ss.org.service.NeoOrgWsProxy;
import com.hanwha.neo.branch.ss.org.vo.OrgUserVO;

@Service
public class SLOServiceImpl implements SLOService {

	private String WS_TARGET = "ERP";
	private String SEED = "1556889699646683";
	
	@Autowired
	JdbcTemplate template;
	
	@Override
	public String getOtaKey(String id) {
		// TODO Auto-generated method stub
		System.setProperty("org.apache.commons.logging.LogFactory", "org.apache.commons.logging.impl.LogFactoryImpl");
		

		String END_POINT = "http://qcells.circle.hanwha.com/api/ss/neoslo";
		String slo_p_ota = "";
		
		try {
			NeoSloWsProxy proxy = new NeoSloWsProxy();
			proxy.setEndpoint(END_POINT);
			String encUserInfo = SLOCrypt4AES.encrypt(id, SEED);

			slo_p_ota = proxy.create(encUserInfo, "A", WS_TARGET);
			
//			template.update("INSERT INTO customer(first_name, last_name) VALUES('Jane1', 'Smith2')");
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("=======================start====================" + slo_p_ota);
		return slo_p_ota;
	}

	@Override
	public String getUserInfo(String _userId, String slo_p_ota) {
		// TODO Auto-generated method stub
		System.setProperty("org.apache.commons.logging.LogFactory", "org.apache.commons.logging.impl.LogFactoryImpl");
		
		System.out.println("=======================start====================1");
		System.out.println("=======================start====================1" + getMyIP());
		String END_POINT = "http://qcells.circle.hanwha.com/api/ws/neoslo";
		System.out.println("=======================start====================2");
		NeoSloWsProxy proxy = new NeoSloWsProxy();
		proxy.setEndpoint(END_POINT);
		System.out.println("=======================start====================3");
		String userId = _userId;
		
		OrgUserVO[] orgUsers;
		
		try {System.out.println("=======================start====================4");
			NeoOrgWsProxy neoOrgWsProxy = new NeoOrgWsProxy();
			System.out.println("=======================start====================5"+userId);
			orgUsers = neoOrgWsProxy.searchUserByEmpolyeeNo(userId);
			System.out.println("=======================start====================6");
			OrgUserVO orgUser = orgUsers[0];
			
//			printUserInfoToString(orgUser);
			
			System.out.println("=======================success====================" + orgUser);
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	public String getMyIP() {


	    String ip = "";
	    try {
	        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
	        while (interfaces.hasMoreElements()) {
	            NetworkInterface iface = interfaces.nextElement();
	            // filters out 127.0.0.1 and inactive interfaces
	            if (iface.isLoopback() || !iface.isUp())
	                continue;

	            Enumeration<InetAddress> addresses = iface.getInetAddresses();
	            while(addresses.hasMoreElements()) {
	                InetAddress addr = addresses.nextElement();
	                ip = addr.getHostAddress();
	                System.out.println(iface.getDisplayName() + " " + ip);
	            }
	        }
	    } catch (SocketException e) {
	        throw new RuntimeException(e);
	    }
	    
	    return ip;
	}

}
