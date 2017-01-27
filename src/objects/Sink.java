package objects;

import java.util.List;

public abstract class Sink {

	Pipe pipe;

	public List<Line> read() {
		return pipe.read();
	}

	public void setPipe(Pipe p) {
		this.pipe = p;
	}

	//Dummy Function
	public void printList(List<Line> list) {
	}
}
