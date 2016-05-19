package com.truong.brook.client.activities.basic;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.truong.brook.client.activities.basic.BasicViewImpl.Layout;

public interface BasicView extends IsWidget{
	Layout getLayout();
	FlowPanel getContentPanel();
	void refreshView();
	int getViewId();

}
