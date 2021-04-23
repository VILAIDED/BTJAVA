package baitap2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ColorPanel extends Frame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button green_btn,blue_btn,red_btn,exit_btn;
	public void GUI() {
		setLayout(new FlowLayout());
		green_btn = new Button("Green");
		blue_btn = new Button("Blue");
		red_btn = new Button("Red");
		exit_btn = new Button("Exit");
		green_btn.addActionListener(this);
		blue_btn.addActionListener(this);
		red_btn.addActionListener(this);
		exit_btn.addActionListener(this);
		add(green_btn);
		add(blue_btn);
		add(red_btn);
		add(exit_btn);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String args[]) {
		new ColorPanel("Color Change");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == green_btn) {
			setBackground(Color.green);
		}
        if(e.getSource() == blue_btn) {
        	setBackground(Color.blue);
		}if(e.getSource() == red_btn) {
			setBackground(Color.red);
		}
		if(e.getSource() == exit_btn) {
			System.exit(0);
		}
		
	}
	public ColorPanel(String title) {
		super(title);
		GUI();
	}
}
