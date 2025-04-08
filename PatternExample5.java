import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

class PatternExample5 {
    public static void main(String[] args) {
        try {
            File file = new File("‪C:\\Users\\PC\\Desktop\\Suraj_java\\flower.png"); 
            BufferedImage image = ImageIO.read(file);
            
            for (int i = 0; i < image.getHeight(); i++) {
                for (int j = 0; j < image.getWidth(); j++) {
                    Color color = new Color(image.getRGB(j, i));
                    if (color.getRed() == 0 && color.getGreen() == 0 && color.getBlue() == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("@");
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("SOMETHING WENT wrong");
            
        }
    }
}
