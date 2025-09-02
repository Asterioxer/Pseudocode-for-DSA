public class JadenCase {

	public String toJadenCase(String phrase) {
		// TODO put your code below this comment
    if (phrase == null || phrase.trim().isEmpty()){
      return null;
    }
		String[] words = phrase.split(" ");
    StringBuilder jdc = new StringBuilder();
    
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      if (words.length > 0) {
        String capW = word.substring(0, 1).toUpperCase() + word.substring(1);
        jdc.append(capW);
      }
      if (i < words.length - 1) {
        jdc.append(" ");
      }
    }
    return jdc.toString();
	}
}

