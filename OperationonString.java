package collegePrograms;
import java.util.*;

public class OperationonString {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string where you want to perform operations:");
		String str = sc.next();
		System.out.println("Enter 1 for sorting the string in Alphabetical order.\nEnter 2 for checking if there is a substring of previous String.\nEnter 3 for changing to uppercase.");
		int choice=-1;
		while(choice!=0) {
		System.out.print("Enter your prefered choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1: char charArray[] = str.toCharArray();
	            Arrays.sort(charArray);
	            System.out.println(new String(charArray));
	            break;
		case 2: System.out.print("Enter a new string:");
		        String st = sc.next();
		        int value = 0;
		        int size = str.length();
		        for(int i=0;i<size;i++) {
		        	for(int j=0; j<st.length(); j++ ) {
		        	if(str.charAt(i)==st.charAt(j)) {
		        		value++;
		        	}
		        	}
		        }
				// NEW LINE
				
		        if(value>=st.length()) {
		        	System.out.println("The string is a substring!");
		        }
		        else {
		        	System.out.println("The string you entered is not a substring of previous string!");
		        }
		        break;
		case 3: System.out.println("The string in uppercase is:"+str.toUpperCase());
		        break;
		default: System.out.println("Enter correct choice!");
		}
		}
		sc.close();
	}

}
