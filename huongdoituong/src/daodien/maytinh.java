package daodien;

import java.awt.Button;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class maytinh extends JFrame {
	JTextField tfht;
	JButton  btnph;
public maytinh() {
	JPanel p1=new JPanel();
	p1.setLayout(new GridLayout(4,4));
	String buttons[]= {"0","1","2","3","4","5","6","7","8","9","-","*","+","/","="};
	for (int i = 0; i < buttons.length; i++) {
		Button button =new Button(buttons[i]);
		p1.add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			for (int j = 0; j < buttons.length; j++) {
				p1.add(button);
			}	
				
			}
		});
	}
	tfht=new JTextField(10);
Container cont=new Container();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new maytinh();
	}

}
