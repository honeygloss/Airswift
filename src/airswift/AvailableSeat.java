package airswift;

public class AvailableSeat {
    
    private int flightScheduleID;
    private String seatName[] = new String[69];
    private boolean flag[]= new boolean[69];

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

    public int getFlightScheduleID() {
        return flightScheduleID;
    }

    public void setFlightScheduleID(int flightScheduleID) {
        this.flightScheduleID = flightScheduleID;
    }

    public void setSeatName(String seatName, int index) {
        if (index >= 0 && index < 69) {
            this.seatName[index] = seatName;
        } else {
            // Handle the case where the index is out of bounds
            System.out.println("Invalid index for passFirstName array.");
        }
    }
    
    public void setSeatFlag(boolean flag, int index) {
        if (index >= 0 && index < 69) {
            this.flag[index] = flag;
        } else {
            // Handle the case where the index is out of bounds
            System.out.println("Invalid index for passFirstName array.");
        }
    }
    
}
