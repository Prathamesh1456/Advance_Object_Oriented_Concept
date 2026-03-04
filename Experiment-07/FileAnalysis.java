import java.io.*;

public class FileAnalysis {
    public static void main(String[] args) {
        int vowels = 0;
        int words = 0;
        int countA = 0;

        try {
            FileReader fr = new FileReader("C:\\Users\\PRATHAMESH\\Desktop\\DOCUMENT\\SEM IV\\Advance-Object-Oriented-Programming-Lab\\Sample\\Sample.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {

                String[] w = line.trim().split("\\s+");
                if (!line.trim().isEmpty())
                    words += w.length;

                for (char ch : line.toCharArray()) {
                    char c = Character.toLowerCase(ch);

                    if (c == 'a' || c == 'e' || c == 'i' || 
                        c == 'o' || c == 'u') {
                        vowels++;
                    }

                    if (c == 'a') {
                        countA++;
                    }
                }
            }

            br.close();

            System.out.println("Total Vowels: " + vowels);
            System.out.println("Total Words: " + words);
            System.out.println("Total times 'a' appears: " + countA);

        } catch (IOException e) {
            System.out.println("File error!");
        }
    }
}