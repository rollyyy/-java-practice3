package javavavv;

import java.util.Scanner;

public class first {
	
	/*���� ���߱� ������ ������. 1�� 100������ ���� �ݺ������� �Է��ؼ� ��ǻ�Ͱ� ������ ���� ���߸� ������ ������. 
	 * ����ڰ� ���� �Է��ϸ�, ��ǻ�ʹ� �ڽ��� ������ ���� ���ؼ� ����� �˷��ش�. 
	 * ����ڰ� ��ǻ�Ͱ� ������ ���ڸ� ���߸� ������ ������ �� ������ ���ڸ� ������� �˷��ش�.*/
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int computerNumber = (int)(Math.random() * 100) + 1;
	        int userNumber = 0;
	        int trial = 0;
	        while(userNumber != computerNumber){
	            System.out.println("1�� 100������ ���� �Է��ϼ���.");
	            userNumber = scanner.nextInt();
	            if(userNumber > computerNumber){
	                System.out.println("�� ���� ���� �Է��ϼ���.");
	            }else{
	                System.out.println("�� ū���� �Է��ϼ���.");
	            }
	            trial++;
	        }
	        System.out.println("������ϴ�.\n�õ�Ƚ���� " + trial + "���Դϴ�.");
	    }
	
}
