package src;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;


public class TetrisController extends TetrisGame implements KeyListener {
    public ArrayList<Integer> action_queue = new ArrayList<Integer>();
    public boolean register_holds = true;

    private double hold_threshold = 10.0;
    
    private long start_hold_time = 0;

    @Override
    public void on_frame_update() {
        this.apply_gravity();
        this.parse_action_queue();
        
        if (this.changed) {
            this.update_console();
        }
    }

    public void register_input(int key_code) {
        action_queue.add(key_code);
    }

    public void parse_action_queue() {
        for (int key_code : action_queue) {
            parse_input(key_code);
        }

        action_queue.clear();
    }

    private void parse_input(int key_code) {
        switch (key_code) {
            case KeyEvent.VK_UP:
                move_block(0);
                break;

            case KeyEvent.VK_DOWN:
                move_block(1);
                break;
                
            case KeyEvent.VK_LEFT:
                move_block(2);
                break;

            case KeyEvent.VK_RIGHT:
                move_block(3);
                break;
            
            case KeyEvent.VK_E:
                rotate_block(false);
                break;
            
            case KeyEvent.VK_Q:
                rotate_block(true);
                break;
                
            default:
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent event) {
        if (register_holds) {
            // Check if the time exceeds the threshold so the input can be registered
            if (System.currentTimeMillis() - start_hold_time > hold_threshold) {
                start_hold_time = System.currentTimeMillis();
                register_input(event.getKeyCode());
            }
        }   
    }
    
    @Override
    public void keyTyped(KeyEvent event) {
    }

    @Override
    public void keyReleased(KeyEvent event) {
        if (!register_holds) {
            register_input(event.getKeyCode());
        }
    }
}
