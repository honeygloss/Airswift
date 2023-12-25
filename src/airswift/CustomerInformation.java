/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airswift;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaswingdev.GradientDropdownMenu;
import javaswingdev.MenuEvent;
import javax.swing.JOptionPane;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
/**
 *
 * @author ASUS
 */
public class CustomerInformation extends javax.swing.JFrame {
    
    
    /**
     * Creates new form CustomerInformation
     */
    public CustomerInformation() {
        initComponents();
        AutoCompleteDecorator.decorate(nationalityField);
        
        GradientDropdownMenu menu = new GradientDropdownMenu();
        menu.setFont(new java.awt.Font("Segoe UI", 1, 12));
        menu.setBackground(new Color(51,51,51));
        menu.addItem("AirSwift");
        menu.addItem("Profile");
        menu.addItem("Log Out");
        
        menu.applay(this);
        menu.addEvent(new MenuEvent(){
           @Override
           public void selected(int index, int subIndex, boolean menuItem){
               if(menuItem && index == 0){
                   new FlightMenu().setVisible(true);
                   CustomerInformation.this.dispose();
               }
           }
        });
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

        cInformationText = new javax.swing.JLabel();
        pInformationText = new javax.swing.JLabel();
        fNameField = new javax.swing.JTextField();
        lNameField = new javax.swing.JTextField();
        phoneNumberField = new javax.swing.JTextField();
        emailAddressField = new javax.swing.JTextField();
        pInformationText1 = new javax.swing.JLabel();
        fNameEmergencyField = new javax.swing.JTextField();
        phoneNumberEmergencyField = new javax.swing.JTextField();
        relationshipListdown = new javax.swing.JComboBox<>();
        relationshipText = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        passportField = new javax.swing.JTextField();
        titleField = new javax.swing.JComboBox<>();
        nationalityField = new javax.swing.JComboBox<>();
        dobField = new com.toedter.calendar.JDateChooser();
        dobLabel = new javax.swing.JLabel();
        nationalityLabel = new javax.swing.JLabel();
        changePassField = new javax.swing.JPasswordField();
        changePassLabel = new javax.swing.JLabel();
        confirmaPassLabel = new javax.swing.JLabel();
        confirmPassField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cInformationText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cInformationText.setForeground(new java.awt.Color(0, 153, 153));
        cInformationText.setText("CUSTOMER INFORMATION");

        pInformationText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pInformationText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pInformationText.setText("Emergency Contact");

        fNameField.setText("First Name");

        lNameField.setText("Last Name");

        phoneNumberField.setText("Phone Number");

        emailAddressField.setText("Email Address");

        pInformationText1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pInformationText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pInformationText1.setText("Personal Information");

        fNameEmergencyField.setText("Full Name");

        phoneNumberEmergencyField.setText("Phone Number");

        relationshipListdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Parents", "Cousin", "Siblings", "Caretaker" }));

        relationshipText.setText("Relationship");

        updateButton.setBackground(new java.awt.Color(189, 210, 238));
        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        updateButton.setForeground(new java.awt.Color(51, 51, 51));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(189, 210, 238));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(51, 51, 51));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("AirSwift");

        passportField.setText("Passport Number");

        titleField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr.", "Mrs.", "Miss", "Ms." }));

        nationalityField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghan", "Albanian", "Algerian", "American", "Andorran", "Angolan", "Antiguans", "Argentine", "Armenian", "Australian", "Austrian", "Azerbaijani", "Bahamian", "Bahraini", "Bangladeshi", "Barbadian", "Belarusian", "Belgian", "Belizean", "Beninese", "Bhutanese", "Bolivian", "Bosnian", "Brazilian", "British", "Bruneian", "Bulgarian", "Burkinabe", "Burmese", "Burundian", "Cambodian", "Cameroonian", "Canadian", "Cape Verdean", "Central African", "Chadian", "Chilean", "Chinese", "Colombian", "Comoran", "Congolese", "Costa Rican", "Croatian", "Cuban", "Cypriot", "Czech", "Danish", "Djibouti", "Dominican", "Dutch", "East Timorese", "Ecuadorean", "Egyptian", "Emirian", "Equatorial Guinean", "Eritrean", "Estonian", "Ethiopian", "Fijian", "Filipino", "Finnish", "French", "Gabonese", "Gambian", "Georgian", "German", "Ghanaian", "Greek", "Grenadian", "Guatemalan", "Guinea-Bissauan", "Guinean", "Guyanese", "Haitian", "Herzegovinian", "Honduran", "Hungarian", "I-Kiribati", "Icelander", "Indian", "Indonesian", "Iranian", "Iraqi", "Irish", "Israeli", "Italian", "Ivorian", "Jamaican", "Japanese", "Jordanian", "Kazakhstani", "Kenyan", "Kittian and Nevisian", "Kuwaiti", "Kyrgyz", "Laotian", "Latvian", "Lebanese", "Liberian", "Libyan", "Liechtensteiner", "Lithuanian", "Luxembourger", "Macedonian", "Malagasy", "Malawian", "Malaysian", "Maldivan", "Malian", "Maltese", "Marshallese", "Mauritanian", "Mauritian", "Mexican", "Micronesian", "Moldovan", "Monacan", "Mongolian", "Moroccan", "Mosotho", "Motswana", "Mozambican", "Namibian", "Nauruan", "Nepalese", "New Zealander", "Nicaraguan", "Nigerian", "Nigerien", "North Korean", "Northern Irish", "Norwegian", "Omani", "Pakistani", "Palauan", "Palestinian", "Panamanian", "Papua New Guinean", "Paraguayan", "Peruvian", "Polish", "Portuguese", "Qatari", "Romanian", "Russian", "Rwandan", "Saint Lucian", "Salvadoran", "Samoan", "San Marinese", "Sao Tomean", "Saudi", "Scottish", "Senegalese", "Serbian", "Seychellois", "Sierra Leonean", "Singaporean", "Slovakian", "Slovenian", "Solomon Islander", "Somali", "South African", "South Korean", "Spanish", "Sri Lankan", "Sudanese", "Surinamer", "Swazi", "Swedish", "Swiss", "Syrian", "Tajik", "Tanzanian", "Thai", "Togolese", "Tongan", "Trinidadian or Tobagonian", "Tunisian", "Turkish", "Tuvaluan", "Ugandan", "Ukrainian", "Uruguayan", "Uzbekistani", "Venezuelan", "Vietnamese", "Welsh", "Yemenite", "Zambian", "Zimbabwean" }));

        dobField.setDateFormatString("dd-MM-yyyy");

        dobLabel.setText("Date of Birth");

        nationalityLabel.setText("Nationality");

        changePassField.setText("jPasswordField2");

        changePassLabel.setText("Change Password");

        confirmaPassLabel.setText("Confirm Password");

        confirmPassField.setText("jPasswordField2");
        confirmPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPassFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(updateButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backButton)
                                .addGap(137, 137, 137))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(relationshipText, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(relationshipListdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(fNameEmergencyField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addComponent(phoneNumberEmergencyField))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(changePassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(changePassField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(nationalityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(dobLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(nationalityField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fNameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(passportField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(emailAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(confirmaPassLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(confirmPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(50, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cInformationText)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pInformationText1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pInformationText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(cInformationText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pInformationText1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passportField)
                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nationalityLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nationalityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(emailAddressField)
                    .addComponent(dobField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dobLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmaPassLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(changePassLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(changePassField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(confirmPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(pInformationText)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameEmergencyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberEmergencyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(relationshipListdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(relationshipText))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(updateButton))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
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
        
    JOptionPane.showMessageDialog(this, "user updated");
        /*int option = JOptionPane.showConfirmDialog(this, "Do you want to update again?", "Update", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.NO_OPTION) {
            break; // Exit the loop if the user chooses not to update again
        }*/

    }//GEN-LAST:event_updateButtonActionPerformed

    private void confirmPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPassFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       new FlightMenu().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new CustomerInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel cInformationText;
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
