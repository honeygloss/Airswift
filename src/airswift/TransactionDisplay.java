/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airswift;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author 60111
 */
public class TransactionDisplay {
     public void displayTransactions(List<String[]> transactions, JPanel jPanel2, JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);  // Clear existing rows

        Set<String> uniqueEntries = new HashSet<>();

        for (String[] transaction : transactions) {
            if (transaction.length >= 24) {
                String departDate7 = transaction[7];
                String timeDepartF9 = transaction[9];
                String flightID1 = transaction[1];
                String departLong3 = transaction[3];
                String returnLong5 = transaction[5];
                String cabin21 = transaction[21];
                String seatNames11 = transaction[11];
                String timeDepart22 = transaction[22];

                String returnDate8 = "";
                String timeReturnF10 = "";
                String timeReturn23 = "";

                if (!transaction[8].isEmpty()) {
                    returnDate8 = transaction[8];
                    timeReturnF10 = transaction[10];
                    returnLong5 = transaction[5];
                    timeReturn23 = transaction[23];
                }

                // Concatenate data for both rows
                String row1Data = departDate7 + timeDepartF9 + flightID1 + departLong3 + returnLong5 + cabin21 + seatNames11;
                String row2Data = returnDate8 + timeReturnF10 + flightID1 + returnLong5 + departLong3 + cabin21 + seatNames11;

                // Check for duplicates before adding to the table
                if (uniqueEntries.add(row1Data)) {
                    model.addRow(new Object[]{departDate7 + " " + timeDepartF9 + " | " + timeDepart22, flightID1, departLong3 + " ---> " + returnLong5, cabin21 + " | " + seatNames11});
                }

                if (!returnDate8.isEmpty() && uniqueEntries.add(row2Data)) {
                    model.addRow(new Object[]{returnDate8 + " " + timeReturnF10 + " | " + timeReturn23, flightID1, returnLong5 + " ---> " + departLong3, cabin21 + " | " + seatNames11});
                }
            }
        }
    }
}

