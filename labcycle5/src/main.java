import java.awt.*;
import java.awt.event.*;

class EventHandlingExample extends Frame
        implements MouseListener, MouseMotionListener, WindowListener {

    public EventHandlingExample() {
        super("Event Handling Example");

        // Registering event listeners
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(this);

        setSize(400, 300);
        setVisible(true);
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed at: (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released at: (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered the Frame");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited the Frame");
    }

    // MouseMotionListener methods
    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse Dragged at: (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse Moved at: (" + e.getX() + ", " + e.getY() + ")");
    }

    // WindowListener methods
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        dispose();
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Window Minimized");
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Restored");
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }

    public static void main(String[] args) {
        EventHandlingExample eventHandlingExample = new EventHandlingExample();

    }
}

