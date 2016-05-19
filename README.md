# basic_mgwt

## Step 1: Create a Cordova app
```sh
$ ./cordova-app.sh  // Create a Cordovar app
```

## Step 2: Compile Java to Javascript

```sh
$ ./compile-apk.sh  // Compile Java code to Javascript code, Copy js, css, from GWT to Cordova
```

## Step 3: Config index.html file in Cordova app

- import all css file to www/index.html
- import all css file to www/index.html
- import file nocache.js to www/index.html
- remove : in www/index.html remove line below

```html
  <meta http-equiv="Content-Security-Policy" content="default-src 'self' data: gap: https://ssl.gstatic.com 'unsafe-eval'; style-src 'self' 'unsafe-inline'; media-src *">
```

## Step 4: Test
- run 

```sh
$ cd ../www
$ php -S localhost:8000
```

- Go to 'localhost:8000' if everything ok that mean Cordovar is OK.
