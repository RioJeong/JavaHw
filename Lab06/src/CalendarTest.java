import java.util.Calendar;
public class CalendarTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		int hourd=now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		System.out.println("현재시간은 "+hourd+"시 "+minute+"분입니다.");
		if(hourd>=4&&hourd<12)
			System.out.println("Good Morning");
		else if(hourd>=12&&hourd<18)
			System.out.println("Good Afternoon");
		else if(hourd>=18&&hourd<22)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
	}

}
