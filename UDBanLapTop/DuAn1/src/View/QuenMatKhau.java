/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author anhtu
 */
public class QuenMatKhau extends javax.swing.JPanel {
    private boolean isHidden = true;
    /**
     * Creates new form QuenMatKhau
     */
    public QuenMatKhau() {
        initComponents();
    }
    
    public void qmk(){
        txt_email.grabFocus();
    }
    
    public void addEventBackLogin(ActionListener event){
        btn_backLogin.addActionListener(event);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_thoat = new javax.swing.JButton();
        btn_doimk = new javax.swing.JButton();
        JPanel3 = new javax.swing.JPanel();
        lbl_show2 = new javax.swing.JLabel();
        txt_mk2 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JPanel2 = new javax.swing.JPanel();
        lbl_show1 = new javax.swing.JLabel();
        txt_mk1 = new javax.swing.JPasswordField();
        JPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_mabaomat = new javax.swing.JTextField();
        JPanel1 = new javax.swing.JPanel();
        txt_email = new javax.swing.JTextField();
        btn_backLogin = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        btn_thoat.setBackground(new java.awt.Color(255, 102, 102));
        btn_thoat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_thoat.setText("THOÁT");
        btn_thoat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });

        btn_doimk.setBackground(new java.awt.Color(102, 255, 204));
        btn_doimk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_doimk.setText("ĐỔI MẬT KHẨU");
        btn_doimk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        btn_doimk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_doimkActionPerformed(evt);
            }
        });

        JPanel3.setBackground(new java.awt.Color(255, 255, 255));
        JPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));

        lbl_show2.setBackground(new java.awt.Color(255, 255, 204));
        lbl_show2.setForeground(new java.awt.Color(255, 255, 153));
        lbl_show2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/show.png"))); // NOI18N
        lbl_show2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_show2MouseClicked(evt);
            }
        });

        txt_mk2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_mk2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout JPanel3Layout = new javax.swing.GroupLayout(JPanel3);
        JPanel3.setLayout(JPanel3Layout);
        JPanel3Layout.setHorizontalGroup(
            JPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel3Layout.createSequentialGroup()
                .addComponent(txt_mk2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_show2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPanel3Layout.setVerticalGroup(
            JPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_show2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
            .addComponent(txt_mk2)
        );

        jLabel7.setText("Xác nhận mật khẩu");

        jLabel3.setText("Mật khẩu");

        jLabel8.setText("Mã bảo mật");

        jLabel2.setText("Email");

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("QUÊN MẬT KHẨU");

        JPanel2.setBackground(new java.awt.Color(255, 255, 255));
        JPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));

        lbl_show1.setBackground(new java.awt.Color(255, 255, 204));
        lbl_show1.setForeground(new java.awt.Color(255, 255, 153));
        lbl_show1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/show.png"))); // NOI18N
        lbl_show1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_show1MouseClicked(evt);
            }
        });

        txt_mk1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_mk1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout JPanel2Layout = new javax.swing.GroupLayout(JPanel2);
        JPanel2.setLayout(JPanel2Layout);
        JPanel2Layout.setHorizontalGroup(
            JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel2Layout.createSequentialGroup()
                .addComponent(txt_mk1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_show1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPanel2Layout.setVerticalGroup(
            JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_show1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
            .addComponent(txt_mk1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        JPanel4.setBackground(new java.awt.Color(255, 255, 255));
        JPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));

        jLabel10.setBackground(new java.awt.Color(255, 255, 204));
        jLabel10.setForeground(new java.awt.Color(255, 255, 153));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/email.png"))); // NOI18N

        txt_mabaomat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_mabaomat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout JPanel4Layout = new javax.swing.GroupLayout(JPanel4);
        JPanel4.setLayout(JPanel4Layout);
        JPanel4Layout.setHorizontalGroup(
            JPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel4Layout.createSequentialGroup()
                .addComponent(txt_mabaomat, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPanel4Layout.setVerticalGroup(
            JPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
            .addComponent(txt_mabaomat, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        JPanel1.setBackground(new java.awt.Color(255, 255, 255));
        JPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));

        txt_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_email.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanel1Layout = new javax.swing.GroupLayout(JPanel1);
        JPanel1.setLayout(JPanel1Layout);
        JPanel1Layout.setHorizontalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_email)
        );
        JPanel1Layout.setVerticalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        btn_backLogin.setForeground(new java.awt.Color(0, 153, 153));
        btn_backLogin.setText("Đăng nhập ?");
        btn_backLogin.setBorder(null);
        btn_backLogin.setContentAreaFilled(false);
        btn_backLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_backLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btn_doimk, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(JPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addComponent(JPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_backLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(3, 3, 3)
                .addComponent(JPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_backLogin)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_doimk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?","PHẦN MỀM QUẢN LÝ BÁN HÀNG",JOptionPane.YES_NO_OPTION);
        if(i == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_btn_thoatActionPerformed

    private void btn_doimkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_doimkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_doimkActionPerformed

    private void lbl_show1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_show1MouseClicked
        // TODO add your handling code here:
        if (isHidden) {
            txt_mk1.setEchoChar((char) 0);
            lbl_show1.setIcon(new ImageIcon(".\\src\\Images\\blind.png"));
            isHidden = false;
        } else {
            txt_mk1.setEchoChar('•');
            lbl_show1.setIcon(new ImageIcon(".\\src\\Images\\show.png"));
            isHidden = true;
        }
    }//GEN-LAST:event_lbl_show1MouseClicked

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void lbl_show2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_show2MouseClicked
        // TODO add your handling code here:
        if (isHidden) {
            txt_mk2.setEchoChar((char) 0);
            lbl_show2.setIcon(new ImageIcon(".\\src\\Images\\blind.png"));
            isHidden = false;
        } else {
            txt_mk2.setEchoChar('•');
            lbl_show2.setIcon(new ImageIcon(".\\src\\Images\\show.png"));
            isHidden = true;
        }
    }//GEN-LAST:event_lbl_show2MouseClicked

    private void btn_backLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_backLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel1;
    private javax.swing.JPanel JPanel2;
    private javax.swing.JPanel JPanel3;
    private javax.swing.JPanel JPanel4;
    private javax.swing.JButton btn_backLogin;
    private javax.swing.JButton btn_doimk;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl_show1;
    private javax.swing.JLabel lbl_show2;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_mabaomat;
    private javax.swing.JPasswordField txt_mk1;
    private javax.swing.JPasswordField txt_mk2;
    // End of variables declaration//GEN-END:variables
}