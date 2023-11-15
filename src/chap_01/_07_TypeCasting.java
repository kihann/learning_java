package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형 <-> 실수형

        int score = 93;
        System.out.println(score); // 93
        System.out.println((float)score); // 93.0
        System.out.println((double)score); // 93.0
        System.out.println((long)score);

        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f);
        System.out.println((int)score_d);

        score = 93 + (int)98.8;
        System.out.println(score);

        // 정수 + 실수 연산
        score_d = 93 + 98.8; // double로 선언된 변수에 정수(93)를 업데이트하여도 double로 업데이트 됨
        System.out.println(score_d);

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score;
        System.out.println(convertedScoreDouble); // 191 -> 191.0
        // int -> long -> float -> double (자동 형변환)

        int convertedScoreInt = (int)score_d;
        System.out.println(convertedScoreInt); //191.8 -> 191
        // double -> float -> long -> int (수동 형변환)

        // 숫자 -> 문자열
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1); // 93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열 -> 숫자
        int i = Integer.parseInt("93");
        System.out.println(i);

        double d = Double.parseDouble("98.8");
        System.out.println(d);

        // int error = Integer.parseInt("Java");
    }
}
