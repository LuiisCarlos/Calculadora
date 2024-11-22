package luiscaicedocalc2.classes;

import java.io.BufferedWriter;
import java.io.File;
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
    public static Historial getSession(File sessionFile) throws Exception {
        Historial session = new Historial();
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
            session.setType(Integer.parseInt(sessionFields[2]));
            
            if (line.contains("&")) {
                String[] operations = sessionFields[3].split("&");
                List<Operation> operationsList = new ArrayList<>();
                for (String s : operations) {
                    String[] operationFields = s.split(",");
                    
                    operationsList.add( new Operation(
                                    Double.parseDouble(operationFields[0]),
                                    operationFields[2],
                                    Double.parseDouble(operationFields[1]),
                                    Double.parseDouble(operationFields[3])
                            ));
                }
                session.setOperations(operationsList);
            } else {
                session.setOperations( List.of() );
            }
        }
 
        return session;
    }
    
    public static boolean createSessionFile(Historial session, File file) {
        try (BufferedWriter writer = new BufferedWriter( new FileWriter(file, false))) {
           
            writer.write(session.getUsername() + ";;" +
                    session.getCreationDate().toString() + ";;" +
                    session.getType().toString() + ";;"
            );

            if (!session.getOperations().isEmpty()) {
                for (Operation o : session.getOperations()) {
                    String op = o.toString() + '&';
                    writer.write(op);
                }
            }
            
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
   
    public static DefaultTableModel initTable(List<Operation> operations) {
        DefaultTableModel tableModel = new DefaultTableModel();
        String[] columns = {"x", "operador", "y", "resultado"};
        tableModel.setColumnIdentifiers(columns);
        for (Operation o : operations) tableModel.addRow(o.toArray());
        return tableModel;
    }
   
    public static DefaultTableModel initTable() {
       DefaultTableModel tableModel = new DefaultTableModel();
       String[] columns = {"x", "operador", "y", "resultado"};
       tableModel.setColumnIdentifiers(columns);
       return tableModel;
    }
   
    public static String removeZero(Double number) {
        if (number != null) return number % 1 == 0 ? String.valueOf(number.intValue()) : number.toString();
        return null;
    }
}
