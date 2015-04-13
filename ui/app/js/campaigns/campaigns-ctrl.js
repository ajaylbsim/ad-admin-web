angular.module( 'campaigns', [] ).config( [ '$stateProvider', '$urlRouterProvider', '$locationProvider',
	function( $stateProvider, $urlRouterProvider, $locationProvider ) {
		$stateProvider.state( 'home.campaigns', {
			url: '/campaigns',
			templateUrl: 'campaigns/campaigns.tpl',
			controller: 'CampaignsCtrl'
		} );
	}
	] ).controller( 'CampaignsCtrl', [ '$scope', '$state',
	function( $scope, $state) {
	}
	] );
