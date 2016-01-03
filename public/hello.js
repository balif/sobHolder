function Hello($scope, $http) {
    $http.get('http://localhost:9000/hero/sherif').
        success(function(data) {
            $scope.greeting = data;
        });
}