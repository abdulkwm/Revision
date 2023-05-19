package day1;

public class split_alphabet {
    public int solution(String S) {
        int[] lastSeen = new int[26];
        int start = 0, end = 0, count = 0;
        for (int i = 0; i < S.length(); i++){
            int index = S.charAt(i) - 'a';
            end = Math.max(end, lastSeen[index]);
            if (end == i) {
                count++;
                start = i + 1;
            }
            lastSeen[index] = i + 1;
        }
        return count;
    }
    public static void main(String[] args) {
        split_alphabet solution = new split_alphabet();

        System.out.println(solution.solution("djfkshahfiosja"));
    }
}
