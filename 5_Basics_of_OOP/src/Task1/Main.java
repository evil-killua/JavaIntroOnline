package Task1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
          Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
          вывести на консоль содержимое, дополнить, удалить.
         */
        TextFile textFile = new TextFile("C:\\Users\\killua\\Desktop\\file.txt");

        textFile.CreatFile(textFile);

        String text = "qwerty";
        // textFile.AddText(textFile,text);

        // textFile.PrintFile(textFile);

        String name = "C:\\Users\\killua\\Desktop\\qw.txt";
        if(textFile.RenameFile(textFile,name)) System.out.println("файл переименован");
        else System.out.println("файл не переименован");

         textFile.DeleteFile();
    }

}
