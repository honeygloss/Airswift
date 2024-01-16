package airswift;

import java.util.Date;

public class FlightSchedule {
    private int flightScheduleID;
    private String flightName;
    private String destination;
    private String arrival;
    private Date date;
    private String flightTime;

    public int getFlightScheduleID() {
        return flightScheduleID;
    }

    public void setFlightScheduleID(int flightScheduleID) {
        this.flightScheduleID = flightScheduleID;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public FlightSchedule(int flightScheduleID, String flightName, String destination, String arrival, Date date, String flightTime) {
        this.flightScheduleID = flightScheduleID;
        this.flightName = flightName;
        this.destination = destination;
        this.arrival = arrival;
        this.date = date;
        this.flightTime = flightTime;
    }

    

    
}
