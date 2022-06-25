public class StringsHW  {



    public static void main(String[] args) {

        StringsHW palindrome = new StringsHW();
        String textToCheck = "racecar";
        String result = palindrome.reversPalindrome(textToCheck);
        System.out.println(palindrome.isPalindrome(textToCheck,result));
    }
    public String reversPalindrome(String textToCheck) {
        String result = "";
        if (textToCheck == null || textToCheck.isEmpty() || textToCheck.isBlank()) {
            System.out.println("The String is null or empty");
        } else {
            System.out.println(String.format("The input string is %s", textToCheck));
            // String result = "";
            int lastletter = textToCheck.length() - 1;
            {
                for (int i = lastletter; i >= 0; i--)
                    result = result + textToCheck.charAt(i);

            }

            System.out.println(result);

        }
        return result;
    }
    public boolean isPalindrome (String textToCheck, String result) {

        if (textToCheck.equals(result)) {
            System.out.println("This is Palindrome!");
            return true;

        } else  {
            System.out.println("This is not Palindrome");
            return false;

        }

    }


}

