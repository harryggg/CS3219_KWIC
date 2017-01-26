import java.util.List;
import java.util.Scanner;
import modules.CircularShifter;
import modules.Input;
import modules.Output;
import modules.Alphatizer;
import objects.Line;

public class KWIC_ADT {
	public static void main(String[] args) {
		//Input
		Input input = new Input(new Scanner(System.in));
		List<Line> inputLine = input.read();

		//Shifter
		CircularShifter shifter = new CircularShifter(inputLine);
		List<Line> result = shifter.generateShiftedResult();

		//Alphatizer
		Alphatizer sorter = new Alphatizer();
		result = sorter.sort(result);

		//Output
		Output output = new Output();
		output.printList(result);
	}
}
