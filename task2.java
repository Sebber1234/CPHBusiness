class task2 {

    public static void main(String[] args) {

        System.out.println(printPartOfWord("København", 1, 4));
    }

    public static String printPartOfWord(String str, int firstIndex, int subLen) {
        
        return str.substring(firstIndex, firstIndex + subLen);
    }
}
