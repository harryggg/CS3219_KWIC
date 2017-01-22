import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modules.CircularShifter;
import modules.Printer;
import modules.Sorter;
import objects.Line;

public class KWIC {
	public static void main(String[] args) {
		//Read Input & Initialise lineList
		Scanner sc = new Scanner(System.in);
		List<Line> lineList = new ArrayList<Line>();

		while (true) {
			String input = sc.nextLine();
			if (input.isEmpty())
					break;
			Line entry = new Line(input);
			lineList.add(entry);
		}

		//Shifter
		CircularShifter shifter = new CircularShifter(lineList);
		List<Line> result = shifter.generateShiftedResult();

		//Sorter
		Sorter sorter = new Sorter();
		result = sorter.sort(result);

		//Print Out
		Printer printer = new Printer();
		printer.printList(result);
	}
}
