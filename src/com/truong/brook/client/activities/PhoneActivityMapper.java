package com.truong.brook.client.activities;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.truong.brook.client.activities.home.HomeActivity;
import com.truong.brook.client.activities.home.HomePlace;

public class PhoneActivityMapper implements ActivityMapper {
	
	private ClientFactory clientFactory;
	
	public PhoneActivityMapper(ClientFactory clientFactory){
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(Place place) {
		if (place instanceof HomePlace)
			return new HomeActivity(clientFactory, place);
		return null;
	}
}
