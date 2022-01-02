import java.util.LinkedList;
import java.util.List;

public class TableOfContents extends Element{
    String title;
    List<Element> listaElemente = new LinkedList<>();

    public TableOfContents(String title) {
        this.title = title;
    }

    
    public void print() {
        System.out.println("TableOfContents with title: " + this.title);
    }

    
    public void add(Element element) {
    	if (element.parent == null) {
            this.listaElemente.add(element);
            element.parent = this;
        }

    }

    
    public void remove(Element element) {
    	this.listaElemente.remove(element);

    }

    
    public Element get(int nr) {
    	return this.listaElemente.get(nr);
    }
    
 
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    public void render() {
        System.out.println("Table of contents with title: " + this.title);
        for (Element element:listaElemente) {
            element.print();
        }
    }
}
