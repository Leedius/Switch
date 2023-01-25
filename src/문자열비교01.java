public class 문자열비교01 {
    public static void main(String[] args) {
        // ==

        boolean test1=1==1;
        System.out.println(test1);

        //"java" == "java" //오류는 나지않지만 잘못된 결과 값이 나온다.
        //==같다라는 의미지만 숫자만 비교 가능.
        //문자열이 같은지 비교하기 위해서는 다른 문법 사용
        //문법 : 비교할문자.equals(비교될문자)
        boolean test2="java".equals("java");
        System.out.println(test2);


    }
}
