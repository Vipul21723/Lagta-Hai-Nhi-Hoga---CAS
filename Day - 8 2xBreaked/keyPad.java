public class keyPad {
    
    public static String[] keyPad = {".", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };
    public static void printComb(String str, int idx, String comb) {
        char currChar = str.charAt(idx);
        String mapping = keyPad[currChar-'0'];
    }
    public static void main(String[] args) {
        
    }
}
