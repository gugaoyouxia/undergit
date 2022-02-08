package threadDeal;

public class threadDeal extends Thread {
    int flag;
    Integer FLAG = 1;

    public threadDeal() {
    }

    public threadDeal(int a) {
        flag = a;
    }


    @Override
    public void run() {
        FLAG = flag;
        for (int i = 0; i < 99; i++) {
            System.out.println(i + "," + FLAG);
        }
    }
}
