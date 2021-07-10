package BookTickets;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MovieTest {

	@Test
	void NoMovietest() {
		Validation Validate = new Validation(1,new ArrayList<>());
		
		assertFalse(Validate.validate());
		
	}
	
	@Test
	void OneMovietest() {
		Validation Validate = new Validation(1,Arrays.asList("A3","A4"));
		assertTrue(Validate.validate());
	}
	
	@Test
	void SecondShowTest() {
		Validation Validate = new Validation(2,Arrays.asList("A1","A2"));
		assertTrue(Validate.validate());
		
	}
	@Test
	void MultipleGroupsTest() {
		Validation group1 = new Validation(1,Arrays.asList("A1","A2"));
		Validation group2 = new Validation(1,Arrays.asList("A1","A2"));
		boolean group1val = group1.validate();
		boolean group2val = group2.validate();
		assertFalse(group2val);
	}

}
