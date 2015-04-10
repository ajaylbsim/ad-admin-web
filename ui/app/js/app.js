angular.module( 'app', [ 'ui.router', 'ui.bootstrap', 'home', 'templates' ] ).config( function( $httpProvider,
		$locationProvider, $urlRouterProvider ) {
  $urlRouterProvider.otherwise( '/home' );
} ).run( function( $rootScope ) {
  console.log( "app.js!" );
} );
