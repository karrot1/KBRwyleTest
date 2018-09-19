import java.security.InvalidParameterException;

public class ellipse implements Shape {
	protected double axis1;
	protected double axis2;
	public ellipse(double naxis1, double naxis2) throws InvalidParameterException{
		if(naxis1 > 0 && naxis2 > 0){
			axis1=naxis1;
			axis2=naxis2;
		}
		else{
            throw new InvalidParameterException();
		}
	} 
	@Override
	public double getArea() {
		return Math.PI * axis1 * axis2;
	}

	@Override
	public double getPerimeter() {
		//this isn't exact and that makes me sad
		double h = ((axis1-axis2)*(axis1-axis2))/((axis1+axis2)*(axis1+axis2));
		return Math.PI * (axis1+axis2)*(1+ (h/4) + (h*h)/64 + (h*h*h)/256);
	}

}
