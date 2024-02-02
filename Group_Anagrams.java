package Java;

import java.util.*;

public class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a hashmap to store the groups of anagrams
        Map<String, List<String>> map = new HashMap<>();

        // Iterate through each word in the array
        for (String word : strs) {
            // Sort the characters of the word to use as a key
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // If the sorted word is not in the map, create a new list
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            // Add the word to the list corresponding to its sorted version
            map.get(sortedWord).add(word);
        }

        // Return the values (lists of anagrams) from the hashmap
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        Group_Anagrams solution = new Group_Anagrams();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(input);
        System.out.println(result);
    }
}
