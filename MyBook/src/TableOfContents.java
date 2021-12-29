
public class TableOfContents extends Element{
    String title;

    public TableOfContents(String title) {
        this.title = title;
    }

    
    public void print() {
        System.out.println("TableOfContents with title: " + this.title);
    }

    
    public void add(Element element) {

    }

    
    public void remove(Element element) {

    }

   
    public Element get(int nr) {
        return null;
    }
}
