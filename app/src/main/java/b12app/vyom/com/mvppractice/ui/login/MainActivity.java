package b12app.vyom.com.mvppractice.ui.login;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import b12app.vyom.com.mvppractice.R;
import b12app.vyom.com.mvppractice.data.db.model.LoginContract;
import b12app.vyom.com.mvppractice.data.db.model.LoginPojo;

public class MainActivity extends AppCompatActivity implements IView {

    private IPresenterLogin iPresenterLogin;

    private EditText etName, etPass;
    private TextView tvDisplayData;

    // main activity is a view
    // it should be as dumb as possible

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iPresenterLogin = new PresenterLogin(MainActivity.this);

        etName = findViewById(R.id.etName);
        etPass = findViewById(R.id.etPassword);
        tvDisplayData = findViewById(R.id.tvDisplayData);
    }

    public void clickHandler(View view) {
        // inform presenter that on of the buttons was clicked
        // as presenter is going to decide what action should be performed on click event of the button


        LoginPojo loginPojo = new LoginPojo(etName.getText().toString(),etPass.getText().toString());
        iPresenterLogin.onButtonClick(view, loginPojo);
    }

    @Override
    public void showToast(View view) {
        Button button = (Button) view;
        Toast.makeText(this,"button Clicked: "+button.getText(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setDbText(String data) {
        tvDisplayData.setText(data);
    }


}
