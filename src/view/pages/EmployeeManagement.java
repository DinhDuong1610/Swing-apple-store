package view.pages;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmployeeManagement extends JPanel{
	private JTextField tf_id;
	private JTextField tf_name;
	private JTextField tf_cccd;
	private JTextField tf_sex;
	private JTextField tf_birth;
	private JTextField tf_phone;
	private JTextField tf_role;
	private JTextField tf_salary;
	private JTable table;
	private JTextField tf_search;
	private DefaultTableModel table_model;
	
	public EmployeeManagement() {
		setBackground(new Color(255, 255, 255));
		setSize(1240, 840);
		setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setIcon(new ImageIcon(EmployeeManagement.class.getResource("/images/logo_title.png")));
		logo.setBounds(370, 10, 442, 63);
		add(logo);
		
		JLabel lblNewLabel = new JLabel("Mã nhân viên");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(49, 107, 160, 30);
		add(lblNewLabel);
		
		tf_id = new JTextField();
		tf_id.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_id.setBounds(219, 107, 278, 30);
		add(tf_id);
		tf_id.setColumns(10);
		
		JLabel lblTnNhnVin = new JLabel("Tên nhân viên");
		lblTnNhnVin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTnNhnVin.setBounds(49, 157, 160, 30);
		add(lblTnNhnVin);
		
		tf_name = new JTextField();
		tf_name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_name.setColumns(10);
		tf_name.setBounds(219, 157, 278, 30);
		add(tf_name);
		
		JLabel lblCccd = new JLabel("CCCD");
		lblCccd.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCccd.setBounds(49, 210, 160, 30);
		add(lblCccd);
		
		tf_cccd = new JTextField();
		tf_cccd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_cccd.setColumns(10);
		tf_cccd.setBounds(219, 210, 278, 30);
		add(tf_cccd);
		
		JLabel lblNewLabel_2_1 = new JLabel("Giới tính");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(49, 261, 160, 30);
		add(lblNewLabel_2_1);
		
		tf_sex = new JTextField();
		tf_sex.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_sex.setColumns(10);
		tf_sex.setBounds(219, 261, 278, 30);
		add(tf_sex);
		
		tf_birth = new JTextField();
		tf_birth.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_birth.setColumns(10);
		tf_birth.setBounds(672, 107, 278, 30);
		add(tf_birth);
		
		JLabel lblNewLabel_3 = new JLabel("Ngày sinh");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(539, 107, 160, 30);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("SĐT");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(539, 157, 160, 30);
		add(lblNewLabel_1_1);
		
		tf_phone = new JTextField();
		tf_phone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_phone.setColumns(10);
		tf_phone.setBounds(672, 157, 278, 30);
		add(tf_phone);
		
		JLabel lblNewLabel_2_2 = new JLabel("Chức vụ");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(539, 210, 160, 30);
		add(lblNewLabel_2_2);
		
		tf_role = new JTextField();
		tf_role.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_role.setColumns(10);
		tf_role.setBounds(672, 210, 278, 30);
		add(tf_role);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Lương");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBounds(539, 261, 160, 30);
		add(lblNewLabel_2_1_1);
		
		tf_salary = new JTextField();
		tf_salary.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tf_salary.setColumns(10);
		tf_salary.setBounds(672, 261, 278, 30);
		add(tf_salary);
		
		JLabel lb_export = new JLabel("XUẤT DANH SÁCH");
		lb_export.setIcon(new ImageIcon(EmployeeManagement.class.getResource("/images/icons/icon_export.png")));
		lb_export.setBackground(new Color(0, 255, 127));
		lb_export.setOpaque(true);
		lb_export.setHorizontalAlignment(SwingConstants.CENTER);
		lb_export.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_export.setBounds(980, 107, 223, 42);
		add(lb_export);
		
		JLabel lb_add = new JLabel("THÊM NHÂN VIÊN");
		lb_add.setIcon(new ImageIcon(EmployeeManagement.class.getResource("/images/icons/icon_add.png")));
		lb_add.setBackground(new Color(0, 191, 255));
		lb_add.setOpaque(true);
		lb_add.setHorizontalAlignment(SwingConstants.CENTER);
		lb_add.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_add.setBounds(980, 170, 223, 42);
		add(lb_add);
		
		JLabel lb_edit = new JLabel("SỬA NHÂN VIÊN");
		lb_edit.setIcon(new ImageIcon(EmployeeManagement.class.getResource("/images/icons/edit.png")));
		lb_edit.setBackground(new Color(255, 255, 0));
		lb_edit.setOpaque(true);
		lb_edit.setHorizontalAlignment(SwingConstants.CENTER);
		lb_edit.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_edit.setBounds(980, 233, 223, 42);
		add(lb_edit);
		
		JLabel lb_delete = new JLabel("XÓA NHÂN VIÊN");
		lb_delete.setIcon(new ImageIcon(EmployeeManagement.class.getResource("/images/icons/icon_delete.png")));
		lb_delete.setOpaque(true);
		lb_delete.setBackground(new Color(220, 20, 60));
		lb_delete.setHorizontalAlignment(SwingConstants.CENTER);
		lb_delete.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb_delete.setBounds(980, 298, 223, 42);
		add(lb_delete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 379, 1160, 425);
		add(scrollPane);
		
		table_model = new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
				},
				new String[] {
					"M\u00E3 NV", "T\u00EAn NV", "CCCD", "Gi\u1EDBi", "Ng\u00E0y sinh", "S\u0110T", "Ch\u1EE9c v\u1EE5", "L\u01B0\u01A1ng"
				}
			);
		
		table = new JTable();
		table.setEnabled(false);
		table.setModel(table_model);
		table.setFont(new Font("Tahoma", Font.BOLD, 18));
		table.setRowHeight(40);
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setPreferredWidth(200);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.getColumnModel().getColumn(4).setPreferredWidth(160);
		table.getColumnModel().getColumn(5).setPreferredWidth(150);
		table.getColumnModel().getColumn(6).setPreferredWidth(150);
		table.getColumnModel().getColumn(7).setPreferredWidth(150);
		Font headerFont = new Font("Tahoma", Font.BOLD, 20);
		table.getTableHeader().setPreferredSize(new Dimension(table.getTableHeader().getWidth(), 30));
		table.getTableHeader().setFont(headerFont);
		scrollPane.setViewportView(table);
		
		
		tf_search = new JTextField();
		tf_search.setBounds(43, 339, 290, 30);
		add(tf_search);
		tf_search.setColumns(10);
	}
}
