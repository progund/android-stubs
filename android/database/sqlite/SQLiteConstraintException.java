package android.database.sqlite;

/**
 * An exception that indicates that an integrity constraint was violated.
 */
public class SQLiteConstraintException extends SQLiteException {
    public SQLiteConstraintException() {}

    public SQLiteConstraintException(String error) {
        super(error);
    }
}
