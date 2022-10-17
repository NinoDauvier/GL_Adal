package Physics;

import java.awt.event.KeyEvent;

public class KeyHandler {
    public boolean UpPressed, DownPressed, LeftPressed, RightPressed

    public void KeyPressed(KeyEvent e) {

        //EXEMPLE

        int code = e.getKeyCode();

        if (code == KeyEvent.VK_Z) {
            UpPressed = true;
        }


    }

    public void KeyTyped(KeyEvent e) {
    }

    public void KeyReleased(KeyEvent e) {
        //EXEMPLE

        int code = e.getKeyCode();

        if (code == KeyEvent.VK_Z) {
            UpPressed = false;

        }
    }
}
