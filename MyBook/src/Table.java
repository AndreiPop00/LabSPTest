public class Table extends Element implements Visitee {
	private String title;
	
	
	public Table(String title) {
		this.title = title;
	}
	
	public void print() {
		 System.out.println( "Table with Title: " + title );
	}
	
	
	 public void add(Element element) {}

	
	 public void remove(Element element) {}

	 
	 public Element get(int nr) {
	      return null;
	 }
	 
	 public void render() {
	        System.out.println("Table with Title: " + this.title);
	 }
	 
	 
	 public void accept(Visitor visitor) {
	      visitor.visit(this);
	 }

	 public String getTitle() {
	     return title;
	 }

}
