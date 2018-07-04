
package voiceassistance;
import java.awt.*;
import java.awt.event.ActionListener;
import javafx.event.ActionEvent;
import javax.swing.*;

public class Maingui extends JFrame{
   TextField tf1;


public void Testawt()
 {
  Frame fm=new Frame(); 
      
    Button b1,b2;  
     
        tf1=new TextField();  
        tf1.setBounds(50,50,150,20);  
       
         
        b1=new Button("enter");  
        b1.setBounds(50,200,50,50);  
          
        b1.addActionListener((ActionListener) this);  
         
        fm.add(tf1);  
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }  
 
    public void actionPerformed(ActionEvent e) {  
        String s1=tf1.getText();  
          
        int a=Integer.parseInt(s1);  
       
        
          
    }  
  
}  
 
 
    

