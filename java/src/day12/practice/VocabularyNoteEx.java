package day12.practice;

public class VocabularyNoteEx {

	public static void main(String[] args) {

	Word word1 = new Word("vocabulary", "the words that make up a language");
	word1.print();
	word1.addMeaning("all of the words know and used by a person");	
	word1.print();
	word1.removeMeaning(1);
	word1.print();
	}

}

/* 한 단어를 관리하는 클래스
* - 단어
* - 뜻들
*  
*/
