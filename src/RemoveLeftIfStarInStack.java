import java.util.Stack;

public class RemoveLeftIfStarInStack {

    public static void main(String[] args) throws Exception {
        System.out.println(removeStars("Hello**"));

    }
    //approch 1
    public static String removeStars(String s) {
        int n = s.length();
        if (n == 0) {
            return "";
        }
        Stack<Character> s1 = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                if (!s1.isEmpty())
                    s1.pop();
            } else
                s1.push(ch);
        }

        StringBuilder sb = new StringBuilder();
        while (!s1.isEmpty()) {
            sb.append(s1.pop());
        }
        return sb.reverse().toString();

    }


    //approch 2
    public static String removeStars2(String s){
        int n = s.length();
        if (n == 0) {
            return "";
        }
        char[] chArray = s.toCharArray();
        int index = 0;
        for (char ch : chArray) {
            if (ch != '*') {
                chArray[index++] = ch;
            } else {
                if (index > 0)
                    index--;
            }
        }

        return new String(chArray, 0, index);
    }
    
}
