package Java;

import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {
        

        //전체 단 출력(가로)
        for(int i = 2; i < 10; i++){
            for(int j = 1; j < 10; j++){
                System.out.print(i + "*" + j + "=" + i*j +"\t");
                System.out.print("     ");
                
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 1; i < 10; i++){
            for(int j = 2; j < 10; j++){
                System.out.print(j + "*" + i + "=" + i*j +"\t");
                System.out.print("     ");
                
            }
            System.out.println();
        }

        System.out.println();

        //전체 단 출력(세로)
        for(int i = 2; i < 10; i++){
            for(int j = 1; j < 10; j++){
                System.out.println(i + "*" + j + "=" + i*j);
                
            }
            System.out.println();
        }






        // 단 입력받아 출력하기
        // Scanner in = new Scanner(System.in);
        // System.out.println("단을 입력하세요: ");
        // int dan = in.nextInt();
        // for(int i = 1; i < 10 ; i++){
        //     System.out.println(dan + "*" +  i  + " = " + (dan*i));
        // }


       
    }
}
