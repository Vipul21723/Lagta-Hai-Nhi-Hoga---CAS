public class firstLastOccuranceOfElement {
    
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char element) {

        if(idx == str.length()) {
            System.out.println("First : " + first);
            System.out.println("Last  : " + last);
            return;
        }
        char curntChar = str.charAt(idx);
        if(curntChar == element) {
            if(first == -1) {
                first = idx;
            }
            else {
                last = idx;
            }
        }
        findOccurance(str, idx+1, element);
    }
    
    public static void main(String[] args) {
        
        findOccurance("Vipul Patel", 0, 'p');

    }    
}
