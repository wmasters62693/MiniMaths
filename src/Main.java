import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        File fileDir = getFile();
        try {
            Compile(fileDir);
        }catch (IOException IOE) {
            System.out.println("ERROR: " + IOE);
        }


    }

    public static File getFile() {
        Scanner input = new Scanner(System.in);
        File fileDir;
        do {
            System.out.println("Enter the directory of the .txt you want to compile and run");
            String fileLoc = input.nextLine();
            fileDir = new File(fileLoc);
            if (!(fileDir.exists())) {
                System.out.println("Invalid Directory");
            }
        } while(!(fileDir.exists() && !fileDir.isDirectory()));
        System.out.println(fileDir);
        return (fileDir);
    }

    public static void Compile(File fileDir) throws IOException {
        
    }
}