/* 3445.[Hard] Maximum Difference Between Even and Odd Frequency II */
public class Jun11Problem3445MaximumDifferenceBetweenEvenandOddFrequencyII {
    public static void main(String[] args) {
        
    }
    /**
     * Helper function to calculate the 2-bit parity state.
     * Bit 1: parity of cnt_a. Bit 0: parity of cnt_b.
     */
    private int getStatus(int cnt_a, int cnt_b) {
        // (cnt_a & 1) is 1 if cnt_a is odd, 0 if even.
        // << 1 shifts it to the second bit position.
        // | (cnt_b & 1) puts the parity of cnt_b in the first bit position.
        return ((cnt_a & 1) << 1) | (cnt_b & 1);
    }
}
