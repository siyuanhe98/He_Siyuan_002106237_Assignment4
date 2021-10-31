/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Systems.Systems;
import javax.swing.JOptionPane;
import model.Community;
import model.House;
import model.Person;

/**
 *
 * @author Siyuan He
 */
public class CrudJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    Person RetrievePerson;
    private Systems sys;

    public CrudJPanel(Systems sys) {
        initComponents();
        this.sys = sys;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtHouse = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtDelId = new javax.swing.JTextField();
        btnDel = new javax.swing.JButton();
        txtShowName = new javax.swing.JTextField();
        txtShowId = new javax.swing.JTextField();
        txtShowAge = new javax.swing.JTextField();
        txtShowHouse = new javax.swing.JTextField();
        txtShowCommunity = new javax.swing.JTextField();
        txtSearchId = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        btnSave.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDel.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel2.setText("Id:");

        jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel3.setText("House:");

        jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel4.setText("Community:");

        jLabel5.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel5.setText("Id you want to delete:");

        jLabel6.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel6.setText("Id you want to search:");

        jLabel7.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel7.setText("Name:");

        jLabel8.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel8.setText("Age:");

        jLabel9.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel9.setText("House:");

        jLabel10.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel10.setText("Community:");

        jLabel11.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel11.setText("Age:");

        jLabel12.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Search Person");

        jLabel13.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel13.setText("Create Person");

        jLabel14.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel14.setText("Delete Person");

        jLabel15.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Update Person");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel1)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtHouse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCommunity))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDelId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel13)
                        .addGap(236, 236, 236)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtShowAge, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtShowName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtShowCommunity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtShowHouse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtShowId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDelId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addComponent(btnDel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtShowName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtShowAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtShowCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtShowHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtShowId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate)))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAge, txtCommunity, txtDelId, txtHouse, txtName, txtSearchId, txtShowAge, txtShowCommunity, txtShowHouse, txtShowId, txtShowName});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Name!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtName.setText("");
            return;
        }
        if (txtAge.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Age!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtAge.setText("");
            return;
        } else if (!txtAge.getText().matches("^(?:[1-9]?\\d|100)$")) {
            JOptionPane.showMessageDialog(this, "Please input Correct Age!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtAge.setText("");
            return;
        }
        if (txtHouse.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input House!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtHouse.setText("");
            return;
        }
        if (txtCommunity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Community!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtCommunity.setText("");
            return;
        } else if (!(txtCommunity.getText().equalsIgnoreCase("Fenway") || txtCommunity.getText().equalsIgnoreCase("Lower Manhattan") || txtCommunity.getText().equalsIgnoreCase("Higher Manhattan") || txtCommunity.getText().equalsIgnoreCase("Back Bay"))) {
            JOptionPane.showMessageDialog(this, "Please input correct Community!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtCommunity.setText("");
            return;
        }

        Person person = new Person();
        System.out.println(person.getId());

        person.setName(txtName.getText());
        person.setAge(Integer.parseInt(txtAge.getText()));
        person.setHouse(new House(txtHouse.getText()));
        person.setCommunity(new Community(txtCommunity.getText()));
        sys.getPersonDirectory().createPerson(person);
        System.out.println(sys.getPersonDirectory().getPersons());

        JOptionPane.showMessageDialog(this, "New Person Added.");

        txtName.setText("");
        txtAge.setText("");
        txtHouse.setText("");
        txtCommunity.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
        if (txtDelId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Id!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtDelId.setText("");
            return;
        } else if (!txtDelId.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Please input Correct Id!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtDelId.setText("");
            return;
        }

        boolean find = false;
        for (Person p : sys.getPersonDirectory().getPersons()) {
            if (p.getId() == Integer.parseInt(txtDelId.getText())) {
                find = true;
            }
        }
        if (!find) {
            JOptionPane.showMessageDialog(this, "No person is Found!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtShowName.setText("");
            txtShowId.setText("");
            txtShowAge.setText("");
            txtShowHouse.setText("");
            txtShowCommunity.setText("");
            txtDelId.setText("");
            return;
        }

        boolean deletePerson = sys.getPersonDirectory().deletePerson(Integer.parseInt(txtDelId.getText()));
        JOptionPane.showMessageDialog(this, "Delete Successful");

        System.out.println(deletePerson);
        System.out.println(sys.getPersonDirectory().getPersons());
        txtDelId.setText("");
        txtSearchId.setText("");
        txtShowName.setText("");
        txtShowId.setText("");
        txtShowAge.setText("");
        txtShowHouse.setText("");
        txtShowCommunity.setText("");


    }//GEN-LAST:event_btnDelActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (txtSearchId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Id!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtSearchId.setText("");
            return;
        } else if (!txtSearchId.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Please input Correct Id!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtSearchId.setText("");
            return;
        }

        boolean find = false;
        for (Person p : sys.getPersonDirectory().getPersons()) {
            if (p.getId() == Integer.parseInt(txtSearchId.getText())) {
                find = true;
            }
        }
        if (!find) {
            JOptionPane.showMessageDialog(this, "No person is Found!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtShowName.setText("");
            txtShowId.setText("");
            txtShowAge.setText("");
            txtShowHouse.setText("");
            txtShowCommunity.setText("");
            txtSearchId.setText("");
            return;
        }

        RetrievePerson = sys.getPersonDirectory().RetrievePerson(Integer.parseInt(txtSearchId.getText()));
        txtShowName.setText(RetrievePerson.getName());
        txtShowId.setText(String.valueOf(RetrievePerson.getId()));
        txtShowAge.setText(String.valueOf(RetrievePerson.getAge()));
        txtShowHouse.setText(RetrievePerson.getHouse().getName());
        txtShowCommunity.setText(RetrievePerson.getCommunity().getName());


    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (txtShowName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Name!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtShowName.setText("");
            return;
        }
        if (txtShowAge.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Age!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtShowAge.setText("");
            return;
        } else if (!txtShowAge.getText().matches("^(?:[1-9]?\\d|100)$")) {
            JOptionPane.showMessageDialog(this, "Please input Correct Age!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtShowAge.setText("");
            return;
        }
        if (txtShowHouse.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input House!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtShowHouse.setText("");
            return;
        }
        if (txtShowCommunity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Community!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtShowCommunity.setText("");
            return;
        } else if (!(txtShowCommunity.getText().equalsIgnoreCase("Fenway") || txtShowCommunity.getText().equalsIgnoreCase("Lower Manhattan") || txtShowCommunity.getText().equalsIgnoreCase("Higher Manhattan") || txtShowCommunity.getText().equalsIgnoreCase("Back Bay"))) {
            JOptionPane.showMessageDialog(this, "Please input correct Community!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtShowCommunity.setText("");
            return;
        }
        if (txtShowId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Id cannot be changed!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtShowId.setText(RetrievePerson.getId() + "");
        }
        if (Integer.parseInt(txtShowId.getText()) != RetrievePerson.getId()) {
            JOptionPane.showMessageDialog(this, "Id cannot be changed!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtShowId.setText(RetrievePerson.getId() + "");
            return;
        }
        if (!txtShowCommunity.getText().equalsIgnoreCase(RetrievePerson.getCommunity().getName())) {
            if (txtShowHouse.getText().equalsIgnoreCase(RetrievePerson.getHouse().getName())) {
                JOptionPane.showMessageDialog(this, "Please update the House!", "Warning", JOptionPane.ERROR_MESSAGE);
                txtShowHouse.setText("");
                return;
            }

        }

        RetrievePerson.setAge(Integer.parseInt(txtShowAge.getText()));
        RetrievePerson.setName(txtShowName.getText());
        RetrievePerson.setHouse(new House(txtShowHouse.getText()));
        RetrievePerson.setCommunity(new Community(txtShowCommunity.getText()));

        System.out.println(sys.getPersonDirectory().getPersons());
        JOptionPane.showMessageDialog(this, "Update Successful.");


    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtDelId;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearchId;
    private javax.swing.JTextField txtShowAge;
    private javax.swing.JTextField txtShowCommunity;
    private javax.swing.JTextField txtShowHouse;
    private javax.swing.JTextField txtShowId;
    private javax.swing.JTextField txtShowName;
    // End of variables declaration//GEN-END:variables
}
