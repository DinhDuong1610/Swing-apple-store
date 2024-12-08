package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sidebar extends JPanel{

	public Sidebar() {
		setBackground(new Color(74, 170, 239));
		setSize(300, 840);
		setLayout(null);
		
		JLabel lb_store_management = new JLabel("QUẢN LÝ CỬA HÀNG");
		lb_store_management.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_store_management.setBackground(new Color(34, 133, 205));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_store_management.setBackground(new Color(173, 216, 230));
			}
		});
		lb_store_management.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/cuahang.png")));
		lb_store_management.setForeground(new Color(255, 255, 255));
		lb_store_management.setHorizontalAlignment(SwingConstants.CENTER);
		lb_store_management.setFont(new Font("Tahoma", Font.BOLD, 22));
		lb_store_management.setBackground(new Color(173, 216, 230));
		lb_store_management.setOpaque(true);
		lb_store_management.setBounds(0, 251, 300, 53);
		add(lb_store_management);
		
		JLabel lb_employee_management = new JLabel("QUẢN LÝ NHÂN VIÊN");
		lb_employee_management.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_employee_management.setBackground(new Color(34, 133, 205));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_employee_management.setBackground(new Color(173, 216, 230));
			}
		});
		lb_employee_management.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/nhanvien.png")));
		lb_employee_management.setOpaque(true);
		lb_employee_management.setHorizontalAlignment(SwingConstants.CENTER);
		lb_employee_management.setForeground(Color.WHITE);
		lb_employee_management.setFont(new Font("Tahoma", Font.BOLD, 22));
		lb_employee_management.setBackground(new Color(173, 216, 230));
		lb_employee_management.setBounds(0, 314, 300, 53);
		add(lb_employee_management);
		
		JLabel lb_product_management = new JLabel("QUẢN LÝ SẢN PHẨM");
		lb_product_management.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_product_management.setBackground(new Color(34, 133, 205));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_product_management.setBackground(new Color(173, 216, 230));
			}
		});
		lb_product_management.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/sach.png")));
		lb_product_management.setOpaque(true);
		lb_product_management.setHorizontalAlignment(SwingConstants.CENTER);
		lb_product_management.setForeground(Color.WHITE);
		lb_product_management.setFont(new Font("Tahoma", Font.BOLD, 22));
		lb_product_management.setBackground(new Color(173, 216, 230));
		lb_product_management.setBounds(0, 377, 300, 53);
		add(lb_product_management);
		
		JLabel lb_customer_management = new JLabel("KHÁCH HÀNG");
		lb_customer_management.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_customer_management.setBackground(new Color(34, 133, 205));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_customer_management.setBackground(new Color(173, 216, 230));
			}
		});
		lb_customer_management.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/kahchhang.png")));
		lb_customer_management.setOpaque(true);
		lb_customer_management.setHorizontalAlignment(SwingConstants.CENTER);
		lb_customer_management.setForeground(Color.WHITE);
		lb_customer_management.setFont(new Font("Tahoma", Font.BOLD, 22));
		lb_customer_management.setBackground(new Color(173, 216, 230));
		lb_customer_management.setBounds(0, 440, 300, 53);
		add(lb_customer_management);
		
		JLabel lb_income = new JLabel("DOANH THU");
		lb_income.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_income.setBackground(new Color(34, 133, 205));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_income.setBackground(new Color(173, 216, 230));
			}
		});
		lb_income.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/doanhthu.png")));
		lb_income.setOpaque(true);
		lb_income.setHorizontalAlignment(SwingConstants.CENTER);
		lb_income.setForeground(Color.WHITE);
		lb_income.setFont(new Font("Tahoma", Font.BOLD, 22));
		lb_income.setBackground(new Color(173, 216, 230));
		lb_income.setBounds(0, 503, 300, 53);
		add(lb_income);
		
		JLabel lb_statistical = new JLabel("THỐNG KÊ");
		lb_statistical.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lb_statistical.setBackground(new Color(34, 133, 205));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lb_statistical.setBackground(new Color(173, 216, 230));
			}
		});
		lb_statistical.setIcon(new ImageIcon(Sidebar.class.getResource("/images/icons/thongke.png")));
		lb_statistical.setOpaque(true);
		lb_statistical.setHorizontalAlignment(SwingConstants.CENTER);
		lb_statistical.setForeground(Color.WHITE);
		lb_statistical.setFont(new Font("Tahoma", Font.BOLD, 22));
		lb_statistical.setBackground(new Color(173, 216, 230));
		lb_statistical.setBounds(0, 566, 300, 53);
		add(lb_statistical);
	}
}
