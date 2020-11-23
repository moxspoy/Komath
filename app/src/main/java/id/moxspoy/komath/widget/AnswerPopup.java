package id.moxspoy.komath.widget;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import id.moxspoy.komath.R;

public class AnswerPopup extends Dialog {
    public AppCompatActivity c;
    public Dialog d;
    public int drawable;

    public AnswerPopup(AppCompatActivity a, int drawable) {
        super(a);
        this.c = a;
        this.drawable = drawable;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog_exit);
        ImageView imageView = findViewById(R.id.image_dialog);

        Glide.with(getContext()).load(drawable).into(imageView);
    }


}
