/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airswift;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class CustomerInformation extends javax.swing.JFrame {
    int ln; String flag;
    
    /**
     * Creates new form CustomerInformation
     */
    public CustomerInformation() {
        initComponents();
    }
    
    void readFile(){
        try{
            FileReader fr = new FileReader("customer.txt");
            
       
        } catch(FileNotFoundException ex){
            try{
            FileWriter writer = new FileWriter("Customer.txt",true);
            } catch(IOException ex1){
                Logger.getLogger(CustomerInformation.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }
    void deleteData(String title, String passport, String fName, String lName, String nationality, String phoneNumber, String DOB, String email, String changePass, String confirmPass, String fNameEmergency, String phoneNumberEmergency){
        try{
            File inputFile = new File("Customer.txt");
            File tempFile = new File("CustomerTemp.txt");
            try(BufferedReader breader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter bwriter = new BufferedWriter(new FileWriter(tempFile))){
                String currentLine;
                boolean flagFound = false;
                while((currentLine = breader.readLine()) != null){
                    if(!flagFound && currentLine.equals(flag)){
                        flagFound = true;
                        continue;
                    }
                    bwriter.write(currentLine + "\r\n");
                }
            }
            
            if (!inputFile.delete()) {
                System.out.println("Could not delete the original file");
                return;
            }
            // Rename the temporary file to the original file
            if (!tempFile.renameTo(inputFile)) {
                System.out.println("Could not rename the temporary file");
            }
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(CustomerInformation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CustomerInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    void updateData(String title, String passport, String fName, String lName, String nationality, String phoneNumber, String DOB, String email, String changePass, String confirmPass, String fNameEmergency, String phoneNumberEmergency){
        Customer[] customerList = new Customer[ln];
        String search_email = emailAddressField.getText();
        int currentIndex=0;
        try{
            try(FileReader fr = new FileReader(new File("Customer.txt"))){
                BufferedReader br = new BufferedReader(fr);
                String data;
                Customer tempCustomer;
                
                while((data = br.readLine()) != null){
                    tempCustomer = new Customer(data);
                    if(tempCustomer.getEmailAddress().equals(search_email)){
                        tempCustomer.setPassport(passportField.getText());
                        tempCustomer.setNationality(nationalityField.getText());
                        tempCustomer.setPhoneNumber(phoneNumberField.getText());
                        tempCustomer.setDOB(dobField.getText());
                        tempCustomer.setChangePass(changePassField.getText());
                        tempCustomer.setConfirmPass(confirmPassField.getText());
                        tempCustomer.setFullNameEmergency(fNameEmergencyField.getText());
                        tempCustomer.setPhoneNumberEmergency(phoneNumberEmergencyField.getText());
                    }
                    customerList[currentIndex] = tempCustomer;
                    currentIndex++;
                }
                
            }
            try(PrintWriter pw = new PrintWriter(new FileWriter("Customer.txt", true))){
                for(int i=0; i<ln; i++){
                    if (customerList != null) {
                        pw.println(customerList.toString());
                    }
                }
                
            }
        }catch (FileNotFoundException ex) {
            Logger.getLogger(CustomerInformation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CustomerInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        /*
        try {
            BufferedReader readerb = new BufferedReader(new FileReader("Customer.txt"));
            RandomAccessFile raf = new RandomAccessFile("Customer.txt", "rw");
            
            
            
            for (int i = 0; i < ln; i++) {
                String line = raf.readLine();
                if (line == null){
                    break;
                }
            }
            for (int i = 0; i < ln; i++) {
                flag = readerb.readLine();  
            }
            raf.writeBytes("Title: "+title+","+"passport: "+passport+","+"fName: "+fName+","+"lName: "+lName+","+"nationality: "+nationality+","+"phoneNumber: "+phoneNumber+","+"DOB: "+DOB+","+"Email: "+email+","+"ChangePass: "+changePass+","+"ConfirmPass: "+confirmPass+","+"fNameEmergency: "+fNameEmergency+","+"phoneNumberEmergency: "+phoneNumberEmergency);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CustomerInformation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CustomerInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    } 
    
    void countLines(){
        try {
            ln=0;
            RandomAccessFile raf = new RandomAccessFile("Customer.txt", "rw");
            for(int i=0;raf.readLine()!=null;i++){
                ln++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CustomerInformation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CustomerInformation.class.getName()).log(Level.SEVERE, null, ex);
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
        titleField = new javax.swing.JTextField();
        passportField = new javax.swing.JTextField();
        fNameField = new javax.swing.JTextField();
        lNameField = new javax.swing.JTextField();
        nationalityField = new javax.swing.JTextField();
        phoneNumberField = new javax.swing.JTextField();
        dobField = new javax.swing.JTextField();
        emailAddressField = new javax.swing.JTextField();
        changePassField = new javax.swing.JTextField();
        confirmPassField = new javax.swing.JTextField();
        pInformationText1 = new javax.swing.JLabel();
        fNameEmergencyField = new javax.swing.JTextField();
        phoneNumberEmergencyField = new javax.swing.JTextField();
        relationshipListdown = new javax.swing.JComboBox<>();
        relationshipText = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cInformationText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cInformationText.setForeground(new java.awt.Color(0, 153, 153));
        cInformationText.setText("CUSTOMER INFORMATION");

        pInformationText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pInformationText.setText("Emergency Contact");

        titleField.setText("Title");
        titleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleFieldActionPerformed(evt);
            }
        });

        passportField.setText("Passport Number");
        passportField.setPreferredSize(new java.awt.Dimension(26, 26));
        passportField.setRequestFocusEnabled(false);
        passportField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passportFieldActionPerformed(evt);
            }
        });

        fNameField.setText("First Name");
        fNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameFieldActionPerformed(evt);
            }
        });

        lNameField.setText("Last Name");

        nationalityField.setText("Nationality");
        nationalityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationalityFieldActionPerformed(evt);
            }
        });

        phoneNumberField.setText("Phone Number");

        dobField.setText("DOB");

        emailAddressField.setText("Email Address");

        changePassField.setText("Change Password");

        confirmPassField.setText("Confirm Password");

        pInformationText1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pInformationText1.setText("Personal Information");

        fNameEmergencyField.setText("Full Name");

        phoneNumberEmergencyField.setText("Phone Number");
        phoneNumberEmergencyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberEmergencyFieldActionPerformed(evt);
            }
        });

        relationshipListdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Parents", "Cousin", "Siblings", "Caretaker" }));

        relationshipText.setText("Relationship");

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");

        backButton.setText("Back");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("AirSwift");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cInformationText)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(changePassField, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                        .addComponent(dobField)
                                        .addComponent(nationalityField)
                                        .addComponent(fNameField)
                                        .addComponent(titleField))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(passportField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lNameField)
                                        .addComponent(phoneNumberField)
                                        .addComponent(emailAddressField)
                                        .addComponent(confirmPassField, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(fNameEmergencyField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(phoneNumberEmergencyField, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(relationshipText, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(relationshipListdown, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updateButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backButton))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pInformationText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(179, Short.MAX_VALUE)
                    .addComponent(pInformationText1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(153, 153, 153)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(cInformationText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passportField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nationalityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changePassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(saveButton)
                    .addComponent(backButton))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(137, 137, 137)
                    .addComponent(pInformationText1)
                    .addContainerGap(462, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleFieldActionPerformed
        
    }//GEN-LAST:event_titleFieldActionPerformed

    private void passportFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passportFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passportFieldActionPerformed

    private void fNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameFieldActionPerformed

    private void nationalityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationalityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nationalityFieldActionPerformed

    private void phoneNumberEmergencyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberEmergencyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberEmergencyFieldActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
       countLines();
       readFile();
       if(changePassField.getText().equals(confirmPassField.getText())){
           JOptionPane.showMessageDialog(null, "Password is not match");
       }
       
       updateData(titleField.getText(),passportField.getText(),fNameField.getText(),lNameField.getText(),nationalityField.getText(),phoneNumberField.getText(), dobField.getText(), emailAddressField.getText(), changePassField.getText(), confirmPassField.getText(),fNameEmergencyField.getText(), phoneNumberEmergencyField.getText());
       //deleteData(titleField.getText(),passportField.getText(),fNameField.getText(),lNameField.getText(),nationalityField.getText(),phoneNumberField.getText(), dobField.getText(), emailAddressField.getText(), changePassField.getText(), confirmPassField.getText(),fNameEmergencyField.getText(), phoneNumberEmergencyField.getText());
    }//GEN-LAST:event_updateButtonActionPerformed

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
    private javax.swing.JTextField changePassField;
    private javax.swing.JTextField confirmPassField;
    private javax.swing.JTextField dobField;
    private javax.swing.JTextField emailAddressField;
    private javax.swing.JTextField fNameEmergencyField;
    private javax.swing.JTextField fNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lNameField;
    private javax.swing.JTextField nationalityField;
    private javax.swing.JLabel pInformationText;
    private javax.swing.JLabel pInformationText1;
    private javax.swing.JTextField passportField;
    private javax.swing.JTextField phoneNumberEmergencyField;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JComboBox<String> relationshipListdown;
    private javax.swing.JLabel relationshipText;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField titleField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
