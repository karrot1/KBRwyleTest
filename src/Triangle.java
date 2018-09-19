import java.security.InvalidParameterException;

public class Triangle implements Shape {
	private double side1;
	private double side2;
	private double side3;
	public Triangle(double nside1, double nside2, double nside3) throws InvalidParameterException{
		if(nside1 + nside2 > nside3 && nside1 + nside3 > nside2 && nside2+nside3>nside1 && nside1 > 0 && nside2 > 0 && nside3 > 0){
			side1=nside1;
			side2=nside2;
			side3 = nside3;
		}
		else{
            throw new InvalidParameterException();
		}
	}
	@Override
	public double getArea() {
		double p = getPerimeter() * .5;
		return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
	}

	@Override
	public double getPerimeter() {
		return side1+side2+side3;
	}

}
