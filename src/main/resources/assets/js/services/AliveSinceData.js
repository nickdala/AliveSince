'use strinct';

aliveSinceApp.factory('aliveSinceData', function($http, $log) {
    return {
        getAliveSince: function(year, month, day, successCallback) {
            var url = '/AliveSince?birthYear=' + year + '&birthMonth=' + month + '&birthDay=' +day;
            $http({
                    method: 'GET',
                    url: url
                 }).success(function(data) {
                    successCallback(data);
                 }).error(function(data, status, headers, config) {
                    $log.warn(data, status, headers, config);
                 });
        }
    }
});