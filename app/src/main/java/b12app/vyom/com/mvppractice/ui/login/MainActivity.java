package b12app.vyom.com.mvppractice.ui.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import b12app.vyom.com.mvppractice.R;

public class MainActivity extends AppCompatActivity implements IView {

    private IPresenter iPresenter;

    // main activity is a view
    // it should be as dumb as possible

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iPresenter = new Presenter(MainActivity.this);
    }

    public void clickHandler(View view) {
        // inform presenter that on of the buttons was clicked
        // as presenter is going to decide what action should be performed on click event of the button
        iPresenter.onButtonClick(view);


    }

    @Override
    public void showToast(View view) {
        Button button = (Button) view;
        Toast.makeText(this,"button Clicked: "+button.getText(),Toast.LENGTH_SHORT).show();
    }
}
