package objects;

import java.util.ArrayList;
import java.util.List;

public abstract class Pump {

	Pipe pipe;

	public void write(List<Line> list) {
		pipe.write(list);
	}

	public void setPipe(Pipe p) {
		this.pipe = p;
	}

	//Dummy Function
	public List<Line> getContents() {
		return new ArrayList<Line>();
	}
}
