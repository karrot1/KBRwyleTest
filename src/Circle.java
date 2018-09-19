import java.security.InvalidParameterException;
import java.lang.Math.*;

public class Circle implements Shape {
	private double radius;
	public Circle(double nradius) throws InvalidParameterException{
		if(nradius <= 0) {
            throw new InvalidParameterException();
        }
		else{
			radius = nradius;
		}
	}
	
	@Override
	public double getArea() {
				return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return radius * 2 * Math.PI;
	}

}
