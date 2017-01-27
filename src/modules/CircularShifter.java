package modules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import objects.Filter;

import objects.Line;

public class CircularShifter extends Filter {

	private List<Line> lines;

	private static String[] IGNORED_WORD_LIST = {"after","as","and","of","is","the","a"};

	private static final Set<String> IGNORED_WORD_SET = new HashSet<String>(Arrays.asList(IGNORED_WORD_LIST));

	public CircularShifter() {
	}

	public CircularShifter(List<Line> lines){
		this.lines = lines;
	}

	public List<Line> generateShiftedResult() {
		ArrayList<Line> result = new ArrayList<Line>();
		for (Line line:lines){
						if (!IGNORED_WORD_SET.contains(line.getWords()[0].toLowerCase())) {
								result.add(line);
						}
			for (int i = 0; i < line.getWords().length; i++){
				if (IGNORED_WORD_SET.contains(line.getWords()[i].toLowerCase())){
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
		for (int i=index + 1;i<lineLength;i++){
			words[count++] = line.getWords()[i];
		}
		for (int i=0;i<=index;i++){
			words[count++] = line.getWords()[i];
		}
		return new Line(words);
	}

	@Override
	public void run() {
		this.lines = super.read();
		super.write(generateShiftedResult());
	}
}
