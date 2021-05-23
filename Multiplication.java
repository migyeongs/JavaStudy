package Java;
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("곱할 세자리 수를 입력해주세요: ");
        int a = in.nextInt();
        System.out.println("곱할 세자리 수를 입력해주세요: ");
        int b = in.nextInt();
        //a * (b의 1의 자리수)
        System.out.println(a * ((b%100)%10));
        //a * (b의 10의 자리수)
        System.out.println(a * ((b%100/10)));
        //a * (b의 100의 자리수)
        System.out.println(a * (b/100%10));

    }
}
