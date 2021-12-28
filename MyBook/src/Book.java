
public class Book {
	String title;
	Author auth_Name;
	public Chapter chapter_Name;
	public Book (String title) {
		this.title = title;
	}
	public void addAuthor(Author name) {
		this.auth_Name = name;
	}
	public int createChapter(String chap) {
		
		int nr = Integer.valueOf(chap.replaceAll("[^0-9?!\\.]",""));
		return nr;
	}
	
	public Chapter getChapter(int chapter)
	{
		String nr = String.valueOf(chapter) + ".x";
		Chapter ceva = new Chapter();
		ceva.setChapter(nr);
		this.chapter_Name = ceva;
		return chapter_Name;
	}
}	
