package Task1;

public class File {
    private String title;

    public File() {

    }

    public File(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void rename(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "File{" +
                "title='" + title + '\'' +
                '}';
    }
}
