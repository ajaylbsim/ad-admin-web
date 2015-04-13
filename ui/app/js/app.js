angular.module( 'app', [ 'ui.router', 'ui.bootstrap','LocalStorageModule', 'home', 'templates' ,'login', 'dashboard'] ).config( function( $httpProvider,
		$locationProvider, $urlRouterProvider ) {
  $urlRouterProvider.otherwise( '/home/dashboard' );
} ).run( function( $rootScope ) {
} );
