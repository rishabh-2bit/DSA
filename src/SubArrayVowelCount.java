public class SubArrayVowelCount {

    public static void main(String[] args) throws Exception {
        System.out.println(maxVowels("weallloveyou", 7));
    }

    public static int maxVowels(String s, int k) {
        char[] chArray = s.toCharArray();
        int slen = s.length();
        int start = 0;
        int end = k;
        int window = 0;

        if (slen < k) {
            return 0;
        }

        for (int i = 0; i < k; i++) {
            if (isVowel(chArray[i])) {
                window++;
            }
        }
        int counter = window;

        while (end < slen) {
            if (isVowel(chArray[end]) && isVowel(chArray[start])) {
                end++;
                start++;
            } else if (isVowel(chArray[end]) && !isVowel(chArray[start])) {
                counter++;
                window = Math.max(window, counter);
                end++;
                start++;
            } else if (!isVowel(chArray[end]) && isVowel(chArray[start])) {
                counter--;
                window = Math.max(window, counter);
                end++;
                start++;
            } else {
                end++;
                start++;
            }
        }
        return window;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
}
