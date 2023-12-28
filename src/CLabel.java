import javax.swing.*;
import java.awt.*;

public class CLabel extends JLabel{

    public CLabel(String text) {
        super(text);
    }
    public CLabel(String text, Color color) {
        super(text);
        setForeground(color);
    }
    public CLabel(String text, Color color, Font font) {
        super(text);
        setForeground(color);
        setFont(font);
    }
}
