package AlarmClockProjects;

import java.util.*;

public class AlarmClockRunner {
	public static void main(String args[])
	{
		Scanner myscan = new Scanner(System.in);
		int hours = myscan.nextInt();
		int minutes = myscan.nextInt();
		int seconds = myscan.nextInt();
		AlarmClock myclock = new AlarmClock(hours, minutes, seconds, "Alert");
		myclock.activate();
		Date lasttime = new Date();
		while(!myclock.playAlarm(newtime.getHours(), newtime.getMinutes(), newtime.getSeconds(), true))
		{
			
			Date newtime = new Date();
			if(newtime.getHours() != lasttime.getHours()  || newtime.getMinutes() != lasttime.getMinutes() || newtime.getSeconds() != lasttime.getSeconds())
				System.out.println(newtime.getHours() + ":" + newtime.getMinutes() + ":" + newtime.getSeconds());
			lasttime = newtime;
		}
		myscan.close();
	}
}
