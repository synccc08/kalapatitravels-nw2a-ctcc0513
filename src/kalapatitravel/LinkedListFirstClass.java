package kalapatitravel;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.sql.*;

public class LinkedListFirstClass extends javax.swing.JFrame {

    private CustomTableModel tableModel;
    private PersonLinkedList personList;

    public LinkedListFirstClass() {
        initComponents();
        tableModel = new CustomTableModel();
        personList = new PersonLinkedList();
        jTable2.setModel(tableModel);

        fetchDataFromDatabase();

        tableModel.setData(personList);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Kalapati Travels (First Class)");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Destination", "Seat"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton8.setText("Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(432, 432, 432)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        dispose();
        ClassSelection ClassSelection = new ClassSelection();
        ClassSelection.show();
    }//GEN-LAST:event_jButton8ActionPerformed
  private void fetchDataFromDatabase() {
        try {
            // JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database connection
            String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
            String user = "root";
            String password = "Cmmd10082003";
            Connection connection = DriverManager.getConnection(url, user, password);

            // Execute a query to retrieve data
            String query = "SELECT * FROM firstclass";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            // Populate the linked list 
            while (resultSet.next()) {
                Person person = new Person(
                        resultSet.getString("Name"),
                        resultSet.getString("Destination"),
                        resultSet.getString("Seat")
                );
                personList.add(person);
            }

            // Close
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(LinkedListFirstClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LinkedListFirstClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LinkedListFirstClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LinkedListFirstClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LinkedListFirstClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
        private static class CustomTableModel extends AbstractTableModel {

        private PersonLinkedList data;

        public CustomTableModel() {
            data = new PersonLinkedList();
        }

        @Override
        public int getRowCount() {
            return data.size();
        }

        @Override
        public int getColumnCount() {
            return 3;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Person person = data.get(rowIndex);

            switch (columnIndex) {
                case 0:
                    return person.getName();
                case 1:
                    return person.getDestination();
                case 2:
                    return person.getSeat();
                default:
                    return null;
            }
        }

        public void setData(PersonLinkedList newData) {
            data = newData;
            fireTableDataChanged();
        }
    }

    private static class Person {

        private String name;
        private String destination;
        private String seat;

        public Person(String name, String destination, String seat) {
            this.name = name;
            this.destination = destination;
            this.seat = seat;
        }

        // Add getters for each property
        public String getName() {
            return name;
        }

        public String getDestination() {
            return destination;
        }

        public String getSeat() {
            return seat;
        }
    }

    private static class PersonNode {

        private Person data;
        private PersonNode next;

        public PersonNode(Person data) {
            this.data = data;
            this.next = null;
        }
    }

    private static class PersonLinkedList {

        private PersonNode head;
        private int size;

        public PersonLinkedList() {
            this.head = null;
            this.size = 0;
        }

        public void add(Person person) {
            PersonNode newNode = new PersonNode(person);
            if (head == null) {
                head = newNode;
            } else {
                PersonNode current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            size++;
        }

        public int size() {
            return size;
        }

        public Person get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }

            PersonNode current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            return current.data;
        }
    }
}
