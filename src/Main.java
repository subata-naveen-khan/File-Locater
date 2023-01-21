import java.io.File;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\subata\\Desktop\\random";
        File folder = new File(path);
        File[] list = folder.listFiles();

        for (int i = 0; i < list.length; i++) {
            if (list[i].isFile()) {
                System.out.println(list[i]);
            }
        }
    }
}