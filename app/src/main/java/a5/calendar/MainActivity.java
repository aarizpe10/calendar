package a5.calendar;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.InputStream;
import java.util.ArrayList;
import a5.calendar.controller.SortButtons;
import a5.calendar.model.Event;
import a5.calendar.model.EventList;
import a5.calendar.view.Adapter1;

/**
 * Class for the main activity
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Creates the view for the main activity
     * @param savedInstanceState If the activity is being re-initialized after
     *     previously being shut down then this Bundle contains the data it most
     *     recently supplied in {@link #onSaveInstanceState}.  <b><i>Note: Otherwise it is null.</i></b>
     *
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EventList read = new EventList();
        AssetManager am = getAssets();
        try {
            InputStream is = am.open("events.csv");
            read.readEventList(is);
        }
        catch (Exception e) { e.printStackTrace(); }
        ArrayList<Event> events = read.getEvents();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Adapter1 adapter = new Adapter1(events, this);
        recyclerView.setAdapter(adapter);

        Button dateBtn = findViewById(R.id.sort_by_date);
        Button catBtn = findViewById(R.id.sort_by_category);
        Button nameBtn = findViewById(R.id.sort_by_name);

        SortButtons.sortListeners(dateBtn, catBtn, nameBtn, events, adapter);
    }


}