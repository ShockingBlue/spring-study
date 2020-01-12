package wzg.study.lombok;

import lombok.Cleanup;
import lombok.var;

import java.io.*;

public class CleanupDemo {
    private static void testCleanup(String file) throws IOException {
        @Cleanup var os = new FileOutputStream(file);
        @Cleanup var writer = new OutputStreamWriter(os);
        writer.write("hello world!");
    }

    public static void main(String[] args) throws IOException {
        testCleanup("test.txt");
    }
}
