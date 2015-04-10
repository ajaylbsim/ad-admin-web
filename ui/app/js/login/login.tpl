<div class="all-wrapper no-menu-wrapper light-bg">
  <div class="login-logo-w" ng-click="showBuilder = !showBuilder">
    <a href="" class="logo">
      <img src="img/snapdeal_logo.png" alt=""> </a>
  </div>
  <div class="row">
    <div class="col-md-4 col-md-offset-4">
      <div class="widget widget-blue">
        <div class="widget-title">
          <h3 class="text-center"><i class="fa fa-bolt pull-left"></i> Admin App <i class="fa fa-bolt pull-right"></i>
          </h3>
        </div>
        <div class="widget-content">
          <form name="loginForm" ng-submit="userLogin(loginForm.$valid)" novalidate>
            <div class="form-group relative-w">
              <div class="form-group" ng-class="{'has-error': loginForm.email.$invalid && !loginForm.email.$pristine }">
                <input type="email" name="email" ng-model="loginDto.emailId" class="form-control" placeholder="Enter email" required> <i class="fa fa-user input-abs-icon"></i>
                <p ng-show="loginForm.email.$error.required && !loginForm.email.$pristine" class="help-block">Email ID is Required</p>
       <!--          <p ng-show="loginForm.email.$error.email && !loginForm.email.$pristine" class="help-block">Invalid Email ID</p> -->
              </div>
            </div>
            <div class="form-group relative-w">
              <div class="form-group" ng-class="{'has-error' : loginForm.password.$invalid && !loginForm.password.$pristine }">
                <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" ng-model="loginDto.password" required> <i class="fa fa-lock input-abs-icon"></i>
                <p ng-show="loginForm.password.$invalid && !loginForm.password.$pristine" class="help-block">Password can't be empty</p>
              </div>
            </div>
            <button type="submit" ng-disabled="loginForm.$invalid" class="btn btn-primary btn-rounded btn-iconed">
              <span>Log me in</span> <i class="fa fa-arrow-right"></i> </button>
          </form>
            <button class="btn btn-primary pull-right" ng-click="builtData()" data-ng-show="showBuilder">Built</button>
        </div>
      </div>
    </div>
  </div>

</div>
