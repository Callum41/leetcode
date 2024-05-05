import java.lang.Math;
class Solution {
    public int reverse(int x) {
        if ((x < Math.pow(-2, 31)) || x > (Math.pow(2, 31) - 1)) {
            return 0;
        } else {
            String num = String.valueOf(x);
            String solucion = "";
            char[] arr = num.toCharArray();
            if (arr[0] == '-'){
                solucion = solucion + arr[0];
                for (int i = arr.length - 1; i > 0; i--) {
                solucion = solucion + arr[i];
                }
            }else {
                for (int i = arr.length - 1; i >= 0; i--) {
                solucion = solucion + arr[i];
            }
            }
            if ((Long.parseLong(solucion) < Math.pow(-2, 31)) || Long.parseLong(solucion) > (Math.pow(2, 31) - 1)) {
            return 0;
            }else {   return Integer.parseInt(solucion);}
        }

    }
}
