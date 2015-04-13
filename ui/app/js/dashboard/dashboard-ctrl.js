angular.module( 'dashboard', [] ).config( [ '$stateProvider', '$urlRouterProvider', '$locationProvider',
  function( $stateProvider, $urlRouterProvider, $locationProvider ) {
    $stateProvider.state( 'home.dashboard', {
      url: '/dashboard',
      templateUrl: 'dashboard/dashboard.tpl',
      controller: 'DashboardCtrl'
    } );
  }
  ] ).controller( 'DashboardCtrl', [ '$scope', '$state',
  function( $scope, $state) {
  }
  ] );
