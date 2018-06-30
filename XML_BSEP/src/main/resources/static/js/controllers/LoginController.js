
angular.module('app.LoginController',[])
       .controller('LoginController', function ($localStorage, $scope, $location, LoginFactory) {
    	   function init() {
               console.log("login");
               
                
           }

           init();
           $scope.login = function(user){
        	   if(validate(user)) {     	   
        	   LoginFactory.getUser(user).then(function(data){ 

                   if(data){
                	   	
                       $localStorage.logged = data;
                                      
                       
 
                    	   $location.path('/home');
                       
                    }})  
                    .catch(function(error){
                        alert("Pogresan email ili lozinka!");
                    });
        	   }    
           }
           function validate(user) {
               if(user.email == '' || user.password == ''){
                   alert('Nisu popunjena sva polja!');
                   return false; 
               }

               var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
               if(!re.test(user.email)){
                   alert('Email adresa nije validna!');
                   return false; 
               }

               
               
               console.log(user.jmbg);
               return true;
           }
       });
           
           