

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MovieShow {
	 Set<Movie> movieSet=new HashSet<>();
	public static void main(String[] args)throws IOException {
		MovieShow movShow=new MovieShow();
//		movShow.bookMovie(1, "s1");
//		movShow.bookMovie(1, "s1");
//		movShow.bookMovie(1, "s2");
//		movShow.bookMovie(1, "s3");
//		movShow.bookMovie(2, "s3");
//		movShow.bookMovie(2, "s1");
		String menu; 
		BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("--WELCOME to BOOK MOVIE---");
		    System.out.println("Please enter showno: ");
		        int showNo = Integer.parseInt(bfn.readLine());
		    System.out.println("Please enter seat name: ");
		        String seatName = bfn.readLine();    
		       
		        movShow.bookMovie(showNo, seatName);
		movShow.displayAll();
		movShow.displayShow(showNo);
		System.out.println("\n\nPlease 'q' to exit.... ");
		menu =bfn.readLine();
		}while(!menu.equals("q"));
		
	}
private void displayShow(int showNo) {
	System.out.println("\n-- Show :"+showNo+" ---");
	int price = 0;

	 for (Movie movie : movieSet) {
		 if(movie.getShowNo()==showNo) {
			 switch (movie.getSeatName().charAt(0)) {
			 case 's': price=100; break;
			 case 'g': price=150; break;
			 case 'p': price=200; break;
			 }
         System.out.print(" "+movie.getSeatName()+":"+price+"/-");
		 }
	 }
	} 
public void bookMovie(int showNo,String seatName) {
	Movie mov=new Movie(showNo, seatName);
	if(movieSet.add(mov))
	{
		movieSet.add(mov);
		System.out.println("Success=== Seat  "+seatName+" booked for show "+showNo);
	}
	else
		System.out.println("Fail --- Seat  "+seatName+" already booked for show "+showNo);
  }
public void displayAll() {
	System.out.println("-- displayAll() ---");
	 for (Movie movie : movieSet) {
         System.out.println("Show:"+movie.getShowNo()+"  seat"+movie.getSeatName());
     }
}
}

class Movie{
	int showNo;
	String seatName;	
	public Movie(int showNo, String seatName) {
		this.showNo=showNo;
		this.seatName=seatName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(seatName, showNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(seatName, other.seatName) && showNo == other.showNo;
	}
	public int getShowNo() {
		return showNo;
	}
	public void setShowNo(int showNo) {
		this.showNo = showNo;
	}
	public String getSeatName() {
		return seatName;
	}
	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}
	
}