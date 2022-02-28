package javavavv;

import java.util.Scanner;

public class first {
	
	/*숫자 맞추기 게임을 만들자. 1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임은 끝난다. 
	 * 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다. 
	 * 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번만에 숫자를 맞췄는지 알려준다.*/
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int computerNumber = (int)(Math.random() * 100) + 1;
	        int userNumber = 0;
	        int trial = 0;
	        while(userNumber != computerNumber){
	            System.out.println("1과 100사이의 값을 입력하세요.");
	            userNumber = scanner.nextInt();
	            if(userNumber > computerNumber){
	                System.out.println("더 작은 수를 입력하세요.");
	            }else{
	                System.out.println("더 큰수를 입력하세요.");
	            }
	            trial++;
	        }
	        System.out.println("맞췄습니다.\n시도횟수는 " + trial + "번입니다.");
	    }
	
}
