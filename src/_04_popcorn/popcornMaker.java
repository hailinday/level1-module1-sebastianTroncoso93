package _04_popcorn;

import javax.swing.JOptionPane;

public class popcornMaker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor is the popcorn?");
		String minutes = JOptionPane.showInputDialog("How many minutes do you want to heat it?");
		int time = Integer.parseInt(minutes);
		Popcorn corn = new Popcorn(flavor);
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(corn);
		microwave.setTime(time);
		microwave.startMicrowave();
		corn.eat();
	}
}
