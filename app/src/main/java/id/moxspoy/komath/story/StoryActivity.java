
package id.moxspoy.komath.story;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import id.moxspoy.komath.R;

public class StoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        int res = getIntent().getIntExtra("story", R.id.indicator_1);
        Toast.makeText(getApplicationContext(), "ID IS " + res, Toast.LENGTH_SHORT).show();
    }
}