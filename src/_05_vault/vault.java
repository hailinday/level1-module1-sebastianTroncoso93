package _05_vault;

public class vault {
	
	vault(int value){
		secretNumber = value;
	}

//	int secretNumber = 1234;
//	
//	// tyCode method
//	boolean tryCode(int value) {
//		
//		if( value == secretNumber) {
//			return true;
//		} else {
//			return false;
//		}
//		
//	}
	
	
	public static void main(String[] args) {
		vault v = new vault(10);
		System.out.print(v.tryCode(5));
		jamesBond james = new jamesBond();
		System.out.print(james.findCode(v));
		
		
	}
	int secretNumber;
	boolean tryCode(int value) {
		
		if( value == secretNumber) {
			return true;
		} else {
			return false;
		}
		
	}

}
