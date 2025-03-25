package src;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class TetrisController implements KeyListener{
    @Override
    public void keyPressed(KeyEvent event) {
        int key_code = event.getKeyCode();
        switch (key_code) {
            case KeyEvent.VK_LEFT:
                
                break;

            case KeyEvent.VK_RIGHT:
                
                break;
            
            case KeyEvent.VK_UP:
                
                break;

            case KeyEvent.VK_DOWN:
                
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
