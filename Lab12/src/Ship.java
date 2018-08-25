public class Ship 
{
	// Declare the class instance fields as private here:
	private String name_;
	private int crew_;
	// Write a constructor for the Ship class here.
	public Ship(String name, int crew)
	{
		name_=name;
		crew_=crew;
	}
	// Write mutator(set) methods for each instance field:
	public void setName(String nm)
	{
		name_=nm;
	}
	public void setCrew(int cr)
	{
		crew_=cr;
	}
	// Write accessor(get) methods for each instance field:
	public String getName()
	{
		return name_;
	}
	public int getCrew()
	{
		return crew_;
	}
	// Write the toString method to return the instance fields as a String.
	public String toString()
	{
		return String.format("Name is: %s\nCrew # is: %d\n",name_,crew_);
	}
}