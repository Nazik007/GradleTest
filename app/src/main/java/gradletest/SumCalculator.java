package gradletest;

public class SumCalculator {

    public int sum(int number) {
        int sum = 0;

        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        if (sum != 0) {
            return sum;
        }else {
            throw new IllegalArgumentException("Using 0 in the app will only result in having 0 outcome. Use another data");
        }
    }
}
