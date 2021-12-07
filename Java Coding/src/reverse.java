import org.junit.Test;

public class reverse {
	@Test
	public void reverseWord() {
		String sentence="How Are You";
		StringBuffer sb=new StringBuffer();
		String[] words=sentence.split(" ");
		for(String word:words) {
			for(int i=word.length()-1;i>=0;i--) {
				char c=word.charAt(i);
				sb.append(c);
			}
			sb.append(" ");
		}
	System.out.println(sb.toString().trim());
	}

}
