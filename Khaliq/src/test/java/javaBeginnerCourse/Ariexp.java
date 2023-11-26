package javaBeginnerCourse;

public class Ariexp {
	public static void main(String[] args) {
		// int result = 10 +,-,*,/,% 3
		// these are the arithmetic expressions we can use
		// addition sutraction,multiplication, division and
		// modulus for remainder
		// int result = 10 + 3;
		// double result = (double)10/(double)3;
		// int x=1;
		// int y=x++;
		// in this case first the value of x is copied to y
		// and the the x value is incremented, so the value of
		// y remains 1 and x becomes 2
		// int y1=++x;
		// here first the x value is incremented and then
		// it is copied to y
		// x++;
		// ++x;
		// increment the value by 1
		// can used in postfix or prefix X++ or ++X
		// x = x + 2;
		// x += 2; //augmented or compound assignment operator
		// x -= 2;
		// x *= 2;
		// x /= 2;
		int x = 10 + 3 * 2;
		// in mathematics div and multiplication have higher priority
		// so here multi is first executed followed by addition
		// if we want addition first we can use parenthesis
		int x = (10+3)*2;
		System.out.println(x);
		// System.err.println(y);
		// System.out.println(y1);
		// System.out.println(result);
	}

}
