import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class graphics extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        g.setColor(Color.black);
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int space = (screen.height - (30 * 16)) / 20;
        int width = (screen.width - 20) / 12;

        //Left side Round 64 Bracket Lines

        int y1 = 10, y2 = 10;
        for (int i = 0, x1 = 10, x2 = x1 + width; i < 16; i++) {
            g.drawLine(x1, y1, x2, y2);
            y1 += 30;
            g.drawLine(x2, y1, x2, y2);
            y2 += 30;
            g.drawLine(x1, y1, x2, y2);
            y1 += space;
            y2 += space;
        }

        //Right side Round 64 Bracket Lines

        y1 = 10; y2 = 10;
        for (int i = 0, x1 = screen.width - 10, x2 = x1 - width; i < 16; i++) {
            g.drawLine(x1, y1, x2, y2);
            y1 += 30;
            g.drawLine(x2, y1, x2, y2);
            y2 += 30;
            g.drawLine(x1, y1, x2, y2);
            y1 += space;
            y2 += space;
        }

        //Left side Round 64 Team Names

        for(int i = 0, x64L = 10, y64L = 10; i < 32; i += 2) {
            g.drawString(Main.tm.get(i), x64L, y64L);
            y64L += 30;
            g.drawString(Main.tm.get(i + 1), x64L, y64L);
            y64L += space;
        }

        //Right side Round 64 Team Names

        for(int i=32, x64R = screen.width - width - 10, y64R = 10; i<64; i+=2){
            g.drawString(Main.tm.get(i), x64R,y64R);
            y64R+=30;
            g.drawString(Main.tm.get(i + 1), x64R, y64R);
            y64R += space;
        }

        //Left side Round 32 Bracket Lines

        y1 = 25; y2 = 25;
        for (int i = 0, x1 = 10 + width, x2 = x1 + width; i < 8; i++) {
            g.drawLine(x1, y1, x2, y2);
            y1 += 30 + space;
            g.drawLine(x2, y1, x2, y2);
            y2 += 30 + space;
            g.drawLine(x1, y1, x2, y2);
            y1 += 30 + space;
            y2 += 30 + space;
        }

        //Right side Round 32 Bracket Lines

        y1 = 25; y2 = 25;
        for (int i = 0, x1 = screen.width - width - 10, x2 = x1 - width; i < 8; i++) {
            g.drawLine(x1, y1, x2, y2);
            y1 += 30 + space;
            g.drawLine(x2, y1, x2, y2);
            y2 += 30 + space;
            g.drawLine(x1, y1, x2, y2);
            y1 += 30 + space;
            y2 += 30 + space;
        }

        //Left side Round 32 Team Names

        for(int i = 0, x32L = 10 + width, y32L = 25; i < 16; i += 2){
            g.drawString(Main.RO32TM.get(i), x32L, y32L);
            y32L += 30 + space;
            g.drawString(Main.RO32TM.get(i + 1), x32L, y32L);
            y32L += 30 + space;


        }

        //Right side Round 32 Team Names

        for(int i = 16, x32R = screen.width - (width * 2) - 10, y32R = 25; i < 31; i += 2){
            g.drawString(Main.RO32TM.get(i), x32R, y32R);
            y32R += 30 + space;
            g.drawString(Main.RO32TM.get(i + 1), x32R, y32R);
            y32R += 30 + space;


        }

        //Left side Round 16 Bracket Lines

        y1 = 50; y2 = 50;
        for (int i = 0, x1 =10+2*width, x2 =x1 +width ; i < 4; i++) {
            g.drawLine(x1, y1, x2, y2);
            y1 += 60 + 2 * space;
            g.drawLine(x2, y1, x2, y2);
            y2 += 60 + 2 * space;
            g.drawLine(x1, y1, x2, y2);
            y1 += 60 + 2 * space;
            y2 += 60 + 2 * space;
        }

        //Right side Round 16 Bracket Lines

        y1 = 50; y2 = 50;
        for (int i = 0, x1 =screen.width - (width * 2) - 10, x2 =x1 - width; i < 4; i++) {
            g.drawLine(x1, y1, x2, y2);
            y1 += 60 + 2 * space;
            g.drawLine(x2, y1, x2, y2);
            y2 += 60 + 2 * space;
            g.drawLine(x1, y1, x2, y2);
            y1 += 60 + 2 * space;
            y2 += 60 + 2 * space;
        }

        //Left side 16 Team Names

        for(int i = 0, x16L = 10 + width * 2, y16L = 50; i < 8; i += 2){
            g.drawString(Main.RO16TM.get(i), x16L, y16L);
            y16L += 60 + 2 * space;
            g.drawString(Main.RO16TM.get(i + 1), x16L, y16L);
            y16L += 60 + 2 * space;
        }

        //Right side 16 Team Names

        for(int i = 8, x16L = screen.width - (width * 3) - 10, y16L = 50; i < 16; i += 2){
            g.drawString(Main.RO16TM.get(i), x16L, y16L);
            y16L += 60 + 2 * space;
            g.drawString(Main.RO16TM.get(i + 1), x16L, y16L);
            y16L += 60 + 2 * space;
        }

        //Left side Round 8 Bracket Lines

        y1 = 95; y2 = 95;
        for (int i = 0, x1 =10+3*width, x2 = x1 + width ; i < 2; i++) {
            g.drawLine(x1, y1, x2, y2);
            y1 += 120 + 4 * space;
            g.drawLine(x2, y1, x2, y2);
            y2 += 120 + 4 * space;
            g.drawLine(x1, y1, x2, y2);
            y1 += 120 + 4 * space;
            y2 += 120 + 4 * space;
        }

        //Right side Round 8 Bracket Lines

        y1 = 95; y2 = 95;
        for (int i = 0, x1 =screen.width - (width * 3) - 10, x2 = x1 - width ; i < 2; i++) {
            g.drawLine(x1, y1, x2, y2);
            y1 += 120 + 4 * space;
            g.drawLine(x2, y1, x2, y2);
            y2 += 120 + 4 * space;
            g.drawLine(x1, y1, x2, y2);
            y1 += 120 + 4 * space;
            y2 += 120 + 4 * space;
        }

        //Left side Round 8 Team Names

        for(int i = 0, x8L = 10 + width * 3, y8L = 95; i < 4; i += 2){
            g.drawString(Main.RO8TM.get(i), x8L, y8L);
            y8L += 120 + 4 * space;
            g.drawString(Main.RO8TM.get(i + 1), x8L, y8L);
            y8L += 120 + 4 * space;
        }

        //Right side Round 8 Team Names


        for(int i = 4, x8L = screen.width - (width * 4) - 10, y8L = 95; i < 8; i += 2){
            g.drawString(Main.RO8TM.get(i), x8L, y8L);
            y8L += 120 + 4 * space;
            g.drawString(Main.RO8TM.get(i + 1), x8L, y8L);
            y8L += 120 + 4 * space;
        }

        //Left side Round 4 Bracket Lines

        y1 = 180; y2 = 180;
        for (int i = 0, x1 =10+4*width, x2 = x1 + width ; i < 2; i++) {
            g.drawLine(x1, y1, x2, y2);
            y1 += 240 + 8 * space;
            g.drawLine(x2, y1, x2, y2);
            y2 += 240 + 8 * space;
            g.drawLine(x1, y1, x2, y2);
            y1 += 240 + 8 * space;
            y2 += 240 + 8 * space;
        }

        //Right side Round 4 Bracket Lines

        y1 = 180; y2 = 180;
        for (int i = 0, x1 = screen.width - (width * 4) - 10, x2 = x1 - width ; i < 2; i++) {
            g.drawLine(x1, y1, x2, y2);
            y1 += 240 + 8 * space;
            g.drawLine(x2, y1, x2, y2);
            y2 += 240 + 8 * space;
            g.drawLine(x1, y1, x2, y2);
            y1 += 240 + 8 * space;
            y2 += 240 + 8 * space;
        }

        //Left side Round 4 Team Names

        for(int i = 0, x4L = 10 + width * 4, y4L = 180; i < 2; i += 2){
            g.drawString(Main.RO4TM.get(i), x4L, y4L);
            y4L += 240 + 8 * space;
            g.drawString(Main.RO4TM.get(i + 1), x4L, y4L);
            y4L += 240 + 8 * space;
        }

        //Right side Round 4 Team Names

        for(int i = 2, x4L = screen.width - (width * 5) - 10, y4L = 180; i < 4; i += 2){
            g.drawString(Main.RO8TM.get(i), x4L, y4L);
            y4L += 240 + 8 * space;
            g.drawString(Main.RO8TM.get(i + 1), x4L, y4L);
            y4L += 240 + 8 * space;
        }


        g.setFont(new Font("Times New Roman", Font.BOLD,35));
        g.drawString("South", 150,240);
        g.drawString("West" , 150,700);
        g.drawString("East",1700,240);
        g.drawString("Midwest", 1670,720);
    }
}
