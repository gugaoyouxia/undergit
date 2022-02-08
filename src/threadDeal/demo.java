package threadDeal;

public class demo {

    public static void main(String[] args) {

        threadDeal td1 = new threadDeal(1);
        threadDeal td2 = new threadDeal(2);
        td1.start();
        td2.start();


    }


}
