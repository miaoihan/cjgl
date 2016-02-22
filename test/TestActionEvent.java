
import java.awt.*;
import java.awt.event.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestActionEvent {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f = new Frame("ce shi");
     
        Button b = new Button("点击我");
        f.add(b);
        
        Monitor bh = new Monitor();
        b.addActionListener(bh);
        
        f.pack();
        f.setVisible(true);
    }
}

class Monitor implements ActionListener{
public void actionPerformed(ActionEvent e){
System.out.println("你死了 ");

}


}