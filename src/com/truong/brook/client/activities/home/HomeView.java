package com.truong.brook.client.activities.home;

import com.truong.brook.client.activities.basic.BasicView;
import com.google.gwt.event.dom.client.HasClickHandlers;

public interface HomeView extends BasicView{
	void genStream(String url);
	HasClickHandlers getBtnTestConect();
}
