/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package airswift;

/**
 *
 * @author zamhu
 */
public class FlightBookingArrival extends javax.swing.JPanel {

    /**
     * Creates new form FlightBookingArrival
     */
    public FlightBookingArrival() {
        initComponents();
        
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
        menu = new javax.swing.JPanel();
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
        departDateDis = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        availTicket = new javax.swing.JPanel();
        departTime1 = new javax.swing.JLabel();
        departTime2 = new javax.swing.JLabel();
        departLong1 = new javax.swing.JLabel();
        departShort1 = new javax.swing.JLabel();
        returnLong1 = new javax.swing.JLabel();
        returnShort1 = new javax.swing.JLabel();
        economyLabel = new javax.swing.JLabel();
        businessLabel = new javax.swing.JLabel();
        fromLabel1 = new javax.swing.JLabel();
        fromLabel2 = new javax.swing.JLabel();
        rmLabel = new javax.swing.JLabel();
        rmLabel2 = new javax.swing.JLabel();
        ecoPrice = new javax.swing.JLabel();
        businessPrice = new javax.swing.JLabel();
        airswiftAirlineLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(854, 551));

        bg.setBackground(new java.awt.Color(204, 204, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(153, 153, 255));
        menu.setForeground(new java.awt.Color(129, 60, 106));

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        bg.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        findAflight.setBackground(new java.awt.Color(255, 255, 255));
        findAflight.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 102)));
        findAflight.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        departShort.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        departShort.setForeground(new java.awt.Color(0, 0, 0));
        departShort.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departShort.setText("jLabel1");

        departLong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        departLong.setForeground(new java.awt.Color(102, 102, 102));
        departLong.setText("jLabel1");

        returnShort.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        returnShort.setForeground(new java.awt.Color(0, 0, 0));
        returnShort.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnShort.setText("jLabel1");

        returnLong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        returnLong.setForeground(new java.awt.Color(102, 102, 102));
        returnLong.setText("jLabel1");

        departLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        departLabel.setForeground(new java.awt.Color(0, 0, 0));
        departLabel.setText("Depart");

        departDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        departDate.setForeground(new java.awt.Color(102, 102, 102));
        departDate.setText("jLabel2");

        returnLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        returnLabel.setForeground(new java.awt.Color(0, 0, 0));
        returnLabel.setText("Return");

        returnDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        returnDate.setForeground(new java.awt.Color(102, 102, 102));
        returnDate.setText("jLabel1");

        passengerLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passengerLabel.setForeground(new java.awt.Color(0, 0, 0));
        passengerLabel.setText("jLabel1");

        passenger.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        passenger.setForeground(new java.awt.Color(102, 102, 102));
        passenger.setText("jLabel1");

        javax.swing.GroupLayout findAflightLayout = new javax.swing.GroupLayout(findAflight);
        findAflight.setLayout(findAflightLayout);
        findAflightLayout.setHorizontalGroup(
            findAflightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findAflightLayout.createSequentialGroup()
                .addGroup(findAflightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(findAflightLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(departShort))
                    .addGroup(findAflightLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(departLong)))
                .addGroup(findAflightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(findAflightLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(returnShort))
                    .addGroup(findAflightLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(returnLong)))
                .addGap(66, 66, 66)
                .addGroup(findAflightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(departLabel)
                    .addComponent(departDate))
                .addGap(38, 38, 38)
                .addGroup(findAflightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnDate)
                    .addComponent(returnLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(findAflightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passengerLabel)
                    .addComponent(passenger))
                .addGap(33, 33, 33))
        );
        findAflightLayout.setVerticalGroup(
            findAflightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(findAflightLayout.createSequentialGroup()
                .addGroup(findAflightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(findAflightLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(findAflightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(departShort)
                            .addComponent(returnShort)))
                    .addGroup(findAflightLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(findAflightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(departLabel)
                            .addComponent(returnLabel)
                            .addComponent(passengerLabel))))
                .addGap(18, 18, 18)
                .addGroup(findAflightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(findAflightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(departDate)
                        .addComponent(returnDate)
                        .addComponent(passenger))
                    .addComponent(returnLong)
                    .addComponent(departLong))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        bg.add(findAflight, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, 100));

        departDateDis.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        departDateDis.setForeground(new java.awt.Color(102, 0, 102));
        departDateDis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departDateDis.setText("jLabel1");
        bg.add(departDateDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 310, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("SELECT YOUR DEPARTURE :");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        availTicket.setBackground(new java.awt.Color(255, 255, 255));
        availTicket.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 102)));

        departTime1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        departTime1.setForeground(new java.awt.Color(102, 0, 102));
        departTime1.setText("jLabel2");

        departTime2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        departTime2.setForeground(new java.awt.Color(102, 0, 102));
        departTime2.setText("jLabel2");

        departLong1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        departLong1.setForeground(new java.awt.Color(102, 102, 102));
        departLong1.setText("jLabel1");

        departShort1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        departShort1.setForeground(new java.awt.Color(102, 102, 102));
        departShort1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departShort1.setText("jLabel1");

        returnLong1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        returnLong1.setForeground(new java.awt.Color(102, 102, 102));
        returnLong1.setText("jLabel1");

        returnShort1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        returnShort1.setForeground(new java.awt.Color(102, 102, 102));
        returnShort1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnShort1.setText("jLabel1");

        economyLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        economyLabel.setForeground(new java.awt.Color(0, 0, 0));
        economyLabel.setText("Economy");

        businessLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        businessLabel.setForeground(new java.awt.Color(0, 0, 0));
        businessLabel.setText("Business");

        fromLabel1.setForeground(new java.awt.Color(102, 102, 102));
        fromLabel1.setText("From");

        fromLabel2.setForeground(new java.awt.Color(102, 102, 102));
        fromLabel2.setText("From");

        rmLabel.setForeground(new java.awt.Color(102, 102, 102));
        rmLabel.setText("RM");

        rmLabel2.setForeground(new java.awt.Color(102, 102, 102));
        rmLabel2.setText("RM");

        ecoPrice.setForeground(new java.awt.Color(0, 0, 0));
        ecoPrice.setText("jLabel2");

        businessPrice.setForeground(new java.awt.Color(0, 0, 0));
        businessPrice.setText("jLabel2");

        airswiftAirlineLabel.setForeground(new java.awt.Color(102, 102, 102));
        airswiftAirlineLabel.setText("AirSwift Airline - ");

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout availTicketLayout = new javax.swing.GroupLayout(availTicket);
        availTicket.setLayout(availTicketLayout);
        availTicketLayout.setHorizontalGroup(
            availTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availTicketLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(availTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(departShort1)
                    .addComponent(departTime1))
                .addGroup(availTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(availTicketLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(departTime2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                        .addComponent(economyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(availTicketLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(returnShort1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rmLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ecoPrice)
                        .addGap(79, 79, 79)))
                .addGroup(availTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(businessLabel)
                    .addGroup(availTicketLayout.createSequentialGroup()
                        .addComponent(rmLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(businessPrice)))
                .addGap(59, 59, 59))
            .addGroup(availTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(departLong1)
                .addGap(97, 97, 97)
                .addComponent(returnLong1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fromLabel1)
                .addGap(112, 112, 112)
                .addComponent(fromLabel2)
                .addGap(76, 76, 76))
            .addGroup(availTicketLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(airswiftAirlineLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        availTicketLayout.setVerticalGroup(
            availTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availTicketLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(availTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departTime1)
                    .addComponent(departTime2)
                    .addComponent(economyLabel)
                    .addComponent(businessLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(availTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departLong1)
                    .addComponent(returnLong1)
                    .addComponent(fromLabel1)
                    .addComponent(fromLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(availTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(departShort1)
                    .addGroup(availTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(returnShort1)
                        .addComponent(rmLabel)
                        .addComponent(rmLabel2)
                        .addComponent(ecoPrice)
                        .addComponent(businessPrice)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(availTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airswiftAirlineLabel)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25))
        );

        bg.add(availTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 710, 160));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airswiftAirlineLabel;
    private javax.swing.JPanel availTicket;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel businessLabel;
    private javax.swing.JLabel businessPrice;
    public javax.swing.JLabel departDate;
    public javax.swing.JLabel departDateDis;
    public javax.swing.JLabel departLabel;
    public javax.swing.JLabel departLong;
    public javax.swing.JLabel departLong1;
    public javax.swing.JLabel departShort;
    public javax.swing.JLabel departShort1;
    private javax.swing.JLabel departTime1;
    private javax.swing.JLabel departTime2;
    private javax.swing.JLabel ecoPrice;
    private javax.swing.JLabel economyLabel;
    private javax.swing.JPanel findAflight;
    private javax.swing.JLabel fromLabel1;
    private javax.swing.JLabel fromLabel2;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menu;
    public javax.swing.JLabel passenger;
    public javax.swing.JLabel passengerLabel;
    public javax.swing.JLabel returnDate;
    public javax.swing.JLabel returnLabel;
    public javax.swing.JLabel returnLong;
    public javax.swing.JLabel returnLong1;
    public javax.swing.JLabel returnShort;
    public javax.swing.JLabel returnShort1;
    private javax.swing.JLabel rmLabel;
    private javax.swing.JLabel rmLabel2;
    // End of variables declaration//GEN-END:variables
}
