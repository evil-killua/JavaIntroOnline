package Task1;

public class View {
    public void printInfo(Directory directory) {
        System.out.println("название директории: " + directory.getTitle());

        System.out.println("вложенные папки");
        for (Directory dir : directory.getDirectories()) {
            System.out.print(dir.getTitle() + " ");
        }

        System.out.println("\nвложенные файлы");
        for (File file : directory.getFiles()) {
            System.out.print(file.getTitle() + " ");
        }

    }
}
