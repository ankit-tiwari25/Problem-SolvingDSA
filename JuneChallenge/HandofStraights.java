package JuneChallenge;
// 846. [Medium] Hand of Straights
//6 June 2024  -- TLE
// TODO :  Revisit Required

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HandofStraights {
    public static void main(String[] args) {
        int[] hands = {1,2,3,6,2,3,4,7,8};
        int groupSize = 3;
        System.out.println(isNStraightHand(hands, groupSize));
    }   

    // public static boolean checkHands(int[] hands, int gs){

    //     int n = hands.length;
    //     int ans[] =  new int[n];
    //     if(n % gs != 0){
    //         return false;
    //     }
    //     int min = Integer.MAX_VALUE;
    //     int max = Integer.MIN_VALUE;

    //     for(int i : hands){
    //         if(i > max){
    //             max = i;
    //         }
    //         if(i < min){
    //             min = i;
    //         }
    //     }

    //     Map<Integer, Integer> map = new HashMap<>();

    //     for(int i : hands){
    //         if(map.containsKey(i)){
    //             map.put(i, map.get(i) + 1);
    //         }else{
    //             map.put(i, 1);
    //         }
    //     }

    //     int i = 0, nextEle = min;
    //     while(i < n){
    //         int k = gs;
    //         while(k > 0){
    //             if(map.containsKey(nextEle)){
    //                 map.put(nextEle, map.get(nextEle) - 1);
    //                 ans[i] = nextEle;
    //                 i++;
    //             }else{
    //                 return false;
    //             }
    //             nextEle = nextEle + 1;
    //             k--;
    //         }

    //         nextEle = getNextElement(map, min, max);
    //         // All array elements are over
    //         if(nextEle == -1){
    //             return true;
    //         }
    //         min = nextEle;
    //         i++;
    //     }
    //     display(ans);
    //     return true;
    // }

    // // public static int getNextElement(Map<Integer, Integer> map, int min, int max){

    //     if(map.get(min) > 0){
    //         map.put(min, map.get(min) - 1);
    //         return min;
    //     }else{
    //         int k =min + 1;
    //         while(k < max){
    //             if(map.get(k) > 0){
    //                 map.put(k, map.get(k) - 1);
    //                 return k;
    //             }
    //         }
    //     }
    //     return -1;
    // }


     public  static boolean isNStraightHand(int[] hand, int groupSize) {
     int n = hand.length;
        if (n % groupSize != 0)
            return false;
        Arrays.sort(hand);
        int i = 0;
        for (; i < n; i++) {
            if (hand[i] >= 0) {
                if (!findsucessors(hand, groupSize, i, n))
                    return false;
            }
        }
        return true;   
    }
     public  static boolean findsucessors(int[] hand, int groupSize, int i, int n) {
        int f = hand[i] + 1;
        hand[i] = -1;
        int count = 1;
        i += 1;
        while (i < n && count < groupSize) {
            if (hand[i] == f) {
                f = hand[i] + 1;
                hand[i] = -1;
                count++;
            }
            i++;
        }
        if (count != groupSize)
            return false;
        else
            return true;
    }
   
}
