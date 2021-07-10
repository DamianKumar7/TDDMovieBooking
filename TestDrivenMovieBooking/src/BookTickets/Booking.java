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
			System.out.println("Booking Succesfull");
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
			System.out.println();
			
			
			
			return 1;
		}
		else if(ShowNo == 2 && Validate.validate() == true) {
			System.out.println("Booking succesfull");
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
			System.out.println();
			
			
			return 1;
		}
		System.out.println("Seats are not available");
		System.out.println();
		return 0;
		
	}
	

}



/*Output
 * Group1
Requested Seats:[A6, A7]
The Ticket Have Been Booked!!!
Available Seats:
B1 A1 B2 A2 B3 A3 B4 A4 B5 A5 A8 A9 
Booked Seats:
A6 A7 
Group2
Requested Seats:[A6, A7]
The Ticket Have Been Booked!!!
Available Seats:
A1 A2 A3 A4 A5 A8 A9 
Booked Seats:
A6 A7 
Group5
Requested Seats:[A8, A9]
The Ticket Have Been Booked!!!
Available Seats:
A1 A2 A3 A4 A5 
Booked Seats:
A8 A9 
Group5
Requested Seats:[A8, A9]
Seats are not available
Group5
Requested Seats:[A8, A9]
The Ticket Have Been Booked!!!
Available Seats:
B1 A1 B2 A2 B3 A3 B4 A4 B5 A5 
Booked Seats:
A8 A9 */
