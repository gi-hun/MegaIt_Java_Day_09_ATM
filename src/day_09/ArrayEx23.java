/*
 * # ATM[3�ܰ�]
 * 1. ����
 * . ���¹�ȣ�� ��й�ȣ�� �Է¹޾� ����
 * . ���¹�ȣ �ߺ��˻�
 * 2. Ż��
 * . ���¹�ȣ�� �Է¹޾� Ż��
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
			System.out.println("�������ִ� ���� �� ��й�ȣ");
			System.out.print("���� ��ȣ ���[");
			for(int i=0;i<count;i++)
			{
				System.out.print(accs[i] + " ");
			}
			System.out.print("]");
			System.out.println();
			
			System.out.print("��� ��ȣ ���[");
			for(int i=0;i<count;i++)
			{
				System.out.print(pws[i] + " ");
			}
			System.out.print("]");
			System.out.println();
			System.out.println();
			
			System.out.println("1.����");
			System.out.println("2.Ż��");
			
			System.out.println("�޴� ����: ");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				if(count == 5)
				{
					System.out.println("���� ���� ������ �����մϴ�.");
					continue;
				}
				
				System.out.println("���¹�ȣ�� �Է����ּ���");
				int acc = sc.nextInt();
				System.out.println("��й�ȣ�� �Է����ּ���");
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
					System.out.println("���� ��ȣ �Ǵ� ��� ��ȣ�� �ߺ� �Ǿ����ϴ�.");
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
					System.out.println("���¹�ȣ�� �������� �ʽ��ϴ�.");
					System.out.println("���¹�ȣ�� ������ּ���");
					continue;
				}
				System.out.println("");
				
				System.out.println("������ ���¹�ȣ�� �������ּ���");
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
					System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�.");
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
					System.out.println("���������� Ż��Ǿ����ϴ�.");
					System.out.println("");
					count--;
				}
			}
		}
	}
}
