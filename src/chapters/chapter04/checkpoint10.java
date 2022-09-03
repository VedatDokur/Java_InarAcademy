package chapters.chapter04;

public class checkpoint10 {

	public static void main(String[] args) {
		//Comparing Strings, compareTo
		
		String str1 = "java";
		String str2 = "JAVA";
		int comparevalue = str1.compareTo(str2);
		if(comparevalue == 0) {
			System.out.println("same");
		}else if  (comparevalue > 0){
			System.out.println(str1 + " Greater than " + str2);
		}else {
			System.out.println(str1 + " Less than " + str2);
		}
	}
}
		
			
		
	


