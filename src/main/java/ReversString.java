public class ReversString {
    //dog - god
    //get the last letter (leight -1) and add it as a first letter of the new word

    public static void main(String[] args) {
        ReversString reversString = new ReversString();
        reversString.reversString("dog");

    }

    public void reversString(String textToRevers) {
        if (textToRevers == null || textToRevers.isEmpty() || textToRevers.isBlank()) {
            System.out.println("The String is null or empty");
        } else {
            System.out.println(String.format("The input string is %s", textToRevers));

            String result = " ";
            int lastletter = textToRevers.length() - 1;
            for (int i = lastletter; i >= 0; i--) {
                result = result + textToRevers.charAt(i);
            }
            System.out.println(result);
        }

    }

}


