package id.moxspoy.komath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        waiting();
    }


    private void waiting() {
        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                navigateToMenuActivity();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

    private void navigateToMenuActivity() {
        /* Create an Intent that will start the Menu-Activity. */
        Intent mainIntent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(mainIntent);
        finish();
    }

}
