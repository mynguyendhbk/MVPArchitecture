package edu.nguyenmy.mvparchitecture.view;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by DELL on 10/25/2017.
 */

public class LoginInteractorImpl implements LoginInteractor {
    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error = false;
                if(TextUtils.isEmpty(username)){
                    listener.onUsernameError();
                    error = true;
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                    error = true;
                    return;
                }
                if (!error){
                    listener.onSucess();
                }
            }
        },2000);
    }
}
