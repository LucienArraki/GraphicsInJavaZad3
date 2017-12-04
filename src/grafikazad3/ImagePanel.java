/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikazad3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author stasz
 */
public class ImagePanel extends javax.swing.JPanel {
    protected BufferedImage image;
    ArrayList<Polygon> polygon = new ArrayList<Polygon>();
    ArrayList<Point> point = new ArrayList<Point>();
    private Point startPolygon = new Point(0,0);
    public Point turnPolygon = new Point(0,0);
    /**
     * Creates new form ImagePanel
     */
    public ImagePanel() {
        initComponents();
    }
    
    @Override
    public void paintComponent(Graphics g) {    //Wstawienie obrazu i figur
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image, 0, 0, this);
        for(Polygon p: polygon){
            g2d.drawPolygon(p);
        }
        g2d.drawOval((int)startPolygon.getX(), (int)startPolygon.getY(), 2, 2);
        g2d.drawOval((int)turnPolygon.getX(), (int)turnPolygon.getY(), 3, 3);
    }
    
    public void setImage(BufferedImage img){
        this.image=img;
        this.repaint();
    }
    
    public void turnPolygon(int x){
        if(polygon.size()>0){
            slidePolygon(-(int)turnPolygon.getX(),-(int)turnPolygon.getY());
            ArrayList<Polygon> initP = new ArrayList<Polygon>();
            for(Polygon p:polygon){
                int xpoints[] = new int[p.xpoints.length];
                int ypoints[] = new int[p.ypoints.length];
                for(int i = 0; i < p.xpoints.length; i++){
                    xpoints[i] =(int)( (double)p.xpoints[i]*Math.cos(x*Math.PI/180) -
                            (double)p.ypoints[i]*Math.sin(x*Math.PI/180));
                    ypoints[i] =(int)( (double)p.xpoints[i]*Math.sin(x*Math.PI/180) +
                            (double)p.ypoints[i]*Math.cos(x*Math.PI/180));
                }
                Polygon poly = new Polygon(xpoints, ypoints,p.xpoints.length);
                initP.add(poly);
            }
        polygon = initP;
        slidePolygon((int)turnPolygon.getX(),(int)turnPolygon.getY());
        }
        this.repaint();
    }
    
    public void scalePolygon(int x,int y){
        if(polygon.size()>0){
            slidePolygon(-(int)turnPolygon.getX(),-(int)turnPolygon.getY());
            ArrayList<Polygon> initP = new ArrayList<Polygon>();
            for(Polygon p:polygon){
                int xpoints[] = new int[p.xpoints.length];
                int ypoints[] = new int[p.ypoints.length];
                for(int i = 0; i < p.xpoints.length; i++){
                    if(x >= 0)
                        xpoints[i] = p.xpoints[i]*x;
                    else
                        xpoints[i] = p.xpoints[i]/Math.abs(x);
                    if(y >= 0)
                        ypoints[i] = p.ypoints[i]*y;
                    else
                        ypoints[i] = p.ypoints[i]/Math.abs(y);
                }
                Polygon poly = new Polygon(xpoints, ypoints,p.xpoints.length);
                initP.add(poly);
            }
        polygon = initP;
        slidePolygon((int)turnPolygon.getX(),(int)turnPolygon.getY());
        }
        this.repaint();
    }
        
    public void slidePolygon(int x,int y){
        if(polygon.size()>0){
            ArrayList<Polygon> initP = new ArrayList<Polygon>();
            for(Polygon p:polygon){
                int xpoints[] = new int[p.xpoints.length];
                int ypoints[] = new int[p.ypoints.length];
                for(int i = 0; i < p.xpoints.length; i++){
                    xpoints[i] = p.xpoints[i]+x;
                    ypoints[i] = p.ypoints[i]+y;
                }
                Polygon poly = new Polygon(xpoints, ypoints,p.xpoints.length);
                initP.add(poly);
            }
        polygon = initP;
        }
        this.repaint();
    }
    
    public String saveText(int w){
        String out = "";
        int k = 0;
        for(Polygon p:polygon){
            out+="P"+k;
            for(int i = 0; i < p.xpoints.length; i++){
                out+=" [";
                out += p.xpoints[i] + ",";
                out += p.ypoints[i] + ",";
                out += w+"]";
            }
            out+="\n";
            k++;
        }
        return out;
    }
        
    protected void takePicture() {
    BufferedImage img = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB);
    this.print(img.getGraphics()); // or: panel.printAll(...);
    try {
        ImageIO.write(img, "jpg", new File("panel.jpg"));
    }
    catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(102, 255, 51));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        if(point.size()>1){
            if((int)Math.sqrt(Math.pow(evt.getX()-point.get(point.size()-1).getX(),2) +
                    Math.pow(evt.getY()-point.get(point.size()-1).getY(),2))< 10){
                int xpoints[] = new int[point.size()];
                int ypoints[] = new int[point.size()];
                for(int i = 0; i < point.size(); i++){
                    xpoints[i] = (int)point.get(i).getX();
                    ypoints[i] = (int)point.get(i).getY();
                }
                Polygon poly = new Polygon(xpoints, ypoints,point.size());
                polygon.add(poly);
                point.clear();
                startPolygon = new Point(0,0);
                this.repaint();
            }
            else{
                point.add(new Point(evt.getX(), evt.getY()));
            }
        }
        else{
            point.add(new Point(evt.getX(), evt.getY()));
            if(point.size()<2)
                startPolygon = new Point(evt.getX(), evt.getY());
            this.repaint();
        }
    }//GEN-LAST:event_formMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        turnPolygon.setLocation(evt.getX(), evt.getY());
        this.repaint();
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
