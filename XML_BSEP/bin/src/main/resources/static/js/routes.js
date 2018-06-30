var app = angular.module('app.routes', ['ngRoute']);

app.config(['$routeProvider','$httpProvider', function ($routeProvider, $httpProvider) {
    $routeProvider
    .when('/', {
        templateUrl: 'html/home.html'
    	})
        .when('/register',{
            templateUrl : 'html/register.html'
        })
        .when('/login',{ 
            templateUrl : 'html/login.html'
        });
    
}]); 
