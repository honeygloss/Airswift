/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airswift;

/**
 *
 * @author ASUS
 */
class Customer {
    
    private String title;
    private String passport;
    private String fName;
    private String lName;
    private String nationality;
    private String phoneNumber;
    private String DOB;
    private String emailAddress;
    private String changePass;
    private String confirmPass;
    private String fNameEmergency;
    private String phoneNumberEmergency;
    private String relationship;
    
    public Customer(){}
    
    public Customer(String title, String passport, String fName, String lName, String nationality, String phoneNumber, String DOB, String emailAddress, String changePass, String confirmPass, String fNameEmergency, String phoneNumberEmergency, String relationship){
        this.title = title;
        this.passport = passport;
        this.fName = fName;
        this.lName = lName;
        this.nationality = nationality;
        this.phoneNumber = phoneNumber;
        this.DOB = DOB;
        this.emailAddress = emailAddress;
        this.fNameEmergency = fNameEmergency;
        this.phoneNumberEmergency = phoneNumberEmergency;
        this.changePass = changePass;
        this.confirmPass = confirmPass;
        this.relationship = relationship;
    } 
    
    
    
    public void setTitle(String title){this.title = title;}
    public void setFName(String fName){this.fName = fName;}
    public void setLName(String lName){this.lName = lName;}
    public void setPassport(String passport) {this.passport = passport;}
    public void setNationality(String nationality){this.nationality = nationality;}
    public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}
    public void setDOB(String DOB){ this.DOB = DOB;}
    public void setEmailAddress(String emailAddress){ this.emailAddress = emailAddress;}
    public void setChangePass(String changePass){this.changePass = changePass; }
    public void setConfirmPass(String confirmPass){this.confirmPass = confirmPass; }
    public void setRelationship(String relationship){this.relationship = relationship;}
    public void setFullNameEmergency(String fNameEmergency){this.fNameEmergency = fNameEmergency;}
    public void setPhoneNumberEmergency(String phoneNumberEmergency){this.phoneNumberEmergency = phoneNumberEmergency;}
    
    public String getTitle(){ return title;}
    public String getFName(){ return fName;}
    public String getLName(){ return lName;}
    public String getPassport() { return passport;}
    public String getNationality(){ return nationality;}
    public String getPhoneNumber(){ return phoneNumber;}
    public String getDOB(){ return DOB;}
    public String getEmailAddress(){ return emailAddress;}
    public String getChangePass(){ return changePass; }
    public String getConfirmPass(){ return confirmPass; }
    public String getRelationship(){ return relationship;}
    public String getFullNameEmergency(){ return fNameEmergency;}
    public String getPhoneNumberEmergency(){ return phoneNumberEmergency;}
    
    @Override
    public String toString() {
        return (title+","+passport+","+fName+","+lName+","+nationality+","+phoneNumber+","+DOB+","+emailAddress+","+changePass+","+confirmPass+","+fNameEmergency+","+phoneNumberEmergency+","+relationship+"\n");
    }
}
