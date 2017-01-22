package modules;

import java.util.List;
import objects.Line;

public class Printer {

	public Printer() {
	}

	public void printList(List<Line> list) {
		for (Line line:list) {
			System.out.println(line.toString());
		}
	}
}
