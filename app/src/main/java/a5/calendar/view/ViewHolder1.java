package a5.calendar.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import a5.calendar.R;
import a5.calendar.model.Event;

/**
 * Class for setting a singular recyclerView event
 */
public class ViewHolder1 extends RecyclerView.ViewHolder {
    TextView eventTextView;
    Button detailsButton;

    /**
     * Constructor for the ViewHolder1 class
     * @param inflater
     * @param parent
     */
    public ViewHolder1(LayoutInflater inflater, ViewGroup parent) {
        super(inflater.inflate(R.layout.event_item, parent, false));

        eventTextView = itemView.findViewById(R.id.event_blurb);
        detailsButton = itemView.findViewById(R.id.details_button); // ADD THIS to link the button
    }

    /**
     * Sets the text for the recycler view event and the onClickListener for
     * the details button
     * @param event
     */
    @SuppressLint("SetTextI18n")
    public void bind(Event event) {
        eventTextView.setText(event.getMonth() + "/" + event.getDate() + " " +
                event.getCategory() + ": " + event.getName());

        detailsButton.setOnClickListener(v -> {
            Intent intent = new Intent(itemView.getContext(), a5.calendar.DetailActivity.class);
            intent.putExtra("eventDetails", event.getFullDescription());
            itemView.getContext().startActivity(intent);
        });
    }
}
