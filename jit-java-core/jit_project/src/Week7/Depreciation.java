package Week7;
import java.util.Scanner;

class Depreciation {
	Scanner scn ;
	int rate;
	int purchase_value;
	int current_salvage_value;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scn=  new Scanner(System.in);
		System.out.println("Enter the depreciation rate and purchase value");
		rate= scn.nextInt();
		purchase_value = scn.nextInt();
		System.out.println("Table of depreciation for 5 years");
		System.out.println("Purchase Value| year | Salvage Value");
		int year=1;
		for(;year<6;year++) {
			current_salvage_value = purchase_value - year*rate/100;
			System.out.println(purchase_value+"   "+year+"    "+current_salvage_value);
		}
	}

}
