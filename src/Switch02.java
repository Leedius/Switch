import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name;

        System.out.print("name을 입력해주세요 : ");
        name=sc.next();

        switch (name){
            case "남자":
                System.out.println("남자");
                break;
            case "여자":
                System.out.println("여자");
                break;
            default :
                System.out.println("잘못된 데이터");
                //default는 else와 비슷한 기능
        }

    }
}
