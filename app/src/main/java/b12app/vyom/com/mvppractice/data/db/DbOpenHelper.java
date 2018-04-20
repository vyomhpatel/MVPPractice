package b12app.vyom.com.mvppractice.data.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import b12app.vyom.com.mvppractice.data.db.model.LoginContract;

public class DbOpenHelper extends SQLiteOpenHelper {


    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + LoginContract.LoginEntry.TABLE_NAME + " (" +
                    LoginContract.LoginEntry._ID + " INTEGER PRIMARY KEY," +
                    LoginContract.LoginEntry.COLUMN_NAME_ENTRY_ID + TEXT_TYPE + COMMA_SEP +
                    LoginContract.LoginEntry.COLUMN_NAME_TITLE + TEXT_TYPE + COMMA_SEP +
                    LoginContract.LoginEntry.COLUMN_NAME_PASSWORD+
                    " )";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + LoginContract.LoginEntry.TABLE_NAME;

    public DbOpenHelper(Context context) {
        super(context, "login", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
