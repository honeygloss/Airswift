/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package airswift;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import javaswingdev.GradientDropdownMenu;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author ASUS
 */
public class FlightBooking extends javax.swing.JPanel {
    private int randomNum;
    private GradientDropdownMenu menu;
    private Booking book;
    private int selectedFlightIndex =-1;
    private String timeAvail[][] = {{"02:00", "03:00"},{"04:55","05:55"}, {"07:05","08:05"},{"09:15", "10:15"}, 
                                    {"12:05", "13:05"},{"14:45","15:45"}, {"17:00", "18:00"},
                                    {"19:55", "20:55"}, {"21:15", "22:15"},{"23:00", "00:00"}};
    
    private Image backgroundImage;
    /**
     * Creates new form FlightBooking
     */
    /**
     *
     * @param menu
     * @param booking
     */
    public FlightBooking(GradientDropdownMenu menu, Booking booking) {
        book = booking;
        this.menu = menu;
        initComponents();
        javax.swing.ImageIcon backgroundImageIcon = new javax.swing.ImageIcon("C:\\Users\\zamhu\\Documents\\NetBeansProjects\\New Folder\\Airswift\\src\\airswift\\airport2.jpg");
        backgroundImage = backgroundImageIcon.getImage();
        
        
        
        // Display booking information selected in the Flight Menu
        departShort.setText(book.getDepartShort());
        departLong.setText(book.getDepartLong().toUpperCase());
        returnShort.setText(book.getReturnShort());
        returnLong.setText(book.getReturnLong().toUpperCase());
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd MMM yyyy");
        departDate.setText(dateFormat1.format(book.getDepartDate()));
        String passString = ""+book.getPassenger();
        passenger.setText(passString);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("EEEE, dd MMMM yyyy", Locale.ENGLISH);
        departDateDis.setText(dateFormat2.format(book.getDepartDate()).toUpperCase());
        
        // Assign time available
        
        
        // Generate random number of available tickets
        Random random = new Random();
        do{
            randomNum = random.nextInt(10);
        }while(randomNum==0);
        
        int indFTime[]=new int[randomNum], indFNum[]=new int[randomNum];
        String flightTime[][]=new String[randomNum][2];
        String flightName[]=new String[randomNum];
        String flightid[] = new String[randomNum];
        int newValue;
        boolean isDuplicate;
        int ind = 0;
        
        // generate random index for randomNum tickets
        for (int i = 0; i < randomNum; i++) {
            do {
                newValue = random.nextInt(10);
                isDuplicate = false;

                for (int j = 0; j < i; j++) {
                    if (indFTime[j] == newValue) {
                        isDuplicate = true;
                        break;
                    }
                }
            } while (isDuplicate);

            indFTime[i] = newValue;
            do{
                indFNum[i]=random.nextInt(1000);
            }while(indFNum[i]<100);
        }
        
        // create flight name
        for(int i=0; i<randomNum; i++){
            flightName[i]="AS "+Integer.toString(indFNum[i]);
            for(int j=0; j<2; j++){
                flightTime[i][j]=timeAvail[indFTime[i]][j];
            }
        }
        try {
                Path filePath = Paths.get("FlightSchedule.txt");

                // Check if the file exists, create it if it doesn't
                if (!Files.exists(filePath)) {
                    Files.createFile(filePath);
                }
                //  count how many lines in the file (How many schedules)
                int lineCount = (int) Files.lines(Paths.get("FlightSchedule.txt")).count();
                int flightID=1000+lineCount;        // to create new flightID for the newline
                FlightSchedule fstemp[]=new FlightSchedule[900];        //  temporarily store the flight schedule
                int t = 0;      //  the first index of the temporary flight schedule
                try (Scanner filein = new Scanner(new FileReader("FlightSchedule.txt"))) {
                    while(filein.hasNextLine()){       
                        String line = filein.nextLine();
                        StringTokenizer st = new StringTokenizer(line, ";");
                        int idTemp = Integer.parseInt(st.nextToken());
                        String nameTemp = st.nextToken();
                        String departTemp = st.nextToken();
                        String returnTemp = st.nextToken();
                        String dateString = st.nextToken();  // Read the date as a string
                        Date dateTemp = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.forLanguageTag("ms-MY")).parse(dateString);
                        String timeTemp = st.nextToken();
                        String time2Temp = st.nextToken();
                        fstemp[t] = new FlightSchedule(idTemp, nameTemp, departTemp, returnTemp, dateTemp, timeTemp, time2Temp);
                        t++;
                    }
                }
                // Create a SimpleDateFormat object with the desired pattern and locale
                SimpleDateFormat sdf = new SimpleDateFormat("EEE dd MMM", Locale.ENGLISH);
                // Format the date using the SimpleDateFormat
                String formatDepartDate = sdf.format(book.getDepartDate());
                
                boolean hasTicket=false;        // check if the schedule has already written to the file
                for(int s=0; s<lineCount; s++){
                    String tempDate = sdf.format(fstemp[s].getDate());
                    if(formatDepartDate.equalsIgnoreCase(tempDate) && book.getDepartLong().equals(fstemp[s].getDestination()) && booking.getReturnLong().equals(fstemp[s].getArrival()) ){
                        hasTicket=true;
                    }
                }


                if(!hasTicket){
                    try (PrintWriter pr1 = new PrintWriter(new FileWriter("FlightSchedule.txt", true))) {
                        for(int i=0; i<randomNum; i++){
                            //  write the flight schedule to the file
                            pr1.write(flightID + ";" + flightName[i]+ ";" + book.getDepartLong() + ";" + booking.getReturnLong() + ";" + book.getDepartDate().toString()+ ";" + flightTime[i][0]+ ";" + "\n");       
                            fstemp[t]= new FlightSchedule(flightID, flightName[i],book.getDepartLong(), book.getReturnLong(), book.getDepartDate(), flightTime[i][0], flightTime[i][1]);
                            flightid[i]=Integer.toString(flightID);
                            flightID++;
                            t++;     
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }    
                }
                
            } catch (IOException | ParseException e) {
                e.printStackTrace();
        }

        JPanel dynamicButtonsPanel = new JPanel();
        dynamicButtonsPanel.setBackground(new Color(153, 153, 255));
        dynamicButtonsPanel.setLayout(new BoxLayout(dynamicButtonsPanel, BoxLayout.Y_AXIS));
        dynamicButtonsPanel.setBounds(0, 260, 900, 530);
        dynamicButtonsPanel.setVisible(true);
        
        JButton[] buttons = new JButton[randomNum];

        for (int i = 0; i < randomNum; i++) {
            if(booking.getCabin().equalsIgnoreCase("Economy"))
                buttons[i] = new JButton("<html><div style='text-align: center; line-height: 100%;'><font color='#666666'><span style='font-size:16px;'><b>"
                +flightTime[i][0]+"<span style='font-size:10px;'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;....................&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style='font-size:16px;'>"+flightTime[i][1]+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style='font-size:11px;'><font color='black'>Economy</b><br>"
                + "<span style='font-size:9px;'><b><font color='#666666'>"+book.getDepartShort()+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color='#666666'>" + book.getReturnShort()+ "</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color='black'>From<br><font color='#666666'>AirSwift Airline - "+ flightName[i] + 
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color='black'>RM <b>100.00</b></html>");
            else
                buttons[i] = new JButton("<html><div style='text-align: center; line-height: 100%;'><font color='#666666'><span style='font-size:16px;'><b>"
                +flightTime[i][0]+"<span style='font-size:10px;'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;....................&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style='font-size:16px;'>"+flightTime[i][1]+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style='font-size:11px;'><font color='black'>Business</b><br>"
                + "<span style='font-size:9px;'><b><font color='#666666'>"+book.getDepartShort()+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color='#666666'>" + book.getReturnShort()+ "</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color='black'>From<br><font color='#666666'>AirSwift Airline - "+ flightName[i] + 
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color='black'>RM <b>250.00</b></html>");
          
            buttons[i].setFont(new Font("Segoe UI", Font.PLAIN, 12));
            buttons[i].setBackground(new Color(153, 153, 255));
            buttons[i].setForeground(new Color(204,204,255));
            buttons[i].setPreferredSize(new Dimension(200, 200));
          
            dynamicButtonsPanel.add(buttons[i]);
            
            final int index = i; // need to make a final variable for use inside the ActionListener
            final int finalRandomNum = randomNum;

            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle the button click event
                    // You can store the selected index or perform other actions here
                    selectedFlightIndex = index;

                    // Optionally, you can change the appearance of the selected button
                    buttons[index].setBackground(new Color(102,0,102));

                    // Optionally, reset the appearance of other buttons
                    for (int j = 0; j < finalRandomNum; j++) {
                        if (j != index) {
                            buttons[j].setBackground(new Color(153, 153, 255));
                        }
                    }
                }
            });
        }
        if(selectedFlightIndex!=-1)
            ind = selectedFlightIndex;
        final int finalRandomNum = randomNum;
        final String finalfID = flightid[ind];
        continueButt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle the continuation of the booking process
                // Save the selected flight information to the Booking class
                if (selectedFlightIndex >= 0 && selectedFlightIndex < finalRandomNum) {
                    book.setDepartTimeFromTimeAvail(selectedFlightIndex, flightTime);
                    book.setReturnTimeFromTimeAvail(selectedFlightIndex, flightTime);
                    book.setFlightName(flightName, selectedFlightIndex);
                    book.setFlightIDDepart(finalfID);
                    
                    SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        showSeatPanel();
                    }
                });
                    
                } else {
                    // Handle the case where no flight is selected
                    String message = "Please select a flight before continuing.";
                    JOptionPane.showMessageDialog(null, message, "No Flight Selected", JOptionPane.WARNING_MESSAGE);
                }
                
            }
        });
        //Create a JScrollPane and add your main panel to it
        JScrollPane scrollPane = new JScrollPane(dynamicButtonsPanel);
        scrollPane.setBounds(0, 260, 900,210);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); // Disable horizontal scroll
        //scrollPane.getVerticalScrollBar().setUnitIncrement(16);  // Adjust the value as needed
        add(scrollPane);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the background image
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
    
    public void showSeatPanel() {
    try {
        // Assuming paymentPanel is an instance of the PaymentP class
        FlightSeat seatPanel = new FlightSeat(book,menu);

        // Get the parent container of the current FlightBooking panel
        Container parent = this.getParent();

        // Hide the menu before replacing the current panel
        if (menu != null) {
            menu.setVisible(false);
        }

        // Replace the current FlightBooking panel with the PaymentP panel
        if (parent != null) {
            parent.remove(this);
            parent.add(seatPanel);
            parent.revalidate();
            parent.repaint();
        }
    } catch (Exception ex) {
        ex.printStackTrace(); // Print the exception for debugging
        System.err.println("Error creating or displaying PaymentP panel.");
    }
    }
    public void setBooking(Booking booking){
        book = booking;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        findAflight = new javax.swing.JPanel();
        departShort = new javax.swing.JLabel();
        departLong = new javax.swing.JLabel();
        returnShort = new javax.swing.JLabel();
        returnLong = new javax.swing.JLabel();
        departLabel = new javax.swing.JLabel();
        departDate = new javax.swing.JLabel();
        passenger = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        passengerLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        departDateDis = new javax.swing.JLabel();
        continueButt = new airswift.ButtonGradient();
        backButt = new airswift.ButtonGradient();

        setBackground(new java.awt.Color(204, 204, 255));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(900, 530));

        bg.setBackground(new java.awt.Color(204, 204, 255));
        bg.setForeground(new java.awt.Color(204, 204, 255));
        bg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bg.setMaximumSize(new java.awt.Dimension(900, 530));
        bg.setMinimumSize(new java.awt.Dimension(900, 530));
        bg.setOpaque(false);
        bg.setPreferredSize(new java.awt.Dimension(900, 530));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("SELECT YOUR DEPARTURE :");

        findAflight.setBackground(new java.awt.Color(255, 255, 255));
        findAflight.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 102)));
        findAflight.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        findAflight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(findAflight, java.awt.BorderLayout.CENTER);

        departShort.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        departShort.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departShort.setText("jLabel1");
        findAflight.add(departShort, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 20, 45, -1));

        departLong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        departLong.setForeground(new java.awt.Color(102, 102, 102));
        departLong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departLong.setText("jLabel1");
        findAflight.add(departLong, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, -1));

        returnShort.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        returnShort.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnShort.setText("jLabel1");
        findAflight.add(returnShort, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 20, 45, -1));

        returnLong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        returnLong.setForeground(new java.awt.Color(102, 102, 102));
        returnLong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnLong.setText("jLabel1");
        findAflight.add(returnLong, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 100, -1));

        departLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        departLabel.setText("Depart");
        findAflight.add(departLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        departDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        departDate.setForeground(new java.awt.Color(102, 102, 102));
        departDate.setText("jLabel2");
        findAflight.add(departDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 80, -1));

        passenger.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passenger.setForeground(new java.awt.Color(102, 102, 102));
        passenger.setText("jLabel1");
        findAflight.add(passenger, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 30, -1));

        jSeparator1.setBackground(new java.awt.Color(102, 0, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 0, 102));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        findAflight.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 10, 80));

        jSeparator2.setBackground(new java.awt.Color(102, 0, 102));
        jSeparator2.setForeground(new java.awt.Color(102, 0, 102));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        findAflight.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 10, 80));

        passengerLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passengerLabel.setText("Passenger");
        findAflight.add(passengerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 69, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setToolTipText("");
        jPanel1.setAutoscrolls(true);
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.BorderLayout());

        departDateDis.setBackground(new java.awt.Color(255, 255, 255));
        departDateDis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        departDateDis.setForeground(new java.awt.Color(51, 51, 51));
        departDateDis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departDateDis.setText("jLabel2");
        departDateDis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(departDateDis, java.awt.BorderLayout.CENTER);

        continueButt.setBackground(new java.awt.Color(204, 0, 153));
        continueButt.setBorder(null);
        continueButt.setForeground(new java.awt.Color(204, 204, 204));
        continueButt.setText("Continue");
        continueButt.setColor1(new java.awt.Color(102, 0, 102));
        continueButt.setColor2(new java.awt.Color(102, 0, 102));
        continueButt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        continueButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtActionPerformed(evt);
            }
        });

        backButt.setBackground(new java.awt.Color(204, 0, 153));
        backButt.setBorder(null);
        backButt.setForeground(new java.awt.Color(102, 102, 102));
        backButt.setText("Back");
        backButt.setColor1(new java.awt.Color(204, 204, 204));
        backButt.setColor2(new java.awt.Color(204, 204, 204));
        backButt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(findAflight, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(backButt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(660, 660, 660)
                        .addComponent(continueButt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(findAflight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(234, 234, 234)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(continueButt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void continueButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtActionPerformed
         
       // TODO add your handling code here:
        
    }//GEN-LAST:event_continueButtActionPerformed

    private void backButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtActionPerformed
        // TODO add your handling code here:
        Customer cust = new Customer();
        new FlightMenu(cust).setVisible(true);
        
    }//GEN-LAST:event_backButtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private airswift.ButtonGradient backButt;
    private javax.swing.JPanel bg;
    private airswift.ButtonGradient continueButt;
    public javax.swing.JLabel departDate;
    public javax.swing.JLabel departDateDis;
    public javax.swing.JLabel departLabel;
    public javax.swing.JLabel departLong;
    public javax.swing.JLabel departShort;
    private javax.swing.JPanel findAflight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel passenger;
    public javax.swing.JLabel passengerLabel;
    public javax.swing.JLabel returnLong;
    public javax.swing.JLabel returnShort;
    // End of variables declaration//GEN-END:variables

    void setGradientDropdownMenu(GradientDropdownMenu menu) {
        this.menu = menu;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Container getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void refreshContent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
