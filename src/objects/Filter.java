package objects;

import java.util.List;

public abstract class Filter implements Runnable {

	private Pipe inputPipe, outputPipe;

	public void setInput(Pipe p) {
		this.inputPipe = p;
	}

	public void setOutput(Pipe p) {
		this.outputPipe = p;
	}

	public List<Line> read() {
		return inputPipe.read();
	}

	public void write(List<Line> s) {
		outputPipe.write(s);
	}
}