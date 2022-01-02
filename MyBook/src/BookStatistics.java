
public class BookStatistics implements Visitor{
    private int imageNumber, tableNumber, paragraphNumber,subChapterNumber;

    public BookStatistics() {
        this.imageNumber = 0;
        this.tableNumber = 0;
        this.paragraphNumber = 0;
        this.subChapterNumber = 0;
    }

    public void printStatistics() {
        System.out.println("Book Statistics:");
        System.out.println("*** Number of images: " + this.imageNumber);
        System.out.println("*** Number of tables: " + this.tableNumber);
        System.out.println("*** Number of paragraphs: " + this.paragraphNumber);
        System.out.println("*** Number of subchapters: " + this.subChapterNumber);
    }

   
    public void visit(Book book) {}

   
    public void visit(Section section) {}

   
    public void visit(TableOfContents tableOfContents) {

    }
    
  
    public void visit(Paragraph paragraph) {
        this.paragraphNumber++;
    }


    public void visit(ImageProxy imageProxy) {
        this.imageNumber++;
    }

  
    public void visit(Table table) {
        this.tableNumber++;
    }


    public void visit(Image image) {
        this.imageNumber++;
    }


	public void visit(SubChapter subChapter) {
		this.subChapterNumber++;
		
	}
}