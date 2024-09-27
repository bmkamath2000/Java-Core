package Week7;
import Week7.cc.*;
import Week7.dc.*;
import Week7.tc.*;

public class Main {
    public static void main(String args[]) {
        CurrencyC obj = new CurrencyC();
        DistanceC obj1 = new DistanceC();
        TimeC obj2 = new TimeC();
        obj.dollartorupee();
        obj.rupeetodollar();
        obj.eurotorupee();
        obj.rupeetoeuro();
        obj.yentoruppe();
        obj.ruppetoyen();
        obj1.mtokm();
        obj1.kmtom();
        obj1.milestokm();
        obj1.kmtomiles();
        obj2.hourstominutes();
        obj2.minutestohours();
        obj2.hourstoseconds();
        obj2.secondstohours();
    }
}
