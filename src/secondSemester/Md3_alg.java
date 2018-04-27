package secondSemester;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Md3_alg extends JFrame {

	private JPanel contentPane;
	private JTextField txt;
	private JButton btnDelete, btnAdd, btnClear, btnRun;
	private JList listBefore = new JList();
	private JList listAfter = new JList();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Md3_alg frame = new Md3_alg();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private DefaultListModel<String> moda = new DefaultListModel<>();
	private DefaultListModel<String> modb = new DefaultListModel<>();
	public Md3_alg() {
		setTitle("MD3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 312, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txt = new JTextField();
		txt.setBounds(10, 11, 278, 23);
		contentPane.add(txt);
		txt.setColumns(10);

		listBefore.setBounds(45, 86, 108, 149);
		contentPane.add(listBefore);

		listAfter.setBounds(163, 86, 108, 149);
		contentPane.add(listAfter);

		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = listBefore.getSelectedIndex();
				if (selectedIndex != -1) {
					modb.remove(selectedIndex);
				}
			}
		});
		btnDelete.setBounds(53, 257, 100, 23);
		contentPane.add(btnDelete);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listBefore.setModel(moda);
				moda.addElement(txt.getText());
			}
		});
		btnAdd.setBounds(45, 45, 108, 23);
		contentPane.add(btnAdd);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnClear) {
					moda.removeAllElements();
				}
			}
		});
		btnClear.setBounds(163, 257, 108, 23);
		contentPane.add(btnClear);

		JButton btnRun = new JButton("Run");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listAfter.setModel(modb);

				String textAfter = null;
				for (int i = 0; i < listBefore.getModel().getSize(); i++) {
					textAfter = listBefore
							.getModel()
							.getElementAt(i)
							.toString()
							.replaceAll("\\s*\\([^)]*\\)\\s*", " ");
				}

				modb.addElement(textAfter);

			}
		});
		btnRun.setBounds(163, 45, 108, 23);
		contentPane.add(btnRun);
	}
}