package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        // 버스 번호와 도착까지 남은 시간, 거리를 출력하는 프로그램
        // 버스 번호
        final String BUS1 = "1311B";

        // 남은 시간
        int minutes = 3;

        // 남은 거리
        float distance = 1.5F;

        // 출력
        System.out.println(BUS1 + " 버스" + "\n" + "약 " + minutes + "분 후 도착" + "\n" + "남은 거리 " + distance + "km");
    }
}
