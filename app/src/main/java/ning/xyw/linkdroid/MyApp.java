package ning.xyw.linkdroid;

import android.app.Application;
import android.content.Context;

/**
 * Created by ning on 15-9-1.
 */
public class MyApp extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getContext() {
        return context;
    }
}
