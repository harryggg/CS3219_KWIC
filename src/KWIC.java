import java.util.List;
import java.util.Scanner;
import modules.CircularShifter;
import modules.Input;
import modules.Output;
import modules.Sorter;
import objects.Line;

public class KWIC {
	public static void main(String[] args) {
		//Input
		Input input = new Input(new Scanner(System.in));
		List<Line> inputLine = input.read();

		//Shifter
		CircularShifter shifter = new CircularShifter(inputLine);
		List<Line> result = shifter.generateShiftedResult();

		//Sorter
		Sorter sorter = new Sorter();
		result = sorter.sort(result);

		//Output
		Output output = new Output();
		output.printList(result);
	}
}
