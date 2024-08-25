class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();

        int wordLen = words[0].length(); // length of each word
        int numWords = words.length;
        int totalLen = wordLen * numWords;

        if (s.length() < totalLen) return ans; // early exit if string is too short

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Iterate through the string
        for (int i = 0; i < wordLen; i++) { // start at different offsets within the word length
            int left = i;
            int right = i;
            int count = 0;
            Map<String, Integer> window = new HashMap<>();

            while (right + wordLen <= s.length()) {
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                if (wordCount.containsKey(word)) {
                    window.put(word, window.getOrDefault(word, 0) + 1);
                    count++;

                    // Slide the window
                    while (window.get(word) > wordCount.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        left += wordLen;
                        window.put(leftWord, window.get(leftWord) - 1);
                        count--;
                    }

                    // Check if all words match
                    if (count == numWords) {
                        ans.add(left);
                    }
                } else {
                    // Reset the window if word is not in the map
                    window.clear();
                    count = 0;
                    left = right;
                }
            }
        }

        return ans;
    }
}
