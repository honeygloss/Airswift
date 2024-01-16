package airswift;

public class AvailableSeat {
    private int flightScheduleID;
    private String seatName[]=new String[69];
    private boolean flag[]=new boolean[69];

    public AvailableSeat(int flightScheduleID) {
        this.flightScheduleID = flightScheduleID;
    }

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
    
    public void setSeatNameAtIndex(int index, String value) {
        if (index >= 0 && index < seatName.length) {
            seatName[index] = value;
        } else {
            System.out.println("Invalid index");
        }
    }

   
    
}
