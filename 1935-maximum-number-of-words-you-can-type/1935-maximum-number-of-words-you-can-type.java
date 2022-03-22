class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
	String words[] = text.split(" ");
	if(brokenLetters.length()==0)
		return words.length;

	for(int i = 0;i<words.length;i++) {
		for(int j = 0;j<brokenLetters.length();j++) {
			if(words[i].indexOf(brokenLetters.charAt(j))!=-1)
				break;
			if (j == brokenLetters.length() - 1)
				count++;
		}	
	}
	return count;
    }
}