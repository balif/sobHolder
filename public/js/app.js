'use strict';

var App = angular
		.module('myApp', [ 'ngRoute', 'sobControllers', 'ngResource' ]);

App.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/list', {
		templateUrl : 'app/list.html',
		controller : 'ControllerHeroList',
		controllerAs : 'ctrl'
	}).when('/hero/:heroId', {
		templateUrl : 'app/hero.html',
		controller : 'ControllerHeroView',
		controllerAs : 'ctrl'
	}).when('/heroEdit/:heroId', {
		templateUrl : 'app/newHero.html',
		controller : 'ControllerHeroEdit',
		controllerAs : 'ctrl'
	}).when('/heroNew', {
		templateUrl : 'app/newHero.html',
		controller : 'ControllerHeroEdit',
		controllerAs : 'ctrl'
	}).otherwise({
		redirectTo : '/list'
	});
} ]);
