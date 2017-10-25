package edu.nguyenmy.mvparchitecture.presenter;

import edu.nguyenmy.mvparchitecture.view.LoginView;
import edu.nguyenmy.mvparchitecture.view.LoginInteractor;
import edu.nguyenmy.mvparchitecture.view.LoginInteractorImpl;

/**
 * Created by DELL on 10/25/2017.
 */

public class LoginPresenterImpl implements LoginPresenter, LoginInteractor.OnLoginFinishedListener {
    private LoginView mLoginView;
    private LoginInteractor mLoginInteractor;

    public LoginPresenterImpl(LoginView loginView) {
        this.mLoginView = loginView;
        this.mLoginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void validate(String name, String password) {
        if (mLoginView != null) {
            mLoginView.showProgress();
        }
        mLoginInteractor.login(name, password, this);
    }

    @Override
    public void onUsernameError() {
        if (mLoginView != null) {
            mLoginView.setUsernameError();
            mLoginView.hideProgress();
        }
    }

    @Override
    public void onPasswordError() {
        if (mLoginView != null) {
            mLoginView.setPasswordError();
            mLoginView.hideProgress();
        }
    }

    @Override
    public void onSucess() {
        if(mLoginView != null){
            mLoginView.navigateToHome();
        }
    }
}

