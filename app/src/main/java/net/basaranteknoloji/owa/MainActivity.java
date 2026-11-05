package net.basaranteknoloji.owa;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        String owaUrl = "https://mail.basaranteknoloji.net/owa";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(owaUrl));
        
        try {
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            finish();
        }
    }
}