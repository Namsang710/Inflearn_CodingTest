package programmers.level1;

// 핸드폰 번호 가리기
public class Problem33 {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<phone_number.length()-4; i++){
            sb.append("*");
        }
        String str = phone_number.substring(phone_number.length()-4);
        sb.append(str);


        return sb.toString();
    }
}
