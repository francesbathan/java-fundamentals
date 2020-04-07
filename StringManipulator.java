public class StringManipulator {
    public String trimAndConcat(String string1, String string2) {
        String newString = string1.trim();
        String newStringDos = string2.trim();
        String comboString = newString.concat(newStringDos);
        return comboString;
    }

    public Integer getIndexOrNull(String string1, char letter) {
        int a = string1.indexOf(letter);
        return a;
    }

    public Integer getIndexOrNull(String string1, String string2) {
        int a = string1.indexOf(string2);
        return a;
    }

    public String concatSubString(String mainString, int startIndex, int endIndex, String secondString) {
        String subString = mainString.substring(startIndex, endIndex);
        String newString = subString.concat(secondString);
        return newString;
    }
}