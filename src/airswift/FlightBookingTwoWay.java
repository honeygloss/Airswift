/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package airswift;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.StringTokenizer;
import javaswingdev.GradientDropdownMenu;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author zamhu
 */
public class FlightBookingTwoWay extends javax.swing.JPanel {
    private GradientDropdownMenu gradientDropdownMenu;
    private Booking book;
    /**
     * Creates new form FlightBookingTwoWay
     */
    public FlightBookingTwoWay() {
        initComponents();
    }
    
    public FlightBookingTwoWay(GradientDropdownMenu menu, Booking booking) {
        this.gradientDropdownMenu = menu;
        book = booking;
        
        initComponents();
        
        departShort.setText(book.getDepartShort());
        departLong.setText(book.getDepartLong().toUpperCase());
        returnShort.setText(book.getReturnShort());
        returnLong.setText(book.getReturnLong().toUpperCase());
       
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd MMM yyyy");
        departDate.setText(dateFormat1.format(book.getDepartDate()));
        returnDate.setText(dateFormat1.format(book.getReturnDate()));
        
        
        String passString = ""+book.getPassenger();
        passenger.setText(passString);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("EEEE, dd MMMM yyyy", Locale.ENGLISH);
        departDateDis.setText(dateFormat2.format(book.getDepartDate()).toUpperCase());
        
        
        String timeAvail[][] = {{"02:00", "03:00"},{"04:55","05:55"}, {"07:05","08:05"},{"09:15", "10:15"}, 
                                    {"12:05", "13:05"},{"14:45","15:45"}, {"17:00", "18:00"},
                                    {"19:55", "20:55"}, {"21:15", "22:15"},{"23:00", "00:00"}};
        
        Random random = new Random();
        int randomNum;
        do{
            randomNum = random.nextInt(10);
        }while(randomNum==0);
        
        int indFTime[]=new int[randomNum], indFNum[]=new int[randomNum];
        String flightName[]=new String[randomNum];
        String flightTime[][]=new String[randomNum][2];
        int newValue;
        boolean isDuplicate;

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
        
        for(int i=0; i<randomNum; i++){
            flightName[i]="AS "+Integer.toString(indFNum[i]);
            for(int j=0; j<2; j++){
                flightTime[i][j]=timeAvail[indFTime[i]][j];
            }
        }
        
        String seatName[] =new String[69];
        boolean flagSeat[]= new boolean[69];
        
        try {
            int lineCount = (int) Files.lines(Paths.get("FlightSchedule.txt")).count();
            int flightID=1000+lineCount;
            FileWriter fr1 = new FileWriter("FlightSchedule.txt", true);        
            PrintWriter pr1 = new PrintWriter(fr1);
            FileWriter fr2 = new FileWriter("AvailableSeat.txt", true);     
            PrintWriter pr2 = new PrintWriter(fr2);

            FileReader read = new FileReader("FlightSchedule.txt");
            java.util.Scanner filein= new java.util.Scanner(read);

            FlightSchedule fstemp[]=new FlightSchedule[900];
            int t = 0;
            while(filein.hasNextLine()){        // assign all schedules in fstemp[] (for comparison)
               
                String line =filein.nextLine();
                StringTokenizer st =new StringTokenizer(line, ";");
                int idTemp = Integer.parseInt(st.nextToken());
                String nameTemp= st.nextToken();
                String departTemp = st.nextToken();
                String returnTemp = st.nextToken();
                SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy HH:mm:ss");
                Date dateTemp = sdf.parse(st.nextToken());
                String timeTemp = st.nextToken();

                fstemp[t]=new FlightSchedule(idTemp, nameTemp,departTemp, returnTemp,dateTemp, timeTemp);

                t++;
            }
            boolean hasTicket=false;        // check if the schedule has already written in the file
            for(int s=0; s<lineCount; s++){
                if(book.getDepartDate().equals(fstemp[s].getDate()) && book.getDepartLong().equals(fstemp[s].getDestination()) && book.getReturnLong().equals(fstemp[s].getArrival())){
                    hasTicket=true;
                    break;
                }
            }
            if(!hasTicket){
                for(int i=0; i<randomNum; i++){
                    pr1.write(flightID + ";" + flightName[i]+ ";" + book.getDepartLong() + ";" + book.getReturnLong() + ";" + book.getDepartDate().toString()+ ";" + flightTime[i][0]+ ";" + "\n");       // print flight schedule
                    fstemp[t]= new FlightSchedule(flightID, flightName[i],book.getDepartLong() , book.getReturnLong(), book.getDepartDate(), flightTime[i][0]);
                    int z=0;
                    pr2.write(flightID + ";");
                    for(int a=0; a<4; a++){   //z is the first index of BUSINESS seat ,y is the first index of ECONOMY seat  
                        for(int j=0; j<6; j++){
                            switch(j){
                                case 0 :
                                    seatName[z]=Integer.toString(a+1)+"A";
                                    break;

                                case 1 :
                                    seatName[z]=Integer.toString(a+1)+"B";
                                    break;


                                case 2 :
                                    seatName[z]=Integer.toString(a+1)+"C";
                                    break;

                                case 3 :
                                    seatName[z]=Integer.toString(a+1)+"D";
                                    break;
                                    
                                case 4 :
                                    seatName[z]=Integer.toString(a+1)+"E";
                                    break;
                                    
                                case 5 :
                                    seatName[z]=Integer.toString(a+1)+"F";
                                    break;

                            }
                            flagSeat[z]=true;
                            pr2.write(seatName[z] + ";" + flagSeat[z] + ";");
                            z++;
                        }
                    }
                        
                    for(int a=0; a<5; a++){
                        for(int j=0; j<9; j++){
                            switch(j){
                                case 0 :
                                    seatName[z]=Integer.toString(a+1)+"A";
                                    break;

                                case 1 :
                                    seatName[z]=Integer.toString(a+1)+"B";
                                    break;


                                case 2 :
                                    seatName[z]=Integer.toString(a+1)+"C";
                                    break;

                                case 3 :
                                    seatName[z]=Integer.toString(a+1)+"D";
                                    break;

                                case 4 :
                                    seatName[z]=Integer.toString(a+1)+"E";
                                    break;

                                case 5 :
                                    seatName[z]=Integer.toString(a+1)+"F";
                                    break;

                                case 6 :
                                    seatName[z]=Integer.toString(a+1)+"G";
                                    break;

                                case 7 :
                                    seatName[z]=Integer.toString(a+1)+"H";
                                    break;

                                case 8 :
                                    seatName[z]=Integer.toString(a+1)+"I";
                                    break;
                            }

                            flagSeat[z]=true;
                            pr2.write(seatName[z] + ";" + flagSeat[z] + ";");
                            z++;
                        }
                    }
                    flightID++;
                    t++;
                    pr2.write("\n");
                }   
            }
            pr1.close();
            pr2.close();
           
            

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        JPanel dynamicButtonsPanel = new JPanel();
        dynamicButtonsPanel.setLayout(new GridBagLayout());
        dynamicButtonsPanel.setBackground(new Color(204,204,255));
        GridBagConstraints gbcButtons = new GridBagConstraints();

        JButton[] buttons = new JButton[randomNum];

        for (int i = 0; i < randomNum; i++) {
            buttons[i] = new JButton("<html><span style='font-size:16px;'><b>"
            +flightTime[i][0]+"<span style='font-size:10px;'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;....................&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style='font-size:16px;'>"+flightTime[i][1]+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span style='font-size:11px;'><font color='black'>Economy</b><br>"
            + "<span style='font-size:9px;'><b><font color='#666666'>"+book.getDepartShort()+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
            + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color='#666666'>" + book.getReturnShort()+ "</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color='black'>From<br><font color='#666666'>AirSwift Airline - "+ flightName[i] + 
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
            + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color='black'>RM <b>100.00</b></html>");
          
            buttons[i].setFont(new Font("Segoe UI", Font.PLAIN, 12));
            buttons[i].setBackground(new Color(153,153,255));
            buttons[i].setForeground(new Color(102,102,102));
            buttons[i].setPreferredSize(new Dimension(500, 100));
          
            gbcButtons.gridx = 0;
            gbcButtons.gridy = i;
            gbcButtons.anchor = GridBagConstraints.CENTER;  
            gbcButtons.weightx = 1.0; // Adjust weightx to allocate additional horizontal space
            gbcButtons.fill = GridBagConstraints.HORIZONTAL; // Fill horizontally
            dynamicButtonsPanel.add(buttons[i], gbcButtons);
        }
        
        // Create a JScrollPane and add your main panel to it
        JScrollPane scrollPane = new JScrollPane(dynamicButtonsPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));
        scrollPane.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 0));

        
        // Set up layout for your main panel
        setLayout(new BorderLayout());
        // Create a container panel to hold your other components and the JScrollPane
        JPanel containerPanel = new JPanel(new BorderLayout());
        containerPanel.add(bg, BorderLayout.NORTH);  // Assuming your other components are in 'bg'
        
         // Add the JScrollPane to the container panel
        containerPanel.add(scrollPane, BorderLayout.CENTER);

        // Add the container panel to the main panel
        add(containerPanel, BorderLayout.CENTER);
        
        
        // Add the panel with dynamic buttons to the main panel
        GridBagConstraints gbcDynamicButtons = new GridBagConstraints();
        gbcDynamicButtons.gridx = 0;
        gbcDynamicButtons.gridy = 1;
        gbcDynamicButtons.anchor = GridBagConstraints.SOUTH; 
        
        gbcDynamicButtons.weighty = 1.0; // Allow vertical expansion
        availTicket.add(dynamicButtonsPanel, gbcDynamicButtons);
    }
    
    public void setGradientDropdownMenu(GradientDropdownMenu menu) {
        this.gradientDropdownMenu = menu;
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

        jPanel1 = new javax.swing.JPanel();
        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        findAflight = new javax.swing.JPanel();
        departShort = new javax.swing.JLabel();
        departLong = new javax.swing.JLabel();
        returnShort = new javax.swing.JLabel();
        returnLong = new javax.swing.JLabel();
        departLabel = new javax.swing.JLabel();
        departDate = new javax.swing.JLabel();
        returnLabel = new javax.swing.JLabel();
        returnDate = new javax.swing.JLabel();
        passengerLabel = new javax.swing.JLabel();
        passenger = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        backButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        departDateDis = new javax.swing.JLabel();
        buttonGradient2 = new airswift.ButtonGradient();
        buttonGradient3 = new airswift.ButtonGradient();
        availTicket = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(920, 551));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(854, 551));
        jPanel1.setLayout(new java.awt.BorderLayout());

        bg.setBackground(new java.awt.Color(204, 204, 255));
        bg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bg.setPreferredSize(new java.awt.Dimension(920, 530));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("SELECT YOUR DEPARTURE :");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        findAflight.setBackground(new java.awt.Color(255, 255, 255));
        findAflight.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 102)));
        findAflight.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        findAflight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(findAflight, java.awt.BorderLayout.CENTER);

        departShort.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        departShort.setForeground(new java.awt.Color(0, 0, 0));
        departShort.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departShort.setText("jLabel1");
        findAflight.add(departShort, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 20, 45, -1));

        departLong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        departLong.setForeground(new java.awt.Color(102, 102, 102));
        departLong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departLong.setText("jLabel1");
        findAflight.add(departLong, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, -1));

        returnShort.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        returnShort.setForeground(new java.awt.Color(0, 0, 0));
        returnShort.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnShort.setText("jLabel1");
        findAflight.add(returnShort, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 20, 45, -1));

        returnLong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        returnLong.setForeground(new java.awt.Color(102, 102, 102));
        returnLong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnLong.setText("jLabel1");
        findAflight.add(returnLong, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 100, -1));

        departLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        departLabel.setForeground(new java.awt.Color(0, 0, 0));
        departLabel.setText("Depart");
        findAflight.add(departLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        departDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        departDate.setForeground(new java.awt.Color(102, 102, 102));
        departDate.setText("jLabel2");
        findAflight.add(departDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 80, -1));

        returnLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        returnLabel.setForeground(new java.awt.Color(0, 0, 0));
        returnLabel.setText("Return");
        findAflight.add(returnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        returnDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        returnDate.setForeground(new java.awt.Color(102, 102, 102));
        returnDate.setText("jLabel1");
        findAflight.add(returnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 80, -1));

        passengerLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passengerLabel.setForeground(new java.awt.Color(0, 0, 0));
        passengerLabel.setText("Passenger");
        findAflight.add(passengerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 69, -1));

        passenger.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passenger.setForeground(new java.awt.Color(102, 102, 102));
        passenger.setText("jLabel1");
        findAflight.add(passenger, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 30, -1));

        jSeparator1.setBackground(new java.awt.Color(102, 0, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 0, 102));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        findAflight.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 10, 80));

        jSeparator2.setBackground(new java.awt.Color(102, 0, 102));
        jSeparator2.setForeground(new java.awt.Color(102, 0, 102));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        findAflight.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 10, 80));

        jSeparator3.setBackground(new java.awt.Color(102, 0, 102));
        jSeparator3.setForeground(new java.awt.Color(102, 0, 102));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        findAflight.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 10, 80));

        bg.add(findAflight, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 600, 100));

        backButton.setBackground(new java.awt.Color(102, 0, 102));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        backButton.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                backButtonPropertyChange(evt);
            }
        });
        bg.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setToolTipText("");
        jPanel2.setAutoscrolls(true);
        jPanel2.setLayout(new java.awt.BorderLayout());

        departDateDis.setBackground(new java.awt.Color(255, 255, 255));
        departDateDis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        departDateDis.setForeground(new java.awt.Color(102, 102, 102));
        departDateDis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departDateDis.setText("jLabel2");
        departDateDis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(departDateDis, java.awt.BorderLayout.CENTER);

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 185, 280, 50));

        buttonGradient2.setBackground(new java.awt.Color(204, 0, 153));
        buttonGradient2.setBorder(null);
        buttonGradient2.setForeground(new java.awt.Color(204, 204, 204));
        buttonGradient2.setText("Continue");
        buttonGradient2.setColor1(new java.awt.Color(102, 0, 102));
        buttonGradient2.setColor2(new java.awt.Color(102, 0, 102));
        buttonGradient2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonGradient2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient2ActionPerformed(evt);
            }
        });
        bg.add(buttonGradient2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 490, 80, 30));

        buttonGradient3.setBackground(new java.awt.Color(204, 0, 153));
        buttonGradient3.setBorder(null);
        buttonGradient3.setForeground(new java.awt.Color(102, 102, 102));
        buttonGradient3.setText("Back");
        buttonGradient3.setColor1(new java.awt.Color(204, 204, 204));
        buttonGradient3.setColor2(new java.awt.Color(204, 204, 204));
        buttonGradient3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonGradient3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient3ActionPerformed(evt);
            }
        });
        bg.add(buttonGradient3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 80, 30));

        availTicket.setBackground(new java.awt.Color(204, 204, 255));
        bg.add(availTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 900, 220));

        jPanel1.add(bg, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 897, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        new FlightMenu().showForm(new FlightSeat(book, gradientDropdownMenu));

    }//GEN-LAST:event_backButtonActionPerformed

    private void backButtonPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_backButtonPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_backButtonPropertyChange

    private void buttonGradient2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGradient2ActionPerformed

    private void buttonGradient3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGradient3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel availTicket;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel bg;
    private airswift.ButtonGradient buttonGradient2;
    private airswift.ButtonGradient buttonGradient3;
    public javax.swing.JLabel departDate;
    public javax.swing.JLabel departDateDis;
    public javax.swing.JLabel departLabel;
    public javax.swing.JLabel departLong;
    public javax.swing.JLabel departShort;
    private javax.swing.JPanel findAflight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JLabel passenger;
    public javax.swing.JLabel passengerLabel;
    public javax.swing.JLabel returnDate;
    public javax.swing.JLabel returnLabel;
    public javax.swing.JLabel returnLong;
    public javax.swing.JLabel returnShort;
    // End of variables declaration//GEN-END:variables
}
