package Bai3;

public class ComplexNumber 
{
	private double realPart,imaginaryPart;
	public ComplexNumber()
	{
		this(0,0);
	}
	public ComplexNumber(double realPart,double imaginaryPart)
	{
		this.realPart=realPart;
		this.imaginaryPart=imaginaryPart;
	}
	public void setRealPart(double realPart)
	{
		this.realPart=realPart;
	}
	public double getRealPart()
	{
		return this.realPart;
	}
	public void setImaginaryPart(double imaginaryPart)
	{
		this.imaginaryPart=imaginaryPart;
	}
	public double getImaginaryPart()
	{
		return this.imaginaryPart;
	}
	public ComplexNumber add(ComplexNumber other)
	{
		ComplexNumber x = new ComplexNumber();
		x.imaginaryPart = this.imaginaryPart + other.imaginaryPart;
		x.realPart = this.realPart + other.realPart;
		return x;
	}
	public ComplexNumber subtract(ComplexNumber other)
	{
		ComplexNumber x = new ComplexNumber();
		x.imaginaryPart = this.imaginaryPart - other.imaginaryPart;
		x.realPart = this.realPart - other.realPart;
		return x;
	}
	public ComplexNumber multiply(ComplexNumber other)
	{
		ComplexNumber x = new ComplexNumber();
		x.imaginaryPart = this.imaginaryPart*other.realPart + this.realPart*other.imaginaryPart;
		x.realPart = this.realPart*other.realPart - this.imaginaryPart*other.imaginaryPart;
		return x;
	}
	public ComplexNumber divide(ComplexNumber other)
	{
		ComplexNumber x = new ComplexNumber();
		double sumsquare = other.realPart*other.realPart+other.imaginaryPart*other.imaginaryPart;
		x.imaginaryPart = (this.imaginaryPart*other.realPart-this.realPart*other.imaginaryPart)/sumsquare;
		x.realPart = (this.realPart*other.realPart+this.imaginaryPart*other.imaginaryPart)/sumsquare;
		return x;
	}
	public ComplexNumber pow(int n)
	{
		ComplexNumber x = new ComplexNumber(this.realPart,this.imaginaryPart);
		ComplexNumber y = x;
		for (int i=1;i<n;i++)
			y = y.multiply(x);
		return y;
	}
	public String toString()
	{
		if (this.realPart==0) return this.imaginaryPart+""; 
		if (this.imaginaryPart<0) return this.realPart + " - " + (-this.imaginaryPart) +"i";
		if (this.imaginaryPart==0) return this.realPart+"";
		else return this.realPart + " + " + this.imaginaryPart +"i";
	}
}
