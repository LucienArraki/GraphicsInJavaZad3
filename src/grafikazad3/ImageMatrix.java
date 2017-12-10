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

        Matrix help = m.times(new MatrixPoint(image.getWidth(), image.getHeight()).toMatrix());
        sizeX = (int) help.get(0, 0);
        sizeY = (int) help.get(1, 0);
        imageResult = new BufferedImage(sizeX, sizeY, BufferedImage.TYPE_INT_RGB);

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
        for (int i = 0; i < imageResult.getWidth()-1; i++) {
            for (int j = 0; j < imageResult.getHeight()-1; j++) {
                point = (Matrix)matrix.times(new MatrixPoint(i, j).toMatrix()).clone();
                x = point.get(0, 0);
                y = point.get(1, 0);
                if(x < 1 || y < 1){
                    imageResult.setRGB(i, j, Color.BLACK.getRGB());
                }else{
                    try{
                        imageResult.setRGB(i, j, pixelToColor(x,y));
                    }catch(Exception e){
                        imageResult.setRGB(i, j, Color.BLACK.getRGB());
                    }
                }
            }
        }
    }

    private int pixelToColor(double x, double y) {
        Color c1 = new Color(image.getRGB((int)x, (int)y));
        Color c2 = new Color(image.getRGB((int)x, (int)y + 1));
        Color c3 = new Color(image.getRGB((int)x + 1, (int)y));
        Color c4 = new Color(image.getRGB((int)x + 1, (int)y + 1));

        double factorY = y - (int) y;

        double kARed = (1 - factorY) * c1.getRed() + factorY * c2.getRed();
        double kAGreen = (1 - factorY) * c1.getGreen() + factorY * c2.getGreen();
        double kABlue = (1 - factorY) * c1.getBlue() + factorY * c2.getBlue();

        double kBRed = (1 - factorY) * c3.getRed() + factorY * c4.getRed();
        double kBGreen = (1 - factorY) * c3.getGreen() + factorY * c4.getGreen();
        double kBBlue = (1 - factorY) * c3.getBlue() + factorY * c4.getBlue();

        double factorX = x - (int) x;

        double kCRed = (1 - factorX) * kARed + factorX * kARed;
        double kCGreen = (1 - factorX) * kARed + factorX * kARed;
        double kCBlue = (1 - factorX) * kARed + factorX * kARed;

        return int2RGB((int)kCRed, (int)kCGreen, (int)kCBlue);
    }

    private void saveImage() {
        String transformationImage = JOptionPane.showInputDialog("Nazwij obraz wynikowy");
        try {
            ImageIO.write(imageResult, "bmp", new File(transformationImage + ".bmp"));
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
