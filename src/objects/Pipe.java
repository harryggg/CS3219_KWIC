package objects;

import java.util.List;

public class Pipe {

	private List<Line> buffer;

	List<Line> read() {
		return this.buffer;
	}

	void write(List<Line> s) {
		this.buffer = s;
	}
}