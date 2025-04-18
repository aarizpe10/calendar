package a5.calendar.model;

import java.util.ArrayList;

public class Sort {

    private static boolean needDateSwap(Event event1, Event event2){
        int date1 = (event1.getMonth() * 100) + event1.getDate();
        int date2 = (event2.getMonth() * 100) + event2.getDate();
        if (date1 != date2){
            return date1 > date2;
        }
        int compCat = event1.getCategory().compareTo(event2.getCategory());
        if (compCat != 0){
            return compCat > 0;
        }
        return event1.getName().compareTo(event2.getName()) > 0;

    }
    private static void swap(ArrayList<Event> events, int i, int j){
        Event temp = events.get(i);
        events.set(i, events.get(j));
        events.set(j, temp);
    }
    public void dateSort(ArrayList<Event> events){
        for(int i = 0; i < events.size() - 1; i++){
            for(int j = 0; j < events.size() - i - 1; j++){
                if (needDateSwap(events.get(j), events.get(j + 1))){
                    swap(events, j, j + 1);
                }
            }
        }
    }
    public void catSort(ArrayList<Event> events){
        for(int i = 0; i < events.size() - 1; i++){
            for(int j = 0; j < events.size() - i - 1; j++){
                if (needCatSwap(events.get(j), events.get(j + 1))){
                    swap(events, j, j + 1);
                }
            }
        }
    }
    private static boolean needCatSwap(Event event1, Event event2){
        int compCat = event1.getCategory().compareTo(event2.getCategory());
        if (compCat != 0){
            return compCat > 0;
        }
        int date1 = (event1.getMonth() * 100) + event1.getDate();
        int date2 = (event2.getMonth() * 100) + event2.getDate();
        if (date1 != date2){
            return date1 > date2;
        }
        return event1.getName().compareTo(event2.getName()) > 0;

    }
    public void nameSort(ArrayList<Event> events){
        for(int i = 0; i < events.size() - 1; i++){
            for(int j = 0; j < events.size() - i - 1; j++){
                if (needNameSwap(events.get(j), events.get(j + 1))){
                    swap(events, j, j + 1);
                }
            }
        }
    }
    private static boolean needNameSwap(Event event1, Event event2){
        if (event1.getName().compareTo(event2.getName()) != 0){
            return event1.getName().compareTo(event2.getName()) > 0;
        }
        int date1 = (event1.getMonth() * 100) + event1.getDate();
        int date2 = (event2.getMonth() * 100) + event2.getDate();
        if (date1 != date2){
            return date1 > date2;
        }

        return event1.getCategory().compareTo(event2.getCategory()) > 0;

    }

}
