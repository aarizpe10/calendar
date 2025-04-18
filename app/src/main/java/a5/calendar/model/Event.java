package a5.calendar.model;

public class Event {
    private String category, name, location, description, price;
    private int month, date;

    public Event(String category, String name, String location, String description, int month, int date, String price){
        this.category = category;
        this.name = name;
        this.location = location;
        this.description = description;
        this.month = month;
        this.date = date;
        this.price = price;
    }

    public String getFullDescription() {
        return "Name: " + name + "\n" +
                "Category: " + category + "\n" +
                "Location: " + location + "\n" +
                "Date: " + month + "/" + date + "\n" +
                "Admission: " + price + "\n" +
                "Description: " + description;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }

    public int getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }
}
