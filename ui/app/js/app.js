angular.module( 'app', [ 'ui.router', 'ui.bootstrap','LocalStorageModule', 'home', 'templates' ,'login'] ).config( function( $httpProvider,
		$locationProvider, $urlRouterProvider ) {
  $urlRouterProvider.otherwise( '/home' );
} ).run( function( $rootScope ) {
  console.log( "app.js!" );
} );
