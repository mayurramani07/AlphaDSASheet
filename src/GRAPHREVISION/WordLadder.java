package GRAPHREVISION;
import java.util.*;
public class WordLadder {
    public static int LadderLength(String beingWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        if(!dict.contains(endWord)){
            return 0;
        }
        Queue<String> queue = new LinkedList<>();
        queue.add(beingWord);

        int level = 1;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size; i++) {
                String word = queue.poll();
                for(int pos = 0 ; pos<word.length() ; pos++) {
                    char[] chars = word.toCharArray();

                    for(char ch='a'; ch<='z' ; ch++) {
                        chars[pos] = ch;
                        String newWord = new String(chars);

                        if (newWord.equals(endWord)) {
                            return level + 1;
                        }
                        if(dict.contains(newWord)) {
                            queue.add(newWord);
                            dict.remove(newWord);
                        }
                    }
                }
                level++;
            }
        }
        return 0;
    }
}
