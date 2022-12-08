package com.qenergy.services;

public interface SLOService {
	public String getOtaKey(String id) throws Exception;

	public String getUserInfo(String userId, String slo_p_ota) throws Exception;
}
