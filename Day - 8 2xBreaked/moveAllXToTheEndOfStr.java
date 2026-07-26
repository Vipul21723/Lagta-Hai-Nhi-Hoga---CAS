class moveAllXToTheEndOfStr{
    public static void moveXToEndStr(String str, int idx, int count, String newString) {
        if(idx == str.length()) {
            for(int i=0 ; i<count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x') {
            count++;
            moveXToEndStr(str, idx+1, count, newString);
        } else {
            newString += currChar;
            moveXToEndStr(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveXToEndStr(str, 0, 0, "");
    }
}