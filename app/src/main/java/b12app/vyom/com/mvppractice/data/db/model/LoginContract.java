package b12app.vyom.com.mvppractice.data.db.model;

import android.provider.BaseColumns;

public class LoginContract {

    public LoginContract() {}

    /* Inner class that defines the table contents */
    public static abstract class LoginEntry implements BaseColumns {
        public static final String TABLE_NAME = "tb_login";
        public static final String COLUMN_NAME_ENTRY_ID = "entryid";
        public static final String COLUMN_NAME_TITLE = "name";
        public static final String COLUMN_NAME_PASSWORD = "password";
    }
}
