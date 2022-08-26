import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SignUpForm extends javax.swing.JFrame {

    public SignUpForm() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        back.setVisible(false);
    }
    static boolean checker(String s){
        boolean caps=false;
        boolean small=false;
        boolean cha=false;
        boolean number=false;
        for(char i = 'a' ; i<= 'z' ;i++ ){
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==i){
                    small=true;
                    break;
                }
            }
            if(small==true){
                break;
            }
        }
        for(char i = 'A' ; i<= 'Z' ;i++ ){
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==i){
                    caps=true;
                    break;
                }
            }
            if(caps==true){
                break;
            }
        }
        for(char i = 33 ; i<= 47 ;i++ ){
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==i){
                    cha=true;
                    break;
                }
            }
            if(cha==true){
                break;
            }
        }
        if(!cha){
            for(char i = 58 ; i<= 64 ;i++ ){
                for(int j=0;j<s.length();j++){
                    if(s.charAt(j)==i){
                        cha=true;
                        break;
                    }
                }
                if(cha==true){
                    break;
                }
            }
        }
        if(!cha){
            for(char i = 92 ; i<= 96 ;i++ ){
                for(int j=0;j<s.length();j++){
                    if(s.charAt(j)==i){
                        cha=true;
                        break;
                    }
                }
                if(cha==true){
                    break;
                }
            }
        }
        if(!cha){
            for(char i = 123 ; i<= 126 ;i++ ){
                for(int j=0;j<s.length();j++){
                    if(s.charAt(j)==i){
                        cha=true;
                        break;
                    }
                }
                if(cha==true){
                    break;
                }
            }
        }
        
        for(char i = '0';i<='9';i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==i){
                    number=true;
                    break;
                }
            }
            if(number==true){
                break;
            }
        }
        if(caps && small && cha && number) return true;
        else return false;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tEnrollmentNumber = new javax.swing.JTextField();
        tName = new javax.swing.JTextField();
        tEmail = new javax.swing.JTextField();
        tPassword = new javax.swing.JPasswordField();
        tConfirmPassword = new javax.swing.JPasswordField();
        tSchool = new javax.swing.JTextField();
        tBranch = new javax.swing.JTextField();
        tSpecial = new javax.swing.JTextField();
        Register = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter the following details to register");

        jLabel2.setText("Enrollment Number");

        jLabel3.setText("Name");

        jLabel4.setText("Email");

        jLabel5.setText("Password");

        jLabel6.setText("Confirm Password");

        jLabel7.setText("School");

        jLabel8.setText("Branch");

        jLabel9.setText("Special");

        tEnrollmentNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEnrollmentNumberActionPerformed(evt);
            }
        });

        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        back.setText("Go To Login Page");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tEnrollmentNumber)
                                    .addComponent(tName)
                                    .addComponent(tEmail)
                                    .addComponent(tPassword)
                                    .addComponent(tConfirmPassword)
                                    .addComponent(tSchool)
                                    .addComponent(tBranch)
                                    .addComponent(tSpecial, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
                            .addComponent(Register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel1)
                                                                        .addGap(41, 41, 41)
                                                                        .addComponent(jLabel2))
                                                                    .addComponent(tEnrollmentNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel3))
                                                            .addComponent(tName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel4))
                                                    .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel5))
                                            .addComponent(tPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6))
                                    .addComponent(tConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addComponent(tSchool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addComponent(tBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(tSpecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(Register)
                .addGap(18, 18, 18)
                .addComponent(back)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private StudentInfo dataInsertor(){
        StudentInfo si=new StudentInfo();
        si.enrollmentNumber=tEnrollmentNumber.getText();
        si.name=tName.getText();
        si.email=tEmail.getText();
        si.password=tPassword.getText();
        si.school=tSchool.getText();
        si.branch=tBranch.getText();
        si.special=tSpecial.getText();
        si.lastLogIn="";
        si.lastLogOut="";
        si.lastLogOutTime="";
        si.attendence="";
//        System.out.println("data read");
        return si;
    }
    private void tEnrollmentNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEnrollmentNumberActionPerformed
        
    }//GEN-LAST:event_tEnrollmentNumberActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        if(!checker(tPassword.getText())){
            JOptionPane.showMessageDialog(null,"The password must contain a capital letter, a small letter, a number and a special character");
        }else if(!(tPassword.getText().equals(tConfirmPassword.getText()))){
            JOptionPane.showMessageDialog(null,"The passwords do not match");
        }else{
            StudentInfo si=new StudentInfo();
            si=dataInsertor();
            DataManager.inserter(si);
            back.setVisible(true);
        }
    }//GEN-LAST:event_RegisterActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        LogInForm obj=new LogInForm();
        obj.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Register;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tBranch;
    private javax.swing.JPasswordField tConfirmPassword;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tEnrollmentNumber;
    private javax.swing.JTextField tName;
    private javax.swing.JPasswordField tPassword;
    private javax.swing.JTextField tSchool;
    private javax.swing.JTextField tSpecial;
    // End of variables declaration//GEN-END:variables
}
