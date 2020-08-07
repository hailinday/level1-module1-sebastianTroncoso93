package _05_vault;

public class jamesBond {
	int findCode(vault v) {
		for (int i = 0; i < 1000000; i++) {
			boolean isCode = v.tryCode(i);
			if (isCode == true) {
				return i;
			} 
		}
		return -1;
	}
}
