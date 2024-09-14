package Week4;

public class FactTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		float fact=1;
		int i=1;
		while(i<n) {
			fact = fact * i;
			System.out.println(" "+i+"!="+fact);
			i++;
		}
	}

}
