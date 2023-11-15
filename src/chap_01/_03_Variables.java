package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "이기한";
        int hour = 15;

        System.out.println(name + "님, 배송이 올거에요, " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        Character grade = 'A'; // 하나의 문자
        name = "손호평"; // 변수 업데이트

        System.out.println(name + "님의 평균 점수는 " + score + "점 입니다.");
        System.out.println(name + "님의 학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.141591123123123;
        float f = 3.14159112321312312F; // float은 소수점 6 번째 자리까지, 더 긴 수는 double로
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L; // int 값의 범위는 약 +- 2,100,000,000
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
