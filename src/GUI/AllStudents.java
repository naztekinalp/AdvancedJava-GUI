
 
package GUI;

import CRUD.Student;
import CRUD.StudentCRUD;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AllStudents extends javax.swing.JInternalFrame {

    ArrayList<Student> list;
    StudentCRUD stdCRUD;
    int currentSelection = -1;

    public AllStudents() {
        initComponents();
        setTitle("All Students");
        setClosable(true);
        list = new ArrayList<Student>();
        stdCRUD = new StudentCRUD();
        list = stdCRUD.getAll();
        addDataToJTable(list);
        this.setClosable(true);
       
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelStdID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldStdName = new javax.swing.JTextField();
        jTextFieldSTDClass = new javax.swing.JTextField();
        jTextFieldSTDgpa = new javax.swing.JTextField();
        jTextFeildSTDDEpart = new javax.swing.JTextField();
        jTextFieldSTDYearEnrolled = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAllStudents = new javax.swing.JTable();
        jTextFieldSTDSearch = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("ID");

        jLabelStdID.setText("Student ID");

        jLabel2.setText("Student Name");

        jLabel3.setText("Class");

        jLabel4.setText("Department");

        jLabel5.setText("Year Enrolled");

        jLabel6.setText("CGPA");

        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTableAllStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Class", "CGPA", "Department", "Year Enroll"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAllStudents.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableAllStudents);
        if (jTableAllStudents.getColumnModel().getColumnCount() > 0) {
            jTableAllStudents.getColumnModel().getColumn(0).setResizable(false);
            jTableAllStudents.getColumnModel().getColumn(1).setResizable(false);
            jTableAllStudents.getColumnModel().getColumn(2).setResizable(false);
            jTableAllStudents.getColumnModel().getColumn(3).setResizable(false);
            jTableAllStudents.getColumnModel().getColumn(4).setResizable(false);
        }

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSTDSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelStdID)
                                    .addComponent(jTextFieldSTDYearEnrolled, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFeildSTDDEpart, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSTDClass, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldStdName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldSTDgpa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jButton1))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(267, 267, 267)
                    .addComponent(jButton2)
                    .addContainerGap(206, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelStdID)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldStdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldSTDClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldSTDgpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFeildSTDDEpart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldSTDYearEnrolled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSTDSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(jButton2)
                    .addContainerGap(325, Short.MAX_VALUE)))
        );

        pack();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        if (jTextFieldSTDSearch.getText().length() > 0) {
            list.clear();
            list = stdCRUD.getAll(jTextFieldSTDSearch.getText());
            addDataToJTable(list);
        }

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        Student s = new Student();
        s.setId(jLabelStdID.getText());
        s.setName(jTextFieldStdName.getText());
        s.setDepartment(jTextFeildSTDDEpart.getText());
        s.setCgpa(jTextFieldSTDgpa.getText());
        s.setClassName(jTextFieldSTDClass.getText());
        s.setYearEnrolled(jTextFieldSTDYearEnrolled.getText());
        stdCRUD.Update(s);

        refresh();


    }
    public void refresh() {
        list.clear();
        list = stdCRUD.getAll();
        addDataToJTable(list);

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        stdCRUD.Delete(jLabelStdID.getText());

        JOptionPane.showConfirmDialog(this, "Deleted");
        list.clear();
        list = stdCRUD.getAll();
        addDataToJTable(list);


    }


    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelStdID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAllStudents;
    private javax.swing.JTextField jTextFeildSTDDEpart;
    private javax.swing.JTextField jTextFieldSTDClass;
    private javax.swing.JTextField jTextFieldSTDSearch;
    private javax.swing.JTextField jTextFieldSTDYearEnrolled;
    private javax.swing.JTextField jTextFieldSTDgpa;
    private javax.swing.JTextField jTextFieldStdName;
   

    public void addDataToJTable(ArrayList<Student> list) {

        DefaultTableModel ddm = (DefaultTableModel) jTableAllStudents.getModel();
        ddm.getDataVector().removeAllElements();

        ddm.fireTableDataChanged();

        Object[] objects = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            objects[0] = list.get(i).getName();
            objects[1] = list.get(i).getClassName();
            objects[2] = list.get(i).getCgpa();
            objects[3] = list.get(i).getDepartment();
            objects[4] = list.get(i).getYearEnrolled();
            ddm.addRow(objects);

        }

        jTableAllStudents.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent e) {
                if (e.getClickCount() == 1) {
                    final JTable target = (JTable) e.getSource();
                    final int row = target.getSelectedRow();
                    currentSelection = row;
                    Student user = list.get(currentSelection);
                    jLabelStdID.setText(user.getId());
                    jTextFieldStdName.setText(user.getName());
                    jTextFeildSTDDEpart.setText(user.getDepartment());
                    jTextFieldSTDClass.setText(user.getClassName());
                    jTextFieldSTDgpa.setText(user.getCgpa());
                    jTextFieldSTDYearEnrolled.setText(user.getYearEnrolled());

                }
            }
        });
    }
}
