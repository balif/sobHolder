'use strict';

var App = angular.module('myApp',['ngRoute','sobControllers']);

App.config(['$routeProvider',
                    function($routeProvider) {
                      $routeProvider.
                        when('/list', {
                          templateUrl: 'app/list.html',
                          controller: 'ListController'
                        }).when('/hero/:heroId', {templateUrl: 'app/hero.html',controller: 'Controller'}).
                        otherwise({
                          redirectTo: '/list'
                        });
                    }]);

