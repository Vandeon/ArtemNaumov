package mainPackage;

import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		while (true) {
			System.out.println("������� �����, ��������������� ������ ��������� ������� (1-9) ��� 0 ��� ������ :");
			Scanner sc = new Scanner(System.in);
			int key = sc.nextInt();
			switch (key) {
			case 1:
				function1(sc);
				break;
			case 2:
				function2(sc);
				break;
			case 3:
				function3();
				break;
			case 4:
				function4(sc);
				break;
			case 5:
				function5(sc);
				break;
			case 6:
				function6(sc);
				break;
			case 7:
				function7();
				break;
			case 8:
				function8();
				break;
			case 9:
				function9();
				break;
			default:
				System.exit(0);
				break;
			}
		}
	}

	public static void function1(Scanner sc) {
		System.out.println("������� ����� �� 0 �� 9, ����� ������� ��� ����� ��������: \n");
		int a = sc.nextInt();
		switch (a) {
		case 0:
			System.out.println("����.");
			break;
		case 1:
			System.out.println("����.");
			break;
		case 2:
			System.out.println("���.");
			break;
		case 3:
			System.out.println("���.");
			break;
		case 4:
			System.out.println("�������.");
			break;
		case 5:
			System.out.println("����.");
			break;
		case 6:
			System.out.println("�����.");
			break;
		case 7:
			System.out.println("����.");
			break;
		case 8:
			System.out.println("������.");
			break;
		case 9:
			System.out.println("������.");
			break;
		default:
			System.out.println("������� ����� �� 0 �� 9.");
			break;
		}
	};

	public static void function2(Scanner sc) {
		System.out.println("������� �����:");
		int num = sc.nextInt();
		System.out.println("�������� �������������:");
		System.out.println(Integer.toBinaryString(num));
		System.out.println("����������������� �������������:");
		System.out.println(new Formatter().format("%015X;", num).toString());
	};

	public static void function3() {
		int a = 1;
		int b = 1;
		int sum;
		for (int i = 0; i < 23; i++) {
			sum = a + b;
			a = b;
			b = sum;

			if (i > 2)
				System.out.print(sum + " ");
		}
	};

	public static void function4(Scanner sc) {
		System.out.println(
				"������� ������ ��������, ����� ������� ���� ��������� (:), ����� ���������� ������� �������� ��� ������������:");
		String raw = sc.next();
		String result = raw.split(":")[0];
		System.out.println(result.length());
	};

	public static void function5(Scanner sc) {
		System.out.println("������� ����� ��������� ������ �����: ");

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("������� " + (i + 1) + " ������� ������ - ����������� 4-������� �����:");
			arr[i] = sc.nextInt();
		}

		System.out.println("�����: \n");

		for (int i = 0; i < n; i++) {
			String str = "" + arr[i];
			int num1 = Integer.parseInt("" + str.charAt(0));
			int num2 = Integer.parseInt("" + str.charAt(1));
			int num3 = Integer.parseInt("" + str.charAt(2));
			int num4 = Integer.parseInt("" + str.charAt(3));

			if ((num1 + num2) == (num3 + num4)) {
				System.out.print(arr[i] + " ");
			}

			System.out.println("");
		};
	};

	public static void function6(Scanner sc) {
		System.out.println("������� ����� ������� ������ ����������� �����:");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("������� " + (i + 1) + " ������� ������ - ����������� �����:");
			arr1[i] = sc.nextInt();
		}

		System.out.println("������� ����� ������� ������ ����������� �����:");
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for (int i = 0; i < m; i++) {
			System.out.println("������� " + (i + 1) + " ������� ������ - ����������� �����:");
			arr2[i] = sc.nextInt();
		}

		int result = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < m; j++) {
				if (arr1[i] == arr2[j]) {
					result++;
					break;
				}
			}
		}
		System.out.println(
				"���������� ������ ������ ������������������, ����������� � ������� ������ ������������������:");
		System.out.println(result);
	};

	public static void function7() {

		int n = (int) Math.rint(Math.random() * 10 + 10);
		int[] A = new int[n];
		for (int i = 0; i < A.length; i++) {
			A[i] = (int) Math.rint(Math.random() * 100);
		}

		int m = (int) Math.rint(Math.random() * 10 + 10);
		int[] B = new int[m];
		for (int i = 0; i < B.length; i++) {
			B[i] = (int) Math.rint(Math.random() * 100);
		}

		Arrays.sort(A);
		Arrays.sort(B);
		System.out.println("������������������ A: \n" + Arrays.toString(A));
		System.out.println("������������������ B: \n" + Arrays.toString(B));

		int[] C = new int[A.length + B.length];
		int a = 0;
		int b = 0;
		int c = 0;
		while (c != C.length) {
			if (a < A.length) {
				if (A[a] < B[b]) {
					C[c] = A[a];
					a++;
					c++;
				} else {
					C[c] = B[b];
					b++;
					c++;
				}
			} else {
				C[c] = B[b];
				b++;
				c++;
			}
		};

		System.out.println("������������������ C: \n" + Arrays.toString(C));

	};

	public static void function8() {
		
		int n = (int) Math.rint(Math.random() * 10 + 10);
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.rint(Math.random() * 2);
		};
		System.out.println("�������� �����: \n" + Arrays.toString(arr));
		
		boolean check = true;
		while (check) {
			check = false;
			for(int i = 0; i < arr.length - 1; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					check = true;
				}
			};
		}
		System.out.println("���������: \n" + Arrays.toString(arr));
		
	};

	public static void function9() {

		int n = (int) Math.rint(Math.random() * 10 + 10);
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.rint(Math.random() * 100);
		};
		
		System.out.println("�������� ������������������: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			int max = arr[i];
			int index = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] > max) {
					max = arr[j];
					index = j;
				}
			};
			
			int temp = arr[i];
			arr[i] = max;
			arr[index] = temp;
		};

		System.out.println("\n���������: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println();

	};
}
