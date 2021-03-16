package Task1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
          Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
          вывести на консоль содержимое, дополнить, удалить.
         */

        View view = new View();
        Directory directory = new Directory("1");
        TextFile textFile = new TextFile();

        textFile.addText("zxc");
        textFile.rename("file2");

        directory.addDirectory(new Directory("2"));
        directory.addDirectory(new Directory("3"));
        directory.addDirectory(new Directory("4"));
        directory.addDirectory(new Directory("5"));
        directory.addFile(new TextFile("file1", "qwerty"));
        directory.addFile(textFile);

        view.printInfo(directory);
    }

}
