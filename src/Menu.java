import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Menu extends JPanel {
	public Menu(){
		setLayout(null);
		
		JButton btnCrear = new JButton("CREAR");
		btnCrear.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		btnCrear.setBounds(184, 105, 115, 23);
		add(btnCrear);
		btnCrear.addActionListener(-->);
		
		JButton btnNewButton = new JButton("ELIMINAR");
		btnNewButton.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(184, 139, 115, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MODIFICAR");
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1.setBounds(184, 173, 115, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CONSULTA");
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_2.setBounds(184, 207, 115, 23);
		add(btnNewButton_2);
		
		JTextPane txtpnDsdsa = new JTextPane();
		txtpnDsdsa.setEnabled(false);
		txtpnDsdsa.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 18));
		txtpnDsdsa.setForeground(Color.YELLOW);
		txtpnDsdsa.setBackground(Color.BLACK);
		txtpnDsdsa.setEditable(false);
		txtpnDsdsa.setText("CONSULTORA SARASASASA");
		txtpnDsdsa.setBounds(99, 32, 296, 36);
		add(txtpnDsdsa);
	}
}
