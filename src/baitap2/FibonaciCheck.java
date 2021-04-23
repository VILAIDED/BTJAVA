package baitap2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FibonaciCheck extends Frame implements ActionListener{
	Label lb,lbA,lbKQ;
	TextField a_txt,kq_txt;
	Button ok_btn,reset_btn,exit_btn;
	Panel pn,pn1,pn2,pn3;
	public static int fibonacci(int n) {
		if(n == 0 || n == 1) return 1;
		else return fibonacci(n-1) + fibonacci(n-2); 
	}
	public void GUI() {
		lb = new Label("Kiem tra co thuoc day fibonaci");
		lbA = new Label("Nhap a");
		lbKQ = new Label("KQ");
		a_txt = new TextField();
		kq_txt = new TextField();
		ok_btn = new Button("Ok");
		reset_btn = new Button("Reset");
		exit_btn = new Button("Exit");
		ok_btn.addActionListener(this);
		reset_btn.addActionListener(this);
		exit_btn.addActionListener(this);
		pn = new Panel(new GridLayout(3,1));
		pn1 = new Panel(new FlowLayout());
		pn2 = new Panel(new GridLayout(2,2));
		pn3 = new Panel(new FlowLayout());
		pn1.add(lb);
		pn2.add(lbA);
		pn2.add(a_txt);
		pn2.add(lbKQ);
		pn2.add(kq_txt);
		pn3.add(ok_btn);
		pn3.add(reset_btn);
		pn3.add(exit_btn);
		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		add(pn);
		setSize(300,400);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == ok_btn) {
			int a = Integer.parseInt(a_txt.getText());
			for(int i = 0 ; i < a; i++) {
				int f = fibonacci(i);
				if(f== a) {
					kq_txt.setText("thuoc day fibonacii");
					break;
				}else {
					kq_txt.setText("ko co thuoc day fibonacii");
				}
			}
			
		}
		if(e.getSource() == reset_btn) {
			a_txt.setText("");
			kq_txt.setText("");
		}
		if(e.getSource() == exit_btn) {
			System.exit(0);
		}
		
	}
	public FibonaciCheck(String title) {
		super(title);
		GUI();
	}
	public static void main(String agrs[]) {
		new FibonaciCheck("Fibo Check");
	}
	
}
