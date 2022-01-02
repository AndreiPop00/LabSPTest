
public class AlignLeft implements AlignStrategy {
	 
	    public String render(String paragraf) {
	        String text = "##" + paragraf;
	        return text;
	    }
}
