class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < words.length) {
            int j = i;
            int lineLen = 0;

            while (j < words.length && lineLen + words[j].length() + (j - i) <= maxWidth) {
                lineLen += words[j].length();
                j++;
            }
            int wordsCount = j - i;
            int spacesNeeded = maxWidth - lineLen;
            StringBuilder line = new StringBuilder();
            if (j == words.length || wordsCount == 1) {
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) line.append(" ");
                }
                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            } else {
                int slots = wordsCount - 1;
                int baseSpace = spacesNeeded / slots;
                int extraSpace = spacesNeeded % slots;
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        int spaces = baseSpace + (extraSpace > 0 ? 1 : 0);
                        extraSpace--;
                        for (int s = 0; s < spaces; s++) line.append(" ");
                    }
                }
            }
            result.add(line.toString());
            i = j;
        }
        return result;
    }
}