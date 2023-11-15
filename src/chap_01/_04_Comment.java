package chap_01;

public class _04_Comment {
    public static void main(String[] args) {
        System.out.println("(10분 전) 잠시 후 결혼식 시작 예정이오니 착석 부탁드립니다.");
        //System.out.println("(5분 전) 잠시 후 결혼식 시작 예정이오니 착석 부탁드립니다.");
        System.out.println("지금부터 결혼식을 시작하겠습니다.");

        int size = 240;
        size = size + 10; // 어린이는 금방 크기 때문에 사이즈를 10 더 큰 신발을 구매
        System.out.println("신발사이즈 " + size + "으로 보여주세요.");

        // 여러 줄 주석
        /*
        int a = 10;
        int b = 20;
        System.out.println(a + b); // 30
        */

        // 한 줄 주석 단축키 : cmd + /
        // 여러 줄 주석 단축키 : opt + shft + A
    }
}
