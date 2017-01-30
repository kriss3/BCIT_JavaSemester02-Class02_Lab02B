package pl.kriss3.class02;

public enum DayMap {
	
	Saturday(0), 
	Sunday(1),
	Monday(2), 
	Tuesday(3),
	Wednesday(4), 
	Thursday(5),
	Friday(6);

	int value;
	
	private DayMap(int value)
	{
		this.value = value;
	}
}
