package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public class SimpleCollect {
	ArrayList<String> arl;
	Vector<Integer> v;
	HashMap<Integer,String> hmap;
	public SimpleCollect()
	{
		arl = new ArrayList();
		v= new Vector();
		hmap=new HashMap();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCollect sc=new SimpleCollect();
		sc.arl.add("Hello");
		sc.arl.add("How");
		sc.arl.add("Are");
		sc.arl.add("You");
		
		Iterator iter = sc.arl.iterator();
		while(iter.hasNext())
		{
			System.out.print(","+iter.next());
		}
		sc.hmap.put(0,"Hello");
		sc.hmap.put(1,"How");
		sc.hmap.put(2,"Are");
		
		sc.hmap.forEach((k,v)->System.out.println("Key:"+k+" Value:"+v));
		
		sc.v.add(1);
		sc.v.add(2);
		sc.v.add(3);
		
		Iterator it=sc.v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+" ");
		}
	}
	
	
}



