import java.util.concurrent.TimeUnit;


public class Image extends Element implements Picture {
		private String imageName;

		public Image(String name) {
			this.imageName = name;

			try {
			TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
		
		public void print() {
			 System.out.println( "Image with name: " + imageName );
		}
	
		 public void add(Element element) {}

		 public void remove(Element element) {}

		 public Element get(int nr) {
		      return null;
		 }
		 
		 public String url() {
		      return this.imageName;
		 }

		   public void render() {
		        System.out.println("Image with name: " + this.imageName);
		        content().renderImage();
		    }
		   
		  
		    public PictureContent content() {
		        return new PictureContent(this.imageName);
		    }

		
		    public void accept(Visitor visitor) {
		        visitor.visit(this);
		    }

		    public String getImageName() {
		        return imageName;
		    }

}
