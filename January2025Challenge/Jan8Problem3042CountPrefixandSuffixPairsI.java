package January2025Challenge;

/* 3042. [Easy] Count Prefix and Suffix Pairs I */
public class Jan8Problem3042CountPrefixandSuffixPairsI {
    public static void main(String[] args) {
        
    }
    public static int countPrefixSuffixPairs(String[] words) {
        int n = words.length, count = 0;
      for (int i = 0; i < n; ++i) {
          for (int j = i + 1; j < n; ++j) {
              if (isPrefixAndSuffix(words[i], words[j])) {
                  count++;
              }
          }
      }
      return count;
  }

}
