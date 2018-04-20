package b12app.vyom.com.mvppractice.data.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import b12app.vyom.com.mvppractice.data.db.model.LoginContract;
import b12app.vyom.com.mvppractice.data.db.model.LoginPojo;

public class DbHelper implements IDbHelper {

    Context context;
    SQLiteDatabase database;
    DbOpenHelper dbOpenHelper;


    public DbHelper(Context context) {
        this.context = context;

        dbOpenHelper = new DbOpenHelper(context);

    }

    @Override
    public void openDb() {

        database = dbOpenHelper.getWritableDatabase();
    }

    @Override
    public void closeDb() {
            database.close();
    }

    @Override
    public void createRow(LoginPojo loginPojo) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(LoginContract.LoginEntry.COLUMN_NAME_TITLE, loginPojo.getName());
        contentValues.put(LoginContract.LoginEntry.COLUMN_NAME_PASSWORD,loginPojo.getPassword());

        database.insert(LoginContract.LoginEntry.TABLE_NAME,null,contentValues);
    }

    @Override
    public void readRow(OnDataReceive onDataReceive) {
        Cursor cursor;
        cursor =   database.query(LoginContract.LoginEntry.TABLE_NAME,null,null,null,null,null,null);
        onDataReceive.onSuccess(cursor);
    }


    @Override
    public LoginPojo readAllRow() {
        LoginPojo loginPojo;
        String select = "SELECT * FROM "+ LoginContract.LoginEntry.TABLE_NAME;
      Cursor cursor =  database.rawQuery(select,null);
      cursor.moveToFirst();
      do{

           loginPojo = new LoginPojo(cursor.getString(cursor.getColumnIndex(LoginContract.LoginEntry.COLUMN_NAME_TITLE)),
                  cursor.getString(cursor.getColumnIndex(LoginContract.LoginEntry.COLUMN_NAME_PASSWORD)));

      }while (cursor.moveToNext());
      return loginPojo;
    }

    @Override
    public void updateRow() {

    }

    @Override
    public void deleteRow() {

    }
}
