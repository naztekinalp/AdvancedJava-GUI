
package GUI;

import BussinessLogic.LoginAuthenticator;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        jComboBoxUsertype.removeAllItems();
        jComboBoxUsertype.insertItemAt("Student", 0);
        jComboBoxUsertype.insertItemAt("Admin", 1);
        jComboBoxUsertype.insertItemAt("Lecturer", 2);

    }

   
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldLoginUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldLoginPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jButtonLoginSubmit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxUsertype = new javax.swing.JComboBox<>();

        jLabel1.setText("User Name");

        jLabel2.setText("Password");

        jLabel3.setText("Type");

        jButtonLoginSubmit.setText("Login");
        jButtonLoginSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginSubmitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Forte", 1, 18)); 
        jLabel4.setText("WELCOME TO M&NSIS");

        jComboBoxUsertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonLoginSubmit)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(152, 152, 152))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldLoginUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldLoginPassword)
                            .addComponent(jComboBoxUsertype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldLoginUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordFieldLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxUsertype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLoginSubmit)
                .addGap(17, 17, 17))
        );

        pack();
    }

    private void jButtonLoginSubmitActionPerformed(java.awt.event.ActionEvent evt) {
       
        LoginAuthenticator la = new LoginAuthenticator();
        int type = jComboBoxUsertype.getSelectedIndex();
        switch (type) {
            case 0:
                if (la.authenticateUser(jTextFieldLoginUserName.getText().trim().toString(), jPasswordFieldLoginPassword.getText().trim().toString(), 0)) {
                    StudentMainForm l = new StudentMainForm();
                    l.show();
                    dispose();
                }
                break;

            case 1:
                if (la.authenticateUser(jTextFieldLoginUserName.getText().trim(), jPasswordFieldLoginPassword.getText().trim(), 1)) {
                    ManagerMainForm mf = new ManagerMainForm();
                    mf.show();
                    dispose();
                }
                break;
            case 2:
                if (la.authenticateUser(jTextFieldLoginUserName.getText().trim(), jPasswordFieldLoginPassword.getText().trim(), 2)) {
                    LecturerMainForm l = new LecturerMainForm();
                    l.show();
                    dispose();
                }
                break;
        }
    }


   
    private javax.swing.JButton jButtonLoginSubmit;
    private javax.swing.JComboBox<String> jComboBoxUsertype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordFieldLoginPassword;
    private javax.swing.JTextField jTextFieldLoginUserName;
    
}
