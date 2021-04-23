package baitap2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class NguyenTo extends Frame implements ActionListener{
	 public static boolean soNguyenTo(int n) {
		 if(n < 2) return false;
		 for(int i = 2 ; i <= Math.sqrt(Double.valueOf(n));i++) {
			 if(n % i == 0) return false;
			 
		 }
		 return true;
	 }
	Label lb,lbN,lbKQ;
	TextField n_txt,kq_txt;
	Button tim_btn,reset_btn,exit_btn;
	Panel pn,pn1,pn2,pn3;
	public void GUI() {
		lb = new Label("Cac so nguyen to");
		lbN = new Label("Nhap n");
		lbKQ = new Label("KQ");
		n_txt = new TextField();
		kq_txt = new TextField();
		tim_btn = new Button("Tim");
		reset_btn = new Button("Reset");
		exit_btn = new Button("Exit");
		tim_btn.addActionListener(this);
		reset_btn.addActionListener(this);
		exit_btn.addActionListener(this);
		
		pn = new Panel(new GridLayout(3,1));
		pn1 = new Panel(new FlowLayout());
		pn2 = new Panel(new GridLayout(2,2));
		pn3 = new Panel(new FlowLayout());
		pn1.add(lb);
		pn2.add(lbN);
		pn2.add(n_txt);
		pn2.add(lbKQ);
		pn2.add(kq_txt);
		pn3.add(tim_btn);
		pn3.add(reset_btn);
		pn3.add(exit_btn);
		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		add(pn);
		setSize(500,300);
		setVisible(true);
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tim_btn) {
			int n = Integer.parseInt(n_txt.getText());
			for(int i = 0; i <= n ; i++) {
				if(soNguyenTo(i)) kq_txt.setText(kq_txt.getText() +" "+ i);;
			}
		}
        if(e.getSource() == reset_btn) {
			n_txt.setText("");
			kq_txt.setText("");
		}
        if(e.getSource() == exit_btn) {
			System.exit(0);
		}
		
	}
	public NguyenTo(String title) {
		super(title);
		GUI();
	}
	public static void main(String args[]) {
		new NguyenTo("tim so nguyen to");
	}
	
}
