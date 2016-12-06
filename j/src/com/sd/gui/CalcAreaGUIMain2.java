package com.sd.gui;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class CalcAreaGUIMain2 extends JFrame implements ActionListener{
   JTextField radiusTf1;
   JTextField areaTf2;
   JButton b1 = new JButton("계산");
   JButton b2 = new JButton("취소");
   public CalcAreaGUIMain2(){
      //JFrame f = new JFrame();

      JPanel panel = new JPanel(new GridLayout(3,2));
      getContentPane().add(panel);
      JLabel label1 = new JLabel("반지름");
      radiusTf1 = new JTextField(10);
      JLabel label2 = new JLabel("넓이");
      areaTf2 = new JTextField(10);

      b1.addActionListener(this);
      b2.addActionListener(this);
      
      panel.add(label1);
      panel.add(radiusTf1);
      panel.add(label2);
      panel.add(areaTf2);
      panel.add(b1);
      panel.add(b2);
      pack();
      setVisible(true);
      
   }
   public void actionPerformed(ActionEvent e){
      if(e.getSource()==b1){
      JButton b = (JButton)e.getSource();
      b.setText("계산했습니다.");
      Double r = Double.parseDouble(radiusTf1.getText());
      areaTf2.setText(Double.toString(Math.PI*Math.pow(r,2)));
      }else if(e.getSource()==b2){
         radiusTf1.setText("0");
         areaTf2.setText("0");
      }
      
   }
   public static void main(String[] args){
      CalcAreaGUIMain2 c = new CalcAreaGUIMain2();
      c.setDefaultCloseOperation(EXIT_ON_CLOSE);
      c.pack();
      c.setVisible(true);
   }
}