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
    private String flightID;
    private String passFirstName[]= new String[10];
    private String passLastName[]= new String[10];
    private String seatName[] = new String[10];

    

    public String[] getSeatName() {
        return seatName;
    }

    public void setSeatName(String[] seatName) {
        this.seatName = seatName;
    }

    @Override
    public String toString() {
        return "Booking{" + "email=" + email + ", departShort=" + departShort + ", departLong=" + departLong + ", returnShort=" + returnShort + ", returnLong=" + returnLong + ", departDate=" + departDate + ", returnDate=" + returnDate + ", passenger=" + passenger + ", cabin=" + cabin + ", timeDepart=" + timeDepart + ", timeReturn=" + timeReturn + ", flightName=" + flightName + ", flightID=" + flightID + '}';
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

    public void setFlightName(String []flightName, int selectedIndex) {
        this.flightName = flightName[selectedIndex];
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public Booking(String email, String departShort, String departLong, String returnShort, String returnLong, Date departDate, Date returnDate, int passenger, String cabin, String flightName, String flightID) {
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
        this.flightID = flightID;
    }

    
    public double calculatePayment(){
        double price;
        if(cabin.equalsIgnoreCase("Economy")){
            price=100;
        }
        else
            price=250;
        
        if(returnDate!=null)
            price=price*2;
        
        return price*passenger;
    }
    
    public void setDepartTimeFromTimeAvail(int index, String[][] timeAvail) {
        if (index >= 0 && index < timeAvail.length) {
            timeDepart[0] = timeAvail[index][0];
            timeDepart[1] = timeAvail[index][1];
        } else {
            // Handle the case where the index is out of bounds
            System.out.println("Invalid index for timeAvail array.");
        }
    }
    
    public String getDepartTimeFromTimeAvail() {
        return "Depart Time (Start) :" +timeDepart[0]+
                "\nDepart Time (arrival) : "+timeDepart[1];
        
    }
    
    public void setReturnTimeFromTimeAvail(int index, String[][] timeAvail) {
        if (index >= 0 && index < timeAvail.length) {
            timeReturn[0] = timeAvail[index][0];
            timeReturn[1] = timeAvail[index][1];
        } else {
            // Handle the case where the index is out of bounds
            System.out.println("Invalid index for timeAvail array.");
        }
    }
    
    public String getReturnTimeFromTimeAvail() {
        return "Return Time (Start) :" +timeReturn[0]+
                "\nReturn Time (arrival) : "+timeReturn[1];
        
    }
    public void setPassengerFirstName(String firstName, int index) {
        if (index >= 0 && index < passenger) {
            passFirstName[index] = firstName;
        } else {
            // Handle the case where the index is out of bounds
            System.out.println("Invalid index for passFirstName array.");
        }
    }
    
    public void setPassengerLastName(String lastName, int index) {
        if (index >= 0 && index < passenger) {
            passLastName[index] = lastName;
        } else {
            // Handle the case where the index is out of bounds
            System.out.println("Invalid index for passLastName array.");
        }
    }
    
    public void setPassengerSeat(String seatName, int index) {
        if (index >= 0 && index < passenger) {
            this.seatName[index] = seatName;
        } else {
            // Handle the case where the index is out of bounds
            System.out.println("Invalid index for passengerSeat array.");
        }
    }
    
    
    public Booking(){
        
    }
    
    
    

    
}
