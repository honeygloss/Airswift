/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airswift;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import javaswingdev.GradientDropdownMenu;
import javaswingdev.MenuEvent;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author ASUS
 */
public class FlightMenu extends javax.swing.JFrame {
    private GradientDropdownMenu menu;
    private JButton[] bookingButtons; // Array to store dynamically created buttons
    private int numberOfBookings;
    private boolean buttonsCreated = false;
    private Customer cust;
    /**
     * Creates new form FlightMenu1
     */
    public FlightMenu(Customer cust) {
        initComponents();
        this.cust = cust;
        try{
        Image icon = ImageIO.read(new File("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\AirSwift\\src\\airswift\\Lyft _ Plane1.png"));
        this.setIconImage(icon);
        this.setTitle("AirSwift");
        this.setFont(new java.awt.Font("Segoe UI", 1, 12));
        this.setForeground(Color.black);
        }catch (IOException e) {
         e.printStackTrace(); // Handle the exception appropriately, e.g., show an error message
        }
        setResizable(true);
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
        
        this.menu = new GradientDropdownMenu();
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
                    showForm(new CustomerInformation(cust));    
                 }
                 if(index == 0){
                    initComponents();
               }if( index == 2) {
                   new StartUp().setVisible(true);
                   dispose();     
               }
           }}
        });
        returnDate.setVisible(false);
        returnDateLabel.setVisible(false); 
    }

    public void showForm(Component com) {
        jPanel1.removeAll();
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(com);
        jPanel1.repaint();
        jPanel1.revalidate();
        if (com instanceof FlightBooking) {
            ((FlightBooking) com).setGradientDropdownMenu(menu);
        }
        /*else if(com instanceof FlightSeat){
            ((FlightSeat) com).setGradientDropdownMenu(menu);
        }   */
        else if(com instanceof FlightBookingTwoWay){
            ((FlightBookingTwoWay) com).setGradientDropdownMenu(menu);
        }
    }
    private void createBookingButtons() {
        SwingUtilities.invokeLater(() -> {
        jPanel3.removeAll();
        // Replace the following line with code to fetch the number of bookings from your data source
       
        int numberOfBookings = getNumberOfBookings();

        // Create a new ArrayList to store the dynamically created buttons
        bookingButtons = new JButton[numberOfBookings];
        jPanel3.setLayout(new FlowLayout((FlowLayout.CENTER)));

        // Create buttons based on the number of bookings
        for (int i = 1; i <= numberOfBookings; i++) {
            JButton bookingButton = new JButton("Booking " + i);
            bookingButtons[i - 1] = bookingButton;

            int finalI = i; 
            bookingButton.addActionListener(e -> handleBookingButtonClick(finalI)); 
            bookingButton.setVisible(true);
            bookingButton.setFont(new java.awt.Font("Segoe UI", 1, 12));
            bookingButton.setBackground(new Color(0,51,153));
            bookingButton.setForeground(new Color(255,255,255));
            bookingButton.setPreferredSize(new Dimension(120, 40));
            
            jPanel3.setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = i - 1; // Adjust as needed
            gbc.anchor = GridBagConstraints.CENTER;

            jPanel3.add(bookingButton,gbc);
        }

        // Repaint and revalidate the panel to reflect the changes
        jPanel3.repaint();
        jPanel3.revalidate();
        });
        
    }
    
    private int getNumberOfBookings() {
        int count=0;
        try (FileReader fr = new FileReader("Transaction.txt");
        Scanner sc = new Scanner(fr)) {
        String line;
        String[] lineArr;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                lineArr = line.split("\n");
                if (lineArr[0].equals(cust.getEmailAddress())) {
                    count++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace(); // Print exception details
        }
        return count; // Placeholder value; replace it with actual logic
    }
    
    private void handleBookingButtonClick(int bookingNumber) {
        // Handle the button click event for the specific booking (bookingNumber)
        JOptionPane.showMessageDialog(this, "Button " + bookingNumber + " clicked!");
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
        jLayeredPane2 = new javax.swing.JLayeredPane();
        myBookingTab = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        departDate = new com.toedter.calendar.JDateChooser();
        departDateLabel = new javax.swing.JLabel();
        returnDate = new com.toedter.calendar.JDateChooser();
        fromLabel2 = new javax.swing.JLabel();
        fromLabel = new javax.swing.JLabel();
        returnDateLabel = new javax.swing.JLabel();
        toLabel = new javax.swing.JLabel();
        fromLabel1 = new javax.swing.JLabel();
        findaFlightButton = new swing.ButtonGradient();
        toListdown = new combo_suggestion.ComboBoxSuggestion();
        fromListdown = new combo_suggestion.ComboBoxSuggestion();
        classCabinListdown = new combo_suggestion.ComboBoxSuggestion();
        passengersListdown2 = new combo_suggestion.ComboBoxSuggestion();
        returnCheckbox = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myBookingTab.setBackground(new java.awt.Color(153, 153, 255));
        myBookingTab.setForeground(new java.awt.Color(0, 51, 51));
        myBookingTab.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        myBookingTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myBookingTabMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        departDate.setBackground(new java.awt.Color(255, 255, 255));
        departDate.setDateFormatString("dd-MM-yyyy");

        departDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        departDateLabel.setForeground(new java.awt.Color(51, 51, 51));
        departDateLabel.setText("Depart Date");

        returnDate.setBackground(new java.awt.Color(255, 255, 255));
        returnDate.setDateFormatString("dd-MM-yyyy");

        fromLabel2.setBackground(new java.awt.Color(51, 51, 51));
        fromLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fromLabel2.setForeground(new java.awt.Color(51, 51, 51));
        fromLabel2.setText("Passengers");

        fromLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fromLabel.setForeground(new java.awt.Color(51, 51, 51));
        fromLabel.setText("Class Cabin");

        returnDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        returnDateLabel.setForeground(new java.awt.Color(51, 51, 51));
        returnDateLabel.setText("Return Date");

        toLabel.setBackground(new java.awt.Color(51, 51, 51));
        toLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        toLabel.setForeground(new java.awt.Color(51, 51, 51));
        toLabel.setText("To");

        fromLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fromLabel1.setForeground(new java.awt.Color(51, 51, 51));
        fromLabel1.setText("From");

        findaFlightButton.setText("Find a Flight");
        findaFlightButton.setColor1(new java.awt.Color(0, 51, 255));
        findaFlightButton.setColor2(new java.awt.Color(0, 51, 153));
        findaFlightButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        findaFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findaFlightButtonActionPerformed(evt);
            }
        });

        toListdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kuala Lumpur (KUL)", "Subang (SZB)", "Kota Bharu (KBR)", "Kuala Terengganu (TGG)", "Johor Bahru (JHB)", "Alor Setar (AOR)", "Kerteh (KTE)", "Penang (PEN)", "Kuantan (KUA)", "Langkawi (LGK)", "Miri (MYY)", "Mulu (MZV)", "Sibu (SBW)", "Tawau (TWU)", "Labuan (LBU)", "Bintulu (BTU)", "Kuching (KCH)", "Limbang (LMN)", "Sandakan (SDK)", "Lahad Datu (LDU)", "Kota Kinabalu (BKI)", "Bario (BBN)", "Kudat (KUD)", "Lawa (LWY)", "Mukah (MKM)", "Marudi (MUR)", "Bakalalan (BKM)", "Long Akah (LKH)", "Long Banga (LBH)", "Long Lellang (LGL)", "Long Seridan (ODN)", "Tanjung Manis (TGC)" }));
        toListdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toListdownActionPerformed(evt);
            }
        });

        fromListdown.setForeground(new java.awt.Color(255, 255, 255));
        fromListdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kuala Lumpur (KUL)", "Subang (SZB)", "Kota Bharu (KBR)", "Kuala Terengganu (TGG)", "Johor Bahru (JHB)", "Alor Setar (AOR)", "Kerteh (KTE)", "Penang (PEN)", "Kuantan (KUA)", "Langkawi (LGK)", "Miri (MYY)", "Mulu (MZV)", "Sibu (SBW)", "Tawau (TWU)", "Labuan (LBU)", "Bintulu (BTU)", "Kuching (KCH)", "Limbang (LMN)", "Sandakan (SDK)", "Lahad Datu (LDU)", "Kota Kinabalu (BKI)", "Bario (BBN)", "Kudat (KUD)", "Lawa (LWY)", "Mukah (MKM)", "Marudi (MUR)", "Bakalalan (BKM)", "Long Akah (LKH)", "Long Banga (LBH)", "Long Lellang (LGL)", "Long Seridan (ODN)", "Tanjung Manis (TGC)" }));
        fromListdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromListdownActionPerformed(evt);
            }
        });

        classCabinListdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Economy", "Business" }));

        passengersListdown2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        passengersListdown2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passengersListdown2ActionPerformed(evt);
            }
        });

        returnCheckbox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        returnCheckbox.setForeground(new java.awt.Color(51, 51, 51));
        returnCheckbox.setText("Return");
        returnCheckbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                returnCheckboxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fromLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromListdown, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passengersListdown2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(classCabinListdown, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(returnDateLabel)
                            .addComponent(findaFlightButton, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(returnDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(toLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toListdown, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(departDateLabel)
                                    .addComponent(departDate, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(returnCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(toListdown, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fromListdown, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(departDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(returnDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fromLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(classCabinListdown, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passengersListdown2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(returnCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(findaFlightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 880, 170));

        myBookingTab.addTab("BOOK A FLIGHT", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        myBookingTab.addTab("MY BOOKING", jPanel3);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\AirSwift\\src\\airswift\\fa1bd79d-f460-43e5-80e5-cbe938e3739e-94.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("AirSwift, Soar Beyond.");

        jLayeredPane2.setLayer(myBookingTab, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addComponent(myBookingTab, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 23, Short.MAX_VALUE)))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(myBookingTab, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(239, Short.MAX_VALUE)))
        );

        myBookingTab.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 530));

        setSize(new java.awt.Dimension(909, 565));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void findaFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findaFlightButtonActionPerformed
        if(fromListdown.getSelectedItem().equals(toListdown.getSelectedItem())){
            JOptionPane.showMessageDialog(this, "From and To airports can not be the same"); 
            return;
        }
        Date returnDateValue = null;
        if (!returnCheckbox.isSelected()) {
            returnDate.setDate(new Date(0));
            returnDateValue = returnDate.getDate();
        }
        
        Booking book = new Booking();
        int startIndex = fromListdown.getSelectedItem().toString().indexOf("(");
        int lastIndex = fromListdown.getSelectedItem().toString().indexOf(")");
        book.setDepartShort(fromListdown.getSelectedItem().toString().substring((startIndex+1),lastIndex));
        startIndex = toListdown.getSelectedItem().toString().indexOf("(");
        lastIndex = toListdown.getSelectedItem().toString().indexOf(")");
        book.setReturnShort(toListdown.getSelectedItem().toString().substring((startIndex+1),lastIndex));
        startIndex = 0;
        lastIndex = fromListdown.getSelectedItem().toString().indexOf("(");
        book.setDepartLong(fromListdown.getSelectedItem().toString().substring(startIndex,lastIndex));
        lastIndex = toListdown.getSelectedItem().toString().indexOf("(");
        book.setReturnLong(toListdown.getSelectedItem().toString().substring(startIndex,lastIndex));
        book.setPassenger(Integer.parseInt(passengersListdown2.getSelectedItem().toString()));  
        book.setDepartDate(departDate.getDate());
        book.setCabin(classCabinListdown.getSelectedItem().toString());
        if(returnCheckbox.isSelected()){
            book.setReturnDate(returnDate.getDate());
            showForm(new FlightBookingTwoWay(menu, book));
        }
        else{
            book.setReturnDate(null);
            showForm(new FlightBooking(menu, book));
        }
       //showForm(new FlightSeat(book, menu));
 
    }//GEN-LAST:event_findaFlightButtonActionPerformed

    private void passengersListdown2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passengersListdown2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passengersListdown2ActionPerformed

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

    private void toListdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toListdownActionPerformed
       
    }//GEN-LAST:event_toListdownActionPerformed

    private void myBookingTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myBookingTabMouseClicked
        if (myBookingTab.getSelectedIndex() == 1) {
            createBookingButtons();
        }
    }//GEN-LAST:event_myBookingTabMouseClicked

    private void returnCheckboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_returnCheckboxItemStateChanged
         returnDate.setVisible(true);
         returnDateLabel.setVisible(true);
         returnDate.setEnabled(returnCheckbox.isSelected());
    }//GEN-LAST:event_returnCheckboxItemStateChanged

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
            java.util.logging.Logger.getLogger(FlightMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlightMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlightMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlightMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        final Customer cust = new Customer();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlightMenu(cust).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private combo_suggestion.ComboBoxSuggestion classCabinListdown;
    private com.toedter.calendar.JDateChooser departDate;
    private javax.swing.JLabel departDateLabel;
    private swing.ButtonGradient findaFlightButton;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JLabel fromLabel1;
    private javax.swing.JLabel fromLabel2;
    private combo_suggestion.ComboBoxSuggestion fromListdown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane myBookingTab;
    private combo_suggestion.ComboBoxSuggestion passengersListdown2;
    private javax.swing.JCheckBox returnCheckbox;
    private com.toedter.calendar.JDateChooser returnDate;
    private javax.swing.JLabel returnDateLabel;
    private javax.swing.JLabel toLabel;
    private combo_suggestion.ComboBoxSuggestion toListdown;
    // End of variables declaration//GEN-END:variables
}
