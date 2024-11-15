package luiscaicedocalc2.classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.table.DefaultTableModel;

/**
 * @author Luis Carlos Caicedo Giraldo
 */
public class Utilities {
    public static Session getSession(File sessionFile) {
        Session session = new Session();
        try {
            Scanner reader = new Scanner(sessionFile);
        
            while (reader.hasNext()) {
                String line = reader.nextLine();
                String[] sessionFields = line.split(";;");
                session.setUsername(sessionFields[0]);
                String[] dateFields = sessionFields[1].split("-");
                int dateYear = Integer.parseInt(dateFields[0]);
                int dateMonth = Integer.parseInt(dateFields[1]);
                int dateDay = Integer.parseInt(dateFields[2]);
                session.setCreationDate(LocalDate.of(dateYear, dateMonth, dateDay));
                
                if (line.contains("&")) {
                    String[] operations = sessionFields[2].split("&");
                    List<Operation> operationsList= new ArrayList<>();
                    for (String s : operations) {
                        String[] operationFields = s.split(",");
                        operationsList.add( new Operation(operationFields[0], operationFields[2], operationFields[1], operationFields[3]));
                    }

                    session.setOperations(operationsList);
                } else {
                    session.setOperations(List.of());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
        
        return session;
    }
    
   public static boolean createSessionFile(Session session, File file) {
        try (BufferedWriter writer = new BufferedWriter( new FileWriter(file, false))) {
           
            writer.write(session.getUsername() + ";;" + session.getCreationDate().toString() + ";;");

            for (Operation o : session.getOperations()) writer.write(o.toString() + "&");

            writer.close();
            return true;
        } catch (IOException e) {
            System.err.println("ERROR" + e.getMessage());
            return false;
        }
   }
   
   public static String formatDateToEu(LocalDate date) {
       String[] dateFields = date.toString().split("-");
       return dateFields[2] + "-" + dateFields[1] + "-" + dateFields[0];
   }
   
   public static DefaultTableModel updateTable(DefaultTableModel tableModel, List<Operation> operations) {
       tableModel.addRow(operations.getLast().toArray());
       return tableModel;
   }
   
   public static DefaultTableModel initTable (List<Operation> operations) {
       DefaultTableModel tableModel = new DefaultTableModel();
       String[] columns = {"x", "operador", "y", "resultado"};
       tableModel.setColumnIdentifiers(columns);
       for (Operation o : operations) tableModel.addRow(o.toArray());
       return tableModel;
   }
   
   public static DefaultTableModel initTable () {
       DefaultTableModel tableModel = new DefaultTableModel();
       String[] columns = {"x", "operador", "y", "resultado"};
       tableModel.setColumnIdentifiers(columns);
       return tableModel;
   }
}
