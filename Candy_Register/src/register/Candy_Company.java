package register;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

public class Candy_Company extends JFrame {
	private final double I_PADS = 429;
	private final double I_PHONE = 699;
	private JLabel Store;
	private JLabel City;
	private JLabel numIpads;
	private JTextField numIpadsTextArea;
	private JLabel numIphones;
	private JTextField IphonesTotal;
	private JCheckBox UpgradePro;
	private JCheckBox Upgrade256;
	private JButton changeNumIphones;
	private JButton caculate;

	public Candy_Company() {
		this.setSize(500, 250);
		this.setTitle(" Thomas Apple Store");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Making the labels and stuff equal stuff

		Store = new JLabel("Apple Store");
		Store.setHorizontalAlignment(SwingConstants.LEFT);
		Store.setFont(new Font("Apple Store", Font.BOLD, 24));
		Store.setForeground(Color.BLUE);

		City = new JLabel("River Forest");
		City.setHorizontalAlignment(SwingConstants.RIGHT);
		City.setFont(new Font("RiverForest", Font.BOLD, 24));
		City.setForeground(Color.GREEN);

		numIpads = new JLabel("Number of Ipads:");
		numIpads.setHorizontalAlignment(SwingConstants.RIGHT);
		numIpads.setForeground(Color.yellow);
		numIpadsTextArea = new JTextField("1");
		numIpads.setFont(new Font("Number of Ipads:", Font.BOLD, 12));

		numIphones = new JLabel("Number of Iphones:");
		numIphones.setHorizontalAlignment(SwingConstants.RIGHT);

		IphonesTotal = new JTextField("1");

		changeNumIphones = new JButton("Change num Iphones");
		changeNumIphones.setHorizontalAlignment(SwingConstants.LEFT);
		changeNumIphones.addActionListener(new CalculateButtonHandler());
		caculate = new JButton("Caculate");
		caculate.setHorizontalAlignment(SwingConstants.RIGHT);
		caculate.addActionListener(new CalculateButtonHandler2());

		UpgradePro = new JCheckBox("Upgrade to iPad Pro");
		UpgradePro.setSelected(true);
		Upgrade256 = new JCheckBox("Upgrade to 256GB");
		Upgrade256.setSelected(true);
		// This adds controls to the window
		Container pane = this.getContentPane();
		pane.setLayout(new GridLayout(5, 2));
		pane.add(Store);
		pane.add(City);
		pane.add(numIpads);
		pane.add(numIpadsTextArea);
		pane.add(numIphones);
		pane.add(IphonesTotal);
		pane.add(UpgradePro);
		pane.add(Upgrade256);
		pane.add(changeNumIphones);
		pane.add(caculate);

		this.setVisible(true);

	}

	private class CalculateButtonHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String Iphones = JOptionPane.showInputDialog(null, "How many Iphones do you want ?:");
			IphonesTotal.setText(Iphones);
		}
	}

	private class CalculateButtonHandler2 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			int numIpads = Integer.parseInt(numIpadsTextArea.getText());
			int numIphones = Integer.parseInt(IphonesTotal.getText());
			double priceTotalIpads = numIpads * I_PADS;
			double priceTotalIphones = numIphones * I_PHONE;
			if (UpgradePro.isSelected()) {
				priceTotalIpads += numIpads * 220;
			}
			if (Upgrade256.isSelected()) {
				priceTotalIphones += numIphones * 150;
			}
			double priceTotal = priceTotalIpads + priceTotalIphones;
			JOptionPane.showMessageDialog(caculate, "Thomas Apple Store \r\n" + "Ipads: " + priceTotalIpads
					+ "\r\n Iphones: " + priceTotalIphones + "  \r\n  \r\n Total:" + priceTotal);

		}

	}
}
