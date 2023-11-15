package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 덧셈, 6
        System.out.println(4 - 2); // 뺄셈, 2
        System.out.println(4 * 2); // 곱셉, 8
        System.out.println(4 / 2); // 나눗셈, 2
        System.out.println(5 / 2); // 나눗셈(소수점 버림), 2
        System.out.println(2 / 4); // 나눗셈(소수점 버림), 0
        System.out.println(4 % 2); // 나머지, 0
        System.out.println(5 % 2); // 나머지, 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 곱셈 우선 -> 6
        System.out.println((2 + 2) * 2); // 괄호 우선 -> 8
        System.out.println(2 + (2 * 2)); // 괄호 우선 -> 8

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;
        
        c = a + b; // c = 30
        System.out.println(c);

        c = a - b; // c = 10
        System.out.println(c);

        c = a * b; // c = 200
        System.out.println(c);

        c = a / b; // c = 2
        System.out.println(c);

        c = a % b; // c = 0
        System.out.println(c);

        // 증감 연산 ++, --
        int val;
        val = 10;

        System.out.println(val); // val = 10
        System.out.println(++ val); // val + 1 = 11
        System.out.println(val ++); // val을 출력한 이후, + 1
        System.out.println(val); // val = 12
        System.out.println(--val); // val - 1 = 11
        System.out.println(val--); // val을 출력한 이후, - 1
        System.out.println(val); // val = 10

        // 대기 번호 표 뽑기
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting ++); // 대기 인원 : 0
        System.out.println("대기 인원 : " + waiting ++); // 대기 인원 : 1
        System.out.println("대기 인원 : " + waiting ++); // 대기 인원 : 2
        System.out.println("총 접수 인원 : " + waiting);
    }
}
