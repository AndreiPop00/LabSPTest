
import java.util.ArrayList;
import java.util.List;

public class Chapter {
	public String chapter;
	public SubChapter sub_capitol;
	private List<SubChapter> subChapters = new ArrayList<>();
	public Chapter(String chapter) {
		this.chapter = chapter;
	
	}
	public Chapter()
	{
		
	}

	public void setChapter(String chapter) {
		this.chapter = chapter;
	}
	
	public int createSubChapter(String subChapter) {
		SubChapter sc = new SubChapter(subChapter, this);
		this.subChapters.add(sc);
		return subChapters.indexOf(sc);
	}
	public SubChapter getSubChapter(int capitol) {
		return subChapters.get(capitol);
	}
}
