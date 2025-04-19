package a5.calendar.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import a5.calendar.MainActivity;
import a5.calendar.model.Event;

import java.util.ArrayList;

/**
 * Class for adapting the recyclerView for the list of events
 */
public class Adapter1 extends RecyclerView.Adapter<ViewHolder1> {
    ArrayList<Event> events;
    MainActivity mainActivity;

    /**
     * Constructor for the Adapter1 class
     * @param events
     * @param mainActivity
     */
    public Adapter1(ArrayList<Event> events, MainActivity mainActivity) {
        this.events = events;
        this.mainActivity = mainActivity;
    }

    /**
     * Creates a new viewHolder1 object
     * @param parent The ViewGroup into which the new View will be added after it is bound to
     *               an adapter position.
     * @param viewType The view type of the new View.
     *
     * @return
     */
    @NonNull
    @Override
    public ViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mainActivity);
        return new ViewHolder1(layoutInflater, parent);
    }

    /**
     * Sets the event used to populate a Recycler view
     * @param holder The ViewHolder which should be updated to represent the contents of the
     *        item at the given position in the data set.
     * @param position The position of the item within the adapter's data set.
     */
    @Override
    public void onBindViewHolder(@NonNull ViewHolder1 holder, int position) {
        Event event = events.get(position);
        holder.bind(event);
    }

    /**
     * Gets the size of the ArrayList events
     * @return
     */
    @Override
    public int getItemCount() {
        return events.size();
    }
}
