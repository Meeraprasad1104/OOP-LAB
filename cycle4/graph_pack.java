import graphics.*;
import java.util.*;
public class graph_pack implements graphics.square,graphics.circle
{
	public double area_sq(double s)
	{
		return (s*s);
	}
	public double area_cir(double r)
	{
		return ((22.0/7.0)*r*r);
	}	
	public static void main(String[] args)
	{
		recta k = new recta();
		triangle t = new triangle();
		graph_pack s = new graph_pack();
		//circle c = new circle();
		System.out.println("\n--Rectangle--\nLength:: 3\nBreadth:: 4\nArea:: " + k.area(3,4));
		System.out.println("\n--Triangle--\nBase:: 3\nHeight:: 4\nArea:: :: " + t.area_tri(3,4));
		System.out.println("\n--Square--\nBase:: 3\nArea:: " + s.area_sq(3));
		System.out.println("\n--Circle--\nRadius:: 3\nArea:: " + s.area_cir(3));
	}
}