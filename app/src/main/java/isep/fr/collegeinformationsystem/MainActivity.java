package isep.fr.collegeinformationsystem;


import android.app.Application;

import com.example.collegeinfo.database.AppSharedPreferences;
import com.example.collegeinfo.database.DatabaseHelper;

public class MainActivity extends Application {
    public static final String TAG = "MainApplication";
    public static MainActivity Instance;

    public static MainActivity getInstance() {
        return Instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Instance = this;

        //initilize sharedprefference
        AppSharedPreferences.getInstance().Initialize(getApplicationContext());

        //initilize database
        DatabaseHelper.init(getApplicationContext());

    }
}
