package mylocation.example.marvyanamobilite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mastermind_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mastermind_button = (Button) findViewById(R.id.chauffeur_button);
        mastermind_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMastermindActivity2();
            }
        });

    }



    public void openMastermindActivity2() {
        Intent intent = new Intent(this, MastermindActivity2.class);
        startActivity(intent);
    }
}