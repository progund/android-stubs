package android.database;

/*import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;

*/
import java.io.Closeable;

/**
 * This interface provides random read-write access to the result set returned
 * by a database query.
 * <p>
 * Cursor implementations are not required to be synchronized so code using a Cursor from multiple
 * threads should perform its own synchronization when using the Cursor.
 * </p><p>
 * Implementations should subclass {@link AbstractCursor}.
 * </p>
 */
public interface Cursor extends Closeable {


    boolean moveToFirst();// { return true ; }
    boolean isAfterLast();// { return true ; }
    boolean moveToNext();
    int getCount();
    int getInt(int columnIndex);
    String getString(int columnIndex);
    long getLong(int index);


}
