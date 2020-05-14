package me.iyansiwik.conlangorg.windows;

import java.awt.BorderLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class ProjectSettings implements WindowListener {

	private JFrame parent;
	
	private JFrame frame;
	
	public ProjectSettings(JFrame parent) {
		this.parent = parent;
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(this);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		try {
			frame.setIconImage(ImageIO.read(new File("res/logo.png")));
		} catch (IOException e3) {
			e3.printStackTrace();
		}
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("General", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Fonts", null, panel_1, null);
		
		frame.setVisible(true);
	}

	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		parent.setEnabled(true);
	}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
}
