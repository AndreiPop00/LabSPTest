
public class Paragraph {
	private String text;
	private SubChapter subChapter;
	
	
	public Paragraph(String text, SubChapter subChapter) {
		this.text = text;

	}
	
	public void print() {
		 System.out.println( "Paragraph: " + text );
	}

	 public void setText(String text) {
	        this.text = text;
	    }

	 public String getText() {
	       return text;
	    }

}
