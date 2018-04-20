package b12app.vyom.com.mvppractice.ui.splash;

import android.content.Context;
import android.content.Intent;

import java.util.logging.Handler;

import b12app.vyom.com.mvppractice.ui.login.IView;
import b12app.vyom.com.mvppractice.ui.login.MainActivity;

public class PresenterSplash implements IPresenterSplash {


    IViewSplash iView;
    SplashActivity splashActivity;

    public PresenterSplash(SplashActivity splashActivity) {
        this.splashActivity = splashActivity;
        iView = splashActivity;
    }

    @Override
    public void showLogin() {



    }

    @Override
    public void showProgressBar() {

    }

    @Override
    public void activityReady(final Context context) {

        iView.showProgressBar();

        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(context,MainActivity.class);
                iView.hideProgressBar();
                context.startActivity(intent);
            }
        },3000);


    }
}
