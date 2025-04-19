package a5.calendar.controller;

import android.widget.Button;

import java.util.ArrayList;

import a5.calendar.model.Event;
import a5.calendar.model.Sort;
import a5.calendar.view.Adapter1;

/**
 * Class that contains method related to the main activities buttons
 */
public class SortButtons {

    /**
     * Sets the OnClickListeners for the main activities sort buttons
     * @param date
     * @param category
     * @param name
     * @param events
     * @param adapter
     */
    public static void sortListeners(Button date, Button category, Button name, ArrayList<Event> events, Adapter1 adapter){
        Sort sort = new Sort();
        date.setOnClickListener(v ->{
            sort.dateSort(events);
            adapter.notifyDataSetChanged();
        });
        category.setOnClickListener(v -> {
            sort.catSort(events);
            adapter.notifyDataSetChanged();
        });
        name.setOnClickListener(v -> {
            sort.nameSort(events);
            adapter.notifyDataSetChanged();
        });
    }

}
