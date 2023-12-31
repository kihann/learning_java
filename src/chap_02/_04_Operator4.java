package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = false;
        boolean 달걀말이 = true;
        boolean 제육볶음 = true;
        
        // Or, And
        System.out.println(김치찌개 || 달걀말이 || 제육볶음); // 하나라도 true일 때, true 출력
        System.out.println(김치찌개 && 달걀말이 && 제육볶음); // 모두 true일 때, true 출력
        
        // And 연산
        System.out.println((5 > 3) && (3 > 1)); // true
        System.out.println((5 > 3) && (3 < 1)); // false

        // Or 연산
        System.out.println((5 > 3) || (3 > 1)); // true
        System.out.println((5 > 3) || (3 < 1)); // true
        System.out.println((5 < 3) || (3 < 1)); // false

        // 불가능
        //System.out.println(1 < 3 < 5);
        System.out.println((1 < 3) && (3 < 5));

        // 논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // true -> false
    }
}
