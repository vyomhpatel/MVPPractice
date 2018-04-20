package b12app.vyom.com.mvppractice.data.db;

import android.database.Cursor;

import b12app.vyom.com.mvppractice.data.db.model.LoginPojo;

public interface IDbHelper {

     void openDb();

     void closeDb();

     void createRow(LoginPojo loginPojo);

     void readRow(OnDataReceive onDataReceive);

     LoginPojo readAllRow();

     void updateRow();

     void deleteRow();

     public interface OnDataReceive{
          public void onSuccess(Cursor cursor);
          void onFailure();
     }

}
