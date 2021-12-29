
public class Image extends Element {
	private String imageName;

	public Image(String imageName) {
		this.imageName = imageName;

	}
	
	public void print() {
		 System.out.println( "Image with name: " + imageName );
	}
		
	 public void add(Element element) {}

	 public void remove(Element element) {}

	 public Element get(int nr) {
	      return null;
	 }

}
