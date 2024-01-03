package airswift;

import java.util.Date;


public class Booking{
    private String departShort;
    private String departLong;
    private String returnShort;
    private String returnLong;
    private Date departDate;
    private Date returnDate;
    private int passenger;
    private String cabin;

    @Override
    public String toString() {
        return "Booking{" + "departShort=" + departShort + ", departLong=" + departLong + ", returnShort=" + returnShort + ", returnLong=" + returnLong + ", departDate=" + departDate + ", returnDate=" + returnDate + ", passenger=" + passenger + ", cabin=" + cabin + '}';
    }

    public String getDepartShort() {
        return departShort;
    }

    public void setDepartShort(String departShort) {
        this.departShort = departShort;
    }

    public String getDepartLong() {
        return departLong;
    }

    public void setDepartLong(String departLong) {
        this.departLong = departLong;
    }

    public String getReturnShort() {
        return returnShort;
    }

    public void setReturnShort(String returnShort) {
        this.returnShort = returnShort;
    }

    public String getReturnLong() {
        return returnLong;
    }

    public void setReturnLong(String returnLong) {
        this.returnLong = returnLong;
    }

    public Date getDepartDate() {
        return departDate;
    }

    public void setDepartDate(Date departDate) {
        this.departDate = departDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    
    public Booking(){
    }
    
    public Booking(String dShort, String dLong, String rShort, String rLong, Date dDate, Date rDate, int pass){
        departShort=dShort;
        departLong=dLong;
        returnShort=rShort;
        returnLong=rLong;
        departDate=dDate;
        returnDate=rDate;
        passenger=pass;
    }

    
}
