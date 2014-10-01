package com.tgx.sdk.push;

import android.content.res.Resources;

import com.tgx.push.sdk.R;

public final class PushSDK_Ext_R {
	public static Resources res;

	public static final class string {

		public static int pushsdk_call_number() {
			return R.string.pushsdk_call_number;
		}
		
		public static int pushsdk_close() {
			return R.string.pushsdk_close;
		}
		
		public static int pushsdk_delete() {
			return R.string.pushsdk_delete;
		}
		
		public static int pushsdk_pause() {
			return R.string.pushsdk_pause;
		}
		
		public static int pushsdk_resume() {
			return R.string.pushsdk_resume;
		}
		
		public static int pushsdk_retry() {
			return R.string.pushsdk_retry;
		}
		
		public static int pushsdk_network_error() {
			return R.string.pushsdk_network_error;
		}
		
		public static int pushsdk_internet_connections() {
			return R.string.pushsdk_internet_connections;
		}
		
		public static int pushsdk_download_complete() {
			return R.string.pushsdk_download_complete;
		}
		
		public static int pushsdk_download_completed() {
			return R.string.pushsdk_download_completed;
		}
		
		public static int pushsdk_download_error() {
			return R.string.pushsdk_download_error;
		}
		
		public static int pushsdk_wifi_only() {
			return R.string.pushsdk_wifi_only;
		}
		
	}

	public static final class drawable{
		
		public static int app_logo(){
			return R.drawable.ic_launcher;
		}
	}
	
	public static final class layout {

		public static int pushsdk_notification() {
			return R.layout.pushsdk_notification;
		}

		public static int pushsdk_notification_v11() {
			return R.layout.pushsdk_notification_v11;
		}

		public static int pushsdk_view(){
			return R.layout.pushsdk_view;
		}
		
		
		public static int pushsdk_download_manager() {
			return R.layout.pushsdk_download_manager;
		}
	}
	
	public static final class id
	{
		
		
		public static int progressBar() {
			return R.id.progressBar;
		}
		
		public static int webview() {
			return R.id.webview;
		}
		
		public static int title() {
			return R.id.title;
		}
		
		public static int text() {
			return R.id.text;
		}
		
		public static int banner() {
			return R.id.banner;
		}
		
		public static int icon_v11() {
			return R.id.icon_v11;
		}
		
		public static int title_v11() {
			return R.id.title_v11;
		}
		
		public static int text_v11() {
			return R.id.text_v11;
		}
		
		public static int icon() {
			return R.id.icon;
		}
		
		public static int pushsdk_download_manager_name() {
			return R.id.pushsdk_download_manager_name;
		}
		
		public static int pushsdk_download_manager_progressbar() {
			return R.id.pushsdk_download_manager_progressbar;
		}
		
		public static int pushsdk_download_manager_info() {
			return R.id.pushsdk_download_manager_info;
		}
		
		public static int pushsdk_download_manager_size() {
			return R.id.pushsdk_download_manager_size;
		}
		
		public static int pushsdk_webviewLayout() {
			return R.id.webviewLayout;
		}
	}
	
	public static final class style
	{
		public static int PushSdk_Dialog() {
			return R.style.PushSdk_Dialog;
		}
		public static int PushSdk_Theme_Dialog() {
			return R.style.PushSdk_Theme_Dialog;
		}
	}
}
