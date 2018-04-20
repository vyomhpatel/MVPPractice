package b12app.vyom.com.mvppractice.ui.login;

import android.view.View;

import b12app.vyom.com.mvppractice.data.db.model.LoginPojo;

public interface IPresenterLogin {

   public void onButtonClick(View view, LoginPojo loginPojo);


}
