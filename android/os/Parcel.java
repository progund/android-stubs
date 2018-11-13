package android.os;


import java.util.ArrayList;
import java.util.List;

public class Parcel {
    
    public final static Parcelable.Creator<String> STRING_CREATOR
	= new Parcelable.Creator<String>() {
		public String createFromParcel(Parcel source) {
		    return null;
		}
		public String[] newArray(int size) {
		    return null;
		}
	    };
    
    public final int readInt() {
        return 0;
    }

    public final long readLong() {
        return 0;
    }

    /**
     * Read a floating point value from the parcel at the current
     * dataPosition().
     */
    public final float readFloat() {
        return 0;
    }

    /**
     * Read a double precision floating point value from the parcel at the
     * current dataPosition().
     */
    public final double readDouble() {
        return 0.0;
    }

    /**
     * Read a string value from the parcel at the current dataPosition().
     */
    public final String readString() {
        return null;
    }

    /**
     * Read a CharSequence value from the parcel at the current dataPosition().
     * @hide
     */
    public final CharSequence readCharSequence() {
        return null;
    }


    public final void writeBlob(byte[] b) {
	;
    }

    /**
     * Write an integer value into the parcel at the current dataPosition(),
     * growing dataCapacity() if needed.
     */
    public final void writeInt(int val) {
	;
    }

    /**
     * Write a long integer value into the parcel at the current dataPosition(),
     * growing dataCapacity() if needed.
     */
    public final void writeLong(long val) {
	;
    }

    /**
     * Write a floating point value into the parcel at the current
     * dataPosition(), growing dataCapacity() if needed.
     */
    public final void writeFloat(float val) {
	;
    }

    /**
     * Write a double precision floating point value into the parcel at the
     * current dataPosition(), growing dataCapacity() if needed.
     */
    public final void writeDouble(double val) {
	;
    }

    /**
     * Write a string value into the parcel at the current dataPosition(),
     * growing dataCapacity() if needed.
     */
    public final void writeString(String val) {
	;
    }

    /**
     * Write a CharSequence value into the parcel at the current dataPosition(),
     * growing dataCapacity() if needed.
     * @hide
     */
    public final void writeCharSequence(CharSequence val) {
	;
    }

    public final <T> ArrayList<T> createTypedArrayList(Parcelable.Creator<T> c) {
	return null;
    }
    

    public final <T extends Parcelable> void writeTypedList(List<T> val) {
	return;
    }
}
