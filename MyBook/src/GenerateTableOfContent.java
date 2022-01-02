public class GenerateTableOfContent implements Visitor {

    private TableOfContents toc = new TableOfContents("Table of contents");
    private int number = 0;
    private int secondNumber = 0;

    public TableOfContents getToc() {
        return toc;
    }

    @Override
    public void visit(Book book) {}

    
    public void visit(Section section) {
        number++;
        secondNumber = 0;
        Section section1 = new Section(section.getTitle() + "........." + number);
        toc.add(section1);
    }

   
    public void visit(TableOfContents tableOfContents) {}

   
    public void visit(Paragraph paragraph) {
        secondNumber++;
        Paragraph paragraph1 = new Paragraph(paragraph.getText() + "........." + number + "." + secondNumber);
        toc.add(paragraph1);
    }

   
    public void visit(ImageProxy imageProxy) {
        secondNumber++;
        ImageProxy imageProxy1 = new ImageProxy(imageProxy.url() + "........." + number + "." + secondNumber);
        toc.add(imageProxy1);
    }

   
    public void visit(Table table) {
        secondNumber++;
        Table table1 = new Table(table.getTitle() + "........." + number + "." + secondNumber);
        toc.add(table1);
    }

  
    public void visit(Image image) {
        secondNumber++;
        Image image1 = new Image(image.getImageName() + "........." + number + "." + secondNumber);
        toc.add(image1);
    }
    public void visit(SubChapter subChapter) {
    	
    }
}