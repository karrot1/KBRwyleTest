import java.security.InvalidParameterException;

public class Rectangle implements Shape {
	protected double length;
	protected double width;
	public Rectangle(double nside1, double nside2) throws InvalidParameterException{
		if(nside1 <= 0 || nside2 <= 0) {
            throw new InvalidParameterException();
        }
		else{
			length = nside1;
			width = nside2;
		}
	}
	@Override
	public double getArea() {
		return length*width;
	}

	@Override
	public double getPerimeter() {
		return length*2 + width*2;
	}

}
