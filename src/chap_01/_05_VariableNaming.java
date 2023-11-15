package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 언더스코어, 문자, 숫자 사용 가능, 공백 사용 불가능
        // 3. 언더스코어 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단의 시작 글자는 대문자 (첫 단어 제외)
        // 6. 예약어 사용 불가능 (public, static, void, int, double 등)

        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "기한"; // 이름
        String lastName = "이"; // 성
        String dateOfBirth = "1994-10-04"; // 생년월일
        String residentialAddress = "호텔 캘리포니아"; // 체류지
        String purposeOfVisit = "관광"; // 입국목적
        String flightNo = "KE707"; // 항공 편명
        String _flightNo = "KE707"; // 언더스코어 시작
        String flight_no_2 = "KE708"; // 밑줄과 숫자 포함
        // Stirng -flightNo = "KE707" // 하이픈 시작 불가

        int accompany = 2; // 동반 가족 수
        int lengthOfStay = 5; // 체류 기간

        String item1 = "가방";
        String item2 = "지갑";
        // String 3item = "휴대폰"; // 숫자 시작 불가

        // 프로그래밍 흐름을 위해 사용되는 경우(=이름이 크게 중요하지 않을 때)
        int i = 0;
        String s = "";
        String str = "";

        // 상수 : 절대 변하지 않는 상수 -> 대문자로 작성
        final String CODE = "KR";
        // CODE = "US"; // 불가능
    }
}
