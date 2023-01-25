//점수에 대한 등급을 출력하는 프로그램을 완성해보자.
//90<=점수<=100 -> A
//80<=점수<90 -> B
//70<=점수<80 -> C
//점수<70 -> D

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int score;
        String grade;

        System.out.print("점수를 입력하세요 : ");
        score=sc.nextInt();

        switch (score/10){
            case 10, 9:
                grade="A";
                break;
            case 8 :
                grade="B";
                break;
            case 7 :
                grade="C";
                break;
            default :
                grade="D";
        }
        System.out.println(grade);
    }

}
