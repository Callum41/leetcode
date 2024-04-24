import java.util.HashMap;
import java.util.Map;

class EfficientSolution {
    private Map<Integer, Integer> memo = new HashMap<>();

    public int tribonacci(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result;
        switch (n) {
            case 0:
                result = 0;
                break;
            case 1:
            case 2:
                result = 1;
                break;
            default:
                result = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
                break;
        }

        memo.put(n, result);
        return result;
    }
}
