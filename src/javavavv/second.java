package javavavv;

public class second {
	
	/*숫자로 이루어진 문자열 str이 있을 때 각 자리의 합을 더한 결과를 출력하는 코드를 완성하여라. 
	 * 만일 문자열이 "12345"이라면, '1+2+3+4+5"의 결과인 15를 출력이 출력되어야 한다.*/


	
	    public static void main(String[] args) {
	        String str = "12345";
	        int sum = 0;
	        for (String number : str.split("")){
	            sum += Integer.parseInt(number);
	        }
	        System.out.println("sum = " + sum);
	    }
	}

