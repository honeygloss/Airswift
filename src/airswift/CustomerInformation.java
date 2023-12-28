/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package airswift;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaswingdev.GradientDropdownMenu;
import javaswingdev.MenuEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author ASUS
 */
public class CustomerInformation extends javax.swing.JPanel {
   private GradientDropdownMenu menu;
   private Image backgroundImage;
    /**
     * Creates new form CustomerInformation1
     */
    public CustomerInformation(String name) {
        initComponents();
        jLabel1.setText(name);
        AutoCompleteDecorator.decorate(nationalityField);
        
       
       ImageIcon backgroundImageIcon = new ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\AirSwift\\src\\airswift\\Flight window.jpeg");
       backgroundImage = backgroundImageIcon.getImage();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
    

    
   

    
    boolean isFound = false;
    void readFile(){
        try{
            FileReader fr = new FileReader("Customer.txt");
            
       
        } catch(FileNotFoundException ex){
            try{
            FileWriter writer = new FileWriter("Customer.txt",true);
            } catch(IOException ex1){
                Logger.getLogger(CustomerInformation.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pInformationText1 = new javax.swing.JLabel();
        titleField = new javax.swing.JComboBox<>();
        passportField = new javax.swing.JTextField();
        fNameField = new javax.swing.JTextField();
        lNameField = new javax.swing.JTextField();
        nationalityLabel = new javax.swing.JLabel();
        nationalityField = new javax.swing.JComboBox<>();
        phoneNumberField = new javax.swing.JTextField();
        dobLabel = new javax.swing.JLabel();
        dobField = new com.toedter.calendar.JDateChooser();
        emailAddressField = new javax.swing.JTextField();
        changePassLabel = new javax.swing.JLabel();
        changePassField = new javax.swing.JPasswordField();
        confirmaPassLabel = new javax.swing.JLabel();
        confirmPassField = new javax.swing.JPasswordField();
        pInformationText = new javax.swing.JLabel();
        fNameEmergencyField = new javax.swing.JTextField();
        phoneNumberEmergencyField = new javax.swing.JTextField();
        relationshipText = new javax.swing.JLabel();
        relationshipListdown = new javax.swing.JComboBox<>();
        updateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);

        pInformationText1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pInformationText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pInformationText1.setText("Personal Information");

        titleField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr.", "Mrs.", "Miss", "Ms." }));

        passportField.setText("Passport Number");

        fNameField.setText("First Name");

        lNameField.setText("Last Name");

        nationalityLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nationalityLabel.setText("Nationality");

        nationalityField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghan", "Albanian", "Algerian", "American", "Andorran", "Angolan", "Antiguans", "Argentine", "Armenian", "Australian", "Austrian", "Azerbaijani", "Bahamian", "Bahraini", "Bangladeshi", "Barbadian", "Belarusian", "Belgian", "Belizean", "Beninese", "Bhutanese", "Bolivian", "Bosnian", "Brazilian", "British", "Bruneian", "Bulgarian", "Burkinabe", "Burmese", "Burundian", "Cambodian", "Cameroonian", "Canadian", "Cape Verdean", "Central African", "Chadian", "Chilean", "Chinese", "Colombian", "Comoran", "Congolese", "Costa Rican", "Croatian", "Cuban", "Cypriot", "Czech", "Danish", "Djibouti", "Dominican", "Dutch", "East Timorese", "Ecuadorean", "Egyptian", "Emirian", "Equatorial Guinean", "Eritrean", "Estonian", "Ethiopian", "Fijian", "Filipino", "Finnish", "French", "Gabonese", "Gambian", "Georgian", "German", "Ghanaian", "Greek", "Grenadian", "Guatemalan", "Guinea-Bissauan", "Guinean", "Guyanese", "Haitian", "Herzegovinian", "Honduran", "Hungarian", "I-Kiribati", "Icelander", "Indian", "Indonesian", "Iranian", "Iraqi", "Irish", "Israeli", "Italian", "Ivorian", "Jamaican", "Japanese", "Jordanian", "Kazakhstani", "Kenyan", "Kittian and Nevisian", "Kuwaiti", "Kyrgyz", "Laotian", "Latvian", "Lebanese", "Liberian", "Libyan", "Liechtensteiner", "Lithuanian", "Luxembourger", "Macedonian", "Malagasy", "Malawian", "Malaysian", "Maldivan", "Malian", "Maltese", "Marshallese", "Mauritanian", "Mauritian", "Mexican", "Micronesian", "Moldovan", "Monacan", "Mongolian", "Moroccan", "Mosotho", "Motswana", "Mozambican", "Namibian", "Nauruan", "Nepalese", "New Zealander", "Nicaraguan", "Nigerian", "Nigerien", "North Korean", "Northern Irish", "Norwegian", "Omani", "Pakistani", "Palauan", "Palestinian", "Panamanian", "Papua New Guinean", "Paraguayan", "Peruvian", "Polish", "Portuguese", "Qatari", "Romanian", "Russian", "Rwandan", "Saint Lucian", "Salvadoran", "Samoan", "San Marinese", "Sao Tomean", "Saudi", "Scottish", "Senegalese", "Serbian", "Seychellois", "Sierra Leonean", "Singaporean", "Slovakian", "Slovenian", "Solomon Islander", "Somali", "South African", "South Korean", "Spanish", "Sri Lankan", "Sudanese", "Surinamer", "Swazi", "Swedish", "Swiss", "Syrian", "Tajik", "Tanzanian", "Thai", "Togolese", "Tongan", "Trinidadian or Tobagonian", "Tunisian", "Turkish", "Tuvaluan", "Ugandan", "Ukrainian", "Uruguayan", "Uzbekistani", "Venezuelan", "Vietnamese", "Welsh", "Yemenite", "Zambian", "Zimbabwean" }));

        phoneNumberField.setText("Phone Number");

        dobLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dobLabel.setText("Date of Birth");

        dobField.setDateFormatString("dd-MM-yyyy");

        emailAddressField.setText("Email Address");

        changePassLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        changePassLabel.setText("Change Password");

        changePassField.setText("jPasswordField2");

        confirmaPassLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirmaPassLabel.setText("Confirm Password");

        confirmPassField.setText("jPasswordField2");
        confirmPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPassFieldActionPerformed(evt);
            }
        });

        pInformationText.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pInformationText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pInformationText.setText("Emergency Contact");
        pInformationText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        fNameEmergencyField.setText("Full Name");

        phoneNumberEmergencyField.setText("Phone Number");

        relationshipText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        relationshipText.setText("Relationship");

        relationshipListdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Parents", "Cousin", "Siblings", "Caretaker" }));
        relationshipListdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relationshipListdownActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateButton.setText("update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(130, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fNameEmergencyField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(phoneNumberEmergencyField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(relationshipText, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(relationshipListdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(262, 262, 262))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(changePassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(changePassField))
                                                    .addComponent(fNameField)
                                                    .addComponent(titleField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(65, 65, 65))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(dobLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(nationalityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(nationalityField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(confirmaPassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(confirmPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(emailAddressField)
                                            .addComponent(phoneNumberField)
                                            .addComponent(lNameField)
                                            .addComponent(passportField)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addComponent(pInformationText, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 3, Short.MAX_VALUE)))))
                .addGap(236, 236, 236))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(pInformationText1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(pInformationText1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passportField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nationalityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nationalityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dobLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailAddressField)
                    .addComponent(dobField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changePassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changePassField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmaPassLabel)
                    .addComponent(confirmPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pInformationText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameEmergencyField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberEmergencyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(relationshipText)
                    .addComponent(relationshipListdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateButton)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void confirmPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPassFieldActionPerformed

    private void relationshipListdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relationshipListdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relationshipListdownActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
         int currentIndex=0;
        String search_email = emailAddressField.getText();
        String title = titleField.getSelectedItem().toString();
        String passport = passportField.getText();
        String fName = fNameField.getText();
        String lName = lNameField.getText();
        String nationality = nationalityField.getSelectedItem().toString();
        String phoneNum = phoneNumberField.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String dob = sdf.format(dobField.getDate());
        String changePass = changePassField.getText();
        String confirmPass = confirmPassField.getText();
        String fNameEmergency = fNameEmergencyField.getText();
        String phoneNumberEmergency =  phoneNumberEmergencyField.getText();
        String relationship = relationshipListdown.getSelectedItem().toString();
        String[] tempArray = new String[100];
        
        if(search_email.isEmpty()){
           JOptionPane.showMessageDialog(this, "fill email address"); 
           return;
        }
        if(!emailAddressField.getText().contains("@")){
            JOptionPane.showMessageDialog(this, "email address is not valid"); 
            return;
        }
        if(changePassField.getText().length()<8){
            JOptionPane.showMessageDialog(this, "This password must be 8 characters or longer"); 
            return;
        }
        if(!changePassField.getText().equals(confirmPassField.getText())){
            JOptionPane.showMessageDialog(this, "Change Password is not the same as confirm Password"); 
            return;
        }
        if(!phoneNumberField.getText().matches("\\d+")){
            JOptionPane.showMessageDialog(this, "Phone number is not valid"); 
            return;
        }
        if(!phoneNumberEmergencyField.getText().matches("\\d+")){
            JOptionPane.showMessageDialog(this, "Phone number is not valid"); 
            return;
        }
        /*
        try {
                FileReader fr = new FileReader("Customer.txt");
                BufferedReader br = new BufferedReader(fr);
                String data;
                Customer cust;
                Locale.setDefault(Locale.ENGLISH);
                titleField.setSelectedItem("");
                        fNameField.setText("");
                        lNameField.setText("");
                        nationalityField.setSelectedItem("");
                        phoneNumberField.setText("");
                       
                        changePassField.setText("") ;
                        confirmPassField.setText("");
                        fNameEmergencyField.setText("") ;  
                        phoneNumberEmergencyField.setText("");
                        relationshipListdown.setSelectedItem("");
                while ((data = br.readLine()) != null) {
                    cust = new Customer(data);
                    if (cust.getEmailAddress().equals(search_email)) {
                        isFound = true;
                        titleField.setSelectedItem(cust.getTitle());
                        fNameField.setText(cust.getFName());
                        lNameField.setText(cust.getLName());
                        nationalityField.setSelectedItem(cust.getNationality());
                        phoneNumberField.setText(cust.getPhoneNumber());
                        
                        
                        changePassField.setText(cust.getChangePass()) ;
                        confirmPassField.setText(cust.getConfirmPass());
                        fNameEmergencyField.setText(cust.getFullNameEmergency()) ;  
                        phoneNumberEmergencyField.setText(cust.getPhoneNumberEmergency());
                        relationshipListdown.setSelectedItem(cust.getRelationship());
                        return;
                    }
                }
                JOptionPane.showMessageDialog(this, "user not found");
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
        */
        try{
            try(FileReader fr = new FileReader("Customer.txt")){        
                Scanner reader = new Scanner(fr);
                String line;
                String[] lineArr;
                while(reader.hasNextLine()){
                    line = reader.nextLine();
                    lineArr = line.split(",");
                    if(lineArr[7].equals(search_email)){
                        String updatedLine =
                        title + "," +
                        passport + "," +
                        fName + "," +
                        lName + "," +
                        nationality + "," +
                        phoneNum + "," +
                        dob + "," +
                        lineArr[7] + "," +
                        changePass + "," +
                        confirmPass + "," +
                        fNameEmergency + "," +   
                        phoneNumberEmergency + "," +
                        relationship;
                        tempArray[currentIndex++] = updatedLine;
                        System.out.println("email is found");
                    }else{
                        tempArray[currentIndex++] = line;
                        System.out.println("email is not found");
                    } 
                }
                
                fr.close();
            }catch(Exception e){
                System.out.println(e.toString());
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
        try{ 
            try(PrintWriter pw = new PrintWriter("Customer.txt")){
                for (int i = 0; i < currentIndex; i++)
                    pw.println(tempArray[i]);
            }catch(Exception e){
                System.out.println(e.toString());
            }
        } catch(Exception e){
            System.out.println(e.toString());
        }
        for (int i = 0; i < currentIndex; i++){
            System.out.print(tempArray[i]);
            System.out.print("\n");
        }
        
        
    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField changePassField;
    private javax.swing.JLabel changePassLabel;
    private javax.swing.JPasswordField confirmPassField;
    private javax.swing.JLabel confirmaPassLabel;
    private com.toedter.calendar.JDateChooser dobField;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JTextField emailAddressField;
    private javax.swing.JTextField fNameEmergencyField;
    private javax.swing.JTextField fNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lNameField;
    private javax.swing.JComboBox<String> nationalityField;
    private javax.swing.JLabel nationalityLabel;
    private javax.swing.JLabel pInformationText;
    private javax.swing.JLabel pInformationText1;
    private javax.swing.JTextField passportField;
    private javax.swing.JTextField phoneNumberEmergencyField;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JComboBox<String> relationshipListdown;
    private javax.swing.JLabel relationshipText;
    private javax.swing.JComboBox<String> titleField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
