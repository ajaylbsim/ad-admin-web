angular.module( 'login', [] ).config( [ '$stateProvider', '$urlRouterProvider', '$locationProvider',
  function( $stateProvider, $urlRouterProvider, $locationProvider ) {
    $stateProvider.state( 'login', {
      url: '/login',
      templateUrl: 'login/login.tpl',
      controller: 'LoginCtrl'
    } );
  }
] ).controller( 'LoginCtrl', [ '$scope', 'LoginService', '$state', 'localStorageService', 'Constants', '$http',
  function( $scope, LoginService, $state, localStorageService, Constants, $http ) {
    $scope.loginDto = {};
    $scope.userLogin = function( isValid ) {
      if ( isValid ) {
        console.log( $scope.loginDto );
        $scope.loginDto.userName = $scope.loginDto.emailId;
        LoginService.loginUser( $scope.loginDto ).success( function( response ) {
          console.log( 'response.data', response );
          localStorageService.set( Constants.AUTH_TOKEN_KEY, response.data.token );
          localStorageService.set( 'user', response.data.user );
          console.log("successfully loggedIn");
          //$state.go( 'home.dashboard' );
        } ).error( function( error ) {
          console.log( "error occured", error.messages[ 0 ] );
          toastr.error( error.messages[ 0 ] ,'ERROR' );
        } );
      }
    };
  }
] );
