import java.util.Stack;

public class DecodeString {

    public static void main(String[] args) throws Exception {
        System.out.println(" ans "+decodeString("100[leetcode]"));

    }

    public static String decodeString(String s) {
        int n = s.length();
        int pos = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder("");
        StringBuilder number = new StringBuilder();
        Stack<Character> st = new Stack<>();

        while (pos < n) {
            while (pos < n) {
                if (s.charAt(pos) == ']') {
                    pos++;
                    break;
                }
                st.push(s.charAt(pos));
                pos++;

            }
            System.out.println("stack : " + st + " pos : " + pos);

            while (!st.isEmpty()) {
                if (st.peek() == '[') {
                    st.pop();
                    break;
                }
                sb.append(st.pop());
            }
            sb.reverse();

            System.out.println("stack2 : " + st + " pos2 : " + pos );
            System.out.println("sb : " + sb);
            while (!st.isEmpty()) {
                if (!Character.isDigit(st.peek())) {
                    break;
                }
                number.append(st.pop());
                System.out.println("number : " + number);
            }
            System.out.println("prev. stack : " + st);
            int num = number.length() > 0 ? Integer.parseInt(number.toString()) : 0;
            System.out.println("num : " + num);
            while (num > 0) {
                ans.append(sb);
                num--;
            }
            System.out.println("num append : " + ans);

            for (int i = 0; i < ans.length(); i++) {
                st.push(ans.charAt(i));
            }
            System.out.println("fresh. stack : " + st);
            if(!st.isEmpty()){
                number.setLength(0);
                sb.setLength(0);
                ans.setLength(0);
            }

            if (pos == n) {
                while (!st.isEmpty()) {
                    sb.append(st.pop());
                }
                return sb.reverse().toString();
            }
            
        }

        return sb.toString();
    }
    
}
