import java.util.Arrays;
public class Anagram {
    static boolean areAnagram(char[] firstString, char[] secondString) //Function to check whether two strings are anagram of each other
    {
        // Finding length of both the strings
        int firstNumberLength = firstString.length;
        int secondNumberLength = secondString.length;
        // If length of both strings is not same,
        // then they cannot be anagram
        if (firstNumberLength != secondNumberLength)
            return false;

        // Sort both strings
        Arrays.sort(firstString);
        Arrays.sort(secondString);

        // Compare sorted strings
        for (int loopOnPower = 0; loopOnPower < firstNumberLength; loopOnPower++)
            if (firstString[loopOnPower] != secondString[loopOnPower])
                return false;

        return true;
    }

    public static void main(String[] args) {
        char firstString[] = { 's', 'o', 'f', 't', 'w', 'a', 'r', 'e' }; //First string
        char secondString[] = { 's', 'w', 'e', 'a', 'r', 'o', 'f', 't' }; //Second string

// Function Call
        if (areAnagram(firstString, secondString))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
        }
    }







![Anagrams](https://user-images.githubusercontent.com/74056455/103381349-856d6b80-4b11-11eb-9121-f855ab628b79.PNG)
