import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.Test;

public class tester2 {
	//tests for triangles
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
	}
	//tests for squares
	@Test
	public void SquareTestPerim(){
		Square square = new Square(2);
		double perimiter = 2*4;
		assertEquals(perimiter, square.getPerimeter(),  0.0002);
	}@Test
	public void SquareTestArea(){
		Square square = new Square(2);
		double area = 2*2;
		assertEquals(area, square.getArea(),  0.0002);
	}
	//tests for circles
	@Test
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
	//tests for ellipse
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
	
	//tests for rectangles
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

	//tests for quads
	@Test
	public void QuadTestPerim(){
		quadrilateral quad = new quadrilateral(2, 2, 2, 2, Math.sqrt(8));
		double perimiter = 8;
		assertEquals(perimiter, quad.getPerimeter(),  0.0002);
	}@Test
	public void QuadTestArea(){
		quadrilateral quad = new quadrilateral(2, 2, 2, 2, Math.sqrt(8));
		double p1 = (2+2+Math.sqrt(8)) * .5;
		double area1 = Math.sqrt(p1*(p1-2)*(p1-Math.sqrt(8))*(p1-2));
		double p2 = (2+2+Math.sqrt(8)) * .5;
		double area2 = Math.sqrt(p1*(p1-2)*(p1-Math.sqrt(8))*(p1-2));
		double area = area1+area2;
		assertEquals(area, quad.getArea(),  0.0002);
	}
	
	//tests for triangle exceptions
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
	
	//tests for circle exceptions
	@Test(expected = InvalidParameterException.class) 
	public void exceptioncircleZero(){
		Circle circle = new Circle(0);
	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionCircleNeg1(){
		Circle circle = new Circle(-1);
	}
	
	//tests for square exceptions
	@Test(expected = InvalidParameterException.class) 
	public void exceptionSquareZero(){
		Square square = new Square(0);	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionSquareNeg(){
		Square square = new Square(-1);
	}
	
	//tests for rectangle exceptions
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
	

	//tests for quad exceptions. Quad shouldn't have any exceptions other than those already tested via triangle, but worth checking anyway
	//honestly, I probably could have done this with like, a loop and some try/catch stuff but like, by the time I realized that would be more efficient I had already written all the code
	@Test(expected = InvalidParameterException.class) 
	public void exceptionQuadZero(){

		quadrilateral quad = new quadrilateral(0, 2, 2, 2, Math.sqrt(8));
	}
	@Test(expected = InvalidParameterException.class) 
	public void exQuadneg1(){

		quadrilateral quad = new quadrilateral(-2, 2, 2, 2, Math.sqrt(8));
	}
	@Test(expected = InvalidParameterException.class) 
	public void exQuadtoobig(){
		quadrilateral quad = new quadrilateral(20000, 2, 2, 2, Math.sqrt(8));
	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionQuadZero2(){
		quadrilateral quad = new quadrilateral(2, 0, 2, 2, Math.sqrt(8));
	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionQuadNeg2(){
		quadrilateral quad = new quadrilateral(2, -2, 2, 2, Math.sqrt(8));
	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionQuadBig2(){
		quadrilateral quad = new quadrilateral(2, 20000, 2, 2, Math.sqrt(8));
	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionQuadZero3(){
		quadrilateral quad = new quadrilateral(2, 2, 0, 2, Math.sqrt(8));
	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionQuadNeg3(){
		quadrilateral quad = new quadrilateral(2, 2, -2, 2, Math.sqrt(8));
	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionQuadBig3(){
		quadrilateral quad = new quadrilateral(2, 2, 20000, 2, Math.sqrt(8));
	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionQuadZero4(){
		quadrilateral quad = new quadrilateral(2, 2, 2, 0, Math.sqrt(8));
	}
	@Test(expected = InvalidParameterException.class) 
	public void exQuadneg4(){
		quadrilateral quad = new quadrilateral(2, 2, 2, -2, Math.sqrt(8));
	}
	@Test(expected = InvalidParameterException.class) 
	public void exQuadtoobi4(){
		quadrilateral quad = new quadrilateral(2, 2, 2, 200000, Math.sqrt(8));
	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionQuadZero5(){
		quadrilateral quad = new quadrilateral(2, 2, 2, 2, 0);
	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionQuadNeg5(){
		quadrilateral quad = new quadrilateral(2, 2, 2, 2, -1*Math.sqrt(8));
	}
	@Test(expected = InvalidParameterException.class) 
	public void exceptionQuadBig5(){
		quadrilateral quad = new quadrilateral(2, 2, 2, 2, 20000000);
	}
}
