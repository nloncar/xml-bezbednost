app.config(function ($qProvider) {
    $qProvider.errorOnUnhandledRejections(false);
});
angular.module('app.UserRegisterController',[])
    .controller('UserRegisterController', function ($scope, $location, UserRegisterFactory ) {
    	function init() {
            console.log("registracija"); 
        }
 
        init();
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

            var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
            if(!re.test(user.email)){
                alert('Email adresa nije validna!');
                return false; 
            }

            if($scope.repeatedPassword != user.password){
                alert('Greska! Sifre se razlikuju!');
                return false;
            }
            console.log(user.jmbg);
            return true;
        }
    });