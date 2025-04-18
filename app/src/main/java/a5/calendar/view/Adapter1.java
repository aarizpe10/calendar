package a5.calendar.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import a5.calendar.MainActivity;
import a5.calendar.model.Event;

import java.util.ArrayList;

public class Adapter1 extends RecyclerView.Adapter<ViewHolder1> {
    ArrayList<Event> events;
    MainActivity mainActivity;
    public Adapter1(ArrayList<Event> events, MainActivity mainActivity) {
        this.events = events;
        this.mainActivity = mainActivity;
    }

    @NonNull
    @Override
    public ViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mainActivity);
        return new ViewHolder1(layoutInflater, parent);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder1 holder, int position) {
        Event event = events.get(position);
        holder.bind(event);
    }

    @Override
    public int getItemCount() {
        return events.size();
    }
}
