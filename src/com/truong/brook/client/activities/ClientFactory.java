package com.truong.brook.client.activities;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.truong.brook.client.activities.basic.BasicView;
import com.truong.brook.client.activities.home.HomeView;

public interface ClientFactory {
	PlaceController getPlaceController();

	EventBus getEventBus();

	BasicView getBasicView();
	
	HomeView getHomeView();
}
