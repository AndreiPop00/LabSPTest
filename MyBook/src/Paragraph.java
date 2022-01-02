

public class Paragraph extends Element implements Visitee {
		private String text;
		
		private AlignStrategy textAlignment;
		
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
		 
		 public void setText(String text) {
		        this.text = text;
		    }
		 
		 public void setAlignStrategy(AlignStrategy alst) {
		       this.textAlignment = alst;
		       setText(alst.render(this.text));
		    }

		 public AlignStrategy getTextAlignment() {
		       return textAlignment;
		   }

		 public String getText() {
		       return text;
		    }

		 public void render() {
		      System.out.println("Paragraph: " + this.text);
		 }
		 
		  public void accept(Visitor visitor) {
		      visitor.visit(this);
		  }
}
