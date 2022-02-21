package help;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        //输入时，'!' 表示 非 , '&' 表示 与 , '|' 表示 或 , '>' 表示 右箭头 , '-' 表示 双箭头
        //此版本还不支持不带括号的多次运算，如"p|q|r" 请改成输入为"(p|q)|r","!p&q"请改成"(!p)&q"等等
        //字符串请用英文输入法，且字符串中不能有空格
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a string : ");
        String s = scanner.next();
        Formula formula = new Formula();
        if(formula.isFormula(s)){
            System.out.println("true");
            Level level = new Level();
            System.out.println(level.levelOfFormula(s));
        }
        else System.out.println("false");
    }
}
