package android.elamien.abdellah.jokeviewer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    TextView jokeDisplayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent jokeIntent = getIntent();

        if (jokeIntent != null && jokeIntent.hasExtra(Intent.EXTRA_TEXT)) {
            String joke = jokeIntent.getStringExtra(Intent.EXTRA_TEXT);
            jokeDisplayTextView = findViewById(R.id.displayJokeTextView);
            jokeDisplayTextView.setText(joke);
        } else {
            finish();
        }
    }
}
