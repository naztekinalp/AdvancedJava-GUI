
package GUI;

import CRUD.Lecture;
import CRUD.LectureCRUD;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LectureIF extends javax.swing.JInternalFrame {

   
    LectureCRUD lecCRUD;
    int currrentSelection = -1;
    ArrayList<Lecture> list;

    public LectureIF() {
        initComponents();
        lecCRUD = new LectureCRUD();
        list = new ArrayList<>();
        list = lecCRUD.getAllLecture();
        addDataToJTable(list);
    }

   
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        jTextFieldLectureShowCourseName = new javax.swing.JTextField();
        jTextFieldLectureShowDepartment = new javax.swing.JTextField();
        jTextFieldLectureShowClassName = new javax.swing.JTextField();
        jTextFieldLectureShowDescription = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldLectureShowTime = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextFieldLectureShowName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Search = new javax.swing.JLabel();
        jTextFieldLectureShowSearch = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        jLabel7.setText("Class Name");

        jLabel3.setText("Lecturer Name");

        jLabel4.setText("Department");

        jLabel8.setText("Time");

        jLabel5.setText("Description");

        jButton1.setText("DELETE");

        jLabel6.setText("Course Name");

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Leturer Name", "Class Name", "Department", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        Search.setText("Lecturer Name");

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Search)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldLectureShowSearch))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(70, 70, 70))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel4)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldLectureShowDescription)
                                    .addComponent(jTextFieldLectureShowClassName)
                                    .addComponent(jTextFieldLectureShowDepartment)
                                    .addComponent(jTextFieldLectureShowCourseName)
                                    .addComponent(jTextFieldLectureShowName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldLectureShowTime, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLectureShowName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLectureShowCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLectureShowDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLectureShowClassName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldLectureShowDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLectureShowTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLectureShowSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (currrentSelection != -1) {
            Lecture lec = new Lecture();
            lec = list.get(currrentSelection);
            lec.setClassName(jTextFieldLectureShowClassName.getText());
            lec.setDepartment(jTextFieldLectureShowDepartment.getText());
            lec.setCourseDescription(jTextFieldLectureShowDescription.getText());
            lec.setLectureName(jTextFieldLectureShowName.getText());
            lec.setCourseName(jTextFieldLectureShowCourseName.getText());
            lec.setTime(jTextFieldLectureShowTime.getText());
            if (lec.getId().length() > 0
                    && lec.getClassName().length() > 0
                    && lec.getCourseDescription().length() > 0
                    && lec.getDepartment().length() > 0
                    && lec.getLectureName().length() > 0
                    && lec.getCourseName().length() > 0
                    && lec.getTime().length() > 0) {
                lecCRUD.Update(lec);
                JOptionPane.showMessageDialog(this, "Saved");
                jTextFieldLectureShowName.setText("");
                jTextFieldLectureShowClassName.setText("");
                jTextFieldLectureShowDepartment.setText("");
                jTextFieldLectureShowDescription.setText("");
                jTextFieldLectureShowClassName.setText("");
                jTextFieldLectureShowTime.setText("");
                jTextFieldLectureShowCourseName.setText("");
                list.clear();
                list = lecCRUD.getAllLecture();
                addDataToJTable(list);

            } else {
                JOptionPane.showMessageDialog(this, "All Inputs are Required");
            }
        }

    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }
    public void addDataToJTable(ArrayList<Lecture> list) {

        DefaultTableModel ddm = (DefaultTableModel) jTable1.getModel();
        ddm.getDataVector().removeAllElements();

        ddm.fireTableDataChanged();

        Object[] objects = new Object[4];
        for (int i = 0; i < list.size(); i++) {
            objects[0] = list.get(i).getLectureName();
            objects[1] = list.get(i).getClassName();
            objects[2] = list.get(i).getDepartment();
            objects[3] = list.get(i).getTime();
            ddm.addRow(objects);

        }

        jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent e) {
                if (e.getClickCount() == 1) {
                    final JTable target = (JTable) e.getSource();
                    final int row = target.getSelectedRow();
                    Lecture lec = list.get(row);
                    currrentSelection = row;
                    
                    jTextFieldLectureShowName.setText(lec.getLectureName());
                    jTextFieldLectureShowDepartment.setText(lec.getDepartment());
                    jTextFieldLectureShowClassName.setText(lec.getClassName());
                    jTextFieldLectureShowDescription.setText(lec.getCourseDescription());
                    jTextFieldLectureShowTime.setText(lec.getTime());
                    jTextFieldLectureShowCourseName.setText(lec.getCourseName());

                }
            }
        });
    }

    
    private javax.swing.JLabel Search;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldLectureShowClassName;
    private javax.swing.JTextField jTextFieldLectureShowCourseName;
    private javax.swing.JTextField jTextFieldLectureShowDepartment;
    private javax.swing.JTextField jTextFieldLectureShowDescription;
    private javax.swing.JTextField jTextFieldLectureShowName;
    private javax.swing.JTextField jTextFieldLectureShowSearch;
    private javax.swing.JTextField jTextFieldLectureShowTime;
   
}
