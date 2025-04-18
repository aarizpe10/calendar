package a5.calendar.model;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EventList {
    public ArrayList<Event> events = new ArrayList<Event>();

    public void readEventList(InputStream is) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader(is));
        String line = br.readLine();
        while(line != null){
            String[] eventData = line.split(",");
            String category = eventData[0];
            String name = eventData[1];
            String location = eventData[2];
            int month = Integer.parseInt(eventData[3]);
            int date = Integer.parseInt(eventData[4]);
            String price = eventData[5];
            String description = eventData[6];
            Event event = new Event (category, name, location, description, month, date, price);
            events.add(event);
            line = br.readLine();
        }
        br.close();

    }
    public ArrayList<Event> getEvents(){
        return events;
    }

}
