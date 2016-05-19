package com.truong.brook.client.activities.home;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.truong.brook.client.Brook;
import com.truong.brook.client.ClientUtils;
import com.truong.brook.client.activities.basic.BasicViewImpl;

public class HomeViewImpl extends BasicViewImpl implements HomeView{
	private static HomeViewImplUiBinder uiBinder = GWT
			.create(HomeViewImplUiBinder.class);
	
	interface HomeViewImplUiBinder extends UiBinder<Widget, HomeViewImpl> {
	}
	@UiField protected FlowPanel homeViewPanel;
	@UiField protected VerticalPanel containerPanel;
	
	public HomeViewImpl() {	
		super();
		this.layout.getScrollPanel().setWidget(uiBinder.createAndBindUi(this));
		this.layout.getHeaderPanel().getBackButton().setVisible(false);
		layout.getScrollPanel().refresh();
	}
	
	@Override
	public void refreshView() {
		super.refreshView();
		layout.getScrollPanel().scrollTo(0, 0);
	}

	@Override
	public void genStream(String url) {
		Brook.getAudioPlayer().initAudio(url, ClientUtils.getScreenWidth());
		if(Brook.getAudioPlayer().isWidget() != null){
			containerPanel.add(Brook.getAudioPlayer().isWidget());
			containerPanel.setCellVerticalAlignment(Brook.getAudioPlayer().isWidget(), HasVerticalAlignment.ALIGN_MIDDLE);
			containerPanel.setCellHorizontalAlignment(Brook.getAudioPlayer().isWidget(), HasHorizontalAlignment.ALIGN_CENTER);
		}
	}
}
