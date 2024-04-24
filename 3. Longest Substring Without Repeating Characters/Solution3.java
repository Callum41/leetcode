import javax.management.StringValueExp;

class Solution3 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(" "));
    }
    public static int lengthOfLongestSubstring(String s) {
        int actLen = 0;
        int maxLen = 0;
        String sub = "";
        int i  = 0;
        int j = 0;
        while (j < s.length() && i < s.length()){
            if (sub.contains(String.valueOf(s.charAt(i)))){
                sub = "";
                if (actLen >= maxLen){
                    maxLen = actLen;
                }
                actLen = 0;
                j++;
                i = j;
            }
            else {
                sub = sub.concat(String.valueOf(s.charAt(i)));
                i++;
                actLen++;
            }
            System.out.println(sub);
            if (actLen >= maxLen){
                maxLen = actLen;
            }
        }
        return maxLen;
    }
}