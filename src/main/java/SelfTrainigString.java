public class SelfTrainigString {
    public static void main(String[] args) {
    //  SelfTrainigString addChars = new SelfTrainigString();
    //  addChars.addChars("red");

    //  SelfTrainigString maxStart = new SelfTrainigString();
    // System.out.println(maxStart.maxStart("max pipiras"));

    //   SelfTrainigString fizzBuzz = new SelfTrainigString();
    //  System.out.println(fizzBuzz.fizzBuzz("fib"));

    // SelfTrainigString bibThere = new SelfTrainigString();
    // System.out.println(bibThere.bibThere("xysbib"));

    // SelfTrainigString bibInTheString = new SelfTrainigString();
    //System.out.println(bibInTheString.bibInTheString("xysbob"));

    // SelfTrainigString stringTimes = new SelfTrainigString();
    // System.out.println(stringTimes.stringTimes("Hi", 5));

    //  SelfTrainigString isPlural = new SelfTrainigString();
    // System.out.println(isPlural.isPlural("changes"));


}

    //=================================1=======================================
    public String addChars(String word) {
        String result = "";
        if (word == null || word.isEmpty() || word.isBlank()) {
            System.out.println("The String is null or empty");
        } else {
            System.out.println(String.format("The input string is %s", word));

            int lastletter = word.length() - 1;
            int i = lastletter;
            {
                result = word.charAt(i) + word + word.charAt(i);
                System.out.println(result);
            }
        }

        return result;
    }
//==============================2=========================================================

    public boolean maxStart(String phrase) {
        //int secondLetter = phrase.charAt(1);
        //int firdLetter = phrase.charAt(2);


        System.out.println(String.format("The input string is %s", phrase));

        if (phrase.startsWith("ax", 1)) {
            return true;
        } else {
            return false;
        }
    }
//====================================3======================================================

    public String fizzBuzz(String inputWord) {
        String result = "";
        System.out.println(String.format("The input string is %s", inputWord));
        if ((inputWord.startsWith("f")) && (inputWord.endsWith("b"))) {
            result = inputWord.replaceAll(inputWord, "FizzBuzz");
        } else if (inputWord.startsWith("f")) {
            result = inputWord.replaceAll(inputWord, "Fizz");
        } else if (inputWord.endsWith("b")) {
            result = inputWord.replaceAll(inputWord, "Buzz");
        } else {
            result = inputWord;
            System.out.println("No changes was made");
        }
        return result;
    }
//====================================4====================================================================

    public boolean bibThere(String str) {
        System.out.println(String.format("The input string is %s", str));

        if (str.contains("bib")) {
            System.out.println("bib There!");
            return true;
        } else {
            System.out.println("bib is not There!");
            return false;
        }


    }

    //=============================4(2) from Internet===============================================
    public boolean bibInTheString(String stng) {
        System.out.println(String.format("The input string is %s", stng));
        int len = stng.length();
        for (int i = 0; i < len - 2; i++) {
            if (stng.charAt(i) == 'b' && stng.charAt(i + 2) == 'b')
                return true;
        }
        return false;
    }


    //=============================================5==============================================
    public String stringTimes(String str, int n) {
        String temp = "";
        for (int i = 0; i < n; i++)

            temp += str;

        return temp;

    }

    //===================================6=====================================================
    public boolean isPlural(String given) {
        System.out.println(String.format("The input string is %s", given));
        if (given.endsWith("s")) {
            return true;
        } else {
            return false;
        }

    }

}






