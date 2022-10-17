package InAndOut;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class IAndO extends JFrame implements KeyListener {

    private Object kernel =  new Object();

    public IAndO (){
        addKeyListener(this);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_Q -> System.out.println("Lances un Q-Spell");
            case KeyEvent.VK_W -> System.out.println("Lances son W");
            case KeyEvent.VK_E -> System.out.println("Lances son E");
            case KeyEvent.VK_R -> System.out.println("Ultimeeeee");
        }



    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_Q -> System.out.println("Lances un Q-Spell");
            case KeyEvent.VK_LEFT -> System.out.println("Vas a gauche");
            case KeyEvent.VK_RIGHT -> System.out.println("Vas a droite");
            case KeyEvent.VK_UP -> System.out.println("Vas en haut");
            case KeyEvent.VK_DOWN -> System.out.println("Vas en bas");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT -> System.out.println("S'arrete d'aller a gauche");
            case KeyEvent.VK_RIGHT -> System.out.println("S'arrete d'aller a droite");
            case KeyEvent.VK_UP -> System.out.println("S'arrete d'aller en haut");
            case KeyEvent.VK_DOWN -> System.out.println("S'arrete d'aller en bas");

        }
    }
}
