package JulyChallenge;
// 1518. [Easy] Water Bottles
public class WaterBottles {
    public static void main(String[] args) {
        int numBottle = 9;
        int numExchange = 3;

        System.out.println(numWaterBottles(numBottle, numExchange));

    }
    public static int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles = numBottles;

        while (numBottles >= numExchange) {
            totalBottles += numBottles / numExchange;
            numBottles = (numBottles / numExchange) + (numBottles % numExchange);
        }

        return totalBottles;
    }
}
