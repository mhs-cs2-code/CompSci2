package AlarmClockProjects;

public class AlarmClock {
	private int alarmHour;
	private int alarmMinutes;
	private int alarmSeconds;
	private String alarmSound;
	public AlarmClock(int h, int m, int sec, String s)
	{
		alarmHour = h;
		alarmMinutes = m;
		alarmSeconds = sec;
		alarmSound = s;
	}
	public AlarmClock(int h, int m, int sec, String s, boolean PM)
	{
		alarmHour = h + (PM ? 12 : 0);
		alarmMinutes = m;
		alarmSeconds = sec;
		alarmSound = s;
	}

	public void setTime(int h, int m, int s)
	{
		alarmHour = h;
		alarmMinutes = m;
		alarmSeconds = s;
	}
	public int[] getTime()
	{
		int[] x = new int[3];
		x[0] = alarmHour;
		x[1] = alarmMinutes;
		x[2] = alarmSeconds;
		return x;
	}
	public String getSound()
	{
		return alarmSound;
	}
	public void setSound(String s)
	{
		alarmSound = s;
	}
	public int playAlarm(int h, int m, int s, boolean playsound)
	{
		if(alarmHour == h && alarmMinutes == m && alarmSeconds <= s)
		{
			if(playsound)
				this.playSound();
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public void playSound()
	{
		System.out.println("Playing Sound: " + alarmSound);
	}
}
