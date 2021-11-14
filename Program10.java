package Collection;
import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Program10 {

	public static void main(String[] args) {
		List<LocalDate> ll=new LinkedList<>();
		ll.add(LocalDate.of(2000,Month.APRIL,23));
		ll.add(LocalDate.of(2004,Month.FEBRUARY,29));
		ll.add(LocalDate.of(2001,Month.JANUARY,15));
		ll.add(LocalDate.of(2000,Month.JULY,28));
		ll.add(LocalDate.of(2003,Month.JUNE,12)); 
		ll.add(LocalDate.of(2005,Month.DECEMBER,24));
		ll.add(LocalDate.of(2006,Month.OCTOBER,31));
		ll.add(LocalDate.of(2008,Month.MARCH,22));
		ll.add(LocalDate.of(2009,Month.SEPTEMBER,20));
		ll.add(LocalDate.of(2012,Month.NOVEMBER,9));
		
		for(LocalDate ld: ll)
		{
			if(ld.isLeapYear())
			{
				System.out.println("Your date of birth is "+ld+" and it was leap year");
			}
			else
			{
				System.out.println("Your date of birth is "+ld+" and it was not leap year");
			}
		}
	}




	}


