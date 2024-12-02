package DecemberChallenge;

/*
 * 1455. [Easy] Check If a Word Occurs As a Prefix of Any Word in a Sentence 
 */
public class December2Problem1455CheckIfAWordOccursAsAPrefixofAnyWordInASentence {
   public static void main(String[] args) {
    String sentence = "hellohello hellohellohello";
    String searchWord = "ell";
    System.out.println(isPrefixOfWord(sentence, searchWord));
   }
   public static int isPrefixOfWord(String sentence, String searchWord) {
    String[] words = sentence.split(" ");

    // System.out.println("Words");

    for(String s : words){
        // System.out.print(s + " ");
    }
    int i = 1;
    for(String word : words){
        if(word.startsWith(searchWord)){
            return i;
        }
        i++;
    }
    return -1;
} 
}
