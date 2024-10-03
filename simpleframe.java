import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class impleframe implements ActionListener
{
    Frame Frame =new JFrame("simpleframe");
    Button Button=new Button("CLICK  HERE......");
    
Simpleframe()
{
    Button.setBounds(140,180,160,50);
    Button.setFocusable(false);
    Button.addActionListener(this);
    Frame.add(Button);

    
    Frame.setSize(400,400);
    Frame.setLayout(null);
    
}

public void actionperformed(ActionEvent e)
{
    login l=new login();
    Frame.setVisible(false);
}
public static void main(String arg[])
{
    Simpleframe s=new Simpleframe();
    
}
}