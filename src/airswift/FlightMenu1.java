/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airswift;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.io.FileReader;
import java.util.Date;
import java.util.Scanner;
import javaswingdev.GradientDropdownMenu;
import javaswingdev.MenuEvent;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


/**
 *
 * @author ASUS
 */
public class FlightMenu1 extends javax.swing.JFrame {
  
    /**
     * Creates new form FlightMenu1
     */
    public FlightMenu1() {
        initComponents();
         AutoCompleteDecorator.decorate(fromListdown);
        AutoCompleteDecorator.decorate(toListdown);
        AutoCompleteDecorator.decorate(passengersListdown);
        AutoCompleteDecorator.decorate(cabinClassListdown);
        setResizable(false);
        Date min = new Date();
        
        departDate.setMinSelectableDate(min);
        returnDate.setMinSelectableDate(min);
        departDate.getDateEditor().addPropertyChangeListener(e -> {
            if ("date".equals(e.getPropertyName())) {
                // When the departure date changes, set the minimum selectable date for return date
                Date selectedDepartureDate = departDate.getDate();
                returnDate.setMinSelectableDate(selectedDepartureDate);
            }
        });

        
        returnDate.getDateEditor().addPropertyChangeListener(e -> {
            if ("date".equals(e.getPropertyName())) {
                
            }
        });
        
        GradientDropdownMenu menu = new GradientDropdownMenu();
        menu.setFont(new java.awt.Font("Segoe UI", 1, 12));
        menu.setBackground(new Color(51,51,51));
        //menu.setHeaderGradient(false);
        menu.addItem("   AirSwift    ");
        menu.addItem("   Profile     ");
        menu.addItem("   Log Out     ");
        
        
        menu.applay(this);
        menu.setLayout(new MigLayout("inset 5", "[left, grow][right]", "[top, fill]"));
        menu.addEvent(new MenuEvent(){
           @Override
           public void selected(int index, int subIndex, boolean menuItem){
               if(menuItem){
                 if(index == 1){
                   showForm(new CustomerInformation1(menu.getMenuNameAt(index, subIndex).trim()));
                 }
                 if(index == 0){
                   initComponents(); 
               }
           }}
        });
}
        private void showForm(Component com) {
           jPanel1.removeAll();
           jPanel1.setLayout(new BorderLayout());
           jPanel1.add(com);
           jPanel1.repaint();
           jPanel1.revalidate();

        }
        

        // Add the custom panel as the first component of myBookingTab
        
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        myBookingTab = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        departDate = new com.toedter.calendar.JDateChooser();
        departDateLabel = new javax.swing.JLabel();
        returnDate = new com.toedter.calendar.JDateChooser();
        toListdown = new javax.swing.JComboBox<>();
        fromListdown = new javax.swing.JComboBox<>();
        passengersListdown = new javax.swing.JComboBox<>();
        fromLabel2 = new javax.swing.JLabel();
        fromLabel = new javax.swing.JLabel();
        cabinClassListdown = new javax.swing.JComboBox<>();
        returnDateLabel = new javax.swing.JLabel();
        findFlightButton = new javax.swing.JButton();
        toLabel = new javax.swing.JLabel();
        fromLabel1 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myBookingTab.setBackground(new java.awt.Color(153, 153, 255));
        myBookingTab.setForeground(new java.awt.Color(0, 51, 51));
        myBookingTab.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        myBookingTab.addTab("MY BOOKING", jPanel3);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        departDate.setDateFormatString("dd-MM-yyyy");

        departDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        departDateLabel.setForeground(new java.awt.Color(51, 51, 51));
        departDateLabel.setText("Depart Date");

        returnDate.setDateFormatString("dd-MM-yyyy");

        toListdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kuala Lumpur (KUL)", "Subang (SZB)", "Kota Bharu (KBR)", "Kuala Terengganu (TGG)", "Johor Bahru (JHB)", "Alor Setar (AOR)", "Kerteh (KTE)", "Penang (PEN)", "Kuantan (KUA)", "Langkawi (LGK)", "Miri (MYY)", "Mulu (MZV)", "Sibu (SBW)", "Tawau (TWU)", "Labuan (LBU)", "Bintulu (BTU)", "Kuching (KCH)", "Limbang (LMN)", "Sandakan (SDK)", "Lahad Datu (LDU)", "Kota Kinabalu (BKI)", "Bario (BBN)", "Kudat (KUD)", "Lawa (LWY)", "Mukah (MKM)", "Marudi (MUR)", "Bakalalan (BKM)", "Long Akah (LKH)", "Long Banga (LBH)", "Long Lellang (LGL)", "Long Seridan (ODN)", "Tanjung Manis (TGC)" }));
        toListdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toListdownActionPerformed(evt);
            }
        });

        fromListdown.setForeground(new java.awt.Color(220, 235, 235));
        fromListdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kuala Lumpur (KUL)", "Subang (SZB)", "Kota Bharu (KBR)", "Kuala Terengganu (TGG)", "Johor Bahru (JHB)", "Alor Setar (AOR)", "Kerteh (KTE)", "Penang (PEN)", "Kuantan (KUA)", "Langkawi (LGK)", "Miri (MYY)", "Mulu (MZV)", "Sibu (SBW)", "Tawau (TWU)", "Labuan (LBU)", "Bintulu (BTU)", "Kuching (KCH)", "Limbang (LMN)", "Sandakan (SDK)", "Lahad Datu (LDU)", "Kota Kinabalu (BKI)", "Bario (BBN)", "Kudat (KUD)", "Lawa (LWY)", "Mukah (MKM)", "Marudi (MUR)", "Bakalalan (BKM)", "Long Akah (LKH)", "Long Banga (LBH)", "Long Lellang (LGL)", "Long Seridan (ODN)", "Tanjung Manis (TGC)" }));
        fromListdown.setName("FROM"); // NOI18N
        fromListdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromListdownActionPerformed(evt);
            }
        });

        passengersListdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        passengersListdown.setName("FROM"); // NOI18N
        passengersListdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passengersListdownActionPerformed(evt);
            }
        });

        fromLabel2.setBackground(new java.awt.Color(51, 51, 51));
        fromLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fromLabel2.setForeground(new java.awt.Color(51, 51, 51));
        fromLabel2.setText("Passengers");

        fromLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fromLabel.setForeground(new java.awt.Color(51, 51, 51));
        fromLabel.setText("Class Cabin");

        cabinClassListdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy", "Business" }));
        cabinClassListdown.setName("FROM"); // NOI18N
        cabinClassListdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cabinClassListdownActionPerformed(evt);
            }
        });

        returnDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        returnDateLabel.setForeground(new java.awt.Color(51, 51, 51));
        returnDateLabel.setText("Return Date");

        findFlightButton.setBackground(new java.awt.Color(0, 102, 102));
        findFlightButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        findFlightButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\AirSwift\\search.png")); // NOI18N
        findFlightButton.setText("FIND A FLIGHT");
        findFlightButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        findFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findFlightButtonActionPerformed(evt);
            }
        });

        toLabel.setBackground(new java.awt.Color(51, 51, 51));
        toLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        toLabel.setForeground(new java.awt.Color(51, 51, 51));
        toLabel.setText("To");

        fromLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fromLabel1.setForeground(new java.awt.Color(51, 51, 51));
        fromLabel1.setText("From");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fromLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromListdown, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passengersListdown, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cabinClassListdown, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(toListdown, javax.swing.GroupLayout.Alignment.LEADING, 0, 180, Short.MAX_VALUE))
                            .addComponent(toLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(departDate, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(departDateLabel))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(findFlightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(returnDateLabel)
                                    .addComponent(returnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(departDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fromListdown, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(toListdown, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passengersListdown, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cabinClassListdown, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findFlightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 900, 180));

        myBookingTab.addTab("BOOK A FLIGHT", jPanel2);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\AirSwift\\src\\airswift\\fa1bd79d-f460-43e5-80e5-cbe938e3739e-94.png")); // NOI18N

        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("AirSwift, Soar Beyond.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(myBookingTab, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(52, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171)
                .addComponent(myBookingTab, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(127, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 940, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toListdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toListdownActionPerformed

    }//GEN-LAST:event_toListdownActionPerformed

    private void fromListdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromListdownActionPerformed

        try{
            FileReader fr = new FileReader("Flight.txt");
            Scanner sc = new Scanner(fr);
            String line;
            String[] lineArr;
            while(sc.hasNextLine()){
                line = sc.nextLine();
                lineArr = line.split("\n");
                if(lineArr[0].equals(fromListdown.getSelectedItem())){
                    toListdown.removeItem(fromListdown.getSelectedItem());
                }

            }

        }catch(Exception e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_fromListdownActionPerformed

    private void passengersListdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passengersListdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passengersListdownActionPerformed

    private void cabinClassListdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cabinClassListdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cabinClassListdownActionPerformed

    private void findFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findFlightButtonActionPerformed
        if(fromListdown.getSelectedItem().toString().isEmpty() || toListdown.getSelectedItem().toString().isEmpty() || passengersListdown.getSelectedItem().toString().isEmpty() || cabinClassListdown.getSelectedItem().toString().isEmpty() || departDate.getDate() == null){
            JOptionPane.showMessageDialog(this, "Fill all the fields");
            return;
        }
        if(fromListdown.getSelectedItem().toString().equals(toListdown.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(this, "From and To flights needs to be different");
            return;
        }

    }//GEN-LAST:event_findFlightButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FlightMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlightMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlightMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlightMenu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlightMenu1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cabinClassListdown;
    private com.toedter.calendar.JDateChooser departDate;
    private javax.swing.JLabel departDateLabel;
    private javax.swing.JButton findFlightButton;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JLabel fromLabel1;
    private javax.swing.JLabel fromLabel2;
    private javax.swing.JComboBox<String> fromListdown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane myBookingTab;
    private javax.swing.JComboBox<String> passengersListdown;
    private com.toedter.calendar.JDateChooser returnDate;
    private javax.swing.JLabel returnDateLabel;
    private javax.swing.JLabel toLabel;
    private javax.swing.JComboBox<String> toListdown;
    // End of variables declaration//GEN-END:variables
}
