/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikazad3;

import java.util.Scanner;

/**
 *
 * @author stasz
 */
public class RasterImage {
    
        private void matrix(Scanner scanner) {
        String type = scanner.next();
        int i = 0;
        double x[][] = new double[3][3];
        while (scanner.hasNext()) {
            if (type.toString().equals("p")) {
                while (scanner.hasNextInt()) {
                    i++;
                    scanner.nextInt();
                    if (i == 6) {
                        x = scanner.nextInt();
                        y = scanner.nextInt();
                        i += 2;
                    }
                }
                if (scanner.hasNext()) {
                    type = scanner.next();
                }
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
                        i++;
                    }
                    scanner.nextInt();

                    if (i == 4) {
                        y = scanner.nextInt();
                        i++;
                    }
                }
                if (scanner.hasNext()) {
                    type = scanner.next();
                }
            }
            if (type.toString().equals("o")) {
                x = 1;
                i = 0;
                System.out.print("\n");
                while (scanner.hasNextInt()) {
                    i++;
                    if (i == 1) {
                        x = scanner.nextInt();
                        i++;
                    }
                    scanner.nextInt();
                }
                if (scanner.hasNext()) {
                    type = scanner.next();
                }
            }
        }
    }
}