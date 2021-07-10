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
		Validation Validate = new Validation(1,Arrays.asList("A1","A2"));
		assertTrue(Validate.validate());
	}
	
	@Test
	void SecondShowTest() {
		Validation Validate = new Validation(2,Arrays.asList("A2","A3"));
		assertTrue(Validate.validate());
		
	}
	@Test
	void MultipleGroupsTest() {
		Validation group1 = new Validation(1,Arrays.asList("A4","A5"));
		Validation group2 = new Validation(1,Arrays.asList("A4","A5"));
		boolean group1val = group1.validate();
		boolean group2val = group2.validate();
		assertFalse(group2val);
	}
	@Test	void OneMovieBooking() {
		Booking tickets = new Booking(1,Arrays.asList("A6","A7"));
		int ans = tickets.book();
		assertEquals(1,ans);
	}
	@Test
	void Show2Booking() {
		Booking tickets = new Booking(2,Arrays.asList("A6","A7"));
		int ans = tickets.book();
		assertEquals(1,ans);
		
	}
	@Test
	void BookingMultiple() {
		Booking group1 = new Booking(1,Arrays.asList("A8","A9"));
		int ans1 = group1.book();
		
		Booking group2 = new Booking(1,Arrays.asList("A8","A9"));
		int ans2 = group2.book();
		
		Booking group3 = new Booking(2,Arrays.asList("A8","A9"));
		int ans3  = group3.book();
		
		
		
	}

}
