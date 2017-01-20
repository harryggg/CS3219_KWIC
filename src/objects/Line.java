package objects;

public class Line {

	private static String DELIMETER = " ";
	private String[] words;

	public Line(String[] words){
		this.words = words;
	}

	public String[] getWords(){
		return words;
	}

	public void setWords(String[] words){
		this.words = words;
	}

	@Override
	public String toString(){
		return String.join(DELIMETER, words);
	}

}
