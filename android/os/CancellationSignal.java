package android.os;

//import android.os.ICancellationSignal;

public final class CancellationSignal {
    public CancellationSignal() {
    }

    public boolean isCanceled() {
	return true;
    }

    public void throwIfCanceled() {
    }

    public void cancel() {
    }

    public void setOnCancelListener(OnCancelListener listener) {
    }

    /*    public void setRemote(ICancellationSignal remote) {
    }
    */
    /*    public static ICancellationSignal createTransport() {
        return new Transport();
    }
    public static CancellationSignal fromTransport(ICancellationSignal transport) {
        if (transport instanceof Transport) {
            return ((Transport)transport).mCancellationSignal;
        }
        return null;
    }
    */

    public interface OnCancelListener {
        /**
         * Called when {@link CancellationSignal#cancel} is invoked.
         */
        void onCancel();
    }

    /*    private static final class Transport extends ICancellationSignal.Stub {
        final CancellationSignal mCancellationSignal = new CancellationSignal();

        @Override
        public void cancel() throws RemoteException {
            mCancellationSignal.cancel();
        }
    }
    */
}
