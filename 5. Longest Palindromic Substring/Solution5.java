import java.util.Arrays;
/*La concatenación de strings dentro de un bucle (actual = actual + s.charAt(j);) es una operación costosa en términos de tiempo y espacio, ya que crea un nuevo objeto String en cada iteración. Para mejorar la eficiencia, especialmente para cadenas largas, considera usar StringBuilder:*/
class Solution {
    public String longestPalindrome(String s){
        int i = 0;
        String longest = "";
        while (i < s.length()){
            StringBuilder actual = new StringBuilder();
            for (int j = i; j < s.length(); j++){
                actual.append(s.charAt(j));
                if (isSymmetric(actual.toString().toCharArray())){
                    if (actual.length() > longest.length()){
                        longest = actual.toString();
                    }
                }
            }
            i++;
        }
        return longest;
    }
    public static boolean isSymmetric(char[] str){
        if (str.length > 2){
            if (str[0] == str[str.length - 1]){
                return isSymmetric(Arrays.copyOfRange(str, 1, str.length -1));
            }
            else return false;
        }
        else if (str.length == 2){
            if (str[0] == str[str.length - 1]){
                return true;
            }
        }
        else if (str.length == 1 || str.length == 0){
            return true;
        }
        return false;
    }
}