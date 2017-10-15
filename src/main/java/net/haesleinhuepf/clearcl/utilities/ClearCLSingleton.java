package net.haesleinhuepf.clearcl.utilities;

import clearcl.ClearCL;
import clearcl.backend.ClearCLBackendInterface;
import clearcl.backend.javacl.ClearCLBackendJavaCL;

public class ClearCLSingleton
{
  private ClearCL mClearCL;

  private ClearCLSingleton() {
    ClearCLBackendInterface
        lClearCLBackend =
        new ClearCLBackendJavaCL();

    mClearCL = new ClearCL(lClearCLBackend);
  }


  private static ClearCLSingleton mInstance = null;
  public static ClearCLSingleton getSingleton() {
    if (mInstance == null) {
      mInstance = new ClearCLSingleton();
    }
    return mInstance;
  }

}
