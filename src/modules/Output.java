package modules;

import java.util.List;
import objects.Line;
import objects.Sink;

public class Output extends Sink {

	private static String OUTPUT_START_LINE = "=========OUTPUT START=============";
	private static String OUTPUT_END_LINE = "=========OUTPUT ENDS===============";

	public Output() {
	}

	public void printList(List<Line> list) {
		System.out.println(OUTPUT_START_LINE);
		for (Line line:list) {
			System.out.println(line.toString());
		}
		System.out.println(OUTPUT_END_LINE);

	}
}
