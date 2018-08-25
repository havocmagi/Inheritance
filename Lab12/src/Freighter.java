
public class Freighter extends Ship
{
	private double capacity_;
	
	public Freighter(String name, int crew, double capacity)
	{
		super(name, crew);
		capacity_=capacity;
	}
	
	public void setCapacity(double cap)
	{
		capacity_=cap;
	}
	
	public double getCapacity()
	{
		return capacity_;
	}
	
	public String toString()
	{
		String str=super.toString();
		return str + String.format("Capacity is: %.2f \n",capacity_);
	}
}
