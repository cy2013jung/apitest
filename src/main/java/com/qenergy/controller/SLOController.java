package com.qenergy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.json.JSONObject;
import com.qenergy.services.SLOService;

@RestController
public class SLOController {

	@Autowired
	private SLOService sLOService;
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseBody
	public String getJSON(@RequestBody String id) throws Exception {

		JSONObject jsonObject = new JSONObject(id);
		String userId = jsonObject.getString("id");

		String slo_p_ota = sLOService.getOtaKey(userId);
		
		String userInfo = sLOService.getUserInfo(userId, slo_p_ota);
		
		return userInfo;
	}
}