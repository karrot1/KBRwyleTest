import java.security.InvalidParameterException;

public class quadrilateral implements Shape {
	private Triangle ab;
	private Triangle cd;
	private double diag;
	public quadrilateral(double nsideA, double nsideB, double nsideC, double nsideD, double ndiag) throws InvalidParameterException{
		//the diag is from AD to BC
		ab = new Triangle(nsideA, nsideB, ndiag);
		cd = new Triangle(nsideC, nsideD, ndiag);
		diag = ndiag;
	}
	@Override
	public double getArea() {
		return ab.getArea() + cd.getArea();
	}

	@Override
	public double getPerimeter() {
		return ab.getPerimeter() + cd.getPerimeter() - diag*2;
	}

}
