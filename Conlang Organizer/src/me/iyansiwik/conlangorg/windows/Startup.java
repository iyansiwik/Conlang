package me.iyansiwik.conlangorg.windows;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import me.iyansiwik.conlangorg.windows.utilities.MotionTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTree;

public class Startup {

	private JFrame frame;

	private Thread thread;
	private JTextField txtLanguageName;
	
	public Startup() {
		thread = new Thread() {
			public void run() {
				initialize();
			}
		};
		thread.start();
	}

	/**
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		frame.setBackground(new Color(0x00ffffff, true));
		JTabbedPane tabbedPane = new MotionTabbedPane(JTabbedPane.TOP, frame);
		tabbedPane.setBounds(0, 0, 480, 300);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panelWelcome = new JPanel();
		tabbedPane.addTab("Welcome", null, panelWelcome, null);
		panelWelcome.setLayout(null);
		
		JLabel lblTitleWelcome = new JLabel("Conlang Organizer");
		lblTitleWelcome.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblTitleWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitleWelcome.setBounds(69, 11, 337, 70);
		panelWelcome.add(lblTitleWelcome);
		
		JButton btnCloseWelcome = new JButton("Close");
		btnCloseWelcome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frame.dispose();
					thread.join();
				} catch(InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnCloseWelcome.setBounds(376, 238, 89, 23);
		panelWelcome.add(btnCloseWelcome);
		
		JPanel panelNew = new JPanel();
		tabbedPane.addTab("New", null, panelNew, null);
		panelNew.setLayout(null);
		
		JLabel lblTitleNew = new JLabel("Conlang Organizer");
		lblTitleNew.setBounds(69, 11, 337, 70);
		panelNew.add(lblTitleNew);
		lblTitleNew.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitleNew.setFont(new Font("Tahoma", Font.BOLD, 28));
		
		JButton btnCloseNew = new JButton("Close");
		btnCloseNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frame.dispose();
					thread.join();
				} catch(InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnCloseNew.setBounds(376, 238, 89, 23);
		panelNew.add(btnCloseNew);
		
		txtLanguageName = new JTextField();
		txtLanguageName.setHorizontalAlignment(SwingConstants.CENTER);
		txtLanguageName.setBounds(132, 102, 210, 20);
		panelNew.add(txtLanguageName);
		txtLanguageName.setColumns(10);
		
		JLabel lblConlangName = new JLabel("Conlang Name");
		lblConlangName.setHorizontalAlignment(SwingConstants.CENTER);
		lblConlangName.setBounds(185, 121, 104, 14);
		panelNew.add(lblConlangName);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(10, 238, 89, 23);
		panelNew.add(btnCreate);
		
		JPanel panelOpen = new JPanel();
		tabbedPane.addTab("Open", null, panelOpen, null);
		panelOpen.setLayout(null);
		
		JLabel lblTitleOpen = new JLabel("Conlang Organizer");
		lblTitleOpen.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitleOpen.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblTitleOpen.setBounds(69, 11, 337, 70);
		panelOpen.add(lblTitleOpen);
		
		JButton btnCloseOpen = new JButton("Close");
		btnCloseOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frame.dispose();
					thread.join();
				} catch(InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnCloseOpen.setBounds(376, 238, 89, 23);
		panelOpen.add(btnCloseOpen);
		
		frame.setVisible(true);
	}
}
