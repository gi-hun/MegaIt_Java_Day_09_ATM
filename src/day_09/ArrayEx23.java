/*
 * # ATM[3단계]
 * 1. 가입
 * . 계좌번호와 비밀번호를 입력받아 가입
 * . 계좌번호 중복검사
 * 2. 탈퇴
 * . 계좌번호를 입력받아 탈퇴
 */

package day_09;

import java.util.Scanner;

public class ArrayEx23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws = {1111, 2222, 0, 0, 0};
		
		int count = 2;
		
		while(true)
		{
			System.out.println("생성되있는 계좌 및 비밀번호");
			System.out.print("계좌 번호 목록[");
			for(int i=0;i<count;i++)
			{
				System.out.print(accs[i] + " ");
			}
			System.out.print("]");
			System.out.println();
			
			System.out.print("비밀 번호 목록[");
			for(int i=0;i<count;i++)
			{
				System.out.print(pws[i] + " ");
			}
			System.out.print("]");
			System.out.println();
			System.out.println();
			
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			
			System.out.println("메뉴 선택: ");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				if(count == 5)
				{
					System.out.println("계좌 생성 공간이 부족합니다.");
					continue;
				}
				
				System.out.println("계좌번호를 입력해주세요");
				int acc = sc.nextInt();
				System.out.println("비밀번호를 입력해주세요");
				int pw = sc.nextInt();
				
				int check = 0;
				for(int i=0; i<count; i++)
				{
					if(accs[i]==acc || pws[i]==pw)
					{
						check = -1;
					}
				}
				
				if(check == -1)
				{
					System.out.println("계좌 번호 또는 비밀 번호가 중복 되었습니다.");
				}
				else
				{
					accs[count] = acc;
					pws[count] = pw;
					count++;
				}
				System.out.println("");
				
			}
			
			else if(select == 2)
			{
				if(count == 0)
				{
					System.out.println("계좌번호가 존재하지 않습니다.");
					System.out.println("계좌번호를 등록해주세요");
					continue;
				}
				System.out.println("");
				
				System.out.println("삭제할 계좌번호를 선택해주세요");
				int acc = sc.nextInt();
				
				int check = -1;
				for(int i=0; i<count; i++)
				{
					if(accs[i]==acc)
					{
						check = i;
					}
				}
				
				if(check == -1)
				{
					System.out.println("해당 계좌번호는 존재하지 않습니다.");
					System.out.println("");
				}
				else
				{
					for(int i=0; i<count-1;i++)
					{
						if(accs[i]==acc)
						{
							accs[i] = accs[i+1];
						}
					}
					System.out.println("성공적으로 탈퇴되었습니다.");
					System.out.println("");
					count--;
				}
			}
		}
	}
}
