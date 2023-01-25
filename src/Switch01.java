import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num;

        System.out.print("num을 입력해주세요 : ");
        num=sc.nextInt();

        switch (num){
            case 1 :
                System.out.println(1);
                break;
            case 2 :
                System.out.println(2);
                break;
            case 3 :
                System.out.println(3);
                //마지막에는 break문을 적지않는 것이 좋다.
        }
        //if문과 구조가 같다. 그러나 ()안에 특정한 변수가 들어가야한다.
        //switch문의 ()안에 변수가 일치하는 case부터 코드를 해석.
        //break 문이 실행되면 다음 코드를 진행하지 않는다.
    }
}
