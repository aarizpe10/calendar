package a5.calendar.model;

/**
 * Class that stores information related to an Event
 */
public class Event {
    private String category, name, location, description, price;
    private int month, date;

    /**
     * Constructor for the Event class
     * @param category
     * @param name
     * @param location
     * @param description
     * @param month
     * @param date
     * @param price
     */
    public Event(String category, String name, String location, String description, int month, int date, String price){
        this.category = category;
        this.name = name;
        this.location = location;
        this.description = description;
        this.month = month;
        this.date = date;
        this.price = price;
    }

    /**
     * Gets string containing the full description of the event.
     * @return
     */
    public String getFullDescription() {
        return "Name: " + name + "\n" +
                "Category: " + category + "\n" +
                "Location: " + location + "\n" +
                "Date: " + month + "/" + date + "\n" +
                "Admission: " + price + "\n" +
                "Description: " + description;
    }

    /**
     * Gets an Event objects category
     * @return
     */
    public String getCategory() {
        return category;
    }

    /**
     * Gets an Event objects name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Gets an Event objects description
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets an Event objects price
     * @return
     */
    public String getPrice() {
        return price;
    }

    /**
     * Gets an Event objects month
     * @return
     */
    public int getMonth() {
        return month;
    }

    /**
     * Gets an Event objects date
     * @return
     */
    public int getDate() {
        return date;
    }

    /**
     * Gets an Event objects location
     * @return
     */
    public String getLocation() {
        return location;
    }
}
