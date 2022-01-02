


public class SubChapter extends Element {
	private String name;
	private Chapter chapter;
	
	public SubChapter(String name, Chapter chapter) {
		this.name = name;
		this.chapter = chapter;
	}
	
	public void print() {
		 System.out.println( "Subchapter: " + name );
		
	}
	
	 public void add(Element element) {}

	 
	 public void remove(Element element) {}

	
	 public Element get(int nr) {
	      return null;
	 }

}