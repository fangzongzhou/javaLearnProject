package digitCounts;

public class DigitCountSolution {

    public int digitCounts(int k, int n) {
        int result = 0;
        int base = 1; //位, 个位/十位/百位
        if (k == 0 && n == 0) {
            return 1;
        }

        while (n / base > 0) {
            int cur = (n / base) % 10;
            int low = n - (n/base) * base;
            int hight = n / (base * 10);

            if (k == 0 && cur > k){
                if (hight != 0) {
                    result += hight + 1;
                } else {
                    result += hight;
                }
            } else if (cur == k){
                result += hight * base + low + 1;
            } else if (cur < k ){
                result += hight * base;
            } else {
                result += (hight + 1) * base;
            }

            base *= 10;

        }

        return result;

    }
}
