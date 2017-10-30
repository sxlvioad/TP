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
		
		TableModel dataModel = new AbstractTableModel() {
	          public int getColumnCount() { return 20; }
	          public int getRowCount() { return 20;}
	          public Object getValueAt(int row, int col) { return new Integer(row*col); }
	      };
	      
		table = new JTable(dataModel);
		table.setBounds(14, 85, 464, 238);
		JScrollPane scrollbar = new JScrollPane(table);
		scrollbar.setBounds(14, 85, 464, 238);
		add(scrollbar);

	}
}
