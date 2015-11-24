<!doctype html>
<html lang="en" ng-app="aliveSinceApp">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Alive Since</title>

    <script src="/assets/lib/angular.min.js"></script>
    <script src="/assets/lib/ui-bootstrap-tpls-0.14.3.min.js"></script>
    <script src="/assets/js/app.js"></script>
    <script src="/assets/js/controllers/AliveSinceController.js"></script>
    <script src="/assets/js/services/AliveSinceData.js"></script>

    <link rel="stylesheet" href="/assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assets/css/app.css">

</head>
<body>
<div role="main" ng-controller="AliveSinceController">
  <header class="bs-header text-center" id="overview">
    <div class="container">
        <h1>How long have you been alive for?</h1>
        <div>Are you curious to see how many years, months, or days you have been alive?</div>
    </div>
  </header>

  <div class="container">
    <section id="getting_started">
      <div class="page-header">
        <h2>Select your birthday</h2>
      </div>
      <div style="display:inline-block; min-height:290px;">
        <uib-datepicker ng-model="dt" show-weeks="false" class="well well-sm" ng-change="handleChange()"></uib-datepicker>
      </div>

      <pre>Your birthday is: <em>{{dt | date:'fullDate' }}</em></pre>

      <hr />

      <p><strong>Years alive:</strong> {{aliveSince.yearsAlive}}</p>
      <p><strong>Months alive:</strong> {{aliveSince.monthsAlive}}</p>
      <p><strong>Weeks alive:</strong> {{aliveSince.weeksAlive}}</p>
      <p><strong>Days alive:</strong> {{aliveSince.daysAlive}}</p>

    </section>
  </div>
</div>

<footer class="footer">
    <div class="container">
      <p>Developed by Nick and Steven Dalalelis.</p>
      <p>Source code on <a href="https://github.com/nickdala/AliveSince">github</a>.</p>
    </div>
</footer>

</body>
</html>