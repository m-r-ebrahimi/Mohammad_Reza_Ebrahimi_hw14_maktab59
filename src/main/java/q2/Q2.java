package q2;

public class Q2 {
    public static void main(String[] args) {
        //Check checkString=(s)->s.charAt(0)==s.charAt(s.length()-1)?true:false;
        Check checkString=(s)-> s.charAt(0) == s.charAt(s.length() - 1);
        System.out.println(checkString.check("good"));
        System.out.println(checkString.check("abca"));
    }
}
