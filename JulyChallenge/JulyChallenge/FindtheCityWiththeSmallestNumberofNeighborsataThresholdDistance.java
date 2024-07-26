package JulyChallenge;
// 1334. [Medium] Find the City With the Smallest Number of Neighbors at a Threshold Distance
public class FindtheCityWiththeSmallestNumberofNeighborsataThresholdDistance {
    public static void main(String[] args) {
        int n = 4;
        int[][] edges = {{0,1,3},{1,2,1},{1,3,4},{2,3,1}};
        int distanceThreshold = 4;

        System.out.println(findTheCity(n, edges, distanceThreshold));
    }
    public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
        // 1. **Distance Matrix Construction:**

        // Store pairwise distances between cities (initially set to a large value)
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = (int) (1e9); // Represents no direct connection
            }
        }

        // Fill in direct edge distances from the input array
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];
            ans[from][to] = weight; // Distance along direct edge
            ans[to][from] = weight; // Bidirectional connections
        }

        // Set diagonal elements to 0 (distance from a city to itself)
        for (int i = 0; i < n; i++) {
            ans[i][i] = 0;
        }

        // 2. **Floyd-Warshall Algorithm:**

        // Iterate through all possible intermediate cities
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // Skip if either path is unknown
                    if (ans[i][k] == (int) (1e9) || ans[k][j] == (int) (1e9)) {
                        continue;
                    }

                    // Update distance if going through 'k' offers a shorter path
                    ans[i][j] = Math.min(ans[i][j], ans[i][k] + ans[k][j]);
                }
            }
        }

        // 3. **Finding the Optimal City:**

        // Track the city with the least reachable cities and its index
        int minReachableCities = n;
        int optimalCity = -1;

        for (int city = 0; city < n; city++) {
            // Count reachable cities within the distance threshold
            int reachableCities = 0;
            for (int adjCity = 0; adjCity < n; adjCity++) {
                if (ans[city][adjCity] <= distanceThreshold) {
                    reachableCities++;
                }
            }

            // Update optimal city based on reachability and city number
            if (reachableCities <= minReachableCities) {
                if (reachableCities < minReachableCities || city > optimalCity) {
                    minReachableCities = reachableCities;
                    optimalCity = city;
                }
            }
        }

        // 4. **Return the Result:**

        return optimalCity; // Index of the city with the fewest reachable neighbors
    }
}
