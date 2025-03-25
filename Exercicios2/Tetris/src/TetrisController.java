package src;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class TetrisController extends TetrisGame implements KeyListener {
    @Override
    public void keyPressed(KeyEvent event) {
        int key_code = event.getKeyCode();
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
            
            default:
                break;
        }
    }
    
    @Override
    public void keyTyped(KeyEvent event) {
    }

    @Override
    public void keyReleased(KeyEvent event) {
    }
}
