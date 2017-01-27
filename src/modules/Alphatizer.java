package modules;

import java.util.Collections;
import java.util.List;
import objects.Filter;

import objects.Line;

public class Alphatizer extends Filter {

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

	@Override
	public void run() {
		super.write(sort(super.read()));
	}
}
