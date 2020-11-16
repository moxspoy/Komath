package id.moxspoy.komath.menu;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import id.moxspoy.komath.R;
import id.moxspoy.komath.story.Episode1Activity;
import id.moxspoy.komath.story.Episode2Activity;
import id.moxspoy.komath.story.Episode3Activity;
import id.moxspoy.komath.story.Episode4Activity;
import id.moxspoy.komath.story.Episode5Activity;
import id.moxspoy.komath.story.StoryActivity;
import id.moxspoy.komath.submenu.IndicatorContentActivity;

public class StoryListActivity extends AppCompatActivity {

    @BindView(R.id.story_1)
    LinearLayout story1;
    @BindView(R.id.story_2)
    LinearLayout story2;
    @BindView(R.id.story_3)
    LinearLayout story3;
    @BindView(R.id.story_4)
    LinearLayout story4;
    @BindView(R.id.story_5)
    LinearLayout story5;
    @BindView(R.id.story_6)
    LinearLayout story6;

    private Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_list);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.story_1)
    void nav1() {
        intent = new Intent(getApplicationContext(), Episode1Activity.class);
        moveActivity(R.id.story_1);
    }
    @OnClick(R.id.story_2)
    void nav2() {
        intent = new Intent(getApplicationContext(), Episode2Activity.class);
        moveActivity(R.id.story_2);
    }
    @OnClick(R.id.story_3)
    void nav3() {
        intent = new Intent(getApplicationContext(), Episode3Activity.class);
        moveActivity(R.id.story_3);
    }
    @OnClick(R.id.story_4)
    void nav4() {
        intent = new Intent(getApplicationContext(), Episode4Activity.class);
        moveActivity(R.id.story_4);
    }
    @OnClick(R.id.story_5)
    void nav5() {
        intent = new Intent(getApplicationContext(), Episode5Activity.class);
        moveActivity(R.id.story_5);
    }
    @OnClick(R.id.story_6)
    void nav6() {
        intent = new Intent(getApplicationContext(), StoryActivity.class);
        moveActivity(R.id.story_6);
    }

    void moveActivity(int res) {
        startActivity(intent);
    }
}
