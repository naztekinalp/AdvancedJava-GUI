
package GUI;

import CRUD.Attandence;
import CRUD.AttandenceCRUD;
import java.util.ArrayList;

public class AllAttandanceIF extends javax.swing.JInternalFrame {


    AttandenceCRUD atnC;
    ArrayList<Attandence> list;

    public AllAttandanceIF() {
        initComponents();
        atnC = new AttandenceCRUD();
        list = new ArrayList();
        list = atnC.getAttandence();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jTextFieldStudentName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setTitle("Attandencec");

        jLabel1.setText("Student Name");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); 
        jLabel2.setText("%");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); 
        jLabel3.setText("0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)
                        .addComponent(jTextFieldStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel2)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addComponent(jLabel3)
                    .addContainerGap(233, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(83, 83, 83)
                .addComponent(jLabel2)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(140, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(94, 94, 94)))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        int total = 0;
        int present = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStudentName().equals(jTextFieldStudentName.getText())) {
                total++;
                if (!list.get(i).getPresenceStatus().equals("abs")) {
                    present++;
                }
            }
        }
        double d = (double) present / (double) total * 100;
        if (Double.isNaN(d)) {
            jLabel3.setText("00.00");
        } else {
            jLabel3.setText(d + "");

        }

    }

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextFieldStudentName;

}
