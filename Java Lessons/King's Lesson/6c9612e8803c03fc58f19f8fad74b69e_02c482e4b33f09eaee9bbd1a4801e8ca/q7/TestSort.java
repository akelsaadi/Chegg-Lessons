package q7;

public class TestSort {

    public static void main(String[] args) {

        InsertionSort is = new InsertionSort();
        BubbleSort bs = new BubbleSort();

        System.out.println("Time Evaluation");

        int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 1};

        long startTime = System.nanoTime();
        is.sort(input);
        long totalTime = System.nanoTime() - startTime;
        System.out.println("Time taken by Insertion Sort: " + totalTime / 1000 + " microsecond");

        startTime = System.nanoTime();
        bs.sort(input);
        totalTime = System.nanoTime() - startTime;
        System.out.println("Time taken by Bubble Sort: " + totalTime / 1000 + " microsecond");
    }
}
