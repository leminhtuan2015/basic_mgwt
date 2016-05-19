function onBodyLoad() {
	 console.log("onBodyLoad");
    document.addEventListener("deviceready", onDeviceReady, false);
}

function onDeviceReady() {
    console.log("Device ready");
}

function splashShow() {
     navigator.splashscreen.show();
}

function splashHide() {
    navigator.splashscreen.hide();
}