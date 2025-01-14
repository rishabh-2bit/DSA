public class CompressString {

    public static int compress(char[] chars) {
        int first = 0;
        int second = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder("");
        while (second < chars.length) {
            if (chars[first] == chars[second]) {
                count++;
                second++;
            } else {
                sb.append(chars[first]);
                first = second;
                if (count > 1)
                    sb.append(count);
                count = 0;
            }
            
        }
        sb.append(chars[first]);
        if (count > 1)
            sb.append(count);
        return sb.length();
    }

    public static void main(String[] args) {
        System.out.println(compress(new char[] { 'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }
    
}
