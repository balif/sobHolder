'use strict';

var sobControllers = angular.module('sobControllers', []);

sobControllers.controller('ControllerHeroView', [ '$location','$scope', 'Service', '$routeParams',
		function($location,$scope, service, $routeParams) {
	
			service.findUserById($routeParams.heroId).then(function(value) {
				$scope.postac = value;
			}, function(reason) {
				alert('findUserById error ' + reason);
			});
			
			this.editHero = function() {
				$location.path('heroEdit/'+$scope.postac.id);
			}
		}

		]);

sobControllers.controller('ControllerHeroEdit', [ '$scope', 'Service','$routeParams','$location',
		function($scope, service,$routeParams,$location) {
	
			this.create = function(hero) {
				var res = service.heroResource();				
				res.save(hero).$promise.then(function (){$location.path('hero/'+$scope.postac.id);});
				
			}
			
			 function get (id){
				var heroResp =  service.heroResource().get({id: id });					 
				heroResp.$promise.then(function (heroResp){ $scope.postac = heroResp; });
			}
			if($routeParams.heroId!=null){
			 get($routeParams.heroId);
			}
		} ]);

sobControllers.controller('ControllerHeroList', [ '$scope', 'Service', '$location',
		function($scope, service, $location) {
			console.log('ListController start');

			var heroesListVar = service.listHeroes().then(function(value) {
				$scope.heroesList = value;
			}, function(reason) {
				alert('listHeroes error ' + reason);
			});

			this.addHero = function() {
				$location.path('heroNew');
			}
		} ]);