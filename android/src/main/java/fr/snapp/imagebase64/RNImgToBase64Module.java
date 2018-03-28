
package fr.snapp.imagebase64;

import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Base64;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;

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
  public void getBase64String(String uri, Promise promise) {
    try {
      Bitmap image = MediaStore.Images.Media.getBitmap(reactContext.getContentResolver(), Uri.parse(uri));
      if (image == null) {
        promise.reject("Error", "Failed to decode Bitmap, uri: " + uri);
      } else {
        promise.resolve(bitmapToBase64(image));
      }
    } catch (Error e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private String bitmapToBase64(Bitmap bitmap) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
    byte[] byteArray = byteArrayOutputStream.toByteArray();
    return Base64.encodeToString(byteArray, Base64.DEFAULT);
  }
}