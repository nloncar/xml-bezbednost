
angular.module('app.LoginController',[])
       .controller('LoginController', function ($localStorage, $scope, $location, LoginFactory) {
    	   function init() {
               console.log("login");
           }

           init();
           $scope.login = function(user){
        	   LoginFactory.getUser(user).then(function(data){ 

                   if(data){
                	   	
                       $localStorage.logged = data;
                                      
                       
 
                    	   $location.path('/');
                       
                    }})  
                    .catch(function(error){
                        alert("Pogresan email ili lozinka!");
                    });
           }; 
 
       }); 