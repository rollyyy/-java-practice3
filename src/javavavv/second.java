package javavavv;

public class second {
	
	/*���ڷ� �̷���� ���ڿ� str�� ���� �� �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��Ͽ���. 
	 * ���� ���ڿ��� "12345"�̶��, '1+2+3+4+5"�� ����� 15�� ����� ��µǾ�� �Ѵ�.*/


	
	    public static void main(String[] args) {
	        String str = "12345";
	        int sum = 0;
	        for (String number : str.split("")){
	            sum += Integer.parseInt(number);
	        }
	        System.out.println("sum = " + sum);
	    }
	}

