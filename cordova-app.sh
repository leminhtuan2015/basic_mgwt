#!/bin/bash
source ./env

cd $CORDOVA_PATH
cordova create $CORDOVA_PROJECT_NAME $CORDOVAR_PROJECT_PACKAGE
cd $CORDOVA_PROJECT_NAME
cordova platform add android
cordova platform add ios
cordova build
cordova plugin add https://github.com/apache/cordova-plugin-console.git
cordova plugin add https://github.com/apache/cordova-plugin-device.git
cordova plugin add https://github.com/EddyVerbruggen/Toast-PhoneGap-Plugin.git
cordova plugin add https://git-wip-us.apache.org/repos/asf/cordova-plugin-vibration.git
cordova plugin add https://git-wip-us.apache.org/repos/asf/cordova-plugin-network-information.git
cordova plugin add https://github.com/brodysoft/Cordova-SQLitePlugin.git
cordova plugin add https://github.com/phonegap-build/PushPlugin.git
cordova plugin add https://github.com/apache/cordova-plugin-file.git
cordova plugin add https://github.com/apache/cordova-plugin-file-transfer.git
cordova plugin add https://github.com/apache/cordova-plugin-splashscreen.git
cordova plugin add https://github.com/katzer/cordova-plugin-local-notifications.git
