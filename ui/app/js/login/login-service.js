angular.module( 'app' ).factory( 'LoginService', [ '$http', 'Constants',
  function( $http, Constants ) {
    return {
      loginUser: function( loginDto ) {
        return $http.post( Constants.APP_URL + 'control-panel/login', loginDto );
      }
    };
  }
] );
