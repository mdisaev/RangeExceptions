package telran.exeptions;

@SuppressWarnings("serial")
public class NumberGreaterRangeMaxException extends Exception {
	public NumberGreaterRangeMaxException(int max, int number) {
		super(String.format("Number(%d) less than range max (%d)",number,max));
	}
}
