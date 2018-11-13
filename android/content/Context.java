package android.content;

import android.content.pm.PackageManager;

public class Context {

  static PackageManager manager =
    new PackageManager();
  
  public PackageManager getPackageManager() {
    return manager;
  }
 
  public String getPackageName() {
    return "";
  }
  
}
