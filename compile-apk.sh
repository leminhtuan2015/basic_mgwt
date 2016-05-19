#!/bin/bash
echo "Begin"

source ./env

ant -f build.xml

echo "removing previous compiled folder"
rm -rf $CORDOVA_PATH/$CORDOVA_PROJECT_NAME/www/brook/*
rm -rf $CORDOVA_PATH/$CORDOVA_PROJECT_NAME/www/images/*

echo "creating target folder"
mkdir -p $CORDOVA_PATH/$CORDOVA_PROJECT_NAME/www/brook/
mkdir -p $CORDOVA_PATH/$CORDOVA_PROJECT_NAME/www/images/
mkdir -p $CORDOVA_PATH/$CORDOVA_PROJECT_NAME/www/stylesheets/
mkdir -p $CORDOVA_PATH/$CORDOVA_PROJECT_NAME/www/javascripts/

echo "copying newly compiled folder"
cp -r $GWT_PATH/$GWT_PROJECT_NAME/war/brook/* $CORDOVA_PATH/$CORDOVA_PROJECT_NAME/www/brook/
cp -r $GWT_PATH/$GWT_PROJECT_NAME/war/css/* $CORDOVA_PATH/$CORDOVA_PROJECT_NAME/www/stylesheets/
cp -r $GWT_PATH/$GWT_PROJECT_NAME/war/js/* $CORDOVA_PATH/$CORDOVA_PROJECT_NAME/www/javascripts/
cp -r $GWT_PATH/$GWT_PROJECT_NAME/war/images/* $CORDOVA_PATH/$CORDOVA_PROJECT_NAME/www/images/

cd $CORDOVA_PATH/$CORDOVA_PROJECT_NAME
#cordova build android
#cordova build android --release
#adb uninstall com.quanh.basic
#adb install "$CORDOVA_PATH/$CORDOVA_PROJECT_NAME/platforms/android/build/outputs/apk/android-debug.apk"

cordova run android
echo "Done! enjoy result ^^"
