import java.io.*;

class simplefile {
    public static void main(String[] args) {
        String content = "It demonstrates file handling in Java with reader/writer";

        try {
            FileWriter writer = new FileWriter("hehe.txt");
            writer.write(content);
            System.out.println("File written successfully.");
            writer.close();
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }

        try  {
            FileReader reader = new FileReader("hehe.txt");
            int character;
            System.out.println("File content:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            reader.close();
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
