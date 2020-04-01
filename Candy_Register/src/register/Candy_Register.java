package register;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.*;

public class Candy_Register extends JFrame {
	private JLabel Store;
	private JLabel City;
	private JLabel numIpads;
	private JTextField numIpadsTextArea;
	private JLabel numIphones;
	private JTextField IphonesTotal;
	private JCheckBox UpgradePro;
	private JCheckBox Upgrade256;
	private JButton changeNumIpads;
	private JButton caculate;

	public Candy_Register() {
		this.setSize(450, 150);
		this.setTitle(" Thomas Apple Store");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Making the labels and stuff equal stuff

		Store = new JLabel("Apple Sotre");
		Store.setHorizontalAlignment(SwingConstants.LEFT);
		Store.setBackground(Color.BLUE);
		City = new JLabel("River Forest");
		City.setHorizontalAlignment(SwingConstants.RIGHT);
		Store.setBackground(Color.GREEN);
		numIpads = new JLabel("Number of Ipads:");
		numIpads.setHorizontalAlignment(SwingConstants.RIGHT);

		numIpadsTextArea = new JTextField("1");

		numIphones = new JLabel("Number of Iphones:");
		numIphones.setHorizontalAlignment(SwingConstants.RIGHT);
		IphonesTotal = new JTextField("1");
		UpgradePro = new JCheckBox("Upgrade to iPad Pro");
		UpgradePro.setSelected(true);
		Upgrade256 = new JCheckBox("Upgrade to 256GB");
		Upgrade256.setSelected(true);
		// This adds controls to the window
		Container pane = this.getContentPane();
		pane.setLayout(new GridLayout(5, 2));
		pane.add(Store);
		pane.add(City);
		pane.add(changeNumIpads);
		pane.add(caculate);
		pane.add(numIpads);
		pane.add(numIpadsTextArea);
		pane.add(numIphones);
		pane.add(Upgrade256);
		pane.add(UpgradePro);

		this.setVisible(true);

	}

}
