public class subsquencesOfStr {
    public static void subSeqOfStr(String str, int idx, String newStr) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        // TO BE
        subSeqOfStr(str, idx+1, newStr+currChar);
        // NOT TO BE
        subSeqOfStr(str, idx+1, newStr);
    }
    public static void main(String[] args) {
        subSeqOfStr("abc", 0, "");
    }
}
