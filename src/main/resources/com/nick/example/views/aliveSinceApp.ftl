<!doctype html>
<html lang="en" ng-app="aliveSinceApp">
<head>
    <meta charset="utf-8">
    <title>Alive Since</title>

    <link rel="stylesheet" href="/assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assets/css/app.css">


    <script src="/assets/lib/angular.min.js"></script>
    <!-- <script src="/assets/lib/angular.js"></script> -->
    <script src="/assets/lib/ui-bootstrap-tpls-0.14.3.min.js"></script>
    <script src="/assets/js/app.js"></script>
    <script src="/assets/js/controllers/AliveSinceController.js"></script>
    <script src="/assets/js/services/AliveSinceData.js"></script>
</head>
<body>
<div class="container">
    <div ng-controller="AliveSinceController">
        <h1>How long have you been alive for?</h1>
        <div>Are you curious to see how many years, months, or days you have been alive?</div>

        <h2>Select your birthday</h2>
        <div style="display:inline-block; min-height:290px;">
          <uib-datepicker ng-model="dt" show-weeks="false" class="well well-sm" ng-change="handleChange()"></uib-datepicker>
        </div>

        <pre>Your birthday is: <em>{{dt | date:'fullDate' }}</em></pre>

        <hr />

        <div><p><strong>Years alive:</stong> {{aliveSince.yearsAlive}}</p></div>
        <div><p><strong>Months alive:</stong> {{aliveSince.monthsAlive}}</p></div>
        <div><p><strong>Days alive:</stong> {{aliveSince.daysAlive}}</p></div>
    </div>
</div>
</body>
</html>