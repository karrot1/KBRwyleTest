import java.security.InvalidParameterException;

public class Square extends Rectangle implements Shape{
	public Square(double nside1) throws InvalidParameterException{
		super(nside1, nside1);
	}

}
