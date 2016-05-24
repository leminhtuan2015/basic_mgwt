package com.truong.brook.server.services;

import com.truong.brook.client.services.DataService;
import com.truong.brook.server.CustomRemoteServiceServlet;

public class DataServiceImpl extends CustomRemoteServiceServlet implements DataService{

	private static final long serialVersionUID = 1L;
	
	public DataServiceImpl() {}

	@Override
	public String testConectToServer() {
	  return "Connect server success!";
	}
}