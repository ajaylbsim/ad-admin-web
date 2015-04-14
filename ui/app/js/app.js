angular.module( 'app', [ 'ui.router', 'ui.bootstrap','LocalStorageModule', 'home', 'templates' ,'login', 'dashboard', 'campaigns','header'] ).config( function( $httpProvider,
		$locationProvider, $urlRouterProvider ) {
  $urlRouterProvider.otherwise( '/home/dashboard' );
} ).run( function( $rootScope ) {
} );
