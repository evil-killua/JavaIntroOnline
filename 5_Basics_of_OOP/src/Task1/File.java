package Task1;

import java.io.IOException;

public interface File {

    void CreatFile(TextFile textFile);

    void PrintFile(TextFile textFile);

    void AddText(TextFile textFile, String text) throws IOException;

    boolean RenameFile(TextFile textFile, String newName);

    void DeleteFile() throws IOException;
}
