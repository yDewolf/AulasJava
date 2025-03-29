package src;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;


public class TetrisController extends TetrisGame implements KeyListener {
    public ArrayList<Integer> action_queue = new ArrayList<Integer>();
    public boolean register_holds = false;
    public boolean render_console = true;
    public double delta = 1;


    private double hold_threshold = 10.0;
    private double idle_seconds = 0;
    private double idle_place_threshold = 0.75;

    private long start_hold_time = 0;

    @Override
    public void on_frame_update() {
        if (this.action_queue.isEmpty()) {
            idle_seconds += delta / 1000;
        } else {
            idle_seconds = 0;
        }

        this.parse_action_queue();
        this.apply_gravity();

        // super.on_frame_update();
        if (idle_seconds > idle_place_threshold && check_on_top(current_block)) {
            place_block();
            next_block();
        }

        clear_filled_rows();

        if (this.changed && render_console) {
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

    @Override
    public String get_ui_string() {
        String ui = super.get_ui_string();
        ui += "\nZ -> Rotate | X -> Reverse Rotate\nArrows -> Movement | Space -> Place Below";

        return ui;
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
            
            case KeyEvent.VK_Z:
                rotate_block(false);
                break;
            
            case KeyEvent.VK_X:
                rotate_block(true);
                break;
            
            case KeyEvent.VK_SPACE:
                boolean placed = false;
                while (!placed) {
                    // Move block down
                    move_block(1);
                    if (check_on_top(current_block)) {
                        placed = place_block();
                    }
                }
                next_block();
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
