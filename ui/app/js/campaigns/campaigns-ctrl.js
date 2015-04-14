angular.module( 'campaigns', [] ).config( [ '$stateProvider', '$urlRouterProvider', '$locationProvider',
	function( $stateProvider, $urlRouterProvider, $locationProvider ) {
		$stateProvider.state( 'home.campaigns', {
			url: '/campaigns',
			templateUrl: 'campaigns/campaigns-main.tpl',
			controller: 'CampaignsCtrl'
		} ).state( 'home.campaigns.campaigns-list', {
			url: '/list',
			templateUrl: 'campaigns/campaigns-list.tpl',
			controller: 'CampaignsListCtrl'
		} ).state( 'home.campaigns.product', {
			url: '/product/123',
			templateUrl: 'campaigns/campaigns-product.tpl',
			controller: 'CampaignsProductCtrl'
		} ).state( 'home.campaigns.add', {
			url: '/add',
			templateUrl: 'campaigns/campaigns-add.tpl',
			controller: 'CampaignsNewProductCtrl'
		} );
	}
	] ).controller( 'CampaignsCtrl', [ '$scope', '$state',
	function( $scope, $state) {
	}
	] ).controller( 'CampaignsListCtrl', [ '$scope', '$state',
	function( $scope, $state) {
	}
	] ).controller( 'CampaignsProductCtrl', [ '$scope', '$state',
	function( $scope, $state) {
	}
	] ).controller( 'CampaignsNewProductCtrl', [ '$scope', '$state',
	function( $scope, $state) {
	}
	] );
