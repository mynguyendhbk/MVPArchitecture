package edu.nguyenmy.mvparchitecture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import edu.nguyenmy.mvparchitecture.presenter.LoginPresenter;
import edu.nguyenmy.mvparchitecture.presenter.LoginPresenterImpl;
import edu.nguyenmy.mvparchitecture.view.ActivityLoading;
import edu.nguyenmy.mvparchitecture.view.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView, View.OnClickListener {
    private EditText mEdtUseName, mEdtPassWord;
    private Button mBtnLogin;
    private ProgressBar mProgressBar;
    private LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdtUseName = (EditText) findViewById(R.id.ed_name);
        mEdtPassWord = (EditText) findViewById(R.id.ed_password);
        mBtnLogin = (Button) findViewById(R.id.btn_login);
        mProgressBar = (ProgressBar)findViewById(R.id.progressbar);
        mLoginPresenter = new LoginPresenterImpl(this);
        mBtnLogin.setOnClickListener(this);

    }

    @Override
    public void showProgress() {
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        mProgressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUsernameError() {
        mEdtUseName.setError("Username cannot be empty!");
    }

    @Override
    public void setPasswordError() {
        mEdtPassWord.setError("Password cannot be empty!");
    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(this, ActivityLoading.class));


    }

    @Override
    public void onClick(View view) {
        mLoginPresenter.validate(mEdtUseName.getText().toString(),mEdtPassWord.getText().toString());
    }
}
