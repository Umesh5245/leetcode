class Solution {
    public int lengthOfLastWord(String s) {
      String trimmedString = s.trim();
        
        if (trimmedString.length() == 0){
            return 0;
        }
int index = trimmedString.lastIndexOf(" ", trimmedString.length()-1);

        String lastWord = trimmedString.substring(index+1);
        return lastWord.length();
    }
}