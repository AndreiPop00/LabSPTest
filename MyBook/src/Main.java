public class Main {
	
	public static void main(String[] args) throws Exception {
		Book myBook = new Book("My Book");
        Author me = new Author("My Self");
        myBook.addAuthor(me);
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        
        cap1.add(new ImageProxy("./src/poza.jpg"));
        cap1.add(new Image("./src/poza.jpg"));
        cap1.add(new Paragraph("Text de umplutura."));
        cap1.add(new Table("Table 1"));
        myBook.addContent(cap1);
        cap1.accept(new RenderContentVisitor());

        BookStatistics stats = new BookStatistics();
        cap1.accept(stats);
        stats.printStatistics();

        GenerateTableOfContent cuprins = new GenerateTableOfContent();
        cap1.accept(cuprins);
        TableOfContents rezultat = cuprins.getToc();
        rezultat.render();
	}

}