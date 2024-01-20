/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airswift;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author 60111
 */
public class TransactionDisplay {
    public void displayTransactions(List<String[]> transactions, JPanel panel, JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);  // Clear existing rows

        for (String[] transaction : transactions) {
            // Extract required information
            String departDate7 = transaction[7];
            String timeDepartF9 = transaction[9];
            String flightID1 = transaction[1];
            String departLong3 = transaction[3];
            String cabin21 = transaction[21];
            String seatNames11 = transaction[11];

            // Add a new row to the table
            model.addRow(new Object[]{departDate7 + " | " + timeDepartF9, flightID1, departLong3, cabin21 + " | " + seatNames11});

            // Check if return information is present
            if (transaction.length > 8 && transaction[8] != null) {
                String returnDate8 = transaction[8];
                String timeReturnF10 = transaction[10];
                String returnLong5 = transaction[5];

                // Add another row for return information
                model.addRow(new Object[]{returnDate8 + " | " + timeReturnF10, flightID1, returnLong5, cabin21 + " | " + seatNames11});
            }
        }
    }
 
}

