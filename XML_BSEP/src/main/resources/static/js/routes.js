var app = angular.module('app.routes', ['ngRoute']);

app.config(['$routeProvider','$httpProvider', function ($routeProvider, $httpProvider) {
    $routeProvider
    .when('/', {
        templateUrl: 'html/pocetna.html'
    	})
        .when('/register',{
            templateUrl : 'html/register.html'
        }).when('/home',{
            templateUrl : 'html/home.html'
        })
        .when('/login',{ 
            templateUrl : 'html/login.html'
        });
    
}]); 
