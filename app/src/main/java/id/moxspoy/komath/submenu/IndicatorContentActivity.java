package id.moxspoy.komath.submenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.moxspoy.komath.R;

public class IndicatorContentActivity extends AppCompatActivity {

    @BindView(R.id.imageView_IndicatorContentActivity1)
    ImageView imageView;
    @BindView(R.id.imageView_IndicatorContentActivity2)
    ImageView imageView2;
    @BindView(R.id.imageView_IndicatorContentActivity3)
    ImageView imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indicator_content);

        ButterKnife.bind(this);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        int res = getIntent().getIntExtra("ind", R.id.indicator_1);
        if(res == R.id.indicator_1) {
            imageView.setVisibility(View.VISIBLE);
        } else if(res == R.id.indicator_2) {
            imageView2.setVisibility(View.VISIBLE);
        } else {
            imageView3.setVisibility(View.VISIBLE);
        }
    }
}