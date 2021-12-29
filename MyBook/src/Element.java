
public abstract class Element {
	Element parent;
	abstract void print();
	
	abstract void add(Element element);
	abstract void remove(Element element);
	abstract Element get(int nr);
}
