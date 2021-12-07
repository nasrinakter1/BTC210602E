
public class practice {

	public static void main(String[] args) {
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
