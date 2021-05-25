package JavaStudy;
import java.util.Scanner;
public class CompareEx {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("첫 번째 숫자를 입력해주세요: ");
    int a = in.nextInt();
    System.out.println("두 번째 숫자를 입력해주세요");
    int b = in.nextInt();

    if(a > b){
        System.out.println(">");
    } else if(a < b){
        System.out.println("<");
    } else{
        System.out.println("==");
    }
}
}