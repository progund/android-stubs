package android.os;

public interface Parceble() {

    abstract int describeContents();
    abstract void writeToParcel(Parcel dest, int flags);

}

