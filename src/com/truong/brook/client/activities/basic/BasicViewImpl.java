package com.truong.brook.client.activities.basic;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.widget.panel.flex.RootFlexPanel;
import com.googlecode.mgwt.ui.client.widget.panel.scroll.ScrollEndEvent;
import com.googlecode.mgwt.ui.client.widget.panel.scroll.ScrollEndEvent.Handler;
import com.googlecode.mgwt.ui.client.widget.panel.scroll.ScrollPanel;
import com.truong.brook.client.view.BhHeaderPanel;

public class BasicViewImpl implements BasicView {
	private BasicViewImplUiBinder basicUiBinder = GWT
			.create(BasicViewImplUiBinder.class);

	interface BasicViewImplUiBinder extends UiBinder<Widget, Layout> {

	}
	
	protected final Layout layout;
	
	public static class Layout {
		private final BasicViewImpl basicView;
		@UiField
		protected RootFlexPanel mainPanel;
		@UiField
		protected BhHeaderPanel headerPanel;
		@UiField
		protected ScrollPanel scrollPanel;
		/**
		 * 
		 */
		public Layout(BasicViewImpl basicView) {
			this.basicView = basicView;
		}

		/**
		 * @return the mainPanel
		 */
		public RootFlexPanel getMainPanel() {
			return mainPanel;
		}

		/**
		 * @return the headerPanel
		 */
		public BhHeaderPanel getHeaderPanel() {
			return headerPanel;
		}

		/**
		 * @return the basicView
		 */
		public BasicViewImpl getBasicView() {
			return basicView;
		}

		public ScrollPanel getScrollPanel() {
			return scrollPanel;
		}
	}
	
	public BasicViewImpl() {
		this.layout = new Layout(this);
		basicUiBinder.createAndBindUi(this.layout);
		layout.getHeaderPanel().getBackButton().setVisible(false);
		this.layout.getScrollPanel().addScrollEndHandler(new Handler() {
			@Override
			public void onScrollEnd(ScrollEndEvent event) {
				layout.getScrollPanel().refresh();
			}
		});
	}

	@Override
	public Widget asWidget() {
		return layout.getMainPanel();
	}

	@Override
	public Layout getLayout() {
		return layout;
	}

	@Override
	public FlowPanel getContentPanel() {
		return null;
	}
	
	@Override
	public void refreshView() {
		
	}
	
	
	@Override
	public int getViewId() {
		return 0;
	}

}
