public class Table {
	private String title;
	private SubChapter subChapter;
	private Paragraph paragraph;
	
	public Table(String title, SubChapter subChapter) {
		this.title = title;

	}
	
	public void print() {
		 System.out.println( "Table with Title: " + title );
	}

}
