package id.moxspoy.komath.menu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import id.moxspoy.komath.R;
import id.moxspoy.komath.widget.MyAdapter;

public class GuideActivity extends AppCompatActivity {

    private final int[] data = {
            R.drawable.petunjuk_penggunaan_01,
            R.drawable.petunjuk_penggunaan_02,
            R.drawable.petunjuk_penggunaan_03,
            R.drawable.petunjuk_penggunaan_04,
            R.drawable.petunjuk_penggunaan_05,
            R.drawable.petunjuk_penggunaan_06,
            R.drawable.petunjuk_penggunaan_07,
            R.drawable.petunjuk_penggunaan_08,
            R.drawable.petunjuk_penggunaan_09,
            R.drawable.petunjuk_penggunaan_10,
            R.drawable.petunjuk_penggunaan_11,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        initRecyclerView();
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.rv_guide);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerView.Adapter mAdapter = new MyAdapter(data);
        recyclerView.setAdapter(mAdapter);
    }
}
