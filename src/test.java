import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        solution s = new solution();
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toString();
        String[] arr = str.split(",");
        s.nums = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            s.nums[i] = Integer.parseInt(arr[i]);
        }
        s.target = sc.nextInt();
        s.printRet();
        //new edit
    }
}
