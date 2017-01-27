package objects;

import java.util.ArrayList;

public class PipeLine {

	private Filter[] filters;
	private ArrayList<Pipe> pipes;
	private Pump pump;
	private Sink sink;

	public PipeLine(Filter ... filters) {
		//Setup Pipeline
		this.pipes = new ArrayList<Pipe>();
		this.filters = filters;

		Pipe from_pump = new Pipe();
		Pipe to_sink = new Pipe();
		pipes.add(from_pump);
		pipes.add(to_sink);

		filters[0].setInput(from_pump);
		for(int i = 0; i < filters.length - 1; i++) {
			Pipe p = new Pipe();
			pipes.add(p);
			filters[i+1].setInput(p);
			filters[i].setOutput(p);
		}
		filters[filters.length - 1].setOutput(to_sink);
	}

	public void setPump(Pump pump) {
		this.pump = pump;
		pump.setPipe(pipes.get(0));
	}

	public void setSink(Sink sink) {
		this.sink = sink;
		sink.setPipe(pipes.get(pipes.size() - 1));
	}

	public void run() {
		pump.write(pump.getContents());
		for (int i = 0; i < this.filters.length; i++) {
			filters[i].run();
		}
		sink.printList(sink.read());
	}
}
