package BookTickets;

import java.util.List;


public class Validation {
	
	int ShowNo;
	List<String> seats;
	Validation(int ShowNo, List<String> seats){
		this.ShowNo = ShowNo;
		this.seats = seats;
		//count ++;
		
	}
	public Boolean validate() {
		// TODO Auto-generated method stub
		//System.out.println("Group"+count);
		if(seats.size() == 0) {
			return false;
		}
		if(ShowNo == 1) {
			for(int i =0;i <seats.size();i++) {
				if(!Show1.map.containsKey(seats.get(i)) || Show1.map.get(seats.get(i)) == false) {
					return false;
				}
				Show1.map.put(seats.get(i), false);
			}
			return true;
		}
		else if(ShowNo == 2) {
			for(int i = 0;i <seats.size();i++) {
				if(!Show2.map.containsKey(seats.get(i)) || Show2.map.get(seats.get(i)) == false) {
					return false;
				}
				Show2.map.put(seats.get(i), false);
				
			}
			return true;
		}
		return false;
	}
}
