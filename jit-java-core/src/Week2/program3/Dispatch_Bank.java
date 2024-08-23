class Bank{  
	float getRateOfInterest(){
		return 6.0f;
	}  
}  
class SBI extends Bank{  
	float getRateOfInterest(){
		return 8.4f;
	}  
}  
class ICICI extends Bank{  
	float getRateOfInterest(){
		return 7.3f;
	}  
}  
class AXIS extends Bank{  
	float getRateOfInterest(){
		return 9.7f;
	}  
}  
public class Dispatch_Bank{  
	public static void main(String args[]){  
		Bank a=new Bank(); 
		Bank b;
		System.out.println("Rate of Interest: "+a.getRateOfInterest()); 
		SBI s1=new SBI();
		b=s1; 
		//b=new SBI();  
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
		b=new ICICI();  
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
		b=new AXIS();  
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
	}  
}  