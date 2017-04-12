package Bai2;

public class Quantity 
{
	private int quantity;
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	public int getQuantity()
	{
		return this.quantity;
	}
	public Quantity()
	{
		this(0);
	}
	public Quantity(int quantity)
	{
		this.quantity=quantity;
	}
}
