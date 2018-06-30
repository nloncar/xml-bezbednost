app.config(function ($qProvider) {
    $qProvider.errorOnUnhandledRejections(false);
});




 
angular.module('app.UserRegisterController',[])
    .controller('UserRegisterController', function ($scope, $location, UserRegisterFactory ) {
    	function init() {
            console.log("registracija"); 
        }
 
        init();
        
        $scope.$watch('newUser.password', checkPassword);
        
        
        $scope.registerUser = function (user) {
            if(validate(user)) {
                UserRegisterFactory.postUser(user).then(function (data) {
                	$location.path('/');	
                });
                
            }
        } 

        $scope.newUser = {id:null, name:'', surname:'', jmbg:'', adresa:'',telefon:'', email:'', password:''};

        $scope.repeatedPassword = ''; 
        
        
        function validate(user) {
            if(user.name == '' || user.surname == ''|| user.jmbg == ''  || user.adresa == '' || user.telefon == '' || user.email == '' || user.password == ''){
                alert('Nisu popunjena sva polja!');
                return false;
            } 
            if(!/[A-Z]/.test( user.name.charAt(0))){
            	alert('Ime mora da pocinje velikim slovom!');
                return false;
            } 
            if(!/[A-Z]/.test( user.surname.charAt(0))){ 
            	alert('Prezime mora da pocinje velikim slovom!'); 
                return false;  
            }
            if(!user.jmbg.match(/^\d+$/)) {
            	alert('JMBG mora imati samo brojeve!'); 
            	return false;
            }
            if(user.jmbg.length!=13){
            	alert('JMBG mora imati tacno 13 cifara!'); 
                return false;
            }
            if(!user.telefon.match(/^\d+$/)) {
            	alert('Telefon mora imati samo brojeve!'); 
            	return false; 
            }
            if(user.telefon.length<9 || user.telefon.length>15){
            	alert('Telefon mora imati izmedju 9 i 15 brojeva!'); 
                return false;
            }  
            if(user.password.length<8 || user.telefon.length>25){
            	alert('Lozinka mora imati izmedju 8 i 25 karaktera!'); 
                return false; 
            }
            
            
            var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
            if(!re.test(user.email)){
                alert('Email adresa nije validna!');
                return false; 
            }

            if($scope.repeatedPassword != user.password){
                alert('Greska! Sifre se razlikuju!');
                return false;
            }
            
            return true;
        }
        function checkPassword() {
        	
        	var pwString=$scope.newUser.password; 
        	 

            var strength = 0; 

            strength += /[A-Z]+/.test(pwString) ? 1 : 0;
            strength += /[a-z]+/.test(pwString) ? 1 : 0;
            strength += /[0-9]+/.test(pwString) ? 1 : 0;
            strength += /[\W]+/.test(pwString) ? 1 : 0;

            switch(strength) {
                case 3:
                	$scope.ps="srednja";
                	
                	
                    break;
                case 4:
                	$scope.ps="jaka";
                	
                    break;
                default:
                	$scope.ps="slaba";
                              
                    break; 
            }  
        }


        
    });