'use strict';

var sobControllers = angular.module('sobControllers', []);

sobControllers.controller('Controller', [ '$scope', 'Service', '$routeParams',
		function($scope, service, $routeParams) {
			service.findUserById($routeParams.heroId).then(function(value) {
				$scope.postac = value;
			}, function(reason) {
				alert('findUserById error ' + reason);
			});
		} ]);

sobControllers.controller('ListController', [ '$scope', 'Service',
		function($scope, service) {
			console.log('ListController start');

			var heroesListVar = service.listHeroes().then(function(value) {
				$scope.heroesList = value;
			}, function(reason) {
				alert('listHeroes error ' + reason);
			});

		} ]);