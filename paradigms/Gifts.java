package paradigms;

	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	public class Gifts {//Event driven programming
		public static void main(String[] args) {
			Gifts gift = new Gifts();
		}
		JFrame frame = new JFrame("Gifts");
		JLabel label = new JLabel("choose a random gift from these 3 options");
		JPanel panel = new JPanel();

		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");

		public Gifts() { // constructor
			frame.setSize(300, 150);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);

			frame.setLayout(new BorderLayout());
			frame.add(panel);
			panel.setBackground(Color.LIGHT_GRAY);
			panel.add(label);
			panel.add(b1);
			panel.add(b2);
			panel.add(b3);
			//////////////////////////////////actions
			b1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Candy cane!");
				}
			});
			b2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "lego!!");
				}
			});
			b3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "shirt!");
				}
			});

		}
	}

