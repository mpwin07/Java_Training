// 843 – Guess the Word
// You are given a list of 6-letter words. One word is secret.
// You can call master.guess(word) which returns the number of matching characters in correct positions.
// Find the secret word within 10 guesses.

class Solution {
    public void findSecretWord(String[] wordlist, Master master) {

        List<String> candidates = new ArrayList<>(Arrays.asList(wordlist));

        for (int i = 0; i < 10; i++) {

            String guess = candidates.get(0);

            int matches = master.guess(guess);

            if (matches == 6) return;

            List<String> next = new ArrayList<>();

            for (String w : candidates) {
                if (matchCount(guess, w) == matches) {
                    next.add(w);
                }
            }

            candidates = next;
        }
    }

    private int matchCount(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) count++;
        }
        return count;
    }
}