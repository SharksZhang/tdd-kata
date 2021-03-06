package fizzbuzz;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameNumberTest {
	@Test
	public void should_return_raw_number_for_normal_number () {
		checkNumberOutput(1, "1");
		checkNumberOutput(2, "2");
	}

	@Test
	public void should_return_fizz_or_buzz_if_number_is_divisible_by_3_or_5 () {
		checkNumberOutput(3, "fizz");
		checkNumberOutput(5, "buzz");
		checkNumberOutput(15, "fizzbuzz");
	}

	@Test
	public void should_return_fizz_or_buzz_if_number_contains_3_or_5 () {
		checkNumberOutput(13, "fizz");
		checkNumberOutput(52, "buzz");
		checkNumberOutput(53, "fizzbuzz");
		checkNumberOutput(54, "fizzbuzz");
	}

	private void checkNumberOutput(int i, String s) {
		assertThat(new GameNumber(i).toString(), is(s));
	}
}
