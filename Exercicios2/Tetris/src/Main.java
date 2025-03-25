package src;

import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        TetrisController controller = new TetrisController();
        // TetrisGame game = new TetrisGame();

        setupWindowForKeyListener(controller);
    }

    private static void setupWindowForKeyListener(KeyListener key_listener) {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setSize(100, 100);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.addKeyListener(key_listener);
    }
}