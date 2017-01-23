package modules;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import objects.Line;

public class Input {

	Scanner sc;
		
	public Input(Scanner sc) {
		this.sc = sc;
	}

	public List<Line> read() {
		List<Line> lineList = new ArrayList<Line>();

		while (true) {
			String input = sc.nextLine();
			if (input.isEmpty())
				break;
			Line entry = new Line(input);
			lineList.add(entry);
		}

		return lineList;
	}
}
