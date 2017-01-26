package modules;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import objects.Line;

public class Input {

	Scanner sc;

	private static String INPUT_PROMPT = "Please input the next index and Press Enter(If there is no more input, press Enter):";

	public Input(Scanner sc) {
		this.sc = sc;
	}

	public List<Line> read() {
		List<Line> lineList = new ArrayList<Line>();

		while (true) {
			System.out.println(INPUT_PROMPT);
			String input = sc.nextLine();
			if (input.isEmpty())
				break;
			Line entry = new Line(input);
			lineList.add(entry);
		}

		return lineList;
	}
}
