/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikazad3;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author stasz
 */
public class Panel extends javax.swing.JFrame {

    /**
     * Creates new form Panel
     */
    public Panel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Open = new javax.swing.JButton();
        Paint = new javax.swing.JButton();
        Matrix = new javax.swing.JButton();
        Scale = new javax.swing.JButton();
        Turn = new javax.swing.JButton();
        TextXScale = new javax.swing.JTextField();
        ScaleX = new javax.swing.JTextField();
        TextYScale = new javax.swing.JTextField();
        ScaleY = new javax.swing.JTextField();
        TextXTurn = new javax.swing.JTextField();
        TurnDegrees = new javax.swing.JTextField();
        Slide = new javax.swing.JButton();
        TextXSlide = new javax.swing.JTextField();
        TextYSlide = new javax.swing.JTextField();
        SlideX = new javax.swing.JTextField();
        SlideY = new javax.swing.JTextField();
        imagePanel1 = new grafikazad3.ImagePanel();
        SaveImage = new javax.swing.JButton();
        SaveText = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BasePanel");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        Open.setText("Wczytaj");
        Open.setMaximumSize(new java.awt.Dimension(200, 23));
        Open.setMinimumSize(new java.awt.Dimension(0, 23));
        Open.setPreferredSize(new java.awt.Dimension(150, 23));
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });

        Paint.setText("Rysuj");
        Paint.setMaximumSize(new java.awt.Dimension(200, 23));
        Paint.setMinimumSize(new java.awt.Dimension(0, 23));
        Paint.setPreferredSize(new java.awt.Dimension(150, 23));
        Paint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaintActionPerformed(evt);
            }
        });

        Matrix.setText("Macierz transformacji");
        Matrix.setMaximumSize(new java.awt.Dimension(200, 23));
        Matrix.setMinimumSize(new java.awt.Dimension(0, 23));
        Matrix.setPreferredSize(new java.awt.Dimension(150, 23));
        Matrix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatrixActionPerformed(evt);
            }
        });

        Scale.setText("Skaluj");
        Scale.setMaximumSize(new java.awt.Dimension(200, 23));
        Scale.setMinimumSize(new java.awt.Dimension(0, 23));
        Scale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScaleActionPerformed(evt);
            }
        });

        Turn.setText("Obróć");
        Turn.setMaximumSize(new java.awt.Dimension(200, 23));
        Turn.setMinimumSize(new java.awt.Dimension(0, 23));
        Turn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TurnActionPerformed(evt);
            }
        });

        TextXScale.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextXScale.setText("Podaj x");
        TextXScale.setEnabled(false);

        TextYScale.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextYScale.setText("Podaj y");
        TextYScale.setEnabled(false);

        ScaleY.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        TextXTurn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextXTurn.setText("Stopnie");
        TextXTurn.setToolTipText("");
        TextXTurn.setEnabled(false);

        Slide.setText("Przesuń");
        Slide.setMaximumSize(new java.awt.Dimension(200, 23));
        Slide.setMinimumSize(new java.awt.Dimension(0, 23));
        Slide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlideActionPerformed(evt);
            }
        });

        TextXSlide.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextXSlide.setText("Punkt x");
        TextXSlide.setEnabled(false);

        TextYSlide.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextYSlide.setText("Punkt y");
        TextYSlide.setEnabled(false);

        imagePanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagePanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );

        SaveImage.setText("Zapisz");
        SaveImage.setToolTipText("");
        SaveImage.setMaximumSize(new java.awt.Dimension(200, 23));
        SaveImage.setMinimumSize(new java.awt.Dimension(0, 23));
        SaveImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveImageActionPerformed(evt);
            }
        });

        SaveText.setText("Zapisz plik text");
        SaveText.setMaximumSize(new java.awt.Dimension(200, 23));
        SaveText.setMinimumSize(new java.awt.Dimension(0, 23));
        SaveText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Open, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Matrix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Paint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SaveImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SaveText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Scale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Turn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextXSlide, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                    .addComponent(TextYSlide))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SlideY)
                                    .addComponent(SlideX, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TextXScale, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                            .addComponent(TextYScale))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ScaleX, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                            .addComponent(ScaleY)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TextXTurn, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TurnDegrees, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Open, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Paint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Matrix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Scale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextXScale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ScaleX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextYScale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ScaleY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addComponent(Turn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextXTurn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TurnDegrees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addComponent(Slide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextXSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SlideX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextYSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SlideY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        // TODO add your handling code here:
        String name = JOptionPane.showInputDialog("wpisz nazwe obrazka");

        img = null;
        try {
            img = ImageIO.read(new File(name));
            imagePanel1.setImage(img);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }//GEN-LAST:event_OpenActionPerformed

    private void MatrixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatrixActionPerformed
        // TODO add your handling code here:
        imagePanel1.turnPolygon.setLocation(0, 0);
        this.repaint();
        String transformationFile = JOptionPane.showInputDialog("wpisz nazwe obrazka");

        try {
            Scanner scanner = new Scanner(new File(transformationFile));
            matrix(scanner);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }//GEN-LAST:event_MatrixActionPerformed

    private void matrix(Scanner scanner) {
        String type = scanner.next();
        int i = 0;
        int x;
        int y;
        while (scanner.hasNext()) {
            if (type.toString().equals("p")) {
                x = 1;
                y = 1;
                i = 0;
                System.out.print("\n");
                while (scanner.hasNextInt()) {
                    i++;
                    scanner.nextInt();
                    if (i == 6) {
                        x = scanner.nextInt();
                        y = scanner.nextInt();
                        System.out.print(x);
                        System.out.print(y);
                        i += 2;
                    }
                }
                if (scanner.hasNext()) {
                    type = scanner.next();
                }
                imagePanel1.slidePolygon(x, y);
            }
            if (type.toString().equals("s")) {
                x = 1;
                y = 1;
                i = 0;
                System.out.print("\n");
                while (scanner.hasNextInt()) {
                    i++;
                    if (i == 1) {
                        x = scanner.nextInt();
                        System.out.print(x);
                        i++;
                    }
                    scanner.nextInt();

                    if (i == 4) {
                        y = scanner.nextInt();
                        System.out.print(y);
                        i++;
                    }
                }
                if (scanner.hasNext()) {
                    type = scanner.next();
                }
                imagePanel1.scalePolygon(x, y);
            }
            if (type.toString().equals("o")) {
                x = 1;
                i = 0;
                System.out.print("\n");
                while (scanner.hasNextInt()) {
                    i++;
                    if (i == 1) {
                        x = scanner.nextInt();
                        System.out.print(x);
                        i++;
                    }
                    scanner.nextInt();
                }
                if (scanner.hasNext()) {
                    type = scanner.next();
                }
                imagePanel1.turnPolygon(x);
            }
        }
    }

    private void PaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaintActionPerformed
        // TODO add your handling code here:
        img = null;
        try {
            img = ImageIO.read(new File("back.jpg"));
            imagePanel1.setImage(img);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }//GEN-LAST:event_PaintActionPerformed

    private void ScaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScaleActionPerformed
        // TODO add your handling code here:
        imagePanel1.scalePolygon(Integer.parseInt(ScaleX.getText()), Integer.parseInt(ScaleY.getText()));
    }//GEN-LAST:event_ScaleActionPerformed

    private void TurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurnActionPerformed
        // TODO add your handling code here:
        imagePanel1.turnPolygon(Integer.parseInt(TurnDegrees.getText()));
    }//GEN-LAST:event_TurnActionPerformed

    private void SaveImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveImageActionPerformed
        // TODO add your handling code here:
        imagePanel1.takePicture();
    }//GEN-LAST:event_SaveImageActionPerformed

    private void SlideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlideActionPerformed
        // TODO add your handling code here:
        imagePanel1.slidePolygon(Integer.parseInt(SlideX.getText()), Integer.parseInt(SlideY.getText()));
    }//GEN-LAST:event_SlideActionPerformed

    private void SaveTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveTextActionPerformed
        // TODO add your handling code here:
        System.out.print(imagePanel1.saveText(1));
    }//GEN-LAST:event_SaveTextActionPerformed

    private void imagePanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_imagePanel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    //My Variables
    protected BufferedImage img;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Matrix;
    private javax.swing.JButton Open;
    private javax.swing.JButton Paint;
    private javax.swing.JButton SaveImage;
    private javax.swing.JButton SaveText;
    private javax.swing.JButton Scale;
    private javax.swing.JTextField ScaleX;
    private javax.swing.JTextField ScaleY;
    private javax.swing.JButton Slide;
    private javax.swing.JTextField SlideX;
    private javax.swing.JTextField SlideY;
    private javax.swing.JTextField TextXScale;
    private javax.swing.JTextField TextXSlide;
    private javax.swing.JTextField TextXTurn;
    private javax.swing.JTextField TextYScale;
    private javax.swing.JTextField TextYSlide;
    private javax.swing.JButton Turn;
    private javax.swing.JTextField TurnDegrees;
    protected grafikazad3.ImagePanel imagePanel1;
    // End of variables declaration//GEN-END:variables
}
