package Week8;
import java.util.*;

public class ArrayL {
    ArrayList<String> list; // Creating arraylist 
    ArrayL(){
    	list = new ArrayList<String>();
    }
    public void arraydisplay()
    {
        list.add("CSE");// Adding object in arraylist
        list.add("ISE");
        list.add("ME");
        System.out.println("ArrayList element are");
        System.out.println(list);
        System.out.println("");
    }

    public void appendatend() {
        System.out.println("Enter the element to append at end");
        Scanner scob1 = new Scanner(System.in);
        String ele = scob1.next();
        list.add(ele);
        System.out.println(list);
        System.out.println("");
    }

    public void insertatpos() {
        System.out.println("Enter the position and element to insert");
        Scanner scob1 = new Scanner(System.in);
        int posind = scob1.nextInt();
        String ele = scob1.next();
        list.add(posind, ele);
        System.out.println(list);
        System.out.println("");
    }

    public void searchele() {
        System.out.println("Enter the Array element to search");
        Scanner scobj = new Scanner(System.in);
        String arele = scobj.next();
        int in = list.indexOf(arele);
        if (in == -1) {
            System.out.println("Element not found");
        }

        else {
            System.out.println("Element found at " + in);
        }
    }

    void print() {

        Scanner nip = new Scanner(System.in);
        System.out.println("Enter the starting charecter to print strings");
        char inputc = nip.next().charAt(0);
        String strc = Character.toString(inputc);
        System.out.println("String starting with character " + strc);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).startsWith(strc)) {
                System.out.println(list.get(i));
            }
        }
    }

    public static void main(String args[]) {
        ArrayL obj = new ArrayL();
        obj.arraydisplay();
        obj.appendatend();
        obj.insertatpos();
        obj.searchele();
        obj.print();
    }
}
