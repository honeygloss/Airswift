package airswift;

import java.util.Date;

public class FlightSchedule {
    private int flightScheduleID;
    private String flightName;
    private String destination;
    private String arrival;
    private Date date;
    private String flightTime1;
    private String flightTime2;

    public FlightSchedule(int flightScheduleID, String flightName, String destination, String arrival, Date date, String flightTime1, String flightTime2) {
        this.flightScheduleID = flightScheduleID;
        this.flightName = flightName;
        this.destination = destination;
        this.arrival = arrival;
        this.date = date;
        this.flightTime1 = flightTime1;
        this.flightTime2 = flightTime2;
    }

    public String getFlightTime1() {
        return flightTime1;
    }

    public void setFlightTime1(String flightTime1) {
        this.flightTime1 = flightTime1;
    }

    public String getFlightTime2() {
        return flightTime2;
    }

    public void setFlightTime2(String flightTime2) {
        this.flightTime2 = flightTime2;
    }

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

   
    public FlightSchedule(){
        
    }
    

    
}
