package edu.nguyenmy.mvparchitecture.view;

/**
 * Created by DELL on 10/25/2017.
 */

public interface LoginView {
     void showProgress();
     void hideProgress();
     void setUsernameError();
     void setPasswordError();
     void navigateToHome();

}
