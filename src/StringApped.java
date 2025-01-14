public class StringApped {
    public static void main(String[] args) {
        String str1 = "2";
        String str2 = "2";
        System.out.println("result:" + add(str1, str2));
    }


    public static String add(String str1, String str2) {
        int carry = 0;
        int in1 = str1.length() - 1;
        int in2 = str2.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (in1 >= 0 || in2 >= 0) {
            int digit1 = in1 < 0 ? 0 : (str1.charAt(in1) - '0');
            int digit2 = in2 < 0 ? 0 : (str2.charAt(in2) - '0');
            int temp = carry + digit1 + digit2;
            int rest = temp % 10;
            carry = temp / 10;
            sb.insert(0,rest);
            in1--;
            in2--;
        }
        if(carry > 0){
            sb.insert(0, carry);
        }
        return sb.toString();
    }
}
