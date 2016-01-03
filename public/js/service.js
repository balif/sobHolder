'use strict';

App.factory('Service', [ '$http', '$q', function($http, $q) {

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
		}

	};

} ]);
