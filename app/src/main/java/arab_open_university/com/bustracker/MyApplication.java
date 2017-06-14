package arab_open_university.com.bustracker;

import android.app.Application;

import com.google.firebase.FirebaseApp;

/**
 * Created by ahmedabobakr on 6/14/17.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
