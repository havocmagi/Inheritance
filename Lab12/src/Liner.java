
public class Liner extends Ship
{
	private int passengers_;
	
	public Liner(String name, int crew, int passengers)
	{
		super(name, crew);
		passengers_=passengers;
	}
	
	public void setPassengers(int pass)
	{
		passengers_=pass;
	}
	
	public int getPassengers()
	{
		return passengers_;
	}
	
	public String toString()
	{
		String str=super.toString();
		return str + String.format("# of Passengers is: %d\n",passengers_);
	}
}
