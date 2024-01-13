package airswift;

public class AvailableSeat {
    private int flightScheduleID;
    private String seatName[];
    private boolean flag[];

    public int getFlightScheduleID() {
        return flightScheduleID;
    }

    public void setFlightScheduleID(int flightScheduleID) {
        this.flightScheduleID = flightScheduleID;
    }

    public String[] getSeatName() {
        return seatName;
    }

    public void setSeatName(String[] seatName) {
        this.seatName = seatName;
    }

    public boolean[] getFlag() {
        return flag;
    }

    public void setFlag(boolean[] flag) {
        this.flag = flag;
    }
    
}
