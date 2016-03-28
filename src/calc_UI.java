import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.lang.Object;
import java.awt.Component;


public class calc_UI implements ActionListener {
	JFrame frame= new JFrame("CLC");
	JPanel panel= new JPanel(null);
	JTextArea text=new JTextArea(4, 18);
	JButton button_1=new JButton("1");
	JButton button_2=new JButton("2");
	JButton button_3=new JButton("3");
	JButton button_4=new JButton("4");
	JButton button_5=new JButton("5");
	JButton button_6=new JButton("6");
	JButton button_7=new JButton("7");
	JButton button_8=new JButton("8");
	JButton button_9=new JButton("9");
	JButton button_0=new JButton("0");
	JButton button_ac=new JButton("AC");
	JButton button_sum=new JButton("+");
	JButton button_sub=new JButton("-");
	JButton button_mul=new JButton("*");
	JButton button_div=new JButton("/");
	JButton button_res=new JButton("=");
	JButton button_sign=new JButton("+|-");
	JButton button_clear=new JButton("C");
	JButton button_dot=new JButton(".");
	JButton button_pow=new JButton("^");
	Double number1, number2, result;
	int addc=0, subc=0,mulc=0,divc=0,powc=0;
	
		public void ui(){
	frame.setVisible(true);
	frame.setSize(284, 277);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(text);
	panel.add(button_clear);
	panel.add(button_sign);
	panel.add(button_div);
	panel.add(button_mul);
	panel.add(button_7);
	panel.add(button_8);
	panel.add(button_9);
	panel.add(button_sub);
	panel.add(button_4);
	panel.add(button_5);
	panel.add(button_6);
	panel.add(button_sum);
	panel.add(button_1);
	panel.add(button_2);
	panel.add(button_3);
	panel.add(button_pow);
	panel.add(button_0);
	panel.add(button_dot);
	panel.add(button_ac);
	panel.add(button_res);
	button_1.addActionListener(this);
	button_2.addActionListener(this);
	button_3.addActionListener(this);
	button_4.addActionListener(this);
	button_5.addActionListener(this);
	button_6.addActionListener(this);
	button_7.addActionListener(this);
	button_8.addActionListener(this);
	button_9.addActionListener(this);
	button_0.addActionListener(this);
	button_sum.addActionListener(this);
	button_sub.addActionListener(this);
	button_mul.addActionListener(this);
	button_div.addActionListener(this);
	button_res.addActionListener(this);
	button_clear.addActionListener(this);
	button_sign.addActionListener(this);
	button_dot.addActionListener(this);
	button_ac.addActionListener(this);
	button_pow.addActionListener(this);
	
	
	text.setEditable(false);
	text.setFont(new Font("Verdana", Font.ITALIC, 20));
	text.setForeground(Color.white);
	panel.setBackground(Color.GRAY);
	button_clear.setBackground(Color.white);
    button_clear.setForeground(Color.black);
    button_clear.setOpaque(true);
    button_clear.setBorderPainted(false);
    button_sum.setBackground(Color.orange);
    button_sum.setForeground(Color.white);
    button_sum.setOpaque(true);
    button_sum.setBorderPainted(false);
    button_sub.setBackground(Color.orange);
    button_sub.setForeground(Color.white);
    button_sub.setOpaque(true);
    button_sub.setBorderPainted(false);
    button_div.setBackground(Color.orange);
    button_div.setForeground(Color.white);
    button_div.setOpaque(true);
    button_div.setBorderPainted(false);
    button_sign.setBackground(Color.LIGHT_GRAY);
    button_sign.setForeground(Color.white);
    button_sign.setOpaque(true);
    button_sign.setBorderPainted(false);
    button_mul.setBackground(Color.orange);
    button_mul.setForeground(Color.white);
    button_mul.setOpaque(true);
    button_mul.setBorderPainted(false);
    button_pow.setBackground(Color.LIGHT_GRAY);
    button_pow.setForeground(Color.white);
    button_pow.setOpaque(true);
    button_pow.setBorderPainted(false);
    button_res.setBackground(Color.orange);
    button_res.setForeground(Color.white);
    button_res.setOpaque(true);
    button_res.setBorderPainted(false);
    button_0.setBackground(Color.white);
    button_0.setForeground(Color.black);
    button_0.setOpaque(true);
    button_0.setBorderPainted(false);
    button_1.setBackground(Color.white);
    button_1.setForeground(Color.black);
    button_1.setOpaque(true);
    button_1.setBorderPainted(false);
    button_2.setBackground(Color.white);
    button_2.setForeground(Color.black);
    button_2.setOpaque(true);
    button_2.setBorderPainted(false);
    button_3.setBackground(Color.white);
    button_3.setForeground(Color.black);
    button_3.setOpaque(true);
    button_3.setBorderPainted(false);
    button_4.setBackground(Color.white);
    button_4.setForeground(Color.black);
    button_4.setOpaque(true);
    button_4.setBorderPainted(false);
    button_5.setBackground(Color.white);
    button_5.setForeground(Color.black);
    button_5.setOpaque(true);
    button_5.setBorderPainted(false);
    button_6.setBackground(Color.white);
    button_6.setForeground(Color.black);
    button_6.setOpaque(true);
    button_6.setBorderPainted(false);
    button_7.setBackground(Color.white);
    button_7.setForeground(Color.black);
    button_7.setOpaque(true);
    button_7.setBorderPainted(false);
    button_8.setBackground(Color.white);
    button_8.setForeground(Color.black);
    button_8.setOpaque(true);
    button_8.setBorderPainted(false);
    button_9.setBackground(Color.white);
    button_9.setForeground(Color.black);
    button_9.setOpaque(true);
    button_9.setBorderPainted(false);
    button_dot.setBackground(Color.white);
    button_dot.setForeground(Color.black);
    button_dot.setOpaque(true);
    button_dot.setBorderPainted(false);
    button_ac.setBackground(Color.LIGHT_GRAY);
    button_ac.setForeground(Color.white);
    button_ac.setOpaque(true);
    button_ac.setBorderPainted(false);
    text.setBackground(Color.gray);
    text.setSize(281,50);
    text.setLocation(1, 1);
    button_ac.setSize(70, 40);
    button_ac.setLocation(1, 51);
    button_sign.setSize(70, 40);
    button_sign.setLocation(72, 51);
    button_pow.setSize(70, 40);
    button_pow.setLocation(143, 51);
    button_div.setSize(70, 40);
    button_div.setLocation(214, 51);
    button_7.setSize(70, 40);
    button_7.setLocation(1, 92);
    button_8.setSize(70, 40);
    button_8.setLocation(72, 92);
    button_9.setSize(70, 40);
    button_9.setLocation(143,92);
    button_mul.setSize(70, 40);
    button_mul.setLocation(214, 92);
    button_4.setSize(70, 40);
    button_4.setLocation(1, 133);
    button_5.setSize(70, 40);
    button_5.setLocation(72, 133);
    button_6.setSize(70, 40);
    button_6.setLocation(143, 133);
    button_sub.setSize(70, 40);
    button_sub.setLocation(214, 133);
    button_1.setSize(70, 40);
    button_1.setLocation(1, 174);
    button_2.setSize(70, 40);
    button_2.setLocation(72, 174);
    button_3.setSize(70, 40);
    button_3.setLocation(143, 174);
    button_sum.setSize(70, 40);
    button_sum.setLocation(214, 174);
    button_0.setSize(70, 40);
    button_0.setLocation(1, 215);
    button_dot.setSize(70, 40);
    button_dot.setLocation(72, 215);
    button_clear.setSize(70, 40);
    button_clear.setLocation(143, 215);
    button_res.setSize(70, 40);
    button_res.setLocation(214, 215);
    
}

		@Override
		public void actionPerformed(ActionEvent e) {
			Object source=e.getSource();
			if(source==button_1){
				if(text.getText().equals("0"))
					text.setText("");
				
				text.append("1");
			}
			if(source==button_2){
				text.append("2");
			}
			if(source==button_dot){
				if(text.getText().contains(".")){}
				else{
					if(text.getText().equals(""))
					{text.append("0.");}
					else
						text.append(".");}
			}
			if(source==button_3){
				text.append("3");
			}
			if(source==button_4){
				text.append("4");
			}
			if(source==button_5){
				text.append("5");
			}
			if(source==button_6){
				text.append("6");
			}
			if(source==button_7){
				text.append("7");
			}
			if(source==button_8){
				text.append("8");
			}
			if(source==button_9){
				text.append("9");
			}
			if(source==button_0){
				if(text.getText().contains("0")){
					if(text.getText().contains(".")||
							text.getText().contains("1")||text.getText().contains("6")||
							text.getText().contains("2")||text.getText().contains("7")||
							text.getText().contains("3")||text.getText().contains("8")||
							text.getText().contains("4")||text.getText().contains("9")||
							text.getText().contains("5")){text.append("0");}
					
				}
				else{text.append("0");}
			}
			if(source==button_sign){
				double digit;
				digit=number_reader();
				if(digit>0)
				digit=-digit;
				else
					if(digit<0)
						digit=Math.abs(digit);
				
				text.setText(Double.toString(digit));
			}
			if(source==button_sum){
				number1=number_reader();
				text.setText("");
				addc=1;
				subc=0;
				mulc=0;
				divc=0;
			}
			if(source==button_sub){
				number1=number_reader();
				text.setText("");
				addc=0;
				subc=1;
				mulc=0;
				divc=0;
			}
			if(source==button_mul){
				number1=number_reader();
				text.setText("");
				addc=0;
				subc=0;
				mulc=1;
				divc=0;
			}
			if(source==button_div){
				number1=number_reader();
				text.setText("");
				addc=0;
				subc=0;
				mulc=0;
				divc=1;
			}
			if(source==button_pow){
				number1=number_reader();
				text.setText("");
				addc=0;
				subc=0;
				mulc=0;
				divc=0;
				powc=1;
			}
			
			if(source==button_clear){
				text.setText("");
				}
			if(source==button_ac){
				text.setText("");
				number1=null;
			}
			
			if(source==button_res){
				//if(text.getText().lastIndexOf(t)==".")
				//{
					//text.setText(text.getText().substring(0, text.getText().length()-1));
			//	}
				//else{}
				number2=number_reader();
				if(addc>0){
					result=number1+number2;
					if(result%result.intValue()==0)
						text.setText(result.intValue()+"");
					else
						text.setText(Double.toString(result));
				}
				if(subc>0){
					result=number1-number2;
					if(result%result.intValue()==0)
						text.setText(result.intValue()+"");
					else
						text.setText(Double.toString(result));
				}
				if(mulc>0){
					result=number1*number2;
					if(result%result.intValue()==0)
						text.setText(result.intValue()+"");
					else
						text.setText(Double.toString(result));
				}
				if(divc>0){
					result=number1/number2;
					
					if(result%result.intValue()==0)
						text.setText(result.intValue()+"");
					else
						text.setText(Double.toString(result));}
				if(powc>0){
					result=Math.pow(number1,number2);
					if(result%result.intValue()==0)
						text.setText(result.intValue()+"");
					else
						text.setText(Double.toString(result));;
				}
				
				
			}
		}
		public double number_reader(){
			double num1;
			String s;
			s=text.getText();
			if(!s.contentEquals("")){
			num1=Double.valueOf(s);}
			else
				{num1=0;}
			return num1;
		}
		
}
