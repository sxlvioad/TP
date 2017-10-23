import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class App {

	public static void main(String[] args) {
		JFrame marco = new JFrame();
		
		marco.setVisible(true);
		marco.setBounds(0, 0, 500, 400);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setContentPane(new Menu(marco));
		marco.validate();
	}

}
