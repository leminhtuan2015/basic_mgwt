package com.truong.brook.client.activities.home;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.truong.brook.client.Brook;
import com.truong.brook.client.activities.ClientFactory;
import com.truong.brook.client.activities.basic.BasicActivity;
import com.truong.brook.client.sliding.SlidingPanel;
import com.truong.brook.client.view.Toaster;

public class HomeActivity extends BasicActivity {

	private HomeView view;
	private boolean exitApp = false;
	private Timer exitAppTimer = new Timer() {

		@Override
		public void run() {
			exitApp = false;
		}
	};

	public HomeActivity(ClientFactory clientFactory, Place place) {
		super(clientFactory, place);
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		view = clientFactory.getHomeView();
		super.start(panel, eventBus, view);
		panel.setWidget(view);
		view.genStream("http://storage.googleapis.com/kstest-asia/xxx.mp3");
	}

	@Override
	protected void bind() {
		super.bind();
	}

	@Override
	protected void loadData() {
	}

	@Override
	protected void onBackButtonPressed() {
		if (SlidingPanel.hideSliding()) {
			return;
		}
		askToExitApp();
	}

	private void askToExitApp() {
		if (exitApp) {
			Brook.phoneGap.exitApp();
		} else {
			Toaster.showToast("Tap back again to exit", false, 3);
		}
		exitApp = !exitApp;
		exitAppTimer.schedule(3000);
	}
}
