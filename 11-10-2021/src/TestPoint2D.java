
public class TestPoint2D {
	public static void main(String[] args) {
        
		Point2D p1 = new Point2D(10,20);
		Point2D p2 = new Point2D(40,30); //creating points
		Point2D p3 = p1.createNewPoint(5,-2);
		System.out.println("for point 1: "+p1.getDetails());
		System.out.println("for point 2: "+p2.getDetails());
		System.out.println("for point 3: "+p3 .getDetails());
		System.out.println("comparision between p1 and p2 : "+ p1.isEqual(p2));  //for creating an
		
		
		//Point2D p2 = p1.createNewPoint(5,-2);
		// p3 = p1.createNewPoint(5,-2);
		
	}
}
