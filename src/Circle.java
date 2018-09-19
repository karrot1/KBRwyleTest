import java.security.InvalidParameterException;
import java.lang.Math.*;

public class Circle extends ellipse implements Shape {
	public Circle(double nradius) throws InvalidParameterException{
		super(nradius, nradius);
	}
	

	@Override
	public double getPerimeter() {
		//this requires less infinity, which makes me happy.
		return axis1 * 2 * Math.PI;
	}

}
