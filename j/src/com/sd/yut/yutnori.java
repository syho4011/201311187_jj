package com.sd.yut;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class yutnori extends JFrame implements ActionListener{

   JTextField a1;
   JTextField a2;
   JTextField a3;
   JTextField a4;
  
    
   JButton b1 = new JButton("À· ´øÁö±â");
   JButton b2 = new JButton("À· ´øÁö±â");

   public yutnori(){
      //JFrame f = new JFrame();

      JPanel panel = new JPanel(new GridLayout(10,4));
      
      getContentPane().add(panel);

      JLabel label1 = new JLabel("ÄÄ°ú ´Ô");
      JLabel label2 = new JLabel("¹Ì¼Ò ´Ô");
      JLabel label3 = new JLabel("  ¡Ú                   ¤·  ");
      JLabel label4 = new JLabel("                    ¤· ");
      JLabel label5 = new JLabel("               ¤·           ");
      JLabel label6 = new JLabel("¤·                     ¡Ú  ");//1
      JLabel label7 = new JLabel("  ¤·                   ¤·  ");
      JLabel label8 = new JLabel("");
      JLabel label9 = new JLabel("");
      JLabel label10 = new JLabel("¤·                     ¤·  ");//2
      JLabel label11 = new JLabel("  ¤·           ");
      JLabel label12 = new JLabel("                    ¤·");
      JLabel label13 = new JLabel("                ¤·");
      JLabel label14 = new JLabel("                         ¤·");//3
      JLabel label15 = new JLabel("                       ");
      JLabel label16 = new JLabel("");
      JLabel label17 = new JLabel("¡Ú");
      JLabel label18 = new JLabel("");//4
      JLabel label19 = new JLabel("  ¤·                    ");
      JLabel label20 = new JLabel("                    ¤·");
      JLabel label21 = new JLabel("                ¤·");
      JLabel label22 = new JLabel("                         ¤·");//5
      JLabel label23 = new JLabel("  ¤·                   ¤·  ");
      JLabel label24 = new JLabel("");
      JLabel label25 = new JLabel("");
      JLabel label26 = new JLabel("¤·                     ¤·");//6
      JLabel label27 = new JLabel("  ¡Ú                   ¤·");
      JLabel label28 = new JLabel("                    ¤· ");
      JLabel label29 = new JLabel("               ¤·           ");
      JLabel label30 = new JLabel("¤·                     ¡Ú  ");
      JLabel label31 = new JLabel("");
      JLabel label32 = new JLabel("");
      JLabel label33 = new JLabel("");
      JLabel label34 = new JLabel("");
      a1 = new JTextField(10);
      a2 = new JTextField(10);
      a3 = new JTextField(10);
      a4 = new JTextField(10);
      
      

      b1.addActionListener(this);
      b2.addActionListener(this); 
      panel.add(label1);
      panel.add(a1);
      panel.add(a3);
      panel.add(b1);
      
      panel.add(label2);
      panel.add(a2);
      panel.add(a4);
      panel.add(b2);
      panel.add(label3);
      panel.add(label4);
      panel.add(label5);
      panel.add(label6);
      panel.add(label7);
      panel.add(label8);
      panel.add(label9);
      panel.add(label10);
      panel.add(label11);
      panel.add(label12);
      panel.add(label13);
      panel.add(label14);
      panel.add(label15);
      panel.add(label16);
      panel.add(label17);
      panel.add(label18);
      panel.add(label19);
      panel.add(label20);
      panel.add(label21);
      panel.add(label22);
      panel.add(label23);
      panel.add(label24);
      panel.add(label25);
      panel.add(label26);
      panel.add(label27);
      panel.add(label28);
      panel.add(label29);
      panel.add(label30);
      panel.add(label31);
      panel.add(label32);
      panel.add(label33);
      panel.add(label34);

      pack();
      setVisible(true);
      
   }
   public void actionPerformed(ActionEvent e){
      
      if(e.getSource()==b1){
         yut y1 = new yut();
         y1.roll();
         if(y1.getNum()==1) {
            a1.setText("µµ");
	    a3.setText("1");
            b2.setEnabled(true);
            b1.setEnabled(false);
	 }else if(y1.getNum()==2){
            a1.setText("°³");
            a3.setText("2");
            b2.setEnabled(true);
            b1.setEnabled(false);
         }else if(y1.getNum()==3){
            a1.setText("°É");
            a3.setText("3");
            b2.setEnabled(true);
            b1.setEnabled(false);
         }else if(y1.getNum()==4){
            a1.setText("À·");
            a3.setText("4");
            b2.setEnabled(false);
            
         }else if(y1.getNum()==5){
            a1.setText("¸ð");
            a3.setText("5");
            b2.setEnabled(false);
         }
      
      
         /*if(a1.setText()==){
            a3.setText(Integer.toString(y1.getNum()));
         }else if(a1.setText("°³")){
            a3.setText(Integer.toString(y1.getNum()));
         }else if(a1.setText("°É")){
            a3.setText(Integer.toString(y1.getNum()));
         }else if(a1.setText("À·")){
            a3.setText(Integer.toString(y1.getNum()));
         }else if(a1.setText("¸ð")){
            a3.setText(Integer.toString(y1.getNum()));
         }*/
      }
      
      if(e.getSource()==b2){
         yut y2 = new yut();
         y2.roll();
         if(y2.getNum()==1) {
            a2.setText("µµ");
            a4.setText("1");
            b1.setEnabled(true);
            b2.setEnabled(false);
	 }else if(y2.getNum()==2){
            a2.setText("°³");
            a4.setText("2");
            b1.setEnabled(true);
            b2.setEnabled(false);
         }else if(y2.getNum()==3){
            a2.setText("°É");
            a4.setText("3");
            b1.setEnabled(true);
            b2.setEnabled(false);
         }else if(y2.getNum()==4){
            a2.setText("À·");
            a4.setText("4");
            b1.setEnabled(false);
         }else if(y2.getNum()==5){
            a2.setText("¸ð");
            a4.setText("5");
            b1.setEnabled(false);
         }
      
        /* if(a2.setText("µµ")){
            a4.setText(Integer.toString(y2.getNum()));
         }else if(a2.setText("°³")){
            a4.setText(Integer.toString(y2.getNum()));
         }else if(a2.setText("°É")){
            a4.setText(Integer.toString(y2.getNum()));
         }else if(a2.setText("À·")){
            a4.setText(Integer.toString(y2.getNum()));
         }else if(a2.setText("¸ð")){
            a4.setText(Integer.toString(y2.getNum()));
         }*/
      }
   }
    
     
   public static void main(String[] args){
      yutnori y = new yutnori();
      y.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      y.pack();
      y.setVisible(true);
   }
}
   

      


