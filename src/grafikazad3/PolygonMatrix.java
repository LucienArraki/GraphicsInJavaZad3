/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikazad3;

import java.awt.Polygon;
import java.util.ArrayList;

/**
 *
 * @author stasz
 */
public class PolygonMatrix {

    ArrayList<Polygon> polygon = new ArrayList<Polygon>();

    double xpoints[];
    double ypoints[];
    int npoints;

    public PolygonMatrix() {
    }

    public PolygonMatrix(double xpoints[], double ypoints[], int npoints) {
        this.xpoints = xpoints;
        this.ypoints = ypoints;
        this.npoints = npoints;
    }

    public int size() {
        return npoints;
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
}
