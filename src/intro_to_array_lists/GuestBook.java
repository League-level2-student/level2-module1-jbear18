package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names". done
	// When the add name button is clicked, display an input dialog that asks
	// the user to enter a name. Add done
	// that name to an ArrayList. When the "View Names" button is clicked,
	// display a message dialog that displays done
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Cornick
	// Guest #2: Sandy Mafong
	// Guest #3: Greg Yoo
	// Guest #4: Cassie Johnson
	ArrayList<String> names = new ArrayList<String>();

	String ans;
	String gn = "Guest";
	// other guests:
	//
	// maliya song
	JPanel panel = new JPanel();
	JButton view = new JButton("View Guestbook");
	JButton add = new JButton("Add Guest");

	public void makeButtons() {
		JFrame frame = new JFrame("The Guest Book");
		frame.setVisible(true);
		frame.setSize(800, 800);
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		frame.pack();
		;
		add.addActionListener(this);
		view.addActionListener(this);
		System.out.println("the fairmont grande league");

		names.add("bob cornick");
		names.add("kato johnson");
		names.add("cassie yoo");
		names.add(" janet mafong");
		names.add("maliya park");

	}

	public static void main(String[] args) {
		GuestBook c = new GuestBook();
		c.makeButtons();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == add) {
			ans = JOptionPane.showInputDialog(
					"Hello, and welcome to Mikes Samsung. We hope you enjoy your stay in an atmosphere full of black backgrounds, and other stuff. Breakfast will be included, which are the 60,000,000,001 cookies that he has been clicking for over a year. If any derps come attacking you, be sure you have mike's derp repellent in your bag, so you can spray it, and mike will be able to smell it and save your derpy life. Enjoy!!!");
			JOptionPane.showMessageDialog(null,
					"Please find your name in the guestbook, by simply pressing the 'view guestbook' button, so you can see your first and last name.");

			names.add(ans);
		}
		if (e.getSource() == view) {
			JOptionPane.showMessageDialog(null, "\n");

			// System.out.println("\n");

			// iterating through list with for-each loop
			String mikeforgotitwasntnoshavenovember = "";
			for (int i = 0; i < names.size(); i++) {
				String s = names.get(i);

			}
			System.out.println("\n");

			for (String s : names) {
				mikeforgotitwasntnoshavenovember += "Guest:  " + s + "\n";
			}
			JOptionPane.showMessageDialog(null, mikeforgotitwasntnoshavenovember);
			System.out.println("\n");

		}
	}

}
