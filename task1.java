class task1 {
    
    public static void main(String[] args) {

       System.out.println(isPalindrome("Den laks skal ned")); 

    }

    static boolean isPalindrome(String str) {
        
        str = str.toLowerCase();

        String backStr = reverseString(str);
        
        if (str.equals(backStr)) {
            return true;
        } 

        else {
            return false;
        } 
    }


    static String reverseString(String str) {
        
        String newStr = "";
        for( int i = str.length() - 1; i >= 0; i--) {
            
            newStr = newStr.concat(Character.toString(str.charAt(i)));
        }

        return newStr;

    }
}
