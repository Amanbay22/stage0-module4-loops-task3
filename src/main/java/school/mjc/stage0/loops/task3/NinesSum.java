package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        int x = 0;
        int sum = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            x = x + (int) Math.pow(10, i) * 9;
            sum +=x;
        }

        System.out.println(sum);
    }
}
