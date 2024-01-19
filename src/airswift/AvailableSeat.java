package airswift;

public class AvailableSeat {
    
    private int flightScheduleID;
    private String seatName;
    private boolean flag;

    public int getFlightScheduleID() {
        return flightScheduleID;
    }

    public void setFlightScheduleID(int flightScheduleID) {
        this.flightScheduleID = flightScheduleID;
    }

    public String getSeatName() {
        return seatName;
    }

    public void setSeatName(String seatName) {
        this.seatName = seatName;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public AvailableSeat(int flightScheduleID, String seatName, boolean flag) {
        this.flightScheduleID = flightScheduleID;
        this.seatName = seatName;
        this.flag = flag;
    }

    
    
}
