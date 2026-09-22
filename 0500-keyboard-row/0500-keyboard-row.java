class Solution {
    public String[] findWords(String[] words) {
         String F1Row = "qwertyuiopQWERTYUIOP";
        String F2Row = "asdfghjklASDFGHJKL";
        String F3Row = "zxcvbnmZXCVBNM";

        ValidRow validRow = new ValidRow();
        String[] result = new String[0];

        int lenofInput = words.length;

        for (int i = 0; i < lenofInput; i++) {

            if (validRow.isSameRow(words[i], F1Row)) {
                result = ValidRow.append(result, words[i]);
            }
            else if (validRow.isSameRow(words[i], F2Row)) {
                result = ValidRow.append(result, words[i]);
            }
            else if (validRow.isSameRow(words[i], F3Row)) {
                result = ValidRow.append(result, words[i]);
            }
            else {
                continue;
            }
        }

        return result;

    }
}

class ValidRow {

    public static boolean isSameRow(String word, String row) {
        for (int i = 0; i < word.length(); i++) {
            if (!row.contains(String.valueOf(word.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static String[] append(String[] arr, String element) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = element;
        return arr;
    }
}