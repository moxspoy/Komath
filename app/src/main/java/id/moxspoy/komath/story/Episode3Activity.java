package id.moxspoy.komath.story;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import id.moxspoy.komath.R;
import id.moxspoy.komath.widget.AnswerPopup;
import id.moxspoy.komath.widget.MyAdapter;

public class Episode3Activity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    private boolean isScrollable = false;

    private RecyclerView recyclerView;
    private RecyclerView recyclerView2;
    private RecyclerView recyclerView3;
    private RecyclerView recyclerView4;

    private final int[] firstDataset = {
            R.drawable.ep3_fix_01,
            R.drawable.ep3_fix_02,
            R.drawable.ep3_fix_03,
            R.drawable.ep3_fix_04,
            R.drawable.ep3_fix_05,
            R.drawable.ep3_fix_06,
            R.drawable.ep3_fix_07,
            R.drawable.ep3_fix_08,
            R.drawable.ep3_fix_09,
            R.drawable.ep3_fix_10,
            R.drawable.ep3_fix_11,
            R.drawable.ep3_fix_12,
            R.drawable.ep3_fix_13,
    };
    private final int[] secondDataset = {
            R.drawable.ep3_fix2_01,
            R.drawable.ep3_fix2_02,
            R.drawable.ep3_fix2_03,
            R.drawable.ep3_fix2_04,
    };

    private final int[] thirdDataset = {
            R.drawable.ep3_fix3_02,
            R.drawable.ep3_fix3_03,
            R.drawable.ep3_fix3_04,
            R.drawable.ep3_fix3_05,
            R.drawable.ep3_fix3_06,
            R.drawable.ep3_fix3_07,
            R.drawable.ep3_fix3_08,
            R.drawable.ep3_fix3_09,
    };

    private final int[] fourthDataset = {
            R.drawable.ep3_fix4_01,
            R.drawable.ep3_fix4_02,
            R.drawable.ep3_fix4_03,
            R.drawable.ep3_fix4_04,
            R.drawable.ep3_fix4_05,
            R.drawable.ep3_fix4_06,
            R.drawable.ep3_fix4_07,
            R.drawable.ep3_fix4_08,
            R.drawable.ep3_fix4_09,
            R.drawable.ep3_fix4_10,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode3);
        initImages();
        initScrollView();
    }

    private void initScrollView() {
        recyclerView.setOnTouchListener((view, motionEvent) -> isScrollable);
    }

    private void initImages() {
        ImageView img1 = findViewById(R.id.img_ep3_part_3);
        ImageView img2 = findViewById(R.id.img_ep3_part_4);
        ImageView img3 = findViewById(R.id.img_ep3_part_5);
        ImageView img4 = findViewById(R.id.img_ep3_part_7);
        Glide.with(this).load(R.drawable.ep3_fix_14).into(img1);
        Glide.with(this).load(R.drawable.ep3_fix2_05).into(img2);
        Glide.with(this).load(R.drawable.ep3_fix3_01).into(img3);
        Glide.with(this).load(R.drawable.ep3_fix3_10).into(img4);

        recyclerView = findViewById(R.id.rv_episode3a);
        recyclerView2 = findViewById(R.id.rv_episode3b);
        recyclerView3 = findViewById(R.id.rv_episode3c);
        recyclerView4 = findViewById(R.id.rv_episode3d);

        recyclerView.setHasFixedSize(true);
        recyclerView2.setHasFixedSize(true);
        recyclerView3.setHasFixedSize(true);
        recyclerView4.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView.LayoutManager layoutManager3 = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView.LayoutManager layoutManager4 = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView2.setLayoutManager(layoutManager2);
        recyclerView3.setLayoutManager(layoutManager3);
        recyclerView4.setLayoutManager(layoutManager4);

        RecyclerView.Adapter mAdapter = new MyAdapter(firstDataset);
        RecyclerView.Adapter mAdapter2 = new MyAdapter(secondDataset);
        RecyclerView.Adapter mAdapter3 = new MyAdapter(thirdDataset);
        RecyclerView.Adapter mAdapter4 = new MyAdapter(fourthDataset);
        recyclerView.setAdapter(mAdapter);
        recyclerView2.setAdapter(mAdapter2);
        recyclerView3.setAdapter(mAdapter3);
        recyclerView4.setAdapter(mAdapter4);
    }

    public void onRightAnswer(View view) {
        AnswerPopup answerPopup = new AnswerPopup(this, R.drawable.tepat);
        answerPopup.setCanceledOnTouchOutside(false);
        answerPopup.show();
        mediaPlayer = MediaPlayer.create(this, R.raw.right);
        mediaPlayer.start();
        isScrollable = false;
    }

    public void onWrongAnswer(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        mediaPlayer.start();
        AnswerPopup answerPopup = new AnswerPopup(this,R.drawable.wrong_answer_ep3);
        answerPopup.setCanceledOnTouchOutside(false);
        answerPopup.show();
        isScrollable = true;
    }

}