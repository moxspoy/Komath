package id.moxspoy.komath.menu;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import id.moxspoy.komath.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void handleInstagramButton(View view) {
        final String INSTAGRAM_ADDRESS = "https://instagram.com/wulans.sari_?igshid=91tp0j8q1ocp";
        Uri uri = Uri.parse(INSTAGRAM_ADDRESS);
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

        likeIng.setPackage("com.instagram.android");

        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    uri));
        }
    }

    public void handleGmailButton(View view) {
        final String EMAIL_ADDRESS = "wulan9703@gmail.com";
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto", EMAIL_ADDRESS, null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Komentar/Saran Tentang Kommika");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Halo!\n" +
                "Nama saya ....... dari ........\n" +
                "\n" +
                "Komentar/Saran (pilih salah satu atau boleh juga keduanya) saya terkait kommika, yaitu:");
        startActivity(Intent.createChooser(emailIntent, "Send email..."));
    }
}

