
package com.reactlibrary;

import android.Manifest;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNImgToBase64Module extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNImgToBase64Module(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNImgToBase64";
  }

  @ReactMethod
  public void getBase64String(String uri, Callback callback) {
    try {
      Bitmap image = MediaStore.Images.Media.getBitmap(this.context.getContentResolver(), Uri.parse(uri));
      if (image == null) {
        callback.invoke("Failed to decode Bitmap, uri: " + uri);
      } else {
        callback.invoke(null, bitmapToBase64(image));
      }
    } catch (IOException e) {
    }
  }

  private String bitmapToBase64(Bitmap bitmap) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
    byte[] byteArray = byteArrayOutputStream.toByteArray();
    return Base64.encodeToString(byteArray, Base64.DEFAULT);
  }
}