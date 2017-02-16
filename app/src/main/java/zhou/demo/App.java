package zhou.demo;

import android.app.Application;

import org.ayo.Ayo;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

public class App extends Application {

    public static App app;

    @Override
    public void onCreate() {
        super.onCreate();
        App.app = this;
        Ayo.init(this, "rich-text", true, true);
    }
}
