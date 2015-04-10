angular.module( "app" ).factory( 'HomeService', [ '$http', 'Constants',
  function( $http, Constants ) {
    return {
      createNotificationGCM: function( deviceId ) {
        return $http.post( Constants.APP_URL + 'app/push-notification', deviceId );
      }
    };
  }
] );
