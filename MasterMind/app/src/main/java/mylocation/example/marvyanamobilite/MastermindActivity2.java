package mylocation.example.marvyanamobilite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MastermindActivity2 extends AppCompatActivity {

    private WebView Mastermind_WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chauffeur2);

        Mastermind_WebView = (WebView)findViewById(R.id.Chauffeur_WebView);
        WebSettings webSettings = Mastermind_WebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        Mastermind_WebView.loadUrl("https://amankumary.com.np/");
        Mastermind_WebView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(Mastermind_WebView.canGoBack()){
            Mastermind_WebView.goBack();
        } else {
            super.onBackPressed();
        }

    }

}