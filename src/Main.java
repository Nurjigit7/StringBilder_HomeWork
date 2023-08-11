import java.io.*;
import java.util.Scanner;

public class Main {
    private static final String FILE_NAME = "alphabet.txt";

    public static void main(String[] args) throws IOException {
        System.out.println(writeToFile(FILE_NAME));

        readFile(FILE_NAME);
    }

    public static String writeToFile(String fileName) throws IOException {
        String[] alphabet = {"Aa", "Bb", "Cc", "Dd", "Ee", "Ff", "Gg", "Hh", "Ii", "Jj", "Kk", "Ll", "Mm", "Nn", "Oo", "Pp", "Qq", "Rr", "Ss", "Tt", "Uu", "Vv", "Ww", "Xx", "Yy", "Zz", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        FileWriter fileWriter = new FileWriter(fileName);
        for (String word:alphabet) {
            fileWriter.write(word + "\n");
        }

        fileWriter.close();
        return "Братан успешно записал на файл!!!";
    }

    public static void readFile(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            Scanner scanner = new Scanner(fileReader);
            int i = 1;
            while (scanner.hasNext()) {
                System.out.println(i + ": " + scanner.nextLine());
                i++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}