package android.database.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public abstract class SQLiteOpenHelper {

    public SQLiteOpenHelper(Context context, String name, CursorFactory factory, int version) {
	;
    }

    public void onCreate(SQLiteDatabase database) {
	;
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	;
    }

    public SQLiteDatabase getWritableDatabase() {
	return null;
    }
    
    public synchronized void close() {
	;
    }

}
