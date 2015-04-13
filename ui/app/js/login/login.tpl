<center class="logo-top">
  <img src="../img/JumpAhead-Logo.png"> </center>
  <section class="login-container">
    <form class="form-signin" name="loginForm" ng-submit="userLogin(loginForm.$valid)" novalidate>
      <center class="group" ng-class="{'has-error': loginForm.email.$invalid && !loginForm.email.$pristine }">
        <input class="login-input" type="email" name="email" ng-model="loginDto.emailId" required>
        <span class="highlight"></span>
        <span class="bar"></span>
        <label>Email</label>
        <p class="bg-warning" ng-show="loginForm.email.$error.required && !loginForm.email.$pristine" class="help-block">Email is Required.</p>
      </center>
      <center class="group" ng-class="{'has-error' : loginForm.password.$invalid && !loginForm.password.$pristine }">
      <input class="login-input" id="inputPassword" type="password" name="password" ng-model="loginDto.password" required>
        <span class="highlight"></span>
        <span class="bar"></span>
        <label>Password</label>
        <p class="bg-warning"  ng-show="loginForm.password.$invalid && !loginForm.password.$pristine" class="help-block">Password can't be empty.</p>
      </center>
      <button class="btn-primary" type="submit" ng-disabled="loginForm.$invalid">Sign In</button>
    </form>
  </section>
