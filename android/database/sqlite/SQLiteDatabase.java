package android.database.sqlite;

import android.database.SQLException;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.content.ContentValues;

public final class SQLiteDatabase {

        public interface CursorFactory {
        /**
        public Cursor newCursor(SQLiteDatabase db,
				SQLiteCursorDriver masterQuery, String editTable,
				SQLiteQuery query);
         */
    }

    public void execSQL(String sql) throws SQLException {
	;
    }

    public Cursor query(boolean distinct, String table, String[] columns,
            String selection, String[] selectionArgs, String groupBy,
            String having, String orderBy, String limit) {
        return null;
    }

    public Cursor query(boolean distinct, String table, String[] columns,
            String selection, String[] selectionArgs, String groupBy,
            String having, String orderBy, String limit, CancellationSignal cancellationSignal) {
        return null;
    }

    public Cursor query(String table, String[] columns, String selection,
            String[] selectionArgs, String groupBy, String having,
            String orderBy) {
        return null;
    }

        public Cursor query(String table, String[] columns, String selection,
            String[] selectionArgs, String groupBy, String having,
            String orderBy, String limit) {
        return null;
    }

    public long insert(String table, String nullColumnHack, ContentValues values) {
	return 0;
    }

    public int update(String table, ContentValues values, String whereClause, String[] whereArgs) {
	return 0;
    }

    public long  insertOrThrow(String table, String nullColumnHack, ContentValues values) {
	return 0;
    }
			
    public int delete (String table, String whereClause, String[] whereArgs){
	return 0;
    }

    public Cursor rawQuery (String sql, String[] selectionArgs, CancellationSignal cancellationSignal) {
	return null;
    }

    public Cursor rawQuery (String sql, String[] selectionArgs) {
	return null;
    }

	
	
}
