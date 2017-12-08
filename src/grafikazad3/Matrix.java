/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikazad3;

import java.awt.Point;

/**
 *
 * @author stasz
 */
public class Matrix {

    double x;
    double y;
    double z;

    public Matrix() {
    }

    public Matrix(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 1;
    }

    public Matrix(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Matrix(Matrix m) {
        this.x = m.x;
        this.y = m.y;
        this.z = m.z;
    }
    
    public Point matrixToPoint(){
        Point p = new Point((int)(x/z),(int)(y/z));
        return p;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public double getZ(){
        return z;
    }
}
