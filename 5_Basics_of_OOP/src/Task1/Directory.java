package Task1;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String title;
    private List<Directory> directories;
    private List<File> files;

    {
        directories = new ArrayList<Directory>();
        files = new ArrayList<File>();
    }

    public Directory() {

    }

    public Directory(String title) {
        this.title = title;
    }

    public void addDirectory(Directory directory) {
        directories.add(directory);
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void removeDirectory(String title) {
        for (Directory dir : directories) {
            if (dir.getTitle().equals(title)) {
                directories.remove(dir);
            }
        }
    }

    public void removeFile(String title) {
        for (File file : files) {
            if (file.getTitle().equals(title)) {
                files.remove(file);
            }
        }
    }

    public String getTitle() {
        return title;
    }

    public void rename(String title) {
        this.title = title;
    }

    public List<Directory> getDirectories() {
        return directories;
    }

    public void setDirectories(List<Directory> directories) {
        this.directories = directories;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
}
