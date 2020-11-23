package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {

        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        StringBuilder string2 = new StringBuilder();
        string2.append(string1);
        return string2.reverse().toString();
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        StringBuilder stringOne = new StringBuilder();
        StringBuilder stringTwo = new StringBuilder();
        stringOne.append(string1);
        stringTwo.append(string2);

        return stringOne.reverse().toString() + stringTwo.reverse();
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        String strFinal = string;
        String[] newCharArr = charactersToRemove.split("");
        for(String newChar : newCharArr) {
            strFinal = strFinal.replace(newChar,"");
        }
        return strFinal;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        StringBuilder stringRev = new StringBuilder();
        String strFinal = string;
        String[] newCharArr = charactersToRemove.split("");
        for(String newChar : newCharArr) {
            strFinal = strFinal.replace(newChar,"");
        }
        stringRev.append(strFinal);

        return stringRev.reverse().toString();

    }
}
