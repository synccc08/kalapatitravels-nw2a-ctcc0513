package kalapatitravel;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.sql.*;

public class LinkedList extends javax.swing.JFrame {

    private CustomTableModel tableModel;
    private PersonLinkedList personList;

    public LinkedList() {
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

        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Address", "Number", "Occupation", "Age", "Nationality", "Destination", "Sex", "Seat"
            }
        ));
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.setUpdateSelectionOnSort(false);
        jScrollPane2.setViewportView(jTable2);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Kalapati Travels (Travelers)");

        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(52, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(451, 451, 451))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
        ClassSelection ClassSelection = new ClassSelection();
        ClassSelection.show();
    }//GEN-LAST:event_jButton7ActionPerformed
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
            String query = "SELECT * FROM traveler";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            // Populate the linked list 
            while (resultSet.next()) {
                Person person = new Person(
                        resultSet.getString("Name"),
                        resultSet.getString("Address"),
                        resultSet.getString("Number"),
                        resultSet.getString("Occupation"),
                        resultSet.getString("Age"),
                        resultSet.getString("Nationality"),
                        resultSet.getString("Destination"),
                        resultSet.getString("Sex"),
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
            java.util.logging.Logger.getLogger(LinkedList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LinkedList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LinkedList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LinkedList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LinkedList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
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
            return 9;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Person person = data.get(rowIndex);

            switch (columnIndex) {
                case 0:
                    return person.getName();
                case 1:
                    return person.getAddress();
                case 2:
                    return person.getNumber();
                case 3:
                    return person.getOccupation();
                case 4:
                    return person.getAge();
                case 5:
                    return person.getNationality();
                case 6:
                    return person.getDestination();
                case 7:
                    return person.getSex();
                case 8:
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
        private String address;
        private String number;
        private String occupation;
        private String age;
        private String nationality;
        private String destination;
        private String sex;
        private String seat;

        public Person(String name, String address, String number, String occupation, String age,
                String nationality, String destination, String sex, String seat) {
            this.name = name;
            this.address = address;
            this.number = number;
            this.occupation = occupation;
            this.age = age;
            this.nationality = nationality;
            this.destination = destination;
            this.sex = sex;
            this.seat = seat;
        }

        // Add getters for each property
        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getNumber() {
            return number;
        }

        public String getOccupation() {
            return occupation;
        }

        public String getAge() {
            return age;
        }

        public String getNationality() {
            return nationality;
        }

        public String getDestination() {
            return destination;
        }

        public String getSex() {
            return sex;
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
