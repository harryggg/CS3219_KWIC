package modules;

import java.util.Collections;
import java.util.List;

import objects.Line;

public class Alphatizer {

	public Alphatizer(){
	}

	public List<Line> sort(List<Line> lines) {
		Collections.sort(lines);
		return lines;
	}

	//Can implement other sort algorithms if necessary
	public List<Line> customSort(List<Line> lines) {
		return lines;
	}
}
