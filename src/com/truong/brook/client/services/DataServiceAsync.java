package com.truong.brook.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;


public interface DataServiceAsync {
  void testConectToServer(AsyncCallback<String> callback);
}
