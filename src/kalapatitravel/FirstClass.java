
package kalapatitravel;

import javax.swing.JOptionPane;
import java.sql.*;

public class FirstClass extends javax.swing.JFrame {

    public static boolean validation = true;

    public FirstClass() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Btn3 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn10 = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));
        jPanel6.setForeground(new java.awt.Color(51, 51, 255));

        Btn1.setText("1");
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });

        Btn2.setText("2");
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("First Class");

        Btn3.setText("3");
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        Btn5.setText("5");
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });

        Btn7.setText("7");
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });

        Btn9.setText("9");
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });

        Btn6.setText("6");
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });

        Btn4.setText("4");
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        Btn8.setText("8");
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });

        Btn10.setText("10");
        Btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn10ActionPerformed(evt);
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
                        .addGap(88, 88, 88)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 103, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Kalapati Travels");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(367, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        // All buttons 1-10 have the same explanation with button 11 in Economy.java
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
                       
                            String insertQuery = "INSERT INTO firstclass (Name, Destination, Seat) VALUES (?, ?, 1)";
                            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                            insertStatement.setString(1, name);
                            insertStatement.setString(2, desti);

                            int rowsAffected = insertStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data added to FirstClass successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to add data to FirstClass.", "Error", JOptionPane.ERROR_MESSAGE);
                            } 
                            String updateQuery = "UPDATE traveler SET Seat = ? WHERE Name = ?";
                            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                            updateStatement.setInt(1, 1);
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
                    "Admin, First Class is full. Would you like to go to the Economy Class?",
                    "KalapatiTravels",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options2,
                    options2[0]
            );
            if (choice2 == 0) {
                dispose();
                Economy Economy = new Economy();
                Economy.show();
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

                    String deleteQuery = "DELETE FROM firstclass WHERE Name = ?";
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
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
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
                         
                            String insertQuery = "INSERT INTO firstclass (Name, Destination, Seat) VALUES (?, ?, 2)";
                            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                            insertStatement.setString(1, name);
                            insertStatement.setString(2, desti);

                            int rowsAffected = insertStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data added to FirstClass successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to add data to FirstClass.", "Error", JOptionPane.ERROR_MESSAGE);
                            } 
                            String updateQuery = "UPDATE traveler SET Seat = ? WHERE Name = ?";
                            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                            updateStatement.setInt(1, 2);
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
                    "Admin, First Class is full. Would you like to go to the Economy Class?",
                    "KalapatiTravels",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options2,
                    options2[0]
            );
            if (choice2 == 0) {
                dispose();
                Economy Economy = new Economy();
                Economy.show();
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

                    String deleteQuery = "DELETE FROM firstclass WHERE Name = ?";
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
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed

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
                      
                            String insertQuery = "INSERT INTO firstclass (Name, Destination, Seat) VALUES (?, ?, 3)";
                            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                            insertStatement.setString(1, name);
                            insertStatement.setString(2, desti);

                            int rowsAffected = insertStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data added to FirstClass successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to add data to FirstClass.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            String updateQuery = "UPDATE traveler SET Seat = ? WHERE Name = ?";
                            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                            updateStatement.setInt(1, 3);
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
                    "Admin, First Class is full. Would you like to go to the Economy Class?",
                    "KalapatiTravels",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options2,
                    options2[0]
            );
            if (choice2 == 0) {
                dispose();
                Economy Economy = new Economy();
                Economy.show();
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

                    String deleteQuery = "DELETE FROM firstclass WHERE Name = ?";
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
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
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
                          
                            String insertQuery = "INSERT INTO firstclass (Name, Destination, Seat) VALUES (?, ?, 5)";
                            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                            insertStatement.setString(1, name);
                            insertStatement.setString(2, desti);

                            int rowsAffected = insertStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data added to FirstClass successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to add data to FirstClass.", "Error", JOptionPane.ERROR_MESSAGE);
                            } 
                            String updateQuery = "UPDATE traveler SET Seat = ? WHERE Name = ?";
                            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                            updateStatement.setInt(1, 5);
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
                    "Admin, First Class is full. Would you like to go to the Economy Class?",
                    "KalapatiTravels",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options2,
                    options2[0]
            );
            if (choice2 == 0) {
                dispose();
                Economy Economy = new Economy();
                Economy.show();
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

                    String deleteQuery = "DELETE FROM firstclass WHERE Name = ?";
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
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
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
                    
                            String insertQuery = "INSERT INTO firstclass (Name, Destination, Seat) VALUES (?, ?, 7)";
                            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                            insertStatement.setString(1, name);
                            insertStatement.setString(2, desti);

                            int rowsAffected = insertStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data added to FirstClass successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to add data to FirstClass.", "Error", JOptionPane.ERROR_MESSAGE);
                            } 
                            String updateQuery = "UPDATE traveler SET Seat = ? WHERE Name = ?";
                            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                            updateStatement.setInt(1, 7);
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
                    "Admin, First Class is full. Would you like to go to the Economy Class?",
                    "KalapatiTravels",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options2,
                    options2[0]
            );
            if (choice2 == 0) {
                dispose();
                Economy Economy = new Economy();
                Economy.show();
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

                    String deleteQuery = "DELETE FROM firstclass WHERE Name = ?";
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
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
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
                  
                            String insertQuery = "INSERT INTO firstclass (Name, Destination, Seat) VALUES (?, ?, 9)";
                            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                            insertStatement.setString(1, name);
                            insertStatement.setString(2, desti);

                            int rowsAffected = insertStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data added to FirstClass successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to add data to FirstClass.", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                            String updateQuery = "UPDATE traveler SET Seat = ? WHERE Name = ?";
                            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                            updateStatement.setInt(1, 9);
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
                    "Admin, First Class is full. Would you like to go to the Economy Class?",
                    "KalapatiTravels",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options2,
                    options2[0]
            );
            if (choice2 == 0) {
                dispose();
                Economy Economy = new Economy();
                Economy.show();
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

                    String deleteQuery = "DELETE FROM firstclass WHERE Name = ?";
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
    }//GEN-LAST:event_Btn9ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
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
                          
                            String insertQuery = "INSERT INTO firstclass (Name, Destination, Seat) VALUES (?, ?, 6)";
                            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                            insertStatement.setString(1, name);
                            insertStatement.setString(2, desti);

                            int rowsAffected = insertStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data added to FirstClass successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to add data to FirstClass.", "Error", JOptionPane.ERROR_MESSAGE);
                            } 
                            String updateQuery = "UPDATE traveler SET Seat = ? WHERE Name = ?";
                            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                            updateStatement.setInt(1, 6);
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
                    "Admin, First Class is full. Would you like to go to the Economy Class?",
                    "KalapatiTravels",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options2,
                    options2[0]
            );
            if (choice2 == 0) {
                dispose();
                Economy Economy = new Economy();
                Economy.show();
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

                    String deleteQuery = "DELETE FROM firstclass WHERE Name = ?";
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
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
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
                           
                            String insertQuery = "INSERT INTO firstclass (Name, Destination, Seat) VALUES (?, ?, 4 )";
                            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                            insertStatement.setString(1, name);
                            insertStatement.setString(2, desti);

                            int rowsAffected = insertStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data added to FirstClass successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to add data to FirstClass.", "Error", JOptionPane.ERROR_MESSAGE);
                            } 
                            String updateQuery = "UPDATE traveler SET Seat = ? WHERE Name = ?";
                            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                            updateStatement.setInt(1, 4);
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
                    "Admin, First Class is full. Would you like to go to the Economy Class?",
                    "KalapatiTravels",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options2,
                    options2[0]
            );
            if (choice2 == 0) {
                dispose();
                Economy Economy = new Economy();
                Economy.show();
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
                    
                    String deleteQuery = "DELETE FROM firstclass WHERE Name = ?";
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
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
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
                       
                            String insertQuery = "INSERT INTO firstclass (Name, Destination, Seat) VALUES (?, ?, 8)";
                            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                            insertStatement.setString(1, name);
                            insertStatement.setString(2, desti);

                         
                            int rowsAffected = insertStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data added to FirstClass successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to add data to FirstClass.", "Error", JOptionPane.ERROR_MESSAGE);
                            } 
                            String updateQuery = "UPDATE traveler SET Seat = ? WHERE Name = ?";
                            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                            updateStatement.setInt(1, 8);
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
                    "Admin, First Class is full. Would you like to go to the Economy Class?",
                    "KalapatiTravels",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options2,
                    options2[0]
            );
            if (choice2 == 0) {
                dispose();
                Economy Economy = new Economy();
                Economy.show();
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

                    String deleteQuery = "DELETE FROM firstclass WHERE Name = ?";
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
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn10ActionPerformed
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
                    
                            String insertQuery = "INSERT INTO firstclass (Name, Destination, Seat) VALUES (?, ?, 10)";
                            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                            insertStatement.setString(1, name);
                            insertStatement.setString(2, desti);

                            int rowsAffected = insertStatement.executeUpdate();
                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Data added to FirstClass successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Failed to add data to FirstClass.", "Error", JOptionPane.ERROR_MESSAGE);
                            } 
                            String updateQuery = "UPDATE traveler SET Seat = ? WHERE Name = ?";
                            PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                            updateStatement.setInt(1, 10);
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
                    "Admin, First Class is full. Would you like to go to the Economy Class?",
                    "KalapatiTravels",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options2,
                    options2[0]
            );
            if (choice2 == 0) {
                dispose();
                Economy Economy = new Economy();
                Economy.show();
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

                    String deleteQuery = "DELETE FROM firstclass WHERE Name = ?";
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
    }//GEN-LAST:event_Btn10ActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
     // disposes the current frame and opens ClassSelection.java
        dispose();
        ClassSelection ClassSelection = new ClassSelection();
        ClassSelection.show();
    }//GEN-LAST:event_BackBtnActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FirstClass.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstClass.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstClass.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstClass.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstClass().setVisible(true);
            }
        });
    }

    private static boolean SeatsValidation() {
        // same explanation from Economy.java
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3307/KalapatiTravels";
            String user = "root";
            String password = "Cmmd10082003";
            Connection connection = DriverManager.getConnection(url, user, password);

            String countQuery = "SELECT COUNT(*) FROM firstclass";
            PreparedStatement countStatement = connection.prepareStatement(countQuery);
            ResultSet resultSet = countStatement.executeQuery();
            resultSet.next();
            int rowCount = resultSet.getInt(1);

            resultSet.close();
            countStatement.close();
            connection.close();

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
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn10;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
