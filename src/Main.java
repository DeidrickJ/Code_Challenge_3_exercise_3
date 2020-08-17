public class Main {

    public static void main(String[] args) {
        double [] array = {1.0, 2.0, 3.0, 2.0, 2.0};
        double sumOfNums = 0;

        for (int i =0; i < array.length; i++) {

            sumOfNums = array[i] + sumOfNums;


        }

        double mean = sumOfNums/array.length;
        System.out.println(mean);
    }
}
