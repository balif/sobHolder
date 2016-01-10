'use strict';

App.factory('Service', [ '$http', '$q','$resource', function($http, $q,$resource) {

	return {

		findUserById : function(id) {
			return $http.get('../heroC/' + id).then(function(response) {
				return response.data;
			}, function(errResponse) {
				console.error('Hero donst exist');
				return $q.reject(errResponse);
			});
		},

//		findUserByName : function(name) {
//			return $http.get('../hero/' + name).then(function(response) {
//				return response.data;
//			}, function(errResponse) {
//				console.error('Hero donst exist');
//				return $q.reject(errResponse);
//			});
//		},

		listHeroes : function() {
			return $http.get('../heroes').then(function(response) {
				return response.data;
			});
		},
		
		heroPost : function(hero) {
			return $http.post('../heroC',hero).then(function(response) {
				return response.data;
			}, function(errResponse) {
				console.error('Hero donst exist');
				return $q.reject(errResponse);
			});
		},
		
		heroResource : function(){
			return $resource("../heroC");
		}

	};

} ]);
