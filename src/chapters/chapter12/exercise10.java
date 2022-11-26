package chapters.chapter12;

public class exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            int[] temp = new int[1000000000];
            temp = new int[temp.length * 1000000000];
        } catch (OutOfMemoryError ex) {
            ex.printStackTrace();
        }
	}
}



