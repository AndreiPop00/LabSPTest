

public class ImageProxy extends Element implements Picture,Visitee{
	private String url;
	private Image realImg;
	
	public ImageProxy(String url) {
		this.url = url;
	}
	
	public Image loadImage() {
		if(realImg == null) {
			realImg = new Image(url);
		}
		return realImg;
	}
	
	
	void print() {
		loadImage();
		realImg.print();
	}
	
	void render() {
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

	 public void accept(Visitor visitor) {
	       visitor.visit(this);
	 }
}
