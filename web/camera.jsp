<%-- 
    Document   : camera
    Created on : May 6, 2020, 9:06:04 AM
    Author     : India
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
   
<head>
  <meta charset="utf-8">
  <title>HTML5 Demo: getUserMedia </title>
  <link rel="stylesheet" href="style.css">
   <link href="Css/cam.css" rel="stylesheet" type="text/css"/>
  
   
</head>
<body>
 <!-- The buttons to control the stream -->
<div class="button-group">
    <button id="btn-start" type="button" class="button">Start Streaming</button>
    <button id="btn-stop" type="button" class="button">Stop Streaming</button>
    <button id="btn-capture" type="button" class="button">Capture Image</button>
  </div>
  <!--ek min ruk jaa office call start ho gye hai ok-->
  <!-- Video Element & Canvas -->
  <div class="play-area">
    <div class="play-area-sub">
      <h3>The Stream</h3>
      <video id="stream" width="320" height="240"></video>
    </div>
    <div class="play-area-sub">
      <h3>The Capture</h3>
      <canvas id="capture" width="320" height="240"></canvas>
      <div id="snapshot"></div>
    </div>
  </div>
  <script src="jsphoto.js"></script>
</body>
</html>