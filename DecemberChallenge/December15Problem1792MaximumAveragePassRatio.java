package DecemberChallenge;

import java.util.PriorityQueue;

/*
 * 1792. [Medium] Maximum Average Pass Ratio
 */
public class December15Problem1792MaximumAveragePassRatio {
    public static void main(String[] args) {
        int[][] classes = {{1,2},{3,5},{2,2}};
        int extraStudents = 2;
        System.out.println(maxAverageRatio(classes, extraStudents));
    }
     public static double maxAverageRatio(int[][] classes, int extraStudents) {
          PriorityQueue<double[]> maxHeap = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));
        double sum = 0.0;

        // Initialize the heap with gains and add the initial ratios to sum
        for (int[] cls : classes) {
            int pass = cls[0], total = cls[1];
            double currentRatio = (double) pass / total;
            double gain = ((double) (pass + 1) / (total + 1)) - currentRatio;
            sum += currentRatio;
            maxHeap.offer(new double[]{gain, pass, total});
        }

        // Distribute extra students to maximize the average ratio
        for (int i = 0; i < extraStudents; i++) {
            double[] top = maxHeap.poll();
            double gain = top[0];
            int pass = (int) top[1];
            int total = (int) top[2];

            // Update the sum by removing the old ratio and adding the new one
            sum -= (double) pass / total;
            pass++;
            total++;
            sum += (double) pass / total;

            // Recalculate the gain and push back into the heap
            double newGain = ((double) (pass + 1) / (total + 1)) - ((double) pass / total);
            maxHeap.offer(new double[]{newGain, pass, total});
        }

        // Return the final average
        return sum / classes.length;
    }
}
