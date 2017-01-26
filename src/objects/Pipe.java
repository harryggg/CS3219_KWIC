package objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modules.*;

public class Pipe {

	private List<Line> lines;

	public Pipe(){
		lines = new ArrayList<Line>();
	}

	public void getInput(){
		Input input = new Input(new Scanner(System.in));
		lines = input.read();
	}

	public void doCircularShift(){
		CircularShifter shifter = new CircularShifter(lines);
		lines = shifter.generateShiftedResult();
	}
	
	
}
