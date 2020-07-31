package _04_popcorn;

import javax.swing.JOptionPane;

public class popcornMaker {
	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("What flavor is the popcorn");
		String a = JOptionPane.showInputDialog("How long to heat");
		Popcorn corn = new Popcorn(x);
		corn.applyHeat();
		
		
	}
}
