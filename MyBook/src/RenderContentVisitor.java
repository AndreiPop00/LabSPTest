public class RenderContentVisitor implements Visitor{

  
    public void visit(Book book) {
        book.render();
    }

    
    public void visit(Section section) {
        section.render();
    }

   
    public void visit(TableOfContents tableOfContents) {
        tableOfContents.render();
    }

 
    public void visit(Paragraph paragraph) {
        paragraph.render();
    }

  
    public void visit(ImageProxy imageProxy) {
        imageProxy.render();
    }

 
    public void visit(Table table) {
        table.render();
    }

  
    public void visit(Image image) {
        image.render();
    }
    
    public void visit(SubChapter subChapter) {
    	subChapter.render();
    }
}
