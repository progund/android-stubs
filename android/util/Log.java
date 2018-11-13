package android.util;

public class Log {

  public static int d (String tag, String msg) {
    System.out.println("DEBUG: " + tag + " | " + msg);
    return 0;
  }

  public static int d (String tag, String msg, Exception e) {
    System.out.println("DEBUG: " + tag + " | " + msg + " | " + e.getMessage());
    return 0;
  }

  public static int e (String tag, String msg) {
    System.out.println("DEBUG: " + tag + " | " + msg);
    return 0;
  }

  public static int i (String tag, String msg) {
    System.out.println("DEBUG: " + tag + " | " + msg);
    return 0;
  }

  public static int w (String tag, String msg) {
    System.out.println("DEBUG: " + tag + " | " + msg);
    return 0;
  }

  public static int v (String tag, String msg) {
    System.out.println("DEBUG: " + tag + " | " + msg);
    return 0;
  }

}
