package b12app.vyom.com.mvppractice.ui.splash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import b12app.vyom.com.mvppractice.R;

public class SplashActivity extends AppCompatActivity implements IViewSplash {

    IPresenterSplash iPresenterSplash;
    ProgressBar progressBar ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        progressBar = findViewById(R.id.progressBar);

   iPresenterSplash = new PresenterSplash(this);

        iPresenterSplash.activityReady(this);

    }


    @Override
    public void showProgressBar() {

        progressBar.setVisibility(View.VISIBLE);

    }

    @Override
    public void hideProgressBar() {

        progressBar.setVisibility(View.INVISIBLE);
    }
}
