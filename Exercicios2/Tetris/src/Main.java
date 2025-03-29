package src;

import java.awt.event.KeyListener;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        boolean skip_intro = true;

        if (!skip_intro) {
            System.out.println(
                " _________  _______  _________  ________  ___  ________      \r\n" + //
                "|\\___   ___\\\\  ___ \\|\\___   ___\\\\   __  \\|\\  \\|\\   ____\\     \r\n" + //
                "\\|___ \\  \\_\\ \\   __/\\|___ \\  \\_\\ \\  \\|\\  \\ \\  \\ \\  \\___|_    \r\n" + //
                "     \\ \\  \\ \\ \\  \\_|/__  \\ \\  \\ \\ \\   _  _\\ \\  \\ \\_____  \\   \r\n" + //
                "      \\ \\  \\ \\ \\  \\_|\\ \\  \\ \\  \\ \\ \\  \\\\  \\\\ \\  \\|____|\\  \\  \r\n" + //
                "       \\ \\__\\ \\ \\_______\\  \\ \\__\\ \\ \\__\\\\ _\\\\ \\__\\____\\_\\  \\ \r\n" + //
                "        \\|__|  \\|_______|   \\|__|  \\|__|\\|__|\\|__|\\_________\\\r\n" + //
                "                                                 \\|_________|\r\n" + //
                "                                                             ");
            System.out.println(
                "___.                   ________                      .__   _____ \r\n" + //
                "\\_ |__ ___.__.  ___.__.\\______ \\   ______  _  ______ |  |_/ ____\\\r\n" + //
                " | __ <   |  | <   |  | |    |  \\_/ __ \\ \\/ \\/ /  _ \\|  |\\   __\\ \r\n" + //
                " | \\_\\ \\___  |  \\___  | |    `   \\  ___/\\     (  <_> )  |_|  |   \r\n" + //
                " |___  / ____|  / ____|/_______  /\\___  >\\/\\_/ \\____/|____/__|   \r\n" + //
                "     \\/\\/       \\/             \\/     \\/                         "
            );
            Scanner wait_input = new Scanner(System.in);
            
            System.out.println("Write anything to start");
            wait_input.next();
            wait_input.close();
        }

        TetrisController controller = new TetrisController();
        controller.register_holds = true;

        // 1000 / FPS
        int update_rate_ms = 1000 / 30;
        controller.delta = (double) update_rate_ms;

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