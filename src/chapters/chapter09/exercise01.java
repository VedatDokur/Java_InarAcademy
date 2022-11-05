package chapters.chapter09;

public class exercise01 {

	
		// TODO Auto-generated method stub
		private double width;
	    private double height;

	    public exercise01() {
	        this.width = 1.0;
	        this.height = 1.0;
	    }

	    public exercise01(double width, double height) {
	        this.width = width;
	        this.height = height;
	    }

	    
	    public double getArea() {
	        return this.width * this.height;
	    }
	   
	    public double getPerimeter() {
	        return this.width * 2 + this.height * 2;
	    }
	}

}
