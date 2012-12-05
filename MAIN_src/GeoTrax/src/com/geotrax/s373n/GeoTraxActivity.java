package com.geotrax.s373n;


/**import com.phonegap.*;**/
import org.apache.cordova.*;
import android.os.Bundle;

public class GeoTraxActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setBooleanProperty("keepRunning", true);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}
