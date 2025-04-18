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

public class ViewHolder1 extends RecyclerView.ViewHolder {
    TextView eventTextView;
    Button detailsButton;

    public ViewHolder1(LayoutInflater inflater, ViewGroup parent) {
        super(inflater.inflate(R.layout.event_item, parent, false));

        eventTextView = itemView.findViewById(R.id.event_blurb);
        detailsButton = itemView.findViewById(R.id.details_button); // ADD THIS to link the button
    }

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
