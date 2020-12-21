package ru.ssau.tk.oop.task0.ui;

public class PanelPictureFrame extends javax.swing.JFrame {

    public PanelPictureFrame() {
        initComponents();
    }

    private void initComponents() {
        picturePanel1 = new PicturePanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(700, 1000);
        picturePanel1.setLayout(new java.awt.BorderLayout());
        picturePanel1.setImageFile(new java.io.File("C:\\Users\\Пользователь\\Desktop\\10.jpg"));
        jPanel1.setLayout(new java.awt.GridLayout());
        jPanel1.setOpaque(false);
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("\u042d\u0442\u043e JLabel");
        jPanel1.add(jLabel1);
        jButton1.setText("\u0410 \u044d\u0442\u043e \u043a\u043d\u043e\u043f\u043a\u0430!");
        jPanel1.add(jButton1);
        picturePanel1.add(jPanel1, java.awt.BorderLayout.NORTH);
        getContentPane().add(picturePanel1, java.awt.BorderLayout.CENTER);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPictureFrame().setVisible(true);
            }
        });
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private PicturePanel picturePanel1;
}
