package pl.kriss3.class02;

public enum MonthMap {

	JANUARY(1),
	FEBRUARY(4),
	MARCH(4),
	APRIL(0),
	MAY(2),
	JUNE(5),
	JULY(0),
	AUGUST(3),
	SEPTEMBER(6),
	OCTOBER(1),
	NOVEBMBER(4),
	DECEMBER(6);
	
	private int numValue;
	private MonthMap(int value)
	{
		numValue = value;
	}
	
	public int getNumericValue()
	{
		return numValue;
	}
}
