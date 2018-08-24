import java.io.File;
import java.util.List;
import static java.util.Arrays.asList;


public class Reader {
    public static void main(String[] args) {
        String filePath = "C:/Users/lukaszb/Downloads/Enum";
        File file;
        file = new File(filePath);
        System.out.println("directory :" + file.toPath().getFileName());
        getFile(file, "");
    }


    private static void getFile(File file, String tab) {
        List<File> fileList1 = asList(file.listFiles());
        tab = tab + "\t";
        for (File tmp : fileList1) {
            if (tmp.isDirectory()) {
                System.out.println(tab + "directory :" + file.toPath().getFileName());
                getFile(tmp, tab);
            } else
                System.out.println(tab + tmp.getName());
        }
    }
}
