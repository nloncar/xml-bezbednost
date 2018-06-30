angular.module('app.HomeController',[])
       .controller('HomeController', function ($localStorage, $scope, $location, LoginFactory) {
    	   
    	 
 

 
$scope.logout = function(){
			if($localStorage.logged == null){
				console.log("Korisnik nije prijavljen");
				$location.path("/"); 
			}else{	
               $localStorage.logged = null;
               $location.path("/");
               console.log("Korisnik je odjavljen");
			} 
           };
           
});