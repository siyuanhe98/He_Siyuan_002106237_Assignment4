/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Systems.Systems;
import data.PatientDirectory;
import data.PersonDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.Person;
import model.VitalSigns;

/**
 *
 * @author Siyuan He
 */
public class LowerPanel extends javax.swing.JPanel {

    /**
     * Creates new form Fenway
     */
    private Systems sys;
    private ArrayList<Person> Person = new ArrayList<>();
    private ArrayList<Person> patients = new ArrayList<>();

    public LowerPanel(Systems sys) {
        initComponents();
        this.sys = sys;
        Person = new ArrayList<>();
        filter();
        filterPatient();
        populatePerson();
        txtPatient.setText(String.valueOf(patients.size()));
        txtPerson.setText(String.valueOf(Person.size()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPatient = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInfo = new javax.swing.JTable();
        btnPerson = new javax.swing.JButton();
        btnPatient = new javax.swing.JButton();
        txtPerson = new javax.swing.JTextField();
        txtLow = new javax.swing.JTextField();
        txtHigh = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtAgePerson = new javax.swing.JTextField();
        txtAgePatient = new javax.swing.JTextField();
        btnAgePerson = new javax.swing.JButton();
        btnAgePatient = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        tblInfo.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        tblInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "House", "Age", "Id", "Blood Pressure"
            }
        ));
        jScrollPane1.setViewportView(tblInfo);

        btnPerson.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnPerson.setText("View All Persons");
        btnPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonActionPerformed(evt);
            }
        });

        btnPatient.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnPatient.setText("View All Patients");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnSearch.setText("Enter");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtAgePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgePersonActionPerformed(evt);
            }
        });

        btnAgePerson.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnAgePerson.setText("View Persons");
        btnAgePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgePersonActionPerformed(evt);
            }
        });

        btnAgePatient.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        btnAgePatient.setText("View All Patients");
        btnAgePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgePatientActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Filter data by age groups");

        jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel2.setText("From:");

        jLabel3.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel3.setText("The number of patients:");

        jLabel4.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel4.setText("The number of persons:");

        jLabel5.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel5.setText("to:");

        jLabel6.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel6.setText("The number of persons:");

        jLabel7.setFont(new java.awt.Font("微软雅黑", 0, 14)); // NOI18N
        jLabel7.setText("The number of patients:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPerson)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPatient))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 276, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLow, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHigh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAgePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAgePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgePerson)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgePatient))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPerson)
                    .addComponent(btnPatient))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtHigh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAgePerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtAgePatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgePerson)
                    .addComponent(btnAgePatient))
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonActionPerformed
        // TODO add your handling code here:
        tblInfo.clearSelection();
        populatePerson();
    }//GEN-LAST:event_btnPersonActionPerformed

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        // TODO add your handling code here:
        tblInfo.clearSelection();
        populatePatient();

    }//GEN-LAST:event_btnPatientActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (txtHigh.getText().isEmpty() || txtLow.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Ages!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtHigh.setText("");
            txtLow.setText("");
            txtAgePerson.setText("");
            txtAgePatient.setText("");
            return;
        } else if ((!txtHigh.getText().matches("\\d+")) || (!txtLow.getText().matches("\\d+"))) {
            JOptionPane.showMessageDialog(this, "Please input correct Ages!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtHigh.setText("");
            txtLow.setText("");
            txtAgePerson.setText("");
            txtAgePatient.setText("");
            return;
        } else if (Integer.parseInt(txtHigh.getText()) <= Integer.parseInt(txtLow.getText())) {
            JOptionPane.showMessageDialog(this, "Max Age cannot be lower than Min Age!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtHigh.setText("");
            txtLow.setText("");
            txtAgePerson.setText("");
            txtAgePatient.setText("");
            return;
        }
        populateAgePerson();
        ArrayList<Person> ages = new ArrayList<Person>();
        int count = 0;
        int patient = 0;
        for (Person p : Person) {
            if (p.getAge() <= Integer.parseInt(txtHigh.getText()) && p.getAge() >= Integer.parseInt(txtLow.getText())) {
                count++;
            }
        }
        for (Person p : patients) {
            if (p.getAge() <= Integer.parseInt(txtHigh.getText()) && p.getAge() >= Integer.parseInt(txtLow.getText())) {
                patient++;
            }
        }
        txtAgePerson.setText(String.valueOf(count));
        txtAgePatient.setText(String.valueOf(patient));
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtAgePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgePersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgePersonActionPerformed

    private void btnAgePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgePersonActionPerformed
        // TODO add your handling code here:
        if (txtHigh.getText().isEmpty() || txtLow.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Ages!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtHigh.setText("");
            txtLow.setText("");
            txtAgePerson.setText("");
            txtAgePatient.setText("");
            return;
        } else if ((!txtHigh.getText().matches("\\d+")) || (!txtLow.getText().matches("\\d+"))) {
            JOptionPane.showMessageDialog(this, "Please input correct Ages!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtHigh.setText("");
            txtLow.setText("");
            txtAgePerson.setText("");
            txtAgePatient.setText("");
            return;
        } else if (Integer.parseInt(txtHigh.getText()) <= Integer.parseInt(txtLow.getText())) {
            JOptionPane.showMessageDialog(this, "Max Age cannot be lower than Min Age!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtHigh.setText("");
            txtLow.setText("");
            txtAgePerson.setText("");
            txtAgePatient.setText("");
            return;
        }
        populateAgePerson();
    }//GEN-LAST:event_btnAgePersonActionPerformed

    private void btnAgePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgePatientActionPerformed
        // TODO add your handling code here:
        if (txtHigh.getText().isEmpty() || txtLow.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Ages!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtHigh.setText("");
            txtLow.setText("");
            txtAgePerson.setText("");
            txtAgePatient.setText("");
            return;
        } else if ((!txtHigh.getText().matches("\\d+")) || (!txtLow.getText().matches("\\d+"))) {
            JOptionPane.showMessageDialog(this, "Please input correct Ages!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtHigh.setText("");
            txtLow.setText("");
            txtAgePerson.setText("");
            txtAgePatient.setText("");
            return;
        } else if (Integer.parseInt(txtHigh.getText()) <= Integer.parseInt(txtLow.getText())) {
            JOptionPane.showMessageDialog(this, "Max Age cannot be lower than Min Age!", "Warning", JOptionPane.ERROR_MESSAGE);
            txtHigh.setText("");
            txtLow.setText("");
            txtAgePerson.setText("");
            txtAgePatient.setText("");
            return;
        }
        populateAgePatient();
    }//GEN-LAST:event_btnAgePatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgePatient;
    private javax.swing.JButton btnAgePerson;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnPerson;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInfo;
    private javax.swing.JTextField txtAgePatient;
    private javax.swing.JTextField txtAgePerson;
    private javax.swing.JTextField txtHigh;
    private javax.swing.JTextField txtLow;
    private javax.swing.JTextField txtPatient;
    private javax.swing.JTextField txtPerson;
    // End of variables declaration//GEN-END:variables

    private void populatePerson() {
        DefaultTableModel model = (DefaultTableModel) tblInfo.getModel();
        model.setRowCount(0);
        for (Person p : Person) {
            int lastData = p.getEncounterHistory().getHistory().size() - 1;
            int highPressure = p.getEncounterHistory().getHistory().get(lastData).getBloodPressure().getHighPressure();
            int lowPressure = p.getEncounterHistory().getHistory().get(lastData).getBloodPressure().getLowPressure();
            System.out.println(lastData);
            System.out.println(highPressure);

            Object[] row = new Object[5];
            row[0] = p.getName();
            row[1] = p.getHouse().getName();
            row[2] = p.getAge();
            row[3] = p.getId();
            row[4] = new String(highPressure + ", " + lowPressure);
            model.addRow(row);
        }
    }

    private void filter() {
        for (Person p : sys.getPersonDirectory().getPersons()) {
            if (p.getCommunity().getName().equalsIgnoreCase("Lower Manhattan")) {
                Person.add(p);
            }
        }
        System.out.println("**" + Person);
    }

    private void populatePatient() {
        DefaultTableModel model = (DefaultTableModel) tblInfo.getModel();
        model.setRowCount(0);
        for (Person p : patients) {
            int lastData = p.getEncounterHistory().getHistory().size() - 1;
            int highPressure = p.getEncounterHistory().getHistory().get(lastData).getBloodPressure().getHighPressure();
            int lowPressure = p.getEncounterHistory().getHistory().get(lastData).getBloodPressure().getLowPressure();
            System.out.println(lastData);
            System.out.println(highPressure);

            Object[] row = new Object[5];
            row[0] = p.getName();
            row[1] = p.getHouse().getName();
            row[2] = p.getAge();
            row[3] = p.getId();
            row[4] = new String(highPressure + ", " + lowPressure);
            model.addRow(row);
        }
    }

    private void filterPatient() {
        for (Person p : sys.updatePatientDirectory().getPatients()) {
            if (p.getCommunity().getName().equalsIgnoreCase("Lower Manhattan")) {
                patients.add(p);
            }
        }
        System.out.println("PP" + patients);
    }

    private void populateAgePatient() {
        ArrayList<Person> agePatients = new ArrayList<>();

        for (Person p : patients) {
            if (p.getAge() <= Integer.parseInt(txtHigh.getText()) && p.getAge() >= Integer.parseInt(txtLow.getText())) {
                agePatients.add(p);
            }
        }
        DefaultTableModel model = (DefaultTableModel) tblInfo.getModel();

        model.setRowCount(
                0);
        for (Person p : agePatients) {
            int lastData = p.getEncounterHistory().getHistory().size() - 1;
            int highPressure = p.getEncounterHistory().getHistory().get(lastData).getBloodPressure().getHighPressure();
            int lowPressure = p.getEncounterHistory().getHistory().get(lastData).getBloodPressure().getLowPressure();
            System.out.println(lastData);
            System.out.println(highPressure);

            Object[] row = new Object[5];
            row[0] = p.getName();
            row[1] = p.getHouse().getName();
            row[2] = p.getAge();
            row[3] = p.getId();
            row[4] = new String(highPressure + ", " + lowPressure);
            model.addRow(row);
        }
    }
    private void populateAgePerson() {
        ArrayList<Person> agePatients = new ArrayList<>();

        for (Person p : Person) {
            if (p.getAge() <= Integer.parseInt(txtHigh.getText()) && p.getAge() >= Integer.parseInt(txtLow.getText())) {
                agePatients.add(p);
            }
        }
        DefaultTableModel model = (DefaultTableModel) tblInfo.getModel();

        model.setRowCount(
                0);
        for (Person p : agePatients) {
            int lastData = p.getEncounterHistory().getHistory().size() - 1;
            int highPressure = p.getEncounterHistory().getHistory().get(lastData).getBloodPressure().getHighPressure();
            int lowPressure = p.getEncounterHistory().getHistory().get(lastData).getBloodPressure().getLowPressure();
            System.out.println(lastData);
            System.out.println(highPressure);

            Object[] row = new Object[5];
            row[0] = p.getName();
            row[1] = p.getHouse().getName();
            row[2] = p.getAge();
            row[3] = p.getId();
            row[4] = new String(highPressure + ", " + lowPressure);
            model.addRow(row);
        }
    }
    
    

}
