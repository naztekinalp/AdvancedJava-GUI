
package GUI;

import CRUD.Lecture;
import CRUD.LectureCRUD;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AllLecIF extends javax.swing.JInternalFrame {

   
    LectureCRUD lcrud;
    ArrayList<Lecture> list;
    int currentSelection = -1;

    public AllLecIF() {
        initComponents();
        lcrud = new LectureCRUD();
        list = new ArrayList();
    }

   
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jTextFieldLectureName = new javax.swing.JTextField();
        jTextFieldLectureCourseName = new javax.swing.JTextField();
        jTextFieldLectureDepartment = new javax.swing.JTextField();
        jTextFieldLectureDescription = new javax.swing.JTextField();
        jTextFieldLectureClassName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldLectureTime = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldLectureID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel7.setText("Class Name");

        jButton1.setText("DELETE");

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Lecturer Name");

        jLabel4.setText("Department");

        jLabel5.setText("Description");

        jLabel6.setText("Course Name");

        jLabel2.setText("ID");

        jLabel8.setText("Time");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Course", "Department", "Class Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldLectureTime, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLectureClassName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(286, 286, 286))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldLectureDepartment)
                                .addComponent(jTextFieldLectureCourseName)
                                .addComponent(jTextFieldLectureName)
                                .addComponent(jTextFieldLectureID, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldLectureDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLectureID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldLectureName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldLectureCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldLectureDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldLectureDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldLectureClassName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldLectureTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        Lecture lec = new Lecture();
        lec.setClassName(jTextFieldLectureClassName.getText());
        lec.setCourseName(jTextFieldLectureCourseName.getText());
        lec.setDepartment(jTextFieldLectureDepartment.getText());
        lec.setCourseDescription(jTextFieldLectureDescription.getText());
        lec.setId(jTextFieldLectureID.getText());
        lec.setLectureName(jTextFieldLectureName.getText());
        lec.setTime(jTextFieldLectureTime.getText());
        if (lec.getId().length() > 0
                && lec.getClassName().length() > 0
                && lec.getCourseDescription().length() > 0
                && lec.getDepartment().length() > 0
                && lec.getLectureName().length() > 0
                && lec.getCourseName().length() > 0
                && lec.getTime().length() > 0) {
            lcrud.Update(lec);
            JOptionPane.showMessageDialog(this, "Updated");

        } else {
            JOptionPane.showMessageDialog(this, "All Inputs are Required");
        }
        clearAllValues();
    }
    public void clearAllValues() {
        jTextFieldLectureID.setText("");
        jTextFieldLectureClassName.setText("");
        jTextFieldLectureCourseName.setText("");
        jTextFieldLectureDescription.setText("");
        jTextFieldLectureDepartment.setText("");
        jTextFieldLectureTime.setText("");
        jTextFieldLectureName.setText("");
    }

    public void setValues(Lecture r) {
        jTextFieldLectureID.setText(r.getId());
        jTextFieldLectureClassName.setText(r.getClassName());
        jTextFieldLectureCourseName.setText(r.getCourseName());
        jTextFieldLectureDescription.setText(r.getCourseDescription());
        jTextFieldLectureDepartment.setText(r.getDepartment());
        jTextFieldLectureTime.setText(r.getTime());
        jTextFieldLectureName.setText(r.getLectureName());
    }

    public void addDataToJTable(ArrayList<Lecture> list) {

        DefaultTableModel ddm = (DefaultTableModel) jTable1.getModel();
        ddm.getDataVector().removeAllElements();

        ddm.fireTableDataChanged();

        Object[] objects = new Object[4];
        for (int i = 0; i < list.size(); i++) {
            objects[0] = list.get(i).getLectureName();
            objects[1] = list.get(i).getCourseName();
            objects[2] = list.get(i).getDepartment();
            objects[3] = list.get(i).getClassName();

            ddm.addRow(objects);

        }

        jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent e) {
                if (e.getClickCount() == 1) {
                    final JTable target = (JTable) e.getSource();
                    final int row = target.getSelectedRow();
                    currentSelection = row;
                    Lecture user = list.get(currentSelection);
                    setValues(user);

                }
            }
        });
    }

    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldLectureClassName;
    private javax.swing.JTextField jTextFieldLectureCourseName;
    private javax.swing.JTextField jTextFieldLectureDepartment;
    private javax.swing.JTextField jTextFieldLectureDescription;
    private javax.swing.JTextField jTextFieldLectureID;
    private javax.swing.JTextField jTextFieldLectureName;
    private javax.swing.JTextField jTextFieldLectureTime;
    
}
