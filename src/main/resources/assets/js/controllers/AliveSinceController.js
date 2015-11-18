'use strict';

aliveSinceApp.controller('AliveSinceController',
    function AliveSinceController($scope, aliveSinceData) {

        $scope.handleChange = function() {
            if (!angular.isDate($scope.dt)) {
              return;
            }

            var date = $scope.dt;
            var year = date.getFullYear();

            // Date.getMonth() returns zero-based value (where zero indicates the first month of the year).
            // The service expects the first month of the year as 1
            var month = date.getMonth()+1;
            var day = date.getDate();

            aliveSinceData.getAliveSince(year, month, day, function(data) {
                $scope.aliveSince = data;
            });
          };

        $scope.dt = new Date();

        $scope.handleChange();
    }
);