package p2;
import p2.p1.*;
public class OtherPackage {
    OtherPackage() {
        Protection p = new Protection();
        System.out.println("other package constructor");
        
        // Class or package only
        // System.out.println("n= " + p1.n);

        // class only
        // System.out.println("n_pri ="+ n_pri);

        // class, subclass or package only
        // System.out.println("n_pro ="+ p.n_pro);
        
        System.out.println("n_pub = "+ p.n_pub);
    }
}
