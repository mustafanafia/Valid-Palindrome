public class Main {
    public static void main(String[] args) {

        Main o = new Main();


        System.out.println(o.isPalindrome(""));


    }

    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        int left = 0;
        int right = s.length() - 1;


        while (left < right) {

            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}


// First approach attempt

    /*
    boolean isPalindrome(String s) {

        boolean res = false;

        s = s.toLowerCase();
        s = s.replaceAll(
                "[^a-zA-Z0-9]", "");

        char[] charArry = s.toCharArray();


        if(s.isEmpty()){return true;}


        for (int i = 0; i < charArry.length; i++) {
            for (int j = charArry.length - 1; j >= 0; j--) {

                if (charArry[i] == charArry[j]) {
                    res = true;
                } else {
                    res = false;
                    break;
                }
            }
        }
        return res;

    }
    
     */




