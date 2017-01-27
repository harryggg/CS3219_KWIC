package objects;

public class Line implements Comparable<Line> {

	private static String DELIMETER = " ";
	private String[] words;

	public Line(String str){
		this.words = str.split(DELIMETER);
	}

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

	@Override
	public int compareTo(Line t) {
		return this.getWords()[0].charAt(0) - t.getWords()[0].charAt(0);
	}
}
