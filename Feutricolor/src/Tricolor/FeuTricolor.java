/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tricolor;

import java.awt.BorderLayout; 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class FeuTricolor extends JFrame implements ActionListener { 

    JButton start; 
    JButton stop; 
    Boolean i; 
    //create constructor method 
    public FeuTricolor(String title) { 
      // create Start button 
      start = new JButton("Start"); 
      //create Stop button 
      stop = new JButton("Stop"); 
      //add Action listeners 
      start.addActionListener(this); 
      stop.addActionListener(this); 
      //create new Button Panel 
      JPanel buttonPanel = new JPanel(); 
      buttonPanel.add(start); 
      buttonPanel.add(stop); 
      Container c = getContentPane(); 
      c.add(buttonPanel, BorderLayout.SOUTH); 

      setSize(200, 425); 
      setLocationRelativeTo(null); 
      setResizable(false); 
      setVisible(true); 
      setDefaultCloseOperation(EXIT_ON_CLOSE); 
    } 

    public void paint(Graphics g){ 
      super.paint(g); 
      g.setColor(Color.black); 
      g.fillOval(50,50,100,100); 
      g.fillOval(50,155,100,100); 
      g.fillOval(50,260,100,100); 
    } 

  
    public void actionPerformed(ActionEvent e){ 
      if(e.getSource() == start){ 
        i = true; 
        new ThreadExtend(this).start(); 
      }else{ 
        i = false; 
      } 
    } 
    public class ThreadExtend extends Thread { 
      Graphics g; 
      JFrame frame; 

      public ThreadExtend(JFrame frame){ 
        this.frame = frame; 
        g = frame.getGraphics(); 
      } 
      public void run(){ 
        while(i) { 
          try{ 
            green(g); 
            if(!i) { 
              break; 
            } 
            Thread.sleep(1000); 
            yellow(g); 
            if(!i) { 
              break; 
            } 
            Thread.sleep(1000); 
            red(g); 
            if(!i){ 
              break; 
            } 
            Thread.sleep(1000); 


          }catch(InterruptedException e) { 
             e.printStackTrace(); 
         } 
        } 
      } 

    } 
    public void green(Graphics g){ 
      g.setColor(Color.black); 
      g.fillOval(52, 262, 96, 96); 
      g.setColor(new Color(255,0,0)); 
      g.fillOval(52, 52, 96, 96); 
    } 
    public void yellow(Graphics g){ 
      g.setColor(Color.black); 
      g.fillOval(52, 52, 96, 96); 
      g.setColor(new Color(250,170,0)); 
      g.fillOval(52, 157, 96, 96); 
    } 
    public void red(Graphics g){ 
      g.setColor(Color.black); 
      g.fillOval(52, 157, 96, 96); 
      g.setColor(new Color(0,250,0)); 
      g.fillOval(52, 262, 96, 96); 
    } 
    public static void main(String[] args) { 
        new FeuTricolor("Stop The Lights"); 

      } 
} 

