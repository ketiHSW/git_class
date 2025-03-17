import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "Hello, this is a file example in Java.";

        // 파일에 쓰기
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("파일 저장 완료: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 파일에서 읽기
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("파일 내용: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

