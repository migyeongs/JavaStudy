package Java;

import java.util.Scanner;

public class Helloworld {
    public static void main(String[] args) {
    // hello world 출력
    System.out.println("Hello world");

    //A + B 입력받아 출력
    Scanner in = new Scanner(System.in);
    System.out.println("10 이하의 정수를 입력해주세요: ");
    int a = in.nextInt();
    System.out.println("10 이하의 정수를 입력해주세요: ");
    int b = in.nextInt();
    System.out.println("더하기: " + (a + b));
    System.out.println("빼기: " + (a - b));
    System.out.println("곱하기: " + (a * b));
    System.out.println("나누기: " + (a / b));
    System.out.println("나머지: " + (a % b));


    //A,B,C 입력받아 나머지 비교
//첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다
    

    System.out.println("첫번째 숫자를 입력해주세요: ");
    int num1 = in.nextInt();
    System.out.println("두번째 숫자를 입력해주세요: ");
    int num2 = in.nextInt();
    System.out.println("세번째 숫자를 입력해주세요: ");
    int num3 = in.nextInt();
    if(num1 == 0 || num2 == 0 ||num3 == 0){
        System.out.println("0이 아닌 숫자를 입력해주세요!");
    } else{
    System.out.println("(num1+num2)%num3 = " + ((num1+num2)%num3));
    System.out.println("((num1%num3) + (num2%num3))%num3 = " + (((num1%num3) + (num2%num3))%num3));
    System.out.println("((num1%num3) × (num2%num3))%num3 = " + ((( num1 % num3 ) * (num2%num3))%num3));
    }


}
}
