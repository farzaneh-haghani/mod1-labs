package lab03a.oo2;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;


public class Game extends Canvas{
   
    Ball ball1=new Ball(0,0,20,20);
    Ball ball2=new Ball(100,100,20,20);
    Ball ball3=new Ball(200,200,20,20);
    Ball[] balls={ball1,ball2,ball3};

    public Game(){
        JFrame frame=new JFrame();
        this.setSize(400, 400);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);

        Timer t=new Timer();
        TimerTask tt =new TimerTask(){
            @Override
            public void run(){
                draw();
            }
        };

        t.schedule(tt,0,50);

        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                t.cancel();
                tt.cancel();
            }
        });
    }

    public void draw(){
        for(Ball b : balls){
            b.Move();
        }
        this.repaint();
    }

    public void paint(Graphics g){
        g.drawRect(0, 0, 300, 300);
        for(Ball b : balls){
            b.Move();
            g.drawOval(b.x,b.y,b.w,b.h);
        }

    }
}