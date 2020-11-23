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

public class Episode1Activity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    private RecyclerView recyclerView;
    private RecyclerView recyclerView2;
    private RecyclerView recyclerView3;
    private RecyclerView recyclerView4;

    private final int[] firstDataset = {
            R.drawable.episode1_part1_01,
            R.drawable.episode1_part1_02,
            R.drawable.episode1_part1_03,
            R.drawable.episode1_part1_04,
            R.drawable.episode1_part1_05,
            R.drawable.episode1_part1_06,
            R.drawable.episode1_part1_07,
            R.drawable.episode1_part1_08,
            R.drawable.episode1_part1_09,
            R.drawable.episode1_part1_10,
            R.drawable.episode1_part1_11,
            R.drawable.episode1_part1_12,
            R.drawable.episode1_part1_13,
            R.drawable.episode1_part1_14,
            R.drawable.episode1_part1_15,
    };

    private final int[] secondDataset = {
            R.drawable.episode1_part2_01,
            R.drawable.episode1_part2_02,
            R.drawable.episode1_part2_03,
            R.drawable.episode1_part2_04,
            R.drawable.episode1_part2_05,
    };

    private final int[] thirdDataset = {
            R.drawable.episode1_part3_02,
            R.drawable.episode1_part3_03,
            R.drawable.episode1_part3_04,
    };

    private final int[] fourthDataset = {
            R.drawable.episode1_part4_02,
            R.drawable.episode1_part4_03,
            R.drawable.episode1_part4_04,
            R.drawable.episode1_part4_05,
            R.drawable.episode1_part4_06,
            R.drawable.episode1_part4_07,
            R.drawable.episode1_part4_08,
            R.drawable.episode1_part4_09,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode1);
        initImages();
    }

    private void initImages() {
        ImageView img1 = findViewById(R.id.img_ep1_part_1_16);
        ImageView img2 = findViewById(R.id.img_ep1_part_2_06);
        ImageView img3 = findViewById(R.id.img_ep1_part_3_05);
        Glide.with(this).load(R.drawable.episode1_part1_16).into(img1);
        Glide.with(this).load(R.drawable.episode1_part2_06).into(img2);
        Glide.with(this).load(R.drawable.episode1_part3_05).into(img3);

        recyclerView = findViewById(R.id.rv_episode1a);
        recyclerView2 = findViewById(R.id.rv_episode1b);
        recyclerView3 = findViewById(R.id.rv_episode1c);
        recyclerView4 = findViewById(R.id.rv_episode1d);

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
        AnswerPopup answerPopup = new AnswerPopup(this, R.drawable.tepat_ep1);
        answerPopup.setCanceledOnTouchOutside(false);
        answerPopup.show();
        mediaPlayer = MediaPlayer.create(this, R.raw.right);
        mediaPlayer.start();
    }

    public void onWrongAnswer(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.wrong);
        mediaPlayer.start();
        AnswerPopup answerPopup = new AnswerPopup(this,R.drawable.kurang_tepat_ep1);
        answerPopup.setCanceledOnTouchOutside(false);
        answerPopup.show();
    }

}