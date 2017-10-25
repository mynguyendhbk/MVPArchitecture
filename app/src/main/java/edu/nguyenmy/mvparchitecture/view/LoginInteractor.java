package edu.nguyenmy.mvparchitecture.view;

/**
 * Created by DELL on 10/25/2017.
 */

public interface LoginInteractor {
    interface OnLoginFinishedListener{
         void onUsernameError();
         void onPasswordError();
         void onSucess();
    }
     void login(String username, String password, OnLoginFinishedListener listener);
}
