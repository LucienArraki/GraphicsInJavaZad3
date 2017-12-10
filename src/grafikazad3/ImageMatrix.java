/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikazad3;

import Jama.Matrix;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author stasz
 */
public class ImageMatrix {

    protected BufferedImage image;
    private BufferedImage imageResult;
    protected Matrix matrix;
    private int sizeX;
    private int sizeY;

    public ImageMatrix() {
    }

    public ImageMatrix(BufferedImage image) {
        this.image = image;
    }

    public void imageMatrixSave(BufferedImage image, Matrix m) {
        this.image = image;

        Matrix help1 = m.times(new MatrixPoint(0, 0).toMatrix());
        help1.print(3, 2);
        Matrix help2 = m.times(new MatrixPoint(image.getWidth(), 0).toMatrix());
        help2.print(3, 2);
        Matrix help3 = m.times(new MatrixPoint(0, image.getHeight()).toMatrix());
        help3.print(3, 2);
        Matrix help4 = m.times(new MatrixPoint(image.getWidth(), image.getHeight()).toMatrix());
        help4.print(3, 2);
        
        if(Math.max((int)Math.abs(help1.get(0,0)), (int)Math.abs(help2.get(0,0))) >
                Math.max((int)Math.abs(help3.get(0,0)), (int)Math.abs(help4.get(0,0))))
            sizeX = Math.max((int)Math.abs(help1.get(0,0)), (int)Math.abs(help2.get(0,0)));
        else
            sizeX = Math.max((int)Math.abs(help3.get(0,0)), (int)Math.abs(help4.get(0,0)));
        
        if(Math.max((int)Math.abs(help1.get(1,0)), (int)Math.abs(help2.get(1,0))) >
                Math.max((int)Math.abs(help3.get(1,0)), (int)Math.abs(help4.get(1,0))))
            sizeY = Math.max((int)Math.abs(help1.get(1,0)), (int)Math.abs(help2.get(1,0)));
        else
            sizeY = Math.max((int)Math.abs(help3.get(1,0)), (int)Math.abs(help4.get(1,0)));
        
        imageResult = new BufferedImage(sizeX, sizeY, BufferedImage.TYPE_INT_RGB);

        System.out.println(sizeX + " x " + sizeY);
        System.out.println("Matrix before inverse");
        m.print(3, 2);
        this.matrix = (Matrix) m.clone();
        this.matrix = matrix.inverse();
        System.out.println("Matrix after inverse");
        matrix.print(3, 2);
        printPixel();
        saveImage();
    }

    private void printPixel() {
        double x = 0;
        double y = 0;
        Matrix point;
        for (int i = 0; i < imageResult.getWidth(); i++) {
            for (int j = 0; j < imageResult.getHeight(); j++) {
                point = (Matrix) matrix.times(new MatrixPoint(i, j).toMatrix()).clone();
                x = point.get(0, 0);
                y = point.get(1, 0);
                if (x < 0 || y < 0) {
                    imageResult.setRGB(i, j, Color.WHITE.getRGB());
                } else {

                    try {
                        imageResult.setRGB(i, j, pixelToColor(x, y));
                    } catch (Exception e) {
                        /*if (x < image.getWidth() && y < image.getHeight()) {
                            pixelToColor(x - 1, y - 1);
                        }*/
                    }
                }
            }
        }
    }

    private int pixelToColor(double x, double y) {
        Color c1 = new Color(image.getRGB((int) x, (int) y));
        Color c2 = new Color(image.getRGB((int) x, (int) y + 1));
        Color c3 = new Color(image.getRGB((int) x + 1, (int) y));
        Color c4 = new Color(image.getRGB((int) x + 1, (int) y + 1));

        double factorY = y - (int) y;

        double kARed = (1 - factorY) * c1.getRed() + factorY * c2.getRed();
        double kAGreen = (1 - factorY) * c1.getGreen() + factorY * c2.getGreen();
        double kABlue = (1 - factorY) * c1.getBlue() + factorY * c2.getBlue();

        double kBRed = (1 - factorY) * c3.getRed() + factorY * c4.getRed();
        double kBGreen = (1 - factorY) * c3.getGreen() + factorY * c4.getGreen();
        double kBBlue = (1 - factorY) * c3.getBlue() + factorY * c4.getBlue();

        double factorX = x - (int) x;

        double kCRed = (1 - factorX) * kARed + factorX * kBRed;
        double kCGreen = (1 - factorX) * kAGreen + factorX * kBGreen;
        double kCBlue = (1 - factorX) * kABlue + factorX * kBBlue;
        int intRGB = int2RGB((int) kCRed, (int) kCGreen, (int) kCBlue);
        return intRGB;
    }

    private void saveImage() {
        String transformationImage = JOptionPane.showInputDialog("Nazwij obraz wynikowy");
        try {
            ImageIO.write(imageResult, "bmp", new File("./Wynik/" + transformationImage + ".bmp"));
            PrintWriter zapis = new PrintWriter("./Wynik/" + transformationImage + ".txt");

            zapis.println("Wymiary przed transformacją:");
            zapis.println(image.getWidth() + " x " + image.getHeight());
            zapis.println();
            zapis.println("Wymiary po transformacją:");
            zapis.println(imageResult.getWidth() + " x " + imageResult.getHeight());
            zapis.println();
            zapis.println("Macierz:");
            zapis.printf("%-5.2f %-5.2f %-5.2f \n", matrix.get(0, 0), matrix.get(0, 1), matrix.get(0, 2));
            zapis.printf("%-5.2f %-5.2f %-5.2f \n", matrix.get(1, 0), matrix.get(1, 1), matrix.get(1, 2));
            zapis.printf("%-5.2f %-5.2f %-5.2f \n", matrix.get(2, 0), matrix.get(2, 1), matrix.get(2, 2));
            zapis.close();

            System.out.println("Ring image created successfully");
            System.out.println("Image size:" + imageResult.getWidth() + "x" + imageResult.getHeight());
        } catch (IOException e) {
            System.out.println("The image cannot be stored");
        }
    }

    static int int2RGB(int red, int green, int blue) {
        // Make sure that color intensities are in 0..255 range: red = red & 0x000000FF;
        green = green & 0x000000FF;
        blue = blue & 0x000000FF;

        // Assemble packed RGB using bit shift operations
        return (red << 16) + (green << 8) + blue;
    }
}
