package dad.codesignal;

public class TheJourneyBegins {
	
	int add(int param1, int param2) {
	    return param1 + param2;
	}
	
	int centuryFromYear(int year) {
	    return (int)Math.floor(year / 100.0) + ((year % 100.0 == 0) ? 0 : 1);	    
	}

	boolean checkPalindrome(String inputString) {
	    int count=0,i=0,d=inputString.length()-1;
	    char[] String1;
	    String1=inputString.toCharArray();
	    while (((i!=Math.round(String1.length-1/2))&&(d!=Math.round(String1.length-1/2)))&&(String1[i]==String1[d])) {
	        i++;
	        d--;
	        count++;
	    }
	    if (count>=Math.round(String1.length-1/2)) {
	        return true;
	    }
	    else {
	        return false;
	    }
	}
}
