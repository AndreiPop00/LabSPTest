import java.util.concurrent.TimeUnit;


public class Image extends Element implements Picture {
		private String imageName;

		public Image(String name) {
			this.imageName = name;

			try {
			TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
		
		public void print() {
			 System.out.println( "Image with name: " + imageName );
		}
	
		 public void add(Element el) {}

		 public void remove(Element el) {}

		 public Element get(int num) {
		      return null;
		 }
		 
		 public String url() {
		      return this.imageName;
		 }

	     public PictureContent content() {
	
			return null;
		 }

}
