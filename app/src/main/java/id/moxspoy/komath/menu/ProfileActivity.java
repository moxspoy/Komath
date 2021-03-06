package id.moxspoy.komath.menu;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import id.moxspoy.komath.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
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
        final String SUBJECT = "Komentar/Saran Tentang Kommika";
        final String BODY = "Dear, Author Kommika \n\n" +
                "Halo!\n" +
                "Nama saya ....... dari ........(nama sekolah atau instansi)\n" +
                "\n" +
                "Komentar dan/atau saran saya terkait Kommika, yaitu:\n\n\n\nTerimakasih";

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{EMAIL_ADDRESS});
        intent.putExtra(Intent.EXTRA_SUBJECT, SUBJECT);
        intent.putExtra(Intent.EXTRA_TEXT,BODY);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}

