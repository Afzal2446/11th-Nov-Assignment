package Assignment7;

//	Input: s = "abcd", t = "abcde"
//	Output: "e"
//	Explanation: 'e' is the letter that was added.

public class FindDifference {
	 public char findTheDifference(String s, String t) {
	       
		    int result = 0;
		    for (int i = 0; i < s.length(); i++) {
		     //use XOR,just like question 136
		      result ^= s.charAt(i);
		      result ^= t.charAt(i);
		    }
		return (char) (result ^ t.charAt(t.length() - 1));
	}
}
