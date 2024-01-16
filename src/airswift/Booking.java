package airswift;

import java.util.Date;


public class Booking{ 
    private String email;
    private String departShort;
    private String departLong;
    private String returnShort;
    private String returnLong;
    private Date departDate;
    private Date returnDate;
    private int passenger;
    private String cabin;
    private String timeDepart[]=new String[2];
    private String timeReturn[]=new String[2];
    private String flightName;

    
    public double calculatePayment(){
        double price;
        if(cabin.equalsIgnoreCase("Economy")){
            price=100;
        }
        else
            price=250;
        
        return price;
        
        
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String[] getTimeDepart() {
        return timeDepart;
    }

    public void setTimeDepart(String[] timeDepart) {
        this.timeDepart = timeDepart;
    }

    public String[] getTimeReturn() {
        return timeReturn;
    }

    public void setTimeReturn(String[] timeReturn) {
        this.timeReturn = timeReturn;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public Booking(String email, String departShort, String departLong, String returnShort, String returnLong, Date departDate, Date returnDate, int passenger, String cabin, String flightName) {
        this.email = email;
        this.departShort = departShort;
        this.departLong = departLong;
        this.returnShort = returnShort;
        this.returnLong = returnLong;
        this.departDate = departDate;
        this.returnDate = returnDate;
        this.passenger = passenger;
        this.cabin = cabin;
        this.flightName = flightName;
    }
    
    public Booking(){
        
    }

    
}
