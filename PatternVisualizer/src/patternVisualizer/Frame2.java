package patternVisualizer;

import java.awt.Dimension;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class Frame2 extends javax.swing.JFrame implements Runnable {

	String str1=new String();
	String str2=new String();
	Thread thread;
	int delay=1000;
	int index=1;
	String label="";
	
    public Frame2(int index) {
    	this.index=index;
        initComponents();
        thread =new Thread((Runnable)this);
        thread.start();
    }
                       
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        Exit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Prev = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int tempx = getWidth();
        int tempy = getHeight();
        int x = (screenSize.width - tempx) /5;
        int y = (screenSize.height - tempy) / 10;

        setLocation(x, y);
        
        setUndecorated(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setSize(new java.awt.Dimension(900, 600));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
///////////////////////////////////////////////////////////////////////////////////////////////
        Title.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Pattern "+index);
        Title.setForeground(new java.awt.Color(255, 255, 255));
///////////////////////////////////////////////////////////////////////////////////////////////////////
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
//        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);   
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 32));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
//        jTextArea2.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea2);
        jTextArea2.setFont(new java.awt.Font("Dialog", 0, 20));

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/prev.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

        		delay+=100;
            }
        });
        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/next.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

        		if(delay==0)delay=0;
        		else if(delay<=50)delay-=10;
        		else delay-=50;
            }
        });
        Prev.setText("prev");
        Prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevActionPerformed(evt);
            }
        });

        Next.setText("next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Prev, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Prev, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        setter();
        pack();
    }                    


	private void setter() {
    	jTextArea1.setText(str2);
    	jTextArea2.setText(str1);
	}

	private void ExitActionPerformed(java.awt.event.ActionEvent evt) {                                     
        System.exit(0);
    }                                    

    private void PrevActionPerformed(java.awt.event.ActionEvent evt) {     
    	index--;
    	if(index<=0)index=1;
    	Title.setText("Pattern "+index);
    }                                    

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {          
    	index++;
    	if(index>=8)index=1;
    	Title.setText("Pattern "+index);  
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
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame2(1).setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Exit;
    private javax.swing.JButton Next;
    private javax.swing.JButton Prev;
    private javax.swing.JLabel Title;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration                   

	public int i=0,j=0;
    @SuppressWarnings("static-access")
	@Override
	public void run() {
        while (true) {
            label = Title.getText();
            if (label.equals("Pattern 1")) {
                str1 = "for (i = 1; i <= 6; i++) {\r\n" +
                        "    for (j = i; j < 6; j++) {\r\n" +
                        "      System.out.print(\" \");\r\n" +
                        "    }\r\n" +
                        "    for (k = 1; k <= (2 * i - 1); k++) {\r\n" +
                        "        if (k == 1 || i == 6 || k == (2 * i - 1)) {\r\n" +
                        "            System.out.print(\"*\");\r\n" +
                        "        }\r\n" +
                        "        else {\r\n" +
                        "        System.out.print(\" \");\r\n" +
                        "    }\r\n" +
                        "}";
                str2 = "";
                setter();
                int i, j, k = 0;
                try {
                    for (i = 1; i <= 6; i++) {
                        if (!Title.getText().equals("Pattern 1"))
                            break;
                        for (j = i; j < 6; j++) {
                            if (!Title.getText().equals("Pattern 1"))
                                break;

                            code(i, j, k);
                            str2 += "  ";
                        }
                        for (k = 1; k <= (2 * i - 1); k++) {
                            if (!Title.getText().equals("Pattern 1"))
                                break;
                            if (k == 1 || i == 6 || k == (2 * i - 1)) {
                                code(i, j, k);
                                str2 += "* ";
                                setter();
                                thread.sleep(delay);
                            } else {
                                code(i, j, k);
                                str2 += "  ";
                                setter();
                                thread.sleep(delay);
                            }
                        }

                        str2 += "\n";
                        setter();
                        thread.sleep(delay);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                setter();
            } else if (label.equals("Pattern 2")) {
                str1 = "for (i = 6; i >= 1; i--) {\r\n" +
                        "    for (j = i; j < 6; j++) {\r\n" +
                        "      System.out.print(\" \");\r\n" +
                        "    }\r\n" +
                        "    for (k = 1; k <= (2 * i - 1); k++) {\r\n" +
                        "        if (k == 1 || k == (2 * i - 1)) {\r\n" +
                        "            System.out.print(\"*\");\r\n" +
                        "        }\r\n" +
                        "        else {\r\n" +
                        "        System.out.print(\" \");\r\n" +
                        "    }\r\n" +
                        "}";
                str2 = "";
                setter();
                int i, j, k;
                try {
                    for (i = 6; i >= 1; i--) {
                        if (!Title.getText().equals("Pattern 2"))
                            break;
                        for (j = i; j < 6; j++) {
                            if (!Title.getText().equals("Pattern 2"))
                                break;

                            str2 += "  ";
                        }
                        for (k = 1; k <= (2 * i - 1); k++) {
                            if (!Title.getText().equals("Pattern 2"))
                                break;
                            if (k == 1 || i == 6 || k == (2 * i - 1)) {
                                code(i, j, k);
                                str2 += "* ";
                                setter();
                                thread.sleep(delay);
                            } else {
                                code(i, j, k);
                                str2 += "  ";
                                setter();
                                thread.sleep(delay);
                            }
                        }

                        str2 += "\n";
                        setter();
                        thread.sleep(delay);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                setter();
            } else if (label.equals("Pattern 3")) {
                str1 = "for (i = 1; i <= 6; i++) {\r\n" +
                        "    for (j = i; j < 6; j++) {\r\n" +
                        "      System.out.print(\" \");\r\n" +
                        "    }\r\n" +
                        "    for (k = 1; k <= (2 * i - 1); k++) {\r\n" +
                        "        if (k == 1 || k == (2 * i - 1)) {\r\n" +
                        "            System.out.print(\"*\");\r\n" +
                        "        }\r\n" +
                        "        else {\r\n" +
                        "        System.out.print(\" \");\r\n" +
                        "    }\r\n" +
                        "}" +
                        "for (i = 6; i >= 1; i--) {\r\n" +
                        "    for (j = i; j < 6; j++) {\r\n" +
                        "      System.out.print(\" \");\r\n" +
                        "    }\r\n" +
                        "    for (k = 1; k <= (2 * i - 1); k++) {\r\n" +
                        "        if (k == 1 || i == 6 || k == (2 * i - 1)) {\r\n" +
                        "            System.out.print(\"*\");\r\n" +
                        "        }\r\n" +
                        "        else {\r\n" +
                        "        System.out.print(\" \");\r\n" +
                        "    }\r\n" +
                        "}";
                str2 = "";
                setter();
                int i, j, k = 1;
                try {
                    for (i = 1; i <= 6; i++) {
                        if (!Title.getText().equals("Pattern 3"))
                            break;
                        for (j = i; j < 6; j++) {
                            if (!Title.getText().equals("Pattern 3"))
                                break;

                            code(i, j, k);
                            str2 += "  ";
                        }
                        for (k = 1; k <= (2 * i - 1); k++) {
                            if (!Title.getText().equals("Pattern 3"))
                                break;
                            if (k == 1 || k == (2 * i - 1)) {
                                code(i, j, k);
                                str2 += "* ";
                                setter();
                                thread.sleep(delay);
                            } else {
                                code(i, j, k);
                                str2 += "  ";
                                setter();
                                thread.sleep(delay);
                            }
                        }

                        str2 += "\n";
                        setter();
                        thread.sleep(delay);
                    }
                    for (i = 6; i >= 1; i--) {
                        if (!Title.getText().equals("Pattern 3"))
                            break;
                        for (j = i; j < 6; j++) {
                            if (!Title.getText().equals("Pattern 3"))
                                break;

                            code(i, j, k);
                            str2 += "  ";
                        }
                        for (k = 1; k <= (2 * i - 1); k++) {
                            if (!Title.getText().equals("Pattern 3"))
                                break;
                            if (k == 1 || k == (2 * i - 1)) {
                                code(i, j, k);
                                str2 += "* ";
                                setter();
                                thread.sleep(delay);
                            } else {
                                code(i, j, k);
                                str2 += "  ";
                                setter();
                                thread.sleep(delay);
                            }
                        }

                        str2 += "\n";
                        setter();
                        thread.sleep(delay);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                setter();
            } else if (label.equals("Pattern 4")) {
                str1 = "for (i = 1; i <= n; i++) {\r\n" +
                        "   for (j = 1; j < i; j++) {\r\n" +
                        "       System.out.print(\" \");\r\n" +
                        "   }\r\n" +
                        "   for (j = i; j <= n; j++) {\r\n" +
                        "       if(j==i||j==n||i==1)\r\n" +
                        "           System.out.print(\"* \");\r\n" +
                        "       else\r\n" +
                        "           System.out.print(\"  \");\r\n" +
                        "       }\r\n" +
                        "            \r\n" +
                        "   System.out.println();\r\n" +
                        "}\r\n" +
                        "            \r\n" +
                        "for (i = n - 1; i >= 1; i--) {\r\n" +
                        "    for (j = 1; j < i; j++) {\r\n" +
                        "        System.out.print(\" \");\r\n" +
                        "    }\r\n" +
                        "    for (j = i; j <= n; j++) {\r\n" +
                        "        if(j==i||j==n||i==1)\r\n" +
                        "           System.out.print(\"* \");\r\n" +
                        "        else\r\n" +
                        "           System.out.print(\"  \");\r\n" +
                        "        }\r\n" +
                        "     System.out.println();\r\n" +
                        "}";
                str2 = "";
                setter();
                int i, j, k = 0, n = 6;
                try {
                    for (i = 1; i <= n; i++) {
                        if (!Title.getText().equals("Pattern 4"))
                            break;
                        for (j = 1; j < i; j++) {
                            if (!Title.getText().equals("Pattern 4"))
                                break;
                            code(i, j, k);
                            str2 += " ";
                            setter();
                            thread.sleep(delay);
                        }
                        for (j = i; j <= n; j++) {
                            if (!Title.getText().equals("Pattern 4"))
                                break;
                            code(i, j, k);
                            if (j == i || j == n || i == 1) {
                                str2 += "* ";
                                setter();
                                thread.sleep(delay);
                            } else {
                                str2 += "  ";
                                setter();
                                thread.sleep(delay);
                            }
                            code(i, j, k);
                        }

                        str2 += "\n";
                        setter();
                        thread.sleep(delay);
                    }

                    for (i = n - 1; i >= 1; i--) {
                        if (!Title.getText().equals("Pattern 4"))
                            break;
                        for (j = 1; j < i; j++) {
                            if (!Title.getText().equals("Pattern 4"))
                                break;
                            code(i, j, k);
                            str2 += " ";
                            setter();
                            thread.sleep(delay);
                        }
                        for (j = i; j <= n; j++) {
                            if (!Title.getText().equals("Pattern 4"))
                                break;
                            if (j == i || j == n || i == 1) {
                                str2 += "* ";
                                setter();
                                thread.sleep(delay);
                            } else {
                                str2 += "  ";
                                setter();
                                thread.sleep(delay);
                            }
                            code(i, j, k);
                        }

                        str2 += "\n";
                        setter();
                        thread.sleep(delay);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                setter();
            } else if (label.equals("Pattern 5")) {
                str1 = "for (int i = 1; i <= n; i++) {\r\n" +
                        " for (int j = 0; j <= n - i; j++) {\r\n" +
                        "     System.out.print(\" \");\r\n" +
                        " }\r\n" +
                        "                \r\n" +
                        " int x = 1;\r\n" +
                        " for (int k = 1; k <= i; k++) {\r\n" +
                        "     System.out.print(x + \" \");\r\n" +
                        "     x = x * (i - k) / k;\r\n" +
                        " }\r\n" +
                        " System.out.println();\r\n" +
                        "}";
                str2 = "";
                setter();
                int n = 5;
                try {
                    for (int i = 1; i <= n; i++) {
                        if (!Title.getText().equals("Pattern 5"))
                            break;
                        for (int j = 0; j <= n - i; j++) {
                            if (!Title.getText().equals("Pattern 5"))
                                break;
                            str2 += "  ";
                            setter();
                        }

                        int x = 1;
                        for (int k = 1; k <= i; k++) {
                            if (!Title.getText().equals("Pattern 5"))
                                break;
                            str2 += x + "  ";
                            setter();
                            thread.sleep(delay);
                            x = x * (i - k) / k;
                        }
                        str2 += "\n";
                        setter();
                        thread.sleep(delay);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                setter();
            }
        }
    }

    private void code(int i, int j, int k) {
        if (label.equals("Pattern 1"))
            str1 = "for (i = " +
                    i +
                    "; i <= 6; i++) {\r\n" +
                    "    for (j = " +
                    j +
                    "; j < 6; j++) {\r\n" +
                    "      System.out.print(\" \");\r\n" +
                    "    }\r\n" +
                    "    for (k = " +
                    k +
                    "; k <= (2 * i - 1); k++) {\r\n" +
                    "        if (k == 1 || i == 6 || k == (2 * i - 1)) {\r\n" +
                    "            System.out.print(\"*\");\r\n" +
                    "        }\r\n" +
                    "        else {\r\n" +
                    "        System.out.print(\" \");\r\n" +
                    "    }\r\n" +
                    "}";
        else if (label.equals("Pattern 2"))
            str1 = "for (i = 6; i >= " +
                    i +
                    "; i--) {\r\n" +
                    "    for (j = " +
                    j +
                    "; j < 6; j++) {\r\n" +
                    "      System.out.print(\" \");\r\n" +
                    "    }\r\n" +
                    "    for (k = " +
                    k +
                    "; k <= (2 * i - 1); k++) {\r\n" +
                    "        if (k == 1 || k == (2 * i - 1)) {\r\n" +
                    "            System.out.print(\"*\");\r\n" +
                    "        }\r\n" +
                    "        else {\r\n" +
                    "        System.out.print(\" \");\r\n" +
                    "    }\r\n" +
                    "}";
        else if (label.equals("Pattern 3"))
            str1 = "for (i = " +
                    i +
                    "; i <= 6; i++) {\r\n" +
                    "    for (j = " +
                    i +
                    "; j < 6; j++) {\r\n" +
                    "      System.out.print(\" \");\r\n" +
                    "    }\r\n" +
                    "    for (k = " +
                    k +
                    "; k <= (2 * i - 1); k++) {\r\n" +
                    "        if (k == 1 || k == (2 * i - 1)) {\r\n" +
                    "            System.out.print(\"*\");\r\n" +
                    "        }\r\n" +
                    "        else {\r\n" +
                    "        System.out.print(\" \");\r\n" +
                    "    }\r\n" +
                    "}" +
                    "for (i = " +
                    i +
                    "; i >= 1; i--) {\r\n" +
                    "    for (j = " +
                    i +
                    "; j < 6; j++) {\r\n" +
                    "      System.out.print(\" \");\r\n" +
                    "    }\r\n" +
                    "    for (k = " +
                    k +
                    "; k <= (2 * i - 1); k++) {\r\n" +
                    "        if (k == 1 || i == 6 || k == (2 * i - 1)) {\r\n" +
                    "            System.out.print(\"*\");\r\n" +
                    "        }\r\n" +
                    "        else {\r\n" +
                    "        System.out.print(\" \");\r\n" +
                    "    }\r\n" +
                    "}";
        else if (label.equals("Pattern 4"))
            str1 = "for (i = " +
                    i +
                    "; i <= 6; i++) {\r\n" +
                    "   for (j = 1; j < " +
                    i +
                    "; j++) {\r\n" +
                    "       System.out.print(\" \");\r\n" +
                    "   }\r\n" +
                    "   for (j = " +
                    i +
                    "; j <= 6; j++) {\r\n" +
                    "       if(j==i||j==6||i==1)\r\n" +
                    "           System.out.print(\"* \");\r\n" +
                    "       else\r\n" +
                    "           System.out.print(\"  \");\r\n" +
                    "       }\r\n" +
                    "            \r\n" +
                    "   System.out.println();\r\n" +
                    "}\r\n" +
                    "            \r\n" +
                    "for (i = 5; i >= " +
                    i +
                    "; i--) {\r\n" +
                    "    for (j = 1; j < " +
                    i +
                    "; j++) {\r\n" +
                    "        System.out.print(\" \");\r\n" +
                    "    }\r\n" +
                    "    for (j = " +
                    i +
                    "; j <= 6; j++) {\r\n" +
                    "        if(j==i||j==6||i==1)\r\n" +
                    "           System.out.print(\"* \");\r\n" +
                    "        else\r\n" +
                    "           System.out.print(\"  \");\r\n" +
                    "        }\r\n" +
                    "     System.out.println();\r\n" +
                    "}";
    }
}

