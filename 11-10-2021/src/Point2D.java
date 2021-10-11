
public class Point2D {
	
	private int x,y;
	
	public Point2D(int a,int b) {
		x = a;
		y = b;
	}
	
	//to get details
	
	public String getDetails() {
		
		return "Point ("+x+","+y+")";
		
	}
	
	public boolean isEqual(Point2D p2) {
		
		if(x==p2.getX() && y==p2.getY()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//to creating new points
	public Point2D createNewPoint(int n1,int n2) {
		
		int xx = n1 + x;
		int yy = n2 + y;
		Point2D newPoint = new Point2D(xx,yy);
		return newPoint;
		//return "Point ("+x+","+y+")";
		
	}
	
	//to access x and y
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

}
