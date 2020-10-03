package id.moxspoy.komath.menu;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import id.moxspoy.komath.R;
import id.moxspoy.komath.submenu.IndicatorContentActivity;

public class IndicatorActivity extends AppCompatActivity {

    @BindView(R.id.indicator_1)
    MaterialButton indicator1;
    @BindView(R.id.indicator_2)
    MaterialButton indicator2;
    @BindView(R.id.indicator_3)
    MaterialButton indicator3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indicator);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.indicator_1)
    void nav1() {
        moveActivity(R.id.indicator_1);
    }
    @OnClick(R.id.indicator_2)
    void nav2() {
        moveActivity(R.id.indicator_2);
    }
    @OnClick(R.id.indicator_3)
    void nav3() {
        moveActivity(R.id.indicator_3);
    }

    void moveActivity(int res) {
        Intent intent = new Intent(getApplicationContext(), IndicatorContentActivity.class);
        intent.putExtra("ind", res);
        startActivity(intent);
    }
}
