package src;

import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        TetrisController controller = new TetrisController();
        // TetrisGame game = new TetrisGame();

        // 1000 / FPS
        int update_rate_ms = 1000 / 30;
        long time = System.currentTimeMillis();

        Timer timer = new Timer();
        Runnable main_update = new Runnable() {
            public void run() {
                controller.on_frame_update();
            }   
        };

        timer.schedule(new TimerTask() {
            public void run() {
                main_update.run();
            }
        }, time % update_rate_ms, update_rate_ms);

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