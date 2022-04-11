import java.util.*;

public class Day8Line {
	
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private float length1;
	private float length2;
	
	public Day8Line(int x1, int x2, int y1, int y2) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	
//	UC1...To calculate length of two lines
	public double Length() {
		double length=0;
		double x=Math.pow((x2-x1), 2);
		double y=Math.pow((y2-y1), 2);
		
		length=Math.pow((x+y), 0.5);
		return length;
	}
	
//	UC2...To compare length of two lines
	public static void compareTo(float length1, float length2){
		if(length1>length2) {
			System.out.println(length1+" is greater than "+length2);
		}else if(length2>length1) {
			System.out.println(length2+" is greater than "+length1);
		}else {
			System.out.println(length1+" and "+length2+" are equal Lines.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparison Computation program...");
		
		Day8Line line1 = new Day8Line(4, 8, 7, 13);
		line1.length1=(float) line1.Length();
		System.out.println("Length of line1= "+line1.length1);
		
		Day8Line line2 = new Day8Line(7, 14, 16, 39);
		line2.length2=(float) line2.Length();
		System.out.println("Length of line2= "+line2.length2);
		
		compareTo(line1.length1, line2.length2);
	}

}
