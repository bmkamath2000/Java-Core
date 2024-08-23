package Week2.program3;
class Bank{  
	float getRateOfInterest(){
		return 6.0f;
	}  
}  
class SBI extends Bank{  
	float getRateOfInterest(){
		return 8.0f;
	}
}  
class ICICI extends Bank{  
	float getRateOfInterest(){
		return 7.0f;
	}  
}  
class AXIS extends Bank{  
	float getRateOfInterest(){
		return 9.0f;
	}  
}  
public class Overriding_Bank{  
	public static void main(String args[]){  
		SBI s=new SBI();  
		ICICI i=new ICICI();  
		AXIS a=new AXIS();  
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
	}  
}  