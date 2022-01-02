
public class AlignRight implements AlignStrategy {
	 
	    public String render(String paragraf) {
	        String text = paragraf + "##";
	        return text;
	    }
}