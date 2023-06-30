import java.applet.*;
import java.awt.*;
 
 
public class apple extends Applet{
    public void paint(Graphics g) {
        g.drawLine(20, 20, 200, 20);
        g.drawRect(20, 60, 200, 40);
        g.drawOval(20, 120, 200, 160);
    }
 
}
/*
<applet code="apple.class" width=300 height=300>
</applet>
*/
