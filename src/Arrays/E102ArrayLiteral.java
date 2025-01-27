package Arrays;

public class E102ArrayLiteral {
    public static void main(String[] args) {
        int [] nums = new int[4];

        nums [0] = 17;
        nums [1] = 23;
        nums [2] = 5;
        nums [3] = 21;

        for (int num : nums){
            System.out.println(num);
        }
    }
}
