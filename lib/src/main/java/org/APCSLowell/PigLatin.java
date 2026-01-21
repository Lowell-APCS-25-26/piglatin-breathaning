package org.APCSLowell;

public class PigLatin {
    public int findFirstVowel(String sWord) {
        //precondition: sWord is a valid String of length greater than 0.
        if (sWord.length() <= 0) { return -1; }
        //postcondition: returns the position of the first vowel in sWord.  If there are no vowels, returns -1
	    for (int i = 0; i < sWord.length(); i++) {
            char letter = sWord.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                return i;
            }
        }
        return -1;
    }

    public String pigLatin(String sWord) {
        //precondition: sWord is a valid String of length greater than 0
        if (sWord.length() <= 0) { return null; }
        //postcondition: returns the pig latin equivalent of sWord
        int vowelPosition = findFirstVowel(sWord);
        String rearrangedWord;
        if (vowelPosition == -1) {
            rearrangedWord = sWord;
        } else if (vowelPosition == 0) {
            rearrangedWord = sWord + "w";
        } else if (sWord.charAt(0) == 'q') {
            rearrangedWord = sWord.substring(2, sWord.length()) + sWord.substring(0, 2);
        } else {
            rearrangedWord = sWord.substring(vowelPosition, sWord.length()) + sWord.substring(0, vowelPosition);
        }
        return rearrangedWord + "ay";
    }
}
