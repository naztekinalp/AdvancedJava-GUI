
package GUI;

import CRUD.Lecturer;
import CRUD.LecturerCRUD;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LecturerForStudent extends javax.swing.JInternalFrame {

    LecturerCRUD lecCRUD;
    ArrayList<Lecturer> list;
    int currentSelection = -1;

    public LecturerForStudent() {
        initComponents();
        lecCRUD = new LecturerCRUD();
        list = new ArrayList();
        list = lecCRUD.getAllLecturer();
        addDataToJTable(list);

    }

   
    @SuppressWarnings("unchecked")

    public void addDataToJTable(ArrayList<Lecturer> list) {

        DefaultTableModel ddm = (DefaultTableModel) jTable2.getModel();
        ddm.getDataVector().removeAllElements();

        ddm.fireTableDataChanged();

        Object[] objects = new Object[4];
        for (int i = 0; i < list.size(); i++) {
            objects[0] = list.get(i).getId();
            objects[1] = list.get(i).getUserName();
            objects[2] = list.get(i).getDepartment();
            objects[3] = list.get(i).getQualification();

            ddm.addRow(objects);

        }

        jTable2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent e) {
                if (e.getClickCount() == 1) {
                    final JTable target = (JTable) e.getSource();
                    final int row = target.getSelectedRow();
                    currentSelection = row;
                    Lecturer user = list.get(currentSelection);
                    jTextFieldAddLecturerID.setText(user.getId());
                    jTextFieldAddLecturerUserName.setText(user.getUserName());
                    jTextFieldAddLecturerDepartment.setText(user.getDepartment());
                    jTextFieldAddLecturerQualification.setText(user.getQualification());

                }
            }
        });
    }

    
    private void initComponents() {

        jTextFieldAddLecturerQualification = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextFieldAddLecturerID = new javax.swing.JTextField();
        jTextFieldAddLecturerQualification1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAddLecturerUserName = new javax.swing.JTextField();
        jTextFieldAddLecturerDepartment = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setTitle("Lecturers");

        jTextFieldAddLecturerQualification.setEditable(false);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "User Name", "Department", "Qualifcation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTextFieldAddLecturerID.setEditable(false);
        jTextFieldAddLecturerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAddLecturerIDActionPerformed(evt);
            }
        });

        jLabel7.setText("Qualification");

        jLabel8.setText("Search");

        jLabel3.setText("ID");

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Department");

        jTextFieldAddLecturerUserName.setEditable(false);

        jTextFieldAddLecturerDepartment.setEditable(false);

        jLabel6.setText("User Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel4)))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldAddLecturerQualification)
                                    .addComponent(jTextFieldAddLecturerDepartment)
                                    .addComponent(jTextFieldAddLecturerUserName)
                                    .addComponent(jTextFieldAddLecturerID, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(41, 41, 41)
                        .addComponent(jTextFieldAddLecturerQualification1)
                        .addGap(44, 44, 44)
                        .addComponent(jButton3)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAddLecturerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAddLecturerUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAddLecturerDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAddLecturerQualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAddLecturerQualification1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jButton3))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        list.clear();
       
    }
    public void clearAllValues() {
        jTextFieldAddLecturerID.setText("");
        jTextFieldAddLecturerUserName.setText("");
        jTextFieldAddLecturerDepartment.setText("");
        jTextFieldAddLecturerQualification.setText("");

    }
    private void jTextFieldAddLecturerIDActionPerformed(java.awt.event.ActionEvent evt) {
    }


   
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldAddLecturerDepartment;
    private javax.swing.JTextField jTextFieldAddLecturerID;
    private javax.swing.JTextField jTextFieldAddLecturerQualification;
    private javax.swing.JTextField jTextFieldAddLecturerQualification1;
    private javax.swing.JTextField jTextFieldAddLecturerUserName;
    
}
