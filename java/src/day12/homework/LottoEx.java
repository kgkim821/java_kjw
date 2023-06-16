package day12.homework;

import java.util.ArrayList;
import java.util.Scanner;

import array.Array;

 public class LottoEx{
	 public static void main(String[] args) {
	
		 System.out.println("input number :");
		 Scanner sc = new Scanner(System.in);
		 
		 int[] usernum = new int [6];
		 
		 for(int i =0;i<6;i++) {
			 usernum[i] = sc.nextInt();
		 }
	 
		 
		 int min=1 , max=45 ;
		 int [] lottonum  = new int[6];
		 Array.createRandomArray(min, max, lottonum);
		 
		 sc.close();
	 
	 
	 }
 }
	/*
	 * 로또 번호를 생성하고, 사용자가 번호를 입력하면 몇등인지 출력하는 코드를 작성하세요.
로또 번호는 1~45
(package : day12.homework, file : LottoEx)
1등 : 번호 6개
2등 : 번호 5개 + 보너스
3등 : 번호 5개
4등 : 번호 4개
5등 : 번호 3개
number: [1, 3, 40, 23, 24, 45]
bonus : 2
user  : 1 2 3 4 5 6
losing ticket!

	 */
	