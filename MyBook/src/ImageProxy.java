

public class ImageProxy extends Element implements Picture{
	private String url;
	private Image realImg;
	
	public ImageProxy(String url) {
		this.url = url;
		this.realImg = null;

	}
	
	public Image loadImage() {
		if(realImg == null) {
			realImg = new Image(url);
		}
		return realImg;
	}
	
	public void print() {
		loadImage();
		 realImg.print();
	}
	
	
	 public void add(Element element) {}

	
	 public void remove(Element element) {}

	 
	 public Element get(int nr) {
	      return null;
	 }
	 
	
	 public String url() {
	     return this.url;
	 }

		
	 public PictureContent content() {
			
		return null;
	 }

}
