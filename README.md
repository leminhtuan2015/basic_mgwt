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

```html
<!DOCTYPE html>
<html>
    <head>
        <meta name="format-detection" content="telephone=no">
        <meta name="msapplication-tap-highlight" content="no">
        <meta name="viewport" content="user-scalable=no, initial-scale=1, maximum-scale=1, minimum-scale=1, width=device-width">
        <link rel="stylesheet" type="text/css" href="css/index.css">
        <link rel="stylesheet" type="text/css" href="stylesheets/index.css" />
        <link rel="stylesheet" type="text/css" href="stylesheets/animations.css" />
        <title>Hello World</title>
    </head>
    <body>
        <div class="app">
            <h1>Apache Cordova</h1>
            <div id="deviceready" class="blink">
                <p class="event listening">Connecting to Device</p>
                <p class="event received">Device is Ready</p>
            </div>
        </div>
        <script type="text/javascript" src="cordova.js"></script>
        <script type="text/javascript" src="js/index.js"></script>
        <script type="text/javascript" language="javascript" src="brook/brook.nocache.js"></script>
        <script type="text/javascript" src="javascripts/index.js"></script>
    </body>
</html>


```

## Step 4: Test
- run 

```sh
$ cd ../www
$ php -S localhost:8000
```

- Go to 'localhost:8000' if everything ok that mean Cordovar is OK.
