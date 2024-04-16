package telran.exeptions.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.exeptions.NumberGreaterRangeMaxException;
import telran.exeptions.NumberLessRangeMinException;
import telran.exeptions.RangeExceptions;

class RangeExceptionsTests {

	@Test
	void factoryMethodTest() throws NumberGreaterRangeMaxException, NumberLessRangeMinException {
		RangeExceptions range = RangeExceptions.getRangeExceptions(3, 30);
		assertThrowsExactly(IllegalArgumentException.class,
				() -> RangeExceptions.getRangeExceptions(30, 3)); 
		range.checkNumber(5);
		assertThrowsExactly(NumberGreaterRangeMaxException.class, () -> range.checkNumber(35));
		assertThrowsExactly(NumberLessRangeMinException.class, () -> range.checkNumber(2));
	}
}


