package patternVisualizer;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class chooser2 extends javax.swing.JFrame {

    public chooser2() {
        initComponents();
    }

    String str1 = "     *\r\n" +
            "    * *\r\n" +
            "   *   *\r\n" +
            "  *     *\r\n" +
            " *       *\r\n" +
            "********";
    String str2 = "********\r\n" +
            " *       *\r\n" +
            "  *     *\r\n" +
            "   *   *\r\n" +
            "    * *\r\n" +
            "     *";
    String str3 = "     *\r\n" +
            "    * *\r\n" +
            "   *   *\r\n" +
            "  *     *\r\n" +
            " *       *\r\n" +
            "*         *\r\n" +
            " *       *\r\n" +
            "  *     *\r\n" +
            "   *   *\r\n" +
            "    * *\r\n" +
            "     *";
    String str4 = "* * * * * \r\n" +
            " *       * \r\n" +
            "  *     * \r\n" +
            "   *   * \r\n" +
            "    * * \r\n" +
            "     * \r\n" +
            "    * * \r\n" +
            "   *   * \r\n" +
            "  *     * \r\n" +
            " *       * \r\n" +
            "* * * * * ";

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new JTextArea();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new JTextArea();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int tempx = getWidth();
        int tempy = getHeight();
        int x = (screenSize.width - tempx) / 5;
        int y = (screenSize.height - tempy) / 10;

        setLocation(x, y);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 360));
        setMinimumSize(new java.awt.Dimension(900, 360));
        setPreferredSize(new java.awt.Dimension(900, 360));
        setSize(new java.awt.Dimension(900, 360));

        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 360));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 360));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 360));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choose any of the Following");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jButton1.setText("Click Me !!");

        jButton2.setText("Click Me !!");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jButton3.setText("Click Me !!");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jButton4.setText("Click Me !!");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText(str1);
        jLabel3.setText(str2);
        jLabel4.setText(str3);
        jLabel5.setText(str4);
        jButton1.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        new Frame2(1).setVisible(true);
                        setVisible(false);
                    }
                });
        jButton2.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        new Frame2(2).setVisible(true);
                        setVisible(false);
                    }
                });
        jButton3.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        new Frame2(3).setVisible(true);
                        setVisible(false);
                    }
                });
        jButton4.addActionListener(
                new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        new Frame2(4).setVisible(true);
                        setVisible(false);
                    }
                });
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
                jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                jPanel2Layout
                                        .createSequentialGroup()
                                        .addGroup(
                                                jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(
                                                                jPanel2Layout
                                                                        .createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(
                                                                                jLabel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(
                                                                jPanel2Layout
                                                                        .createSequentialGroup()
                                                                        .addGap(70, 70, 70)
                                                                        .addComponent(
                                                                                jButton1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                95,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(
                                                jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(
                                                                jLabel3,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                200,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(
                                                                jPanel2Layout
                                                                        .createSequentialGroup()
                                                                        .addGap(58, 58, 58)
                                                                        .addComponent(
                                                                                jButton2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                95,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(
                                                jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(
                                                                jLabel4,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                200,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(
                                                                jPanel2Layout
                                                                        .createSequentialGroup()
                                                                        .addGap(58, 58, 58)
                                                                        .addComponent(
                                                                                jButton3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                95,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(
                                                jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(
                                                                jLabel5,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                200,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(
                                                                jPanel2Layout
                                                                        .createSequentialGroup()
                                                                        .addGap(58, 58, 58)
                                                                        .addComponent(
                                                                                jButton4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                95,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(22, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                jPanel2Layout
                                        .createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(
                                                jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(
                                                                jPanel2Layout
                                                                        .createSequentialGroup()
                                                                        .addComponent(
                                                                                jLabel5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jButton4))
                                                        .addGroup(
                                                                jPanel2Layout
                                                                        .createSequentialGroup()
                                                                        .addComponent(
                                                                                jLabel4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jButton3))
                                                        .addGroup(
                                                                jPanel2Layout
                                                                        .createSequentialGroup()
                                                                        .addComponent(
                                                                                jLabel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jButton2))
                                                        .addGroup(
                                                                jPanel2Layout
                                                                        .createSequentialGroup()
                                                                        .addComponent(
                                                                                jLabel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jButton1)))
                                        .addContainerGap(
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
                jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                jPanel1Layout
                                        .createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(
                                                jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(
                                                                jLabel1,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)
                                                        .addComponent(
                                                                jPanel2,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE))
                                        .addContainerGap()));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                jPanel1Layout
                                        .createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(
                                                jLabel1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                39,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(
                                                jPanel2,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
                getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(
                                jPanel1,
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                layout
                                        .createSequentialGroup()
                                        .addComponent(
                                                jPanel1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                347,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)));

        pack();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger
                    .getLogger(chooser1.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger
                    .getLogger(chooser1.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger
                    .getLogger(chooser1.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger
                    .getLogger(chooser1.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(
                new Runnable() {
                    public void run() {
                        new chooser2().setVisible(true);
                    }
                });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private JTextArea jLabel2;
    private JTextArea jLabel3;
    private JTextArea jLabel4;
    private JTextArea jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration
}
