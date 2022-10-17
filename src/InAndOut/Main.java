package InAndOut;

import java.awt.event.KeyEvent;
import java.beans.EventHandler;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("I am a Geek");
        IAndO iAndO = new IAndO();
        while (true){
            iAndO.setVisible(true);
        }
    }
}
