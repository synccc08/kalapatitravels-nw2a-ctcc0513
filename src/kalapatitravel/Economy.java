package kalapatitravel;

import javax.swing.JOptionPane;
import java.sql.*;

public class Economy extends javax.swing.JFrame {

    public static boolean validation = true;

    public Economy() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Btn11 = new javax.swing.JButton();
        Btn12 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Btn13 = new javax.swing.JButton();
        Btn15 = new javax.swing.JButton();
        Btn17 = new javax.swing.JButton();
        Btn19 = new javax.swing.JButton();
        Btn16 = new javax.swing.JButton();
        Btn14 = new javax.swing.JButton();
        Btn18 = new javax.swing.JButton();
        Btn20 = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Kalapati Travels");

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));
        jPanel6.setForeground(new java.awt.Color(51, 51, 255));

        Btn11.setText("11");
        Btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn11ActionPerformed(evt);
            }
        });

        Btn12.setText("12");
        Btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn12ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Economy");

        Btn13.setText("13");
        Btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn13ActionPerformed(evt);
            }
        });

        Btn15.setText("15");
        Btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn15ActionPerformed(evt);
            }
        });

        Btn17.setText("17");
        Btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn17ActionPerformed(evt);
            }
        });

        Btn19.setText("19");
        Btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn19ActionPerformed(evt);
            }
        });

        Btn16.setText("16");
        Btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn16ActionPerformed(evt);
            }
        });

        Btn14.setText("14");
        Btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn14ActionPerformed(evt);
            }
        });

        Btn18.setText("18");
        Btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn18ActionPerformed(evt);
            }
        });

        Btn20.setText("20");
        Btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn20ActionPerformed(evt);
            }
        });

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 103, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn11ActionPerformed
        // checks if the Economy Class is full
        SeatsValidation();
        // I will only be explaining this one button for seats 1-10 
        // they all do the same thing
        // the only difference is that each button has its own corresponding seat 
        
        // 2 choices 
        String[] options = {"Add", "Delete"};

        // command prompt
        int choice = JOptionPane.showOptionDialog(
                null,
                "Admin, please select an action.",
                "KalapatiTravels",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
        );
        if (choice == 0 && validation == true) {
            // username
            String username = JOptionPane.showInputDialog(null, "Enter the username:");
            // validation 
            if (username != null && !username.trim().isEmpty()) {
                // destination
                String destination = JOptionPane.showInputDialog(null, "Enter the destination:");
                // validation
                if (destination != null && !destination.trim().isEmpty()) {
                    try {
                        // load jdbc driver
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        // link
                        String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
                        // db login
                        String user = "root";
                        String password = "Cmmd10082003";
                        Connection connection = DriverManager.getConnection(url, user, password);

                        // query to be filled and executed
                        String sql = "SELECT * FROM traveler WHERE Name = ? AND Destination = ?";
                        PreparedStatement preparedStatement = connection.prepareStatement(sql);
                        // fills the question marks from the query
                        preparedStatement.setString(1, username);
                        preparedStatement.setString(2, destination);
                        // execute the query
                        ResultSet resultSet = preparedStatement.executeQuery();

                        if (resultSet.next()) {
                            // user found prompt
                            String name = resultSet.getString("name");
                            String desti = resultSet.getString("destination");
                            JOptionPane.showMessageDialog(null, "User Found:\nName: " + name + "\nDestination: " + desti, "Success", JOptionPane.INFORMATION_MESSAGE);
                            
                            // insert the traveler into the database query
                            String insertQuery = "INSERT INTO economy (Name, Destination, Seat) VALUES (?, ?, 11)";
                            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                            // fill in the question marks from the previous query
                            insertStatement.setString(1, name);
                            insertStatement.setString(2, desti);

                            // if it made a change, corresponding prompts will appear
                            int rowsAffected = insertStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data added to Economy successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to add data to Economy Class.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            // seat query, this updates the seat of the traveler
                            String updateQuery = "UPDATE traveler SET Seat = ? WHERE Name = ?";
                            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                            updateStatement.setInt(1, 11);// 11 is pre defined since this is seat #11
                            updateStatement.setString(2, name);
                            
                            // validation, if it made any changes. corresponding prompt will prompt
                            int rowsAffected2 = updateStatement.executeUpdate();
                            updateStatement.close();

                            if (rowsAffected2 > 0) {
                                System.out.println("Seat added");
                            } else {
                                System.out.println("Seat error");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "The user you entered is not registered in the database or maybe you input a wrong destination place.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        resultSet.close();
                        preparedStatement.close();
                        connection.close();

                    } catch (ClassNotFoundException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No destination entered.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No username entered.");
            }
//            economy is full
        } else if (choice == 0 && validation == false) {
            String[] options2 = {"Yes", "No"};

            int choice2 = JOptionPane.showOptionDialog(
                    null,
                    "Admin, Economy Class is full. Would you like to go to the First Class?",
                    "KalapatiTravels",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options2,
                    options2[0]
            );
            if (choice2 == 0) {
                //redirect to firstclass.java
                dispose();
                FirstClass FirstClass = new FirstClass();
                FirstClass.show();
            } else if (choice2 == 1) {
                // no prompt
                JOptionPane.showMessageDialog(null, "Next flight leaves in 5 hours");
            }
            
            // delete option
        } else if (choice == 1) {
            // admin enters traveler's username
            String username = JOptionPane.showInputDialog(null, "Enter the username:");
            // username validation
            if (username != null && !username.trim().isEmpty()) {
                try {
                    // load driver
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    // link
                    String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
                    // db login
                    String user = "root";
                    String password = "Cmmd10082003";
                    Connection connection = DriverManager.getConnection(url, user, password);

                    // query to be filled and executed
                    String deleteQuery = "DELETE FROM economy WHERE Name = ?";
                    PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
                    // fills the question mark in the query
                    deleteStatement.setString(1, username);

                    // execute
                    int rowsAffected = deleteStatement.executeUpdate();
                    
                    // validation. will prompt the corresponding prompt.
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Row deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Row not found or failed to delete.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    deleteStatement.close();
                    connection.close();

                } catch (ClassNotFoundException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No username entered.");
            }
        }
    }//GEN-LAST:event_Btn11ActionPerformed

    private void Btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn12ActionPerformed
                SeatsValidation();
        String[] options = {"Add", "Delete"};

        int choice = JOptionPane.showOptionDialog(
                null,
                "Admin, please select an action.",
                "KalapatiTravels",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
        );
        if (choice == 0 && validation == true) {
            String username = JOptionPane.showInputDialog(null, "Enter the username:");
            if (username != null && !username.trim().isEmpty()) {
                String destination = JOptionPane.showInputDialog(null, "Enter the destination:");
                if (destination != null && !destination.trim().isEmpty()) {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
                        String user = "root";
                        String password = "Cmmd10082003";
                        Connection connection = DriverManager.getConnection(url, user, password);

                        String sql = "SELECT * FROM traveler WHERE Name = ? AND Destination = ?";
                        PreparedStatement preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, username);
                        preparedStatement.setString(2, destination);

                        ResultSet resultSet = preparedStatement.executeQuery();

                        if (resultSet.next()) {
                            String name = resultSet.getString("name");
                            String desti = resultSet.getString("destination");
                            JOptionPane.showMessageDialog(null, "User Found:\nName: " + name + "\nDestination: " + desti, "Success", JOptionPane.INFORMATION_MESSAGE);

                            String insertQuery = "INSERT INTO economy (Name, Destination, Seat) VALUES (?, ?, 12)";
                            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                            insertStatement.setString(1, name);
                            insertStatement.setString(2, desti);

                            int rowsAffected = insertStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data added to Economy successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to add data to Economy Class.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            String updateQuery = "UPDATE traveler SET Seat = ? WHERE Name = ?";
                            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                            updateStatement.setInt(1, 12);
                            updateStatement.setString(2, name);
                            int rowsAffected2 = updateStatement.executeUpdate();
                            updateStatement.close();

                            if (rowsAffected2 > 0) {
                                System.out.println("Seat added");
                            } else {
                                System.out.println("Seat error");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "The user you entered is not registered in the database or maybe you input a wrong destination place.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        preparedStatement.close();
                        connection.close();

                    } catch (ClassNotFoundException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No destination entered.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No username entered.");
            }
        } else if (choice == 0 && validation == false) {
            String[] options2 = {"Yes", "No"};

            int choice2 = JOptionPane.showOptionDialog(
                    null,
                    "Admin, Economy Class is full. Would you like to go to the First Class?",
                    "KalapatiTravels",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options2,
                    options2[0]
            );
            if (choice2 == 0) {
                dispose();
                FirstClass FirstClass = new FirstClass();
                FirstClass.show();
            } else if (choice2 == 1) {
                JOptionPane.showMessageDialog(null, "Next flight leaves in 5 hours");
            }
        } else if (choice == 1) {
            String username = JOptionPane.showInputDialog(null, "Enter the username:");
            if (username != null && !username.trim().isEmpty()) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
                    String user = "root";
                    String password = "Cmmd10082003";
                    Connection connection = DriverManager.getConnection(url, user, password);

                    String deleteQuery = "DELETE FROM economy WHERE Name = ?";
                    PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
                    deleteStatement.setString(1, username);

                    int rowsAffected = deleteStatement.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Row deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Row not found or failed to delete.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    deleteStatement.close();
                    connection.close();

                } catch (ClassNotFoundException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No username entered.");
            }
        }
    }//GEN-LAST:event_Btn12ActionPerformed

    private void Btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn13ActionPerformed

        SeatsValidation();
        String[] options = {"Add", "Delete"};

        int choice = JOptionPane.showOptionDialog(
                null,
                "Admin, please select an action.",
                "KalapatiTravels",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
        );
        if (choice == 0 && validation == true) {
            String username = JOptionPane.showInputDialog(null, "Enter the username:");
            if (username != null && !username.trim().isEmpty()) {
                String destination = JOptionPane.showInputDialog(null, "Enter the destination:");
                if (destination != null && !destination.trim().isEmpty()) {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
                        String user = "root";
                        String password = "Cmmd10082003";
                        Connection connection = DriverManager.getConnection(url, user, password);

                        String sql = "SELECT * FROM traveler WHERE Name = ? AND Destination = ?";
                        PreparedStatement preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, username);
                        preparedStatement.setString(2, destination);

                        ResultSet resultSet = preparedStatement.executeQuery();

                        if (resultSet.next()) {

                            String name = resultSet.getString("name");
                            String desti = resultSet.getString("destination");
                            JOptionPane.showMessageDialog(null, "User Found:\nName: " + name + "\nDestination: " + desti, "Success", JOptionPane.INFORMATION_MESSAGE);

                            String insertQuery = "INSERT INTO economy (Name, Destination, Seat) VALUES (?, ?, 13)";
                            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                            insertStatement.setString(1, name);
                            insertStatement.setString(2, desti);

                            int rowsAffected = insertStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data added to Economy successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to add data to Economy Class.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            String updateQuery = "UPDATE traveler SET Seat = ? WHERE Name = ?";
                            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                            updateStatement.setInt(1, 13);
                            updateStatement.setString(2, name);
                            int rowsAffected2 = updateStatement.executeUpdate();
                            updateStatement.close();

                            if (rowsAffected2 > 0) {
                                System.out.println("Seat added");
                            } else {
                                System.out.println("Seat error");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "The user you entered is not registered in the database or maybe you input a wrong destination place.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        resultSet.close();
                        preparedStatement.close();
                        connection.close();

                    } catch (ClassNotFoundException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No destination entered.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No username entered.");
            }
        } else if (choice == 0 && validation == false) {
            String[] options2 = {"Yes", "No"};

            int choice2 = JOptionPane.showOptionDialog(
                    null,
                    "Admin, Economy Class is full. Would you like to go to the First Class?",
                    "KalapatiTravels",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options2,
                    options2[0]
            );
            if (choice2 == 0) {
                dispose();
                FirstClass FirstClass = new FirstClass();
                FirstClass.show();
            } else if (choice2 == 1) {
                JOptionPane.showMessageDialog(null, "Next flight leaves in 5 hours");
            }
        } else if (choice == 1) {
            String username = JOptionPane.showInputDialog(null, "Enter the username:");
            if (username != null && !username.trim().isEmpty()) {
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
                    String user = "root";
                    String password = "Cmmd10082003";
                    Connection connection = DriverManager.getConnection(url, user, password);

                    String deleteQuery = "DELETE FROM economy WHERE Name = ?";
                    PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
                    deleteStatement.setString(1, username);

                    int rowsAffected = deleteStatement.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Row deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Row not found or failed to delete.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    deleteStatement.close();
                    connection.close();

                } catch (ClassNotFoundException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No username entered.");
            }
        }
    }//GEN-LAST:event_Btn13ActionPerformed

    private void Btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn15ActionPerformed
        SeatsValidation();
        String[] options = {"Add", "Delete"};

        int choice = JOptionPane.showOptionDialog(
                null,
                "Admin, please select an action.",
                "KalapatiTravels",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
        );
        if (choice == 0 && validation == true) {
            String username = JOptionPane.showInputDialog(null, "Enter the username:");
            if (username != null && !username.trim().isEmpty()) {
                String destination = JOptionPane.showInputDialog(null, "Enter the destination:");
                if (destination != null && !destination.trim().isEmpty()) {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
                        String user = "root";
                        String password = "Cmmd10082003";
                        Connection connection = DriverManager.getConnection(url, user, password);

                        String sql = "SELECT * FROM traveler WHERE Name = ? AND Destination = ?";
                        PreparedStatement preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, username);
                        preparedStatement.setString(2, destination);

                        ResultSet resultSet = preparedStatement.executeQuery();

                        if (resultSet.next()) {
                            String name = resultSet.getString("name");
                            String desti = resultSet.getString("destination");
                            JOptionPane.showMessageDialog(null, "User Found:\nName: " + name + "\nDestination: " + desti, "Success", JOptionPane.INFORMATION_MESSAGE);

                            String insertQuery = "INSERT INTO economy (Name, Destination, Seat) VALUES (?, ?, 15)";
                            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                            insertStatement.setString(1, name);
                            insertStatement.setString(2, desti);

                            int rowsAffected = insertStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data added to Economy successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to add data to Economy Class.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            String updateQuery = "UPDATE traveler SET Seat = ? WHERE Name = ?";
                            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                            updateStatement.setInt(1, 15);
                            updateStatement.setString(2, name);
                            int rowsAffected2 = updateStatement.executeUpdate();
                            updateStatement.close();

                            if (rowsAffected2 > 0) {
                                System.out.println("Seat added");
                            } else {
                                System.out.println("Seat error");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "The user you entered is not registered in the database or maybe you input a wrong destination place.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        resultSet.close();
                        preparedStatement.close();
                        connection.close();

                    } catch (ClassNotFoundException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No destination entered.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No username entered.");
            }
        } else if (choice == 0 && validation == false) {
            String[] options2 = {"Yes", "No"};

            int choice2 = JOptionPane.showOptionDialog(
                    null,
                    "Admin, Economy Class is full. Would you like to go to the First Class?",
                    "KalapatiTravels",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options2,
                    options2[0]
            );
            if (choice2 == 0) {
                dispose();
                FirstClass FirstClass = new FirstClass();
                FirstClass.show();
            } else if (choice2 == 1) {
                JOptionPane.showMessageDialog(null, "Next flight leaves in 5 hours");
            }
        } else if (choice == 1) {
            String username = JOptionPane.showInputDialog(null, "Enter the username:");
            if (username != null && !username.trim().isEmpty()) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
                    String user = "root";
                    String password = "Cmmd10082003";
                    Connection connection = DriverManager.getConnection(url, user, password);

                    String deleteQuery = "DELETE FROM economy WHERE Name = ?";
                    PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
                    deleteStatement.setString(1, username);

                    int rowsAffected = deleteStatement.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Row deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Row not found or failed to delete.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    deleteStatement.close();
                    connection.close();

                } catch (ClassNotFoundException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No username entered.");
            }
        }
    }//GEN-LAST:event_Btn15ActionPerformed

    private void Btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn17ActionPerformed
        SeatsValidation();
        String[] options = {"Add", "Delete"};

        int choice = JOptionPane.showOptionDialog(
                null,
                "Admin, please select an action.",
                "KalapatiTravels",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
        );
        if (choice == 0 && validation == true) {
            String username = JOptionPane.showInputDialog(null, "Enter the username:");
            if (username != null && !username.trim().isEmpty()) {
                String destination = JOptionPane.showInputDialog(null, "Enter the destination:");
                if (destination != null && !destination.trim().isEmpty()) {
                    try {

                        Class.forName("com.mysql.cj.jdbc.Driver");

                        String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
                        String user = "root";
                        String password = "Cmmd10082003";
                        Connection connection = DriverManager.getConnection(url, user, password);

                        String sql = "SELECT * FROM traveler WHERE Name = ? AND Destination = ?";
                        PreparedStatement preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, username);
                        preparedStatement.setString(2, destination);

                        ResultSet resultSet = preparedStatement.executeQuery();

                        if (resultSet.next()) {

                            String name = resultSet.getString("name");
                            String desti = resultSet.getString("destination");
                            JOptionPane.showMessageDialog(null, "User Found:\nName: " + name + "\nDestination: " + desti, "Success", JOptionPane.INFORMATION_MESSAGE);

                            String insertQuery = "INSERT INTO economy (Name, Destination, Seat) VALUES (?, ?, 17)";
                            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                            insertStatement.setString(1, name);
                            insertStatement.setString(2, desti);

                            int rowsAffected = insertStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data added to Economy successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to add data to Economy Class.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            String updateQuery = "UPDATE traveler SET Seat = ? WHERE Name = ?";
                            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                            updateStatement.setInt(1, 17);
                            updateStatement.setString(2, name);
                            int rowsAffected2 = updateStatement.executeUpdate();
                            updateStatement.close();

                            if (rowsAffected2 > 0) {
                                System.out.println("Seat added");
                            } else {
                                System.out.println("Seat error");
                            }
                        } else {

                            JOptionPane.showMessageDialog(null, "The user you entered is not registered in the database or maybe you input a wrong destination place.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        resultSet.close();
                        preparedStatement.close();
                        connection.close();

                    } catch (ClassNotFoundException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No destination entered.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No username entered.");
            }
        } else if (choice == 0 && validation == false) {
            String[] options2 = {"Yes", "No"};

            int choice2 = JOptionPane.showOptionDialog(
                    null,
                    "Admin, Economy Class is full. Would you like to go to the First Class?",
                    "KalapatiTravels",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options2,
                    options2[0]
            );
            if (choice2 == 0) {
                dispose();
                FirstClass FirstClass = new FirstClass();
                FirstClass.show();
            } else if (choice2 == 1) {
                JOptionPane.showMessageDialog(null, "Next flight leaves in 5 hours");
            }
        } else if (choice == 1) {
            String username = JOptionPane.showInputDialog(null, "Enter the username:");
            if (username != null && !username.trim().isEmpty()) {
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
                    String user = "root";
                    String password = "Cmmd10082003";
                    Connection connection = DriverManager.getConnection(url, user, password);

                    String deleteQuery = "DELETE FROM economy WHERE Name = ?";
                    PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
                    deleteStatement.setString(1, username);

                    int rowsAffected = deleteStatement.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Row deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Row not found or failed to delete.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    deleteStatement.close();
                    connection.close();

                } catch (ClassNotFoundException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No username entered.");
            }
        }
    }//GEN-LAST:event_Btn17ActionPerformed

    private void Btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn19ActionPerformed
        SeatsValidation();
        String[] options = {"Add", "Delete"};

        int choice = JOptionPane.showOptionDialog(
                null,
                "Admin, please select an action.",
                "KalapatiTravels",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
        );
        if (choice == 0 && validation == true) {
            String username = JOptionPane.showInputDialog(null, "Enter the username:");
            if (username != null && !username.trim().isEmpty()) {
                String destination = JOptionPane.showInputDialog(null, "Enter the destination:");
                if (destination != null && !destination.trim().isEmpty()) {
                    try {

                        Class.forName("com.mysql.cj.jdbc.Driver");

                        String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
                        String user = "root";
                        String password = "Cmmd10082003";
                        Connection connection = DriverManager.getConnection(url, user, password);

                        String sql = "SELECT * FROM traveler WHERE Name = ? AND Destination = ?";
                        PreparedStatement preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, username);
                        preparedStatement.setString(2, destination);

                        ResultSet resultSet = preparedStatement.executeQuery();

                        if (resultSet.next()) {

                            String name = resultSet.getString("name");
                            String desti = resultSet.getString("destination");
                            JOptionPane.showMessageDialog(null, "User Found:\nName: " + name + "\nDestination: " + desti, "Success", JOptionPane.INFORMATION_MESSAGE);

                            String insertQuery = "INSERT INTO economy (Name, Destination, Seat) VALUES (?, ?, 19)";
                            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                            insertStatement.setString(1, name);
                            insertStatement.setString(2, desti);

                            int rowsAffected = insertStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data added to Economy successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to add data to Economy Class.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            String updateQuery = "UPDATE traveler SET Seat = ? WHERE Name = ?";
                            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                            updateStatement.setInt(1, 19);
                            updateStatement.setString(2, name);
                            int rowsAffected2 = updateStatement.executeUpdate();
                            updateStatement.close();

                            if (rowsAffected2 > 0) {
                                System.out.println("Seat added");
                            } else {
                                System.out.println("Seat error");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "The user you entered is not registered in the database or maybe you input a wrong destination place.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        resultSet.close();
                        preparedStatement.close();
                        connection.close();

                    } catch (ClassNotFoundException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No destination entered.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No username entered.");
            }
        } else if (choice == 0 && validation == false) {
            String[] options2 = {"Yes", "No"};

            int choice2 = JOptionPane.showOptionDialog(
                    null,
                    "Admin, Economy Class is full. Would you like to go to the First Class?",
                    "KalapatiTravels",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options2,
                    options2[0]
            );
            if (choice2 == 0) {
                dispose();
                FirstClass FirstClass = new FirstClass();
                FirstClass.show();
            } else if (choice2 == 1) {
                JOptionPane.showMessageDialog(null, "Next flight leaves in 5 hours");
            }
        } else if (choice == 1) {
            String username = JOptionPane.showInputDialog(null, "Enter the username:");
            if (username != null && !username.trim().isEmpty()) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
                    String user = "root";
                    String password = "Cmmd10082003";
                    Connection connection = DriverManager.getConnection(url, user, password);

                    String deleteQuery = "DELETE FROM economy WHERE Name = ?";
                    PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
                    deleteStatement.setString(1, username);

                    int rowsAffected = deleteStatement.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Row deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Row not found or failed to delete.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    deleteStatement.close();
                    connection.close();

                } catch (ClassNotFoundException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No username entered.");
            }
        }
    }//GEN-LAST:event_Btn19ActionPerformed

    private void Btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn16ActionPerformed
        SeatsValidation();
        String[] options = {"Add", "Delete"};

        int choice = JOptionPane.showOptionDialog(
                null,
                "Admin, please select an action.",
                "KalapatiTravels",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
        );
        if (choice == 0 && validation == true) {
            String username = JOptionPane.showInputDialog(null, "Enter the username:");
            if (username != null && !username.trim().isEmpty()) {
                String destination = JOptionPane.showInputDialog(null, "Enter the destination:");
                if (destination != null && !destination.trim().isEmpty()) {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
                        String user = "root";
                        String password = "Cmmd10082003";
                        Connection connection = DriverManager.getConnection(url, user, password);

                        String sql = "SELECT * FROM traveler WHERE Name = ? AND Destination = ?";
                        PreparedStatement preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, username);
                        preparedStatement.setString(2, destination);

                        ResultSet resultSet = preparedStatement.executeQuery();

                        if (resultSet.next()) {

                            String name = resultSet.getString("name");
                            String desti = resultSet.getString("destination");
                            JOptionPane.showMessageDialog(null, "User Found:\nName: " + name + "\nDestination: " + desti, "Success", JOptionPane.INFORMATION_MESSAGE);

                            String insertQuery = "INSERT INTO economy (Name, Destination, Seat) VALUES (?, ?, 16)";
                            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                            insertStatement.setString(1, name);
                            insertStatement.setString(2, desti);

                            int rowsAffected = insertStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data added to Economy successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to add data to Economy Class.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            String updateQuery = "UPDATE traveler SET Seat = ? WHERE Name = ?";
                            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                            updateStatement.setInt(1, 16);
                            updateStatement.setString(2, name);
                            int rowsAffected2 = updateStatement.executeUpdate();
                            updateStatement.close();

                            if (rowsAffected2 > 0) {
                                System.out.println("Seat added");
                            } else {
                                System.out.println("Seat error");
                            }
                        } else {

                            JOptionPane.showMessageDialog(null, "The user you entered is not registered in the database or maybe you input a wrong destination place.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        resultSet.close();
                        preparedStatement.close();
                        connection.close();

                    } catch (ClassNotFoundException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No destination entered.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No username entered.");
            }
        } else if (choice == 0 && validation == false) {
            String[] options2 = {"Yes", "No"};

            int choice2 = JOptionPane.showOptionDialog(
                    null,
                    "Admin, Economy Class is full. Would you like to go to the First Class?",
                    "KalapatiTravels",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options2,
                    options2[0]
            );
            if (choice2 == 0) {
                dispose();
                FirstClass FirstClass = new FirstClass();
                FirstClass.show();
            } else if (choice2 == 1) {
                JOptionPane.showMessageDialog(null, "Next flight leaves in 5 hours");
            }
        } else if (choice == 1) {
            String username = JOptionPane.showInputDialog(null, "Enter the username:");
            if (username != null && !username.trim().isEmpty()) {
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
                    String user = "root";
                    String password = "Cmmd10082003";
                    Connection connection = DriverManager.getConnection(url, user, password);

                    String deleteQuery = "DELETE FROM economy WHERE Name = ?";
                    PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
                    deleteStatement.setString(1, username);

                    int rowsAffected = deleteStatement.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Row deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Row not found or failed to delete.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    deleteStatement.close();
                    connection.close();

                } catch (ClassNotFoundException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No username entered.");
            }
        }
    }//GEN-LAST:event_Btn16ActionPerformed

    private void Btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn14ActionPerformed
        SeatsValidation();
        String[] options = {"Add", "Delete"};

        int choice = JOptionPane.showOptionDialog(
                null,
                "Admin, please select an action.",
                "KalapatiTravels",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
        );
        if (choice == 0 && validation == true) {
            String username = JOptionPane.showInputDialog(null, "Enter the username:");
            if (username != null && !username.trim().isEmpty()) {
                String destination = JOptionPane.showInputDialog(null, "Enter the destination:");
                if (destination != null && !destination.trim().isEmpty()) {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
                        String user = "root";
                        String password = "Cmmd10082003";
                        Connection connection = DriverManager.getConnection(url, user, password);

                        String sql = "SELECT * FROM traveler WHERE Name = ? AND Destination = ?";
                        PreparedStatement preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, username);
                        preparedStatement.setString(2, destination);

                        ResultSet resultSet = preparedStatement.executeQuery();

                        if (resultSet.next()) {

                            String name = resultSet.getString("name");
                            String desti = resultSet.getString("destination");
                            JOptionPane.showMessageDialog(null, "User Found:\nName: " + name + "\nDestination: " + desti, "Success", JOptionPane.INFORMATION_MESSAGE);

                            String insertQuery = "INSERT INTO economy (Name, Destination, Seat) VALUES (?, ?, 14)";
                            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                            insertStatement.setString(1, name);
                            insertStatement.setString(2, desti);

                            int rowsAffected = insertStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data added to Economy successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to add data to Economy Class.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            String updateQuery = "UPDATE traveler SET Seat = ? WHERE Name = ?";
                            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                            updateStatement.setInt(1, 14);
                            updateStatement.setString(2, name);
                            int rowsAffected2 = updateStatement.executeUpdate();
                            updateStatement.close();

                            if (rowsAffected2 > 0) {
                                System.out.println("Seat added");
                            } else {
                                System.out.println("Seat error");
                            }
                        } else {

                            JOptionPane.showMessageDialog(null, "The user you entered is not registered in the database or maybe you input a wrong destination place.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        resultSet.close();
                        preparedStatement.close();
                        connection.close();

                    } catch (ClassNotFoundException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No destination entered.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No username entered.");
            }
        } else if (choice == 0 && validation == false) {
            String[] options2 = {"Yes", "No"};

            int choice2 = JOptionPane.showOptionDialog(
                    null,
                    "Admin, Economy Class is full. Would you like to go to the First Class?",
                    "KalapatiTravels",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options2,
                    options2[0]
            );
            if (choice2 == 0) {
                dispose();
                FirstClass FirstClass = new FirstClass();
                FirstClass.show();
            } else if (choice2 == 1) {
                JOptionPane.showMessageDialog(null, "Next flight leaves in 5 hours");
            }
        } else if (choice == 1) {
            String username = JOptionPane.showInputDialog(null, "Enter the username:");
            if (username != null && !username.trim().isEmpty()) {
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
                    String user = "root";
                    String password = "Cmmd10082003";
                    Connection connection = DriverManager.getConnection(url, user, password);

                    String deleteQuery = "DELETE FROM economy WHERE Name = ?";
                    PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
                    deleteStatement.setString(1, username);

                    int rowsAffected = deleteStatement.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Row deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Row not found or failed to delete.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    deleteStatement.close();
                    connection.close();

                } catch (ClassNotFoundException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No username entered.");
            }
        }
    }//GEN-LAST:event_Btn14ActionPerformed

    private void Btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn18ActionPerformed
        SeatsValidation();
        String[] options = {"Add", "Delete"};

        int choice = JOptionPane.showOptionDialog(
                null,
                "Admin, please select an action.",
                "KalapatiTravels",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
        );
        if (choice == 0 && validation == true) {
            String username = JOptionPane.showInputDialog(null, "Enter the username:");
            if (username != null && !username.trim().isEmpty()) {
                String destination = JOptionPane.showInputDialog(null, "Enter the destination:");
                if (destination != null && !destination.trim().isEmpty()) {
                    try {

                        Class.forName("com.mysql.cj.jdbc.Driver");

                        String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
                        String user = "root";
                        String password = "Cmmd10082003";
                        Connection connection = DriverManager.getConnection(url, user, password);

                        String sql = "SELECT * FROM traveler WHERE Name = ? AND Destination = ?";
                        PreparedStatement preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, username);
                        preparedStatement.setString(2, destination);

                        ResultSet resultSet = preparedStatement.executeQuery();

                        if (resultSet.next()) {

                            String name = resultSet.getString("name");
                            String desti = resultSet.getString("destination");
                            JOptionPane.showMessageDialog(null, "User Found:\nName: " + name + "\nDestination: " + desti, "Success", JOptionPane.INFORMATION_MESSAGE);

                            String insertQuery = "INSERT INTO economy (Name, Destination, Seat) VALUES (?, ?, 18)";
                            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                            insertStatement.setString(1, name);
                            insertStatement.setString(2, desti);

                            int rowsAffected = insertStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data added to Economy successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to add data to Economy Class.", "Error", JOptionPane.ERROR_MESSAGE);
                            }

                            String updateQuery = "UPDATE traveler SET Seat = ? WHERE Name = ?";
                            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                            updateStatement.setInt(1, 18);
                            updateStatement.setString(2, name);
                            int rowsAffected2 = updateStatement.executeUpdate();
                            updateStatement.close();

                            if (rowsAffected2 > 0) {
                                System.out.println("Seat added");
                            } else {
                                System.out.println("Seat error");
                            }
                        } else {

                            JOptionPane.showMessageDialog(null, "The user you entered is not registered in the database or maybe you input a wrong destination place.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        resultSet.close();
                        preparedStatement.close();
                        connection.close();

                    } catch (ClassNotFoundException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No destination entered.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No username entered.");
            }
        } else if (choice == 0 && validation == false) {
            String[] options2 = {"Yes", "No"};

            int choice2 = JOptionPane.showOptionDialog(
                    null,
                    "Admin, Economy Class is full. Would you like to go to the First Class?",
                    "KalapatiTravels",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options2,
                    options2[0]
            );
            if (choice2 == 0) {
                dispose();
                FirstClass FirstClass = new FirstClass();
                FirstClass.show();
            } else if (choice2 == 1) {
                JOptionPane.showMessageDialog(null, "Next flight leaves in 5 hours");
            }
        } else if (choice == 1) {
            String username = JOptionPane.showInputDialog(null, "Enter the username:");
            if (username != null && !username.trim().isEmpty()) {
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");

                    String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
                    String user = "root";
                    String password = "Cmmd10082003";
                    Connection connection = DriverManager.getConnection(url, user, password);

                    String deleteQuery = "DELETE FROM economy WHERE Name = ?";
                    PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
                    deleteStatement.setString(1, username);

                    int rowsAffected = deleteStatement.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Row deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Row not found or failed to delete.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    deleteStatement.close();
                    connection.close();

                } catch (ClassNotFoundException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No username entered.");
            }
        }
    }//GEN-LAST:event_Btn18ActionPerformed

    private void Btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn20ActionPerformed
        SeatsValidation();
        String[] options = {"Add", "Delete"};

        int choice = JOptionPane.showOptionDialog(
                null,
                "Admin, please select an action.",
                "KalapatiTravels",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
        );
        if (choice == 0 && validation == true) {
            String username = JOptionPane.showInputDialog(null, "Enter the username:");
            if (username != null && !username.trim().isEmpty()) {
                String destination = JOptionPane.showInputDialog(null, "Enter the destination:");
                if (destination != null && !destination.trim().isEmpty()) {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");

                        String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
                        String user = "root";
                        String password = "Cmmd10082003";
                        Connection connection = DriverManager.getConnection(url, user, password);

                        String sql = "SELECT * FROM traveler WHERE Name = ? AND Destination = ?";
                        PreparedStatement preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, username);
                        preparedStatement.setString(2, destination);

                        ResultSet resultSet = preparedStatement.executeQuery();

                        if (resultSet.next()) {
                            String name = resultSet.getString("name");
                            String desti = resultSet.getString("destination");
                            JOptionPane.showMessageDialog(null, "User Found:\nName: " + name + "\nDestination: " + desti, "Success", JOptionPane.INFORMATION_MESSAGE);

                            String insertQuery = "INSERT INTO economy (Name, Destination, Seat) VALUES (?, ?, 20)";
                            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                            insertStatement.setString(1, name);
                            insertStatement.setString(2, desti);

                            int rowsAffected = insertStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data added to Economy successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to add data to Economy Class.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            String updateQuery = "UPDATE traveler SET Seat = ? WHERE Name = ?";
                            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                            updateStatement.setInt(1, 20);
                            updateStatement.setString(2, name);
                            int rowsAffected2 = updateStatement.executeUpdate();
                            updateStatement.close();

                            if (rowsAffected2 > 0) {
                                System.out.println("Seat added");
                            } else {
                                System.out.println("Seat error");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "The user you entered is not registered in the database or maybe you input a wrong destination place.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        resultSet.close();
                        preparedStatement.close();
                        connection.close();

                    } catch (ClassNotFoundException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No destination entered.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No username entered.");
            }
        } else if (choice == 0 && validation == false) {
            String[] options2 = {"Yes", "No"};

            int choice2 = JOptionPane.showOptionDialog(
                    null,
                    "Admin, Economy Class is full. Would you like to go to the First Class?",
                    "KalapatiTravels",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options2,
                    options2[0]
            );
            if (choice2 == 0) {
                dispose();
                FirstClass FirstClass = new FirstClass();
                FirstClass.show();
            } else if (choice2 == 1) {
                JOptionPane.showMessageDialog(null, "Next flight leaves in 5 hours");
            }
        } else if (choice == 1) {
            String username = JOptionPane.showInputDialog(null, "Enter the username:");
            if (username != null && !username.trim().isEmpty()) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
                    String user = "root";
                    String password = "Cmmd10082003";
                    Connection connection = DriverManager.getConnection(url, user, password);

                    String deleteQuery = "DELETE FROM economy WHERE Name = ?";
                    PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
                    deleteStatement.setString(1, username);

                    int rowsAffected = deleteStatement.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Row deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Row not found or failed to delete.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    deleteStatement.close();
                    connection.close();

                } catch (ClassNotFoundException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No username entered.");
            }
        }
    }//GEN-LAST:event_Btn20ActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
      // disposes the current frame and shows ClassSelection.java
        dispose();
        ClassSelection ClassSelection = new ClassSelection();
        ClassSelection.show();
    }//GEN-LAST:event_BackBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" Btn11ok and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(Economy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Economy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Economy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Economy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Economy().setVisible(true);
            }
        });
    }
// this is to check if the selected flight class is full.
    private static boolean SeatsValidation() {
        try {
// load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
// link
            String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
            // db login
            String user = "root";
            String password = "Cmmd10082003";
            Connection connection = DriverManager.getConnection(url, user, password);
// query
            String countQuery = "SELECT COUNT(*) FROM economy";
            PreparedStatement countStatement = connection.prepareStatement(countQuery);
// execete
            ResultSet resultSet = countStatement.executeQuery();
            resultSet.next();
            int rowCount = resultSet.getInt(1);

            resultSet.close();
            countStatement.close();
            connection.close();
// there are only 10 seats so 10 is pre defined
            if (rowCount >= 10) {
                validation = false;
                return false;
            } else {
                validation = true;
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton Btn11;
    private javax.swing.JButton Btn12;
    private javax.swing.JButton Btn13;
    private javax.swing.JButton Btn14;
    private javax.swing.JButton Btn15;
    private javax.swing.JButton Btn16;
    private javax.swing.JButton Btn17;
    private javax.swing.JButton Btn18;
    private javax.swing.JButton Btn19;
    private javax.swing.JButton Btn20;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
