package chapters.chapter09;

public class exercise08 {

	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;

	private int mSpeed;
	private boolean mOn;
	private double mRadius;
	private String mColor;

	public exercise08() {
		mSpeed = 1;
		mRadius = 5;
		mColor = "white";
	}

	public int getSpeed() {
		return mSpeed;
	}

	public void setSpeed(int speed) {
		mSpeed = speed;
	}

	public boolean isOn() {
		return mOn;
	}

	public void setOn(boolean on) {
		mOn = on;
	}

	public double getRadius() {
		return mRadius;
	}

	public void setRadius(double radius) {
		mRadius = radius;
	}

	public String getColor() {
		return mColor;
	}

	public void setColor(String color) {
		mColor = color;
	}

	public String toString() {
		if (isOn()) {
			return "Speed: " + getSpeed() + " Color: " + getColor() + " Radius: " + getRadius();
		} else {
			return "Color: " + getColor() + " Radius: " + getRadius() + ". The fan is OFF.";
		}
	}
}
