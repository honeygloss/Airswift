/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airswift;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
    boolean isFound = false;
    void readFile(){
        try{
            FileReader fr = new FileReader("Login.txt");
            java.util.Scanner scanner = new java.util.Scanner(fr);
            while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line); // You can modify this to do something with each line
        }

        scanner.close();
        //fr.close();
       
        } catch(FileNotFoundException ex){
            try{
            FileWriter writer = new FileWriter("Login.txt",true);
            } catch(IOException ex1){
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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

        background = new airswift.Background();
        panel = new javax.swing.JPanel();
        txtEmailAddress = new airswift.TextField();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new airswift.PasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmdLogin = new swing.ButtonGradient();
        checkR = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBlur(panel);

        panel.setOpaque(false);

        txtEmailAddress.setForeground(new java.awt.Color(0, 0, 0));
        txtEmailAddress.setHint("Email Address");

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(128, 0, 32));
        jLabel1.setText("LOGIN");

        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.setHint("Password");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Email Address:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Password :");

        cmdLogin.setText("LOGIN");
        cmdLogin.setColor1(new java.awt.Color(128, 0, 32));
        cmdLogin.setColor2(new java.awt.Color(102, 0, 0));
        cmdLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmdLogin.setMaximumSize(new java.awt.Dimension(40, 40));
        cmdLogin.setMinimumSize(new java.awt.Dimension(40, 40));
        cmdLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLoginActionPerformed(evt);
            }
        });

        checkR.setText("show password");
        checkR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmailAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(cmdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(checkR)
                .addGap(34, 34, 34))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(cmdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void cmdLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLoginActionPerformed
        String emailAddress = txtEmailAddress.getText();
        String pass = txtPassword.getText();
        String[] tempArray = new String[100];
        
        if(emailAddress.isEmpty() || pass.isEmpty()){
            JOptionPane.showMessageDialog(this, "Fill all fields"); 
            return;
        }
        
        /*try{
            FileReader fr = new FileReader("UserRegister.txt");
            
            Scanner sc = new Scanner(fr);
            String line;
            String[] lineArr;
            int currIn=0;
            while(sc.hasNextLine()){
                line = sc.nextLine();
                lineArr = line.split(",");
                if(lineArr[7].equals(emailAddress) && lineArr[8].equals(pass)){
                    JOptionPane.showMessageDialog(null, "Login successfull");
                    tempArray[currIn++]=line;
                    
                    try {
                        FileWriter wr = new FileWriter("Login.txt",true);
                        wr.write(emailAddress + " , " +pass);
                        wr.write(System.getProperty("line.separator"));
                        wr.close();
            
                    }
                    catch(Exception e){
                        System.out.println(e.toString());

                    }
                    break;
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Email Address or Password");
                    tempArray[currIn++]=line;
                    return;
                }
            }fr.close();
        }
        
        catch(Exception e){
            System.out.println(e.toString());
        
        }*/
        
        // ... (previous code)

    try {
        FileReader fr = new FileReader("UserRegister.txt");

        Scanner sc = new Scanner(fr);
        String line;
        String[] lineArr;
        int currIn = 0;
        boolean loginSuccessful = false;

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            lineArr = line.split(",");

        // Adjust the indices based on your data structure
            if (lineArr.length >= 9 && lineArr[7].equals(emailAddress) && lineArr[8].equals(pass)) {
                JOptionPane.showMessageDialog(null, "Login successful");
                tempArray[currIn++] = line;
                loginSuccessful = true;
            
                try {
                        FileWriter wr = new FileWriter("Login.txt",true);
                        wr.write(emailAddress + " , " +pass);
                        wr.write(System.getProperty("line.separator"));
                        wr.close();
            
                    }
                    catch(Exception e){
                        System.out.println(e.toString());

                    }
                  break;
            }   else {
                     tempArray[currIn++] = line;
            }
        }   
        fr.close();

    // Move the incorrect message outside the loop
        if (!loginSuccessful) {
            JOptionPane.showMessageDialog(null, "Incorrect Email Address or Password");
            
        }

    // Additional actions if login is successful can be added here.

        } catch (Exception e) {
                e.printStackTrace();
        }
        
        /*try {
            FileWriter wr = new FileWriter("Login.txt",true);
            wr.write(emailAddress + "," +pass);
            wr.write(System.getProperty("line.separator"));
            wr.close();
            
        }
        catch(Exception e){
            System.out.println(e.toString());

        }*/
       
    }//GEN-LAST:event_cmdLoginActionPerformed

    private void checkRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRActionPerformed
        if(checkR.isSelected()){
            txtPassword.setEchoChar((char) 0);
            
        }else{
            txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_checkRActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private airswift.Background background;
    private javax.swing.JCheckBox checkR;
    private swing.ButtonGradient cmdLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panel;
    private airswift.TextField txtEmailAddress;
    private airswift.PasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
