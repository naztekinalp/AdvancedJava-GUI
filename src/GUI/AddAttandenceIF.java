
package GUI;

import CRUD.Attandence;
import CRUD.AttandenceCRUD;
import CRUD.Student;
import CRUD.StudentCRUD;
import java.util.ArrayList;

public class AddAttandenceIF extends javax.swing.JInternalFrame {

  
    StudentCRUD stdCr;
    ArrayList<Student> list;
    int count = 0;
    AttandenceCRUD atnc;

    public AddAttandenceIF() {
        initComponents();
        list = new ArrayList();
        stdCr = new StudentCRUD();
        list = stdCr.getAll();
        atnc = new AttandenceCRUD();
        getdataAndSet(0);
    }

    public void getdataAndSet(int chk) {
        if (count < list.size() && count >= 0) {
            setData(list.get(count));
            if (chk == 0) {
                count++;
            }
            if (chk == 1) {
                count--;
            }
        }
    }

    public void setData(Student obj) {
        jLabelAtnStdName.setText(obj.getUserName());
        jLabelAtnDepartment.setText(obj.getDepartment());
        jLabelAtnClass.setText(obj.getClassName());
    }

    
    @SuppressWarnings("unchecked")
  
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelAtnStdName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelAtnDepartment = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelAtnClass = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel1.setText("Student Name");

        jLabelAtnStdName.setText("jLabel1");

        jLabel3.setText("Department");

        jLabelAtnDepartment.setText("jLabel1");

        jLabel5.setText("Class");

        jLabelAtnClass.setText("jLabel1");

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Present");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Absent");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Previous");

        jButton4.setText("Next");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelAtnClass))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabelAtnStdName)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(21, 21, 21)
                        .addComponent(jLabelAtnDepartment))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelAtnStdName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelAtnDepartment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelAtnClass))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        Attandence a = new Attandence();
        Student s;
       
        if (count < list.size() && count >= 0) {

            s = list.get(count);
            a.setPresenceStatus("abs");
            a.setStudentName(s.getUserName());
            a.setCourseID("");
            a.setCourseName("");
            a.setStudentID(s.getId());
            atnc.Insert(a);
        }


    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        getdataAndSet(0);
        Attandence a = new Attandence();
        Student s;
        
        if (count < list.size() && count >= 0) {

            s = list.get(count);
            a.setPresenceStatus("P");
            a.setStudentName(s.getUserName());
            a.setCourseID("");
            a.setCourseName("");
            a.setStudentID(s.getId());
            atnc.Insert(a);
        }
        
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        getdataAndSet(1);
        Attandence a = new Attandence();
        Student s;
        if (count < list.size() && count >= 0) {
            s = list.get(count);
            a.setPresenceStatus("P");
            a.setStudentName(s.getUserName());
            a.setCourseID("");
            a.setCourseName("");
            a.setStudentID(s.getId());
            atnc.Insert(a);
        }

    }


    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAtnClass;
    private javax.swing.JLabel jLabelAtnDepartment;
    private javax.swing.JLabel jLabelAtnStdName;

}
