import java.util.Scanner;
public class MaxEx01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //세 정수값 입력받아 최댓값 구하기
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
