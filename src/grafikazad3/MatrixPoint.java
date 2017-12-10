/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikazad3;

import Jama.Matrix;
import java.awt.Point;
/**
 *
 * @author stasz
 */
public class MatrixPoint {

    double x;
    double y;
    double z;

    public MatrixPoint() {
    }

    public MatrixPoint(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 1;
    }

    public MatrixPoint(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public MatrixPoint(MatrixPoint m) {
        this.x = m.x;
        this.y = m.y;
        this.z = m.z;
    }
    
    public double getX(){
        return x/z;
    }
    
    public double getY(){
        return y/z;
    }
    
    public double getZ(){
        return z;
    }
    
    public Matrix toMatrix(){
        double m[][] = new double[3][1];
        m[0][0] = x;
        m[1][0] = y;
        m[2][0] = z;
        return new Matrix(m);
    }
    
    public void toMatrixPoint(Matrix m){
        this.x = m.get(0, 0);
        this.y = m.get(1, 0);
        this.z = m.get(2, 0);
    }
}
