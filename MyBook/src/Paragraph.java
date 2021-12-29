
public class Paragraph extends Element {
	private String text;
	
	
	
	public Paragraph(String text) {
		this.text = text;
		
	}
	
	public void print() {
		 System.out.println( "Paragraph: " + text );
	}
	
	
	 public void add(Element el) {}

	
	 public void remove(Element el) {}

	
	 public Element get(int num) {
	      return null;
	 }
	 
}
