//주민등록번호의 7번째 자리 값으로 성별을 구분하는 프로그램.
//주번의 7번째 숫자가 1 혹은 3이면 "남자"라고 출력
//주번의 7번째 숫자가 2 혹은 4이면 "여자"라고 출력
//Scanner를 사용해서 주번의 7번쨰 자리를 입력받아 문제를 해결.

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r_number;
        String s="";

        System.out.print("주민등록번호 7번째 자리를 입력하세요 : ");
        r_number = sc.nextInt();


        while (r_number != 1 && r_number != 2 && r_number != 3 && r_number != 4) {
            System.out.print("잘못 입력되어 있습니다. 다시 입력하세요 : ");
            r_number = sc.nextInt();
            switch (r_number) {
                case 1, 3:
                    s = "남자";
                    break;
                case 2, 4:
                    s = "여자";
                    break;
            }
        }
        System.out.println(s);
    }
}

