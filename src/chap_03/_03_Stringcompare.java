package chap_03;

public class _03_Stringcompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("s2")); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equals("python"));

        // 대소문자 구분 없이 문자열 내용이 같은지 여부 체크
        System.out.println(s2.equalsIgnoreCase("python"));

        // 자바에서 문자열의 내용을 비교하고 싶을때는 equals를 사용해야한다. !!기억하기!!
        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        // equals()는 s1.내용과 (s2)내용이 같으면 true, 다르면 false다.
        System.out.println(s1.equals(s2)); // true (내용을 비교)
        System.out.println(s1 == s2); // true (참조하는 곳 비교

        s1 = new String("1234");
        //    👆👇 각각 다름. s1과 s2는 참조하는 곳이 다르다.
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false // 다른곳을 참조하고 있기때문에 false



    }
}
