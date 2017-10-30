import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import java.awt.Font;

public class Consulta extends JPanel {
	private JTable table;

	public Consulta(JFrame marco) {
		setLayout(null);

		JLabel lblConsulta = new JLabel("Consultas");
		lblConsulta.setFont(new Font("Calibri", Font.PLAIN, 22));
		lblConsulta.setBounds(200, 11, 98, 27);
		add(lblConsulta);
		
	      table.setBounds(20, 94, 449, 233);
	      add(table);

		
	}
}
