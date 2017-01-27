import java.util.List;
import java.util.Scanner;
import modules.CircularShifter;
import modules.Input;
import modules.Output;
import modules.Alphatizer;
import objects.Line;
import objects.Pipe;
import objects.PipeLine;

public class KWIC_PIPE_AND_FILTER {
	public static void main(String[] args) {
		//Pipe Setup
		PipeLine pipeLine = new PipeLine(new CircularShifter(), new Alphatizer());
		pipeLine.setPump(new Input(new Scanner(System.in)));
		pipeLine.setSink(new Output());
		pipeLine.run();
	}
}
