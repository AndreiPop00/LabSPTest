
import java.util.LinkedList;
import java.util.List;

public class Section extends Element {
    String title;
    List<Element> elementList = new LinkedList<>();

    public Section(String title) {
        this.title = title;
    }

    
    public void add(Element element) {
        if (element.parent == null) {
            this.elementList.add(element);
            element.parent = this;
        }
    }

  
    public void remove(Element element) {
        this.elementList.remove(element);
    }

   
    public Element get(int nr) {
        return this.elementList.get(nr);
    }

    
    public void print() {
        System.out.println(this.title);
        for (Element element:elementList) {
        	element.print();
        }
    }
}