/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikazad3;

import Jama.Matrix;
import java.awt.Polygon;
import java.util.ArrayList;

/**
 *
 * @author stasz
 */
public class PolygonMatrix {

    ArrayList<MatrixPoint> matrixPoint = new ArrayList<MatrixPoint>();

    double xpoints[];
    double ypoints[];
    int npoints;

    public PolygonMatrix() {
    }

    public PolygonMatrix(double xpoints[], double ypoints[], int npoints) {
        this.xpoints = xpoints;
        this.ypoints = ypoints;
        this.npoints = npoints;
        matrixPoint.clear();
        
        for(int i = 0; i<npoints; i++){
            matrixPoint.add(new MatrixPoint(xpoints[i], ypoints[i]));
        }
    }

    public int size() {
        return npoints;
    }
    
    public void matrixPointToPolygon(){
        for(int i = 0; i < matrixPoint.size(); i++){
            xpoints[i] = matrixPoint.get(i).getX();
            ypoints[i] = matrixPoint.get(i).getY();
        }
    }

    public Polygon toPolygon() {
        int xpointsInt[] = new int[npoints];
        int ypointsInt[] = new int[npoints];
        for(int i = 0; i < npoints; i++){
            xpointsInt[i] = (int)xpoints[i];
            ypointsInt[i] = (int)ypoints[i];
        }
        Polygon polygon = new Polygon(xpointsInt, ypointsInt, npoints);
        return polygon;
    }
    
    public void changeMatrixPoint(Matrix m){
        m.print(3, 1);
        for(MatrixPoint mPoint:matrixPoint){
            System.out.println("--------------------");
            mPoint.toMatrixPoint(m.times(mPoint.toMatrix()));
            System.out.println("----");
        }
        matrixPointToPolygon();
    }
}
