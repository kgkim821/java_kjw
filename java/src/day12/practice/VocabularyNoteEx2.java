package day12.practice;

public class VocabularyNoteEx2 {

	public static void main(String[] args) {
		Word wordList[] = {
				new Word("abc"),
				new Word("def","def is define")
		};
		
		
		
		VocabularyNote note = new VocabularyNote(wordList);
		//note.print();
	
		Word word = new Word("a", "a");
		note.insert(word);
		//note.print();
		note.insert("b","b is b");
		//note.print();
		
		//note.delete("c"); 
		note.delete("a");
		//note.print();
		
		//note.serch("a");
		//note.serch("b");
		
		note.insert("b", "b");
		note.print();
		
		note.updateMeaning("b", 2, "B");
		note.updateMeaning("b", 3, "B"); //Wrong number
		note.print();
		
		note.updateTitle("b", "B");
		note.updateTitle("b", "B");
		note.print();
		
	}

}

