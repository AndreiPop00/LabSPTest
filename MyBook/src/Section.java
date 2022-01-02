
import java.util.LinkedList;
import java.util.List;

public class Section extends Element implements Visitee {
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

    @Override
    public Element get(int nr) {
        return this.elementList.get(nr);
    }

    @Override
    public void print() {
        System.out.println(this.title);
        for (Element element:elementList) {
            element.print();
        }
    }
    
    public void render() {
        System.out.println(this.title);
        for (Element element:elementList) {
            element.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Element element:elementList) {
            element.accept(visitor);
        }
    }

    public void setElementList(List<Element> elementList) {
        this.elementList = elementList;
    }

    public List<Element> getElementList() {
        return elementList;
    }

    public String getTitle() {
        return title;
    }
}