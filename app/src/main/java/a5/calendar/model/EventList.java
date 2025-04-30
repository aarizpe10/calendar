package a5.calendar.model;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Class that contains methods related to reading the CSV file of events
 */
public class EventList {
    public ArrayList<Event> events = new ArrayList<Event>();

    /**
     * Reads the csv file of events and places them into an Event object and
     * then into an ArrayList
     * @param is
     * @throws Exception
     */
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

    /**
     * Gets the ArrayList of Event objects
     * @return
     */
    public ArrayList<Event> getEvents(){
        return events;
    }

}
