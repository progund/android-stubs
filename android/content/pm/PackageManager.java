package android.content.pm;

public class PackageManager {

  public static PackageInfo pInfo = new PackageInfo();
  
  public PackageInfo getPackageInfo(String s, int nr) throws PackageManager.NameNotFoundException {
    return pInfo;
  }

  public static class NameNotFoundException extends /*Android*/Exception {
    public NameNotFoundException() {
      throw new RuntimeException("Stub!");
    }

    public NameNotFoundException(String name) {
      throw new RuntimeException("Stub!");
    }
  }

}
