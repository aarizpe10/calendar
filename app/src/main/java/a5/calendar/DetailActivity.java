package a5.calendar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import a5.calendar.R;

/**
 * Class for the second activity
 */
public class DetailActivity extends AppCompatActivity {
    /**
     * Creates the view for the second activity
     * @param savedInstanceState If the activity is being re-initialized after
     *     previously being shut down then this Bundle contains the data it most
     *     recently supplied in {@link #onSaveInstanceState}.  <b><i>Note: Otherwise it is null.</i></b>
     *
     */
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
