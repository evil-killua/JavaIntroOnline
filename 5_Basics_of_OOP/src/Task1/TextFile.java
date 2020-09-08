package Task1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class TextFile implements File {
    Files files;
    Path path;

    public TextFile( String path) {
        this.path = Paths.get(path);
    }

    public TextFile(){

    }

    public Files getFiles() {
        return files;
    }

    public Path getPath() {
        return path;
    }

    public void setFiles(Files files) {
        this.files = files;
    }

    public void setPath(Path path) {
        this.path = path;
    }


    @Override
    public void CreatFile(TextFile textFile) {
        try {
            textFile.setPath(Files.createFile(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void PrintFile(TextFile textFile) {

        List<String> lines = null;

        try {
            lines = Files.readAllLines(textFile.getPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Содержимое: ");
        for (String ls : lines)
            System.out.println(ls);

    }

    @Override
    public void AddText(TextFile textFile, String text) throws IOException {
/*
        try (FileWriter FW = new FileWriter(textFile.getPath().toFile(), true)) {
            BufferedWriter BW = new BufferedWriter(FW);
            PrintWriter PW = new PrintWriter(BW) {
                PW.println(text);
            };

        } catch (IOException e) {
            return false;
        }
*/

      /*  try (PrintWriter pw = new PrintWriter(textFile.getPath().toFile())) {
            pw.println(text);
            return true;
        }  catch (IOException e) {
            return false;
        }*/

        /*try (FileWriter fw = new FileWriter(textFile.getPath().toFile(), true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(text);
            return true;
        } catch (IOException e) {
            return false;
        }*/
        byte[] strToBytes = text.getBytes();
        Files.write(path, strToBytes, StandardOpenOption.APPEND);

    }

    @Override
    public boolean RenameFile(TextFile textFile, String newName) {

        try {
            Files.move(textFile.getPath(), textFile.getPath().resolveSibling(newName));
           this.path=Paths.get(newName);
            return true;
        } catch (IOException e) {
            return false;
        }

    }

    @Override
    public void DeleteFile() throws IOException {
        Files.delete(path);
    }
}
