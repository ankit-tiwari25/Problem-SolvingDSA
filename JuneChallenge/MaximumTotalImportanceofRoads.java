package JuneChallenge;

import java.util.Arrays;
import java.util.Comparator;

// 2285. Maximum Total Importance of Roads
// 28 June 2024
// Graph
//Revisit Required
public class MaximumTotalImportanceofRoads {
    public static void main(String[] args) {
        int[][] roads= { {0,1},
                         {1,2},
                         {2,3},
                         {0,2},
                         {1,3},
                         {2,4}};
        int n = 5;
        System.out.println(maximumImportance(n, roads));
    }
    public static long maximumImportance(int n, int[][] roads) {
           int[] degree = new int[n];
        
        // Calculate the degree of each city
        for (int[] road : roads) {
            degree[road[0]]++;
            degree[road[1]]++;
        }
        
        // Create a list of cities and sort by degree
        Integer[] cities = new Integer[n];
        for (int i = 0; i < n; i++) {
            cities[i] = i;
        }
        Arrays.sort(cities, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return Integer.compare(degree[b], degree[a]);
            }
        });
        
        // Assign values to cities starting from the highest degree
        long totalImportance = 0;
        for (int i = 0; i < n; i++) {
            totalImportance += (long) (n - i) * degree[cities[i]];
        }
        
        return totalImportance;
    }
}
