import java.util.Scanner;
public class MaxEx01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.println("a의 값: "); int a = in.nextInt();
        System.out.println("b의 값: "); int b = in.nextInt();
        System.out.println("c의 값: "); int c = in.nextInt();

        int max = a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;
        System.out.println("최댓값: " + max);
    }
}
