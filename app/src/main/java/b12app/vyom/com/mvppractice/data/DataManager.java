package b12app.vyom.com.mvppractice.data;

import android.database.Cursor;

import b12app.vyom.com.mvppractice.data.db.IDbHelper;
import b12app.vyom.com.mvppractice.data.db.model.LoginPojo;

public class DataManager implements IDataManager {

IDbHelper iDbHelper;

    @Override
    public void openDb() {
        iDbHelper.openDb();
    }

    @Override
    public void closeDb() {
        iDbHelper.closeDb();
    }

    @Override
    public void createRow(LoginPojo loginPojo) {
        iDbHelper.createRow(loginPojo);
    }

    @Override
    public void readRow(OnDataReceive onDataReceive) {

    }

    @Override
    public LoginPojo readAllRow() {
        return null;
    }


    @Override
    public void updateRow() {

    }

    @Override
    public void deleteRow() {

    }
}
