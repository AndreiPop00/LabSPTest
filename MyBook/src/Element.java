
public abstract class Element implements Visitee{
	Element parent;
	abstract void print();
	
	abstract void add(Element element);
	abstract void remove(Element element);
	abstract Element get(int nr);
}
