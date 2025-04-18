package a5.calendar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import a5.calendar.R;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        TextView detailsTextView = findViewById(R.id.details_text_view);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("eventDetails")) {
            String eventDetails = intent.getStringExtra("eventDetails");
            detailsTextView.setText(eventDetails);
        }
    }
}
