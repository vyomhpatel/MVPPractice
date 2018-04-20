package b12app.vyom.com.mvppractice.ui.login;
import android.database.Cursor;
import android.view.View;
import android.widget.Button;

import b12app.vyom.com.mvppractice.R;
import b12app.vyom.com.mvppractice.data.db.DbHelper;
import b12app.vyom.com.mvppractice.data.db.IDbHelper;
import b12app.vyom.com.mvppractice.data.db.model.LoginContract;
import b12app.vyom.com.mvppractice.data.db.model.LoginPojo;

public class PresenterLogin implements IPresenterLogin, IDbHelper.OnDataReceive {

  //  Context context;
    IView iView;
    MainActivity activity;
    IDbHelper iDbHelper;

    public PresenterLogin(MainActivity activity) {
      this.activity = activity;
        iView = activity;
        iDbHelper = new DbHelper(activity);
    }

    @Override
    public void onButtonClick(View view, LoginPojo loginPojo) {

      Button b = (Button) view;
    //    Toast.makeText(context,"clicked by "+b.getText(),Toast.LENGTH_SHORT).show();
        iDbHelper.openDb();

        iView.showToast(view);
        if(b.getId()== R.id.btnLogin){

        iDbHelper.createRow(loginPojo);
        } else{

          iDbHelper.readRow(this);


        }




    }

  @Override
  public void onSuccess(Cursor cursor) {

    String data;

      cursor.moveToFirst();
      do {
        data = cursor.getString(cursor.getColumnIndex(LoginContract.LoginEntry.COLUMN_NAME_TITLE));
      }
      while (cursor.moveToNext());
      iView.setDbText(data);


  }

  @Override
  public void onFailure() {

  }
}
