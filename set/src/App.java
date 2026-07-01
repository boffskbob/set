import java.io.*;
import javax.swing.*;

public class App {
    static int WIDTH = 1200;
    static int HEIGHT = 800;

    // this is driver
    public static void main(String[] args) throws Exception {
        JFrame game = new JFrame();
        game.setVisible(true);
        game.setSize(WIDTH, HEIGHT);
        game.setLayout(new java.awt.GridLayout(3, 4, 10, 10));
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Gamemaster gamemaster = new Gamemaster(game);

    }
}
