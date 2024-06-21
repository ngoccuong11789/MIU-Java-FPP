package lesson5.Folderclosedcurvegood;

public class Rectangle extends ClosedCurve {
	private int length;
	private int height;
	public Rectangle(int length, int height) {
		this.length = length;
		this.height = height;
	}
	@Override
	double computeArea() {
		// TODO Auto-generated method stub
		return length * height;
	}

}
