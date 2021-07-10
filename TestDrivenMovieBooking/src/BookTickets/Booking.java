package BookTickets;

import java.util.List;

public class Booking {
	
	static int count = 0;
	int ShowNo;
	List<String>Seats;
	public Booking(int ShowNo, List<String> Seats) {
		this.ShowNo = ShowNo;
		this.Seats = Seats;
		count++;
	}
	public int book() {
		// TODO Auto-generated method stub
		//System.out.println(ShowNo);
		
		System.out.println("Group"+count);
		System.out.println("Requested Seats:"+ Seats);
		Validation Validate = new Validation(ShowNo,Seats);
		if(ShowNo == 1 && Validate.validate() == true) {
			System.out.println("The Ticket Have Been Booked!!!");
			System.out.println("Available Seats:");
			
			
			for(String s: Show1.map.keySet()) {
				if(Show1.map.get(s) == true) {
					System.out.print(s + " ");
				}
				
				
			}
			System.out.println();
			System.out.println("Booked Seats:");
			for(int i = 0;i <Seats.size();i++) {
				System.out.print(Seats.get(i) + " ");
			}
			System.out.println();
			
			
			return 1;
		}
		else if(ShowNo == 2 && Validate.validate() == true) {
			System.out.println("The Ticket Have Been Booked!!!");
			System.out.println("Available Seats:");
			
			
			for(String s: Show2.map.keySet()) {
				if(Show2.map.get(s) == true) {
					System.out.print(s + " ");
				}
				
				
			}
			System.out.println();
			System.out.println("Booked Seats:");
			for(int i = 0;i <Seats.size();i++) {
				System.out.print(Seats.get(i) + " ");
			}
			System.out.println();
			
			
			return 1;
		}
		System.out.println("Seats are not available");
		return 0;
		
	}
	

}
