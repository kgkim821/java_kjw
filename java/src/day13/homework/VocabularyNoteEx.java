package day13.homework;

import java.util.Scanner;


import day12.practice.VocabularyNote;
import day12.practice.Word;
import lombok.Data;

public class VocabularyNoteEx {


		/*
		 * 영어 단어장 프로그램을 구현하세요.
Word, VocabularyNote 클래스 이용
(package : day13.homework, file : VocabularyNoteEx)
메뉴
단어 추가
단어 삭제
단어 수정
단어 출력
프로그램 종료
메뉴 선택 : 3
서브 메뉴
단어 수정
뜻 수정
뜻 삭제
서브 메뉴 선택 : 1
수정할 단어 : a
수정될 단어 : A
수정에 성공했습니다.

		 */
	
	public static void main(String[] args) {

		
		
		
		Scanner sc = new Scanner(System.in);
		
        int num,num2;
        //VocabularyNote voca = new VocabularyNote();
        Word wordList[] = {
				new Word("abc"),
				new Word("def","def is define")
		};
      		
		VocabularyNote note = new VocabularyNote(wordList);
		
		
		
		do {
            System.out.println("Menu:");
            System.out.println("1. Add a word");
            System.out.println("2. Delete a word");
            System.out.println("3. Modify a word");
            System.out.println("4. Output all words");
            System.out.println("5. Exit the program");
            System.out.print("Enter your choice: ");
            num = sc.nextInt();

            switch (num) {
                case 1:
                	System.out.print("input word :(ex : (word) (meaning)): ");
                	String str1 = sc.next();
                	String str2 = sc.nextLine();
                	
                	note.insert(str1, str2);
                	break;
                case 2:
                	System.out.println("input word :");
                	String str3 = sc.next();
                	
                	note.delete(str3);
                	
                    break;
                case 3:
                	 System.out.println("1. Change a word");
                     System.out.println("2. Change a meaning");
                     System.out.println("3. delete a meaning");
                     System.out.println("Input number : ");

                     int num1 = sc.nextInt();
                     if(num1 == 1) {
                    	 System.out.println("input title and change title :");
                    	 String title = sc.next();
                    	 String chgtitle = sc.nextLine();
                    	 note.updateTitle(title, chgtitle);
                    	 break;
                    	 
                     }else if (num1 ==2 ) {
                    	 System.out.println("input title and change meaning , title , meaning");
                    	 
                    	 
                    	 
            
                    	 
                    	 
                    	 
                     }else if (num1 ==3) {
                    	 
                    	 
                     }
                     
                    break;
                case 4:
                	
                	note.print();
                	
                    break;
                case 5:
                    System.out.println("Exiting the program");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
		
		}while (num != 5 );
		sc.close();
	}
}
