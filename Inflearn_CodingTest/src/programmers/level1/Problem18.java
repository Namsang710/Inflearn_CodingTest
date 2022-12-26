package programmers.level1;

// 신규 아이디 추천
public class Problem18 {

    public String solution(String new_id) {
        String answer = "";

        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-z\\-_.0-9]*", "");
        new_id = new_id.replaceAll("\\.{2,}", ".");
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        if(new_id.isEmpty())
            new_id += "a";
        if(new_id.length() >= 16){
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("[.]$", "");
        }
        if(new_id.length() <= 2){
            int cnt = 3 - new_id.length();
            char ch = new_id.charAt(new_id.length()-1);
            for(int i=0; i<cnt; i++){
                new_id += ch;
            }
        }
        answer = new_id;
        return answer;
    }

}
