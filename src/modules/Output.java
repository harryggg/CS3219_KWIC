package modules;

import java.util.List;
import objects.Line;

public class Output {

	public Output() {
	}

	public void printList(List<Line> list) {
		for (Line line:list) {
			System.out.println(line.toString());
		}
	}
}
