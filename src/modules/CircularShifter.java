package modules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import objects.Line;

public class CircularShifter {

	private List<Line> lines;

	private static String[] IGNORED_WORD_LIST = {"the","at","a"};

	private static final Set<String> IGNORED_WORD_SET = new HashSet<String>(Arrays.asList(IGNORED_WORD_LIST));

	public CircularShifter(List<Line> lines){
		this.lines = lines;
	}

	public List<Line> generateShiftedResult() {
		ArrayList<Line> result = new ArrayList<Line>();
		for (Line line:lines){
			for (int i = 0; i < line.getWords().length; i++){
				if (!IGNORED_WORD_SET.contains(line.getWords()[i])){
					result.add(generateShiftedNewLineFromIndex(line,i));
				}
			}
		}
		return result;
	}

	private Line generateShiftedNewLineFromIndex(Line line,int index){
		int lineLength = line.getWords().length;
		String[] words = new String[lineLength];
		int count = 0;
		for (int i=index;i<lineLength;i++){
			words[++count] = line.getWords()[i];
		}
		for (int i=0;i<index;i++){
			words[++count] = line.getWords()[i];
		}
		return new Line(words);
	}
}
