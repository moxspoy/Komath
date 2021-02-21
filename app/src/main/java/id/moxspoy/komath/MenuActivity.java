package id.moxspoy.komath;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import id.moxspoy.komath.menu.GuideActivity;
import id.moxspoy.komath.menu.IndicatorActivity;
import id.moxspoy.komath.menu.InfoActivity;
import id.moxspoy.komath.menu.ProfileActivity;
import id.moxspoy.komath.menu.RangkumanActivity;
import id.moxspoy.komath.menu.StoryListActivity;
import id.moxspoy.komath.menu.TokohActivity;

public class MenuActivity extends AppCompatActivity {

    @BindView(R.id.menu_1)
    MaterialButton firstButton;
    @BindView(R.id.menu_2)
    MaterialButton secondButton;
    @BindView(R.id.menu_3)
    MaterialButton thirdButton;
    @BindView(R.id.menu_4)
    MaterialButton fourthButton;
    @BindView(R.id.menu_5)
    MaterialButton fiveButton;
    @BindView(R.id.menu_6)
    MaterialButton sixButton;
    @BindView(R.id.menu_7)
    MaterialButton sevenButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ButterKnife.bind(this);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
    }

    @OnClick(R.id.menu_1)
    void navigateToGuide() {
        startActivity(new Intent(getApplicationContext(), GuideActivity.class));
    }

    @OnClick(R.id.menu_2)
    void navigateToIndicator() {
        startActivity(new Intent(getApplicationContext(), IndicatorActivity.class));
    }

    @OnClick(R.id.menu_3)
    void navigateToTokoh() {
        startActivity(new Intent(getApplicationContext(), TokohActivity.class));
    }

    @OnClick(R.id.menu_4)
    void navigateToStoryList() {
        startActivity(new Intent(getApplicationContext(), StoryListActivity.class));
    }

    @OnClick(R.id.menu_5)
    void navigateToRangkuman() {
        startActivity(new Intent(getApplicationContext(), RangkumanActivity.class));
    }

    @OnClick(R.id.menu_6)
    void navigateToProfile() {
        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
    }

    @OnClick(R.id.menu_7)
    void navigateToInfo() {
        startActivity(new Intent(getApplicationContext(), InfoActivity.class));
    }
}
