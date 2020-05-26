
package GUI;

import CRUD.Grade;
import CRUD.GradesCRUD;
import javax.swing.JOptionPane;

public class AddGradeInternalFrame extends javax.swing.JInternalFrame {

    GradesCRUD gc;

    public AddGradeInternalFrame() {
        initComponents();
        gc = new GradesCRUD();
        setClosable(true);
        setTitle("Grades");
        setClosable(true);
    }

    @SuppressWarnings("unchecked")
  
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldGradeFullNAme = new javax.swing.JTextField();
        jTextFieldGradeClass = new javax.swing.JTextField();
        jTextFieldGradeDepart = new javax.swing.JTextField();
        jTextFieldGradeStudentID = new javax.swing.JTextField();
        jTextFieldGradeMidTerm = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldGradeFinal = new javax.swing.JTextField();
        jTextFieldGradeTotalGrade = new javax.swing.JTextField();
        jTextFieldGradeAbssenteseem = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel2.setText("Full Name");

        jLabel3.setText("Class");

        jLabel4.setText("StudentID");

        jLabel5.setText("Mid Term");

        jLabel6.setText("Department");

        jTextFieldGradeStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGradeStudentIDActionPerformed(evt);
            }
        });

        jLabel7.setText("Total Grade");

        jLabel8.setText("Absenteseem");

        jLabel9.setText("Final");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldGradeAbssenteseem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldGradeTotalGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldGradeFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(167, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldGradeFullNAme)
                                    .addComponent(jTextFieldGradeClass)
                                    .addComponent(jTextFieldGradeDepart)
                                    .addComponent(jTextFieldGradeStudentID)
                                    .addComponent(jTextFieldGradeMidTerm))))
                        .addGap(73, 73, 73))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldGradeFullNAme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldGradeClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldGradeDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldGradeStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldGradeMidTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldGradeFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldGradeTotalGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldGradeAbssenteseem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }

    private void jTextFieldGradeStudentIDActionPerformed(java.awt.event.ActionEvent evt) {
       
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Grade g = new Grade();
        g.setFullName(jTextFieldGradeFullNAme.getText());
        g.setClassName(jTextFieldGradeClass.getText());
        g.setDepartment(jTextFieldGradeDepart.getText());
        g.setStudentId(jTextFieldGradeStudentID.getText());
        g.setMidterm(jTextFieldGradeMidTerm.getText());
        g.setFinal(jTextFieldGradeFinal.getText());
        g.setTotalGrade(jTextFieldGradeTotalGrade.getText());
        g.setAbsenteme(jTextFieldGradeAbssenteseem.getText());
        gc.Insert(g);

        JOptionPane.showMessageDialog(this, "Data Saved");
        jTextFieldGradeStudentID.setText("");
        jTextFieldGradeFinal.setText("");
        jTextFieldGradeFullNAme.setText("");
        jTextFieldGradeMidTerm.setText("");
        jTextFieldGradeTotalGrade.setText("");
        jTextFieldGradeClass.setText("");
        jTextFieldGradeDepart.setText("");
        jTextFieldGradeAbssenteseem.setText("");

    }


    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldGradeAbssenteseem;
    private javax.swing.JTextField jTextFieldGradeClass;
    private javax.swing.JTextField jTextFieldGradeDepart;
    private javax.swing.JTextField jTextFieldGradeFinal;
    private javax.swing.JTextField jTextFieldGradeFullNAme;
    private javax.swing.JTextField jTextFieldGradeMidTerm;
    private javax.swing.JTextField jTextFieldGradeStudentID;
    private javax.swing.JTextField jTextFieldGradeTotalGrade;
 
}
