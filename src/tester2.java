import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.Test;

public class tester2 {

	@Test
	public void TriTestPerim(){
		Triangle triangle = new Triangle(1, Math.sqrt(2), 1);
		double perimiter = 1+1+Math.sqrt(2);
		assertEquals(perimiter, triangle.getPerimeter(),  0.0002);
	}@Test
	public void TriTestArea(){
		Triangle triangle = new Triangle(1, Math.sqrt(2), 1);
		double p = (1+1+Math.sqrt(2)) * .5;
		double area = Math.sqrt(p*(p-1)*(p-Math.sqrt(2))*(p-1));
		assertEquals(area, triangle.getArea(),  0.0002);
	}@Test
	public void SquareTestPerim(){
		Square square = new Square(2);
		double perimiter = 2*4;
		assertEquals(perimiter, square.getPerimeter(),  0.0002);
	}@Test
	public void SquareTestArea(){
		Square square = new Square(2);
		double area = 2*2;
		assertEquals(area, square.getArea(),  0.0002);
	}@Test
	public void CircleTestPerim(){
		Circle circle = new Circle(3);
		double perimiter =3*2 * Math.PI;
		assertEquals(perimiter, circle.getPerimeter(),  0.0002);
	}@Test
	public void CircleTestArea(){
		Circle circle = new Circle(3);
		double area = 3*3*Math.PI;
		assertEquals(area, circle.getArea(),  0.0002);
	}
	@Test
	public void EllipseTestPerim(){
		double axis1=3;
		double axis2=4;
		ellipse elipse = new ellipse(axis1, axis2);
		double h = ((axis1-axis2)*(axis1-axis2))/((axis1+axis2)*(axis1+axis2));
		double perim = Math.PI * (axis1+axis2)*(1+ (h/4) + (h*h)/64 + (h*h*h)/256);
		assertEquals(perim, elipse.getPerimeter(),  0.0002);
	}@Test
	public void EllipseTestArea(){
		ellipse elipse = new ellipse(3, 4);
		double area = 3*4*Math.PI;
		assertEquals(area, elipse.getArea(),  0.0002);
	}
	@Test
	public void RectangleTestPerim(){
		Rectangle rectangle = new Rectangle(2, 3);
		double perimiter =3+3+2+2;
		assertEquals(perimiter, rectangle.getPerimeter(),  0.0002);
	}@Test
	public void RectangleTestArea(){
		Rectangle rectangle = new Rectangle(2, 3);
		double area = 3*2;
		assertEquals(area, rectangle.getArea(),  0.0002);
	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionTriangleZero(){
		Triangle triangle = new Triangle(1, Math.sqrt(2), 0);
	}
	@Test(expected = InvalidParameterException.class) 
	public void extriangleneg1(){
		Triangle triangle = new Triangle(1, Math.sqrt(2), -1);
	}
	@Test(expected = InvalidParameterException.class) 
	public void extriangletoobig(){
		Triangle triangle = new Triangle(1, Math.sqrt(2), 100);
	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionTriangleZero2(){
		Triangle triangle = new Triangle(1, 0, 1);
	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionTriangleNeg2(){
		Triangle triangle = new Triangle(1, -2, 1);
	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionTriagBig2(){
		Triangle triangle = new Triangle(1, 600000, 1);
	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionTriangleZero3(){
		Triangle triangle = new Triangle(0, Math.sqrt(2), 1);
	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionTriangleNeg3(){
		Triangle triangle = new Triangle(-1, Math.sqrt(2), 1);
	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionTriagBig3(){
		Triangle triangle = new Triangle(100000, Math.sqrt(2), 1);
	}	
	@Test(expected = InvalidParameterException.class) 
	public void exceptioncircleZero(){
		Circle circle = new Circle(0);
	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionCircleNeg1(){
		Circle circle = new Circle(-1);
	}
	
	@Test(expected = InvalidParameterException.class) 
	public void exceptionSquareZero(){
		Square square = new Square(0);	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionSquareNeg(){
		Square square = new Square(-1);
	}
	
	
	@Test(expected = InvalidParameterException.class) 
	public void exceptionRectangleZero(){
		Rectangle rectangle = new Rectangle(2, 0);	
		}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionRectangleNeg(){
		Rectangle rectangle = new Rectangle(2, -1);
	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionRectangleZero2(){
		Rectangle rectangle = new Rectangle(0, 1);	
		}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionRectangleNeg2(){
		Rectangle rectangle = new Rectangle(-2, 1);
	}
}
