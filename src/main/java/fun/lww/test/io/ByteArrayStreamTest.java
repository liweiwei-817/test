package fun.lww.test.io;

import java.io.*;

public class ByteArrayStreamTest {

    public static void main(String[] args) throws IOException {

        /*String str = "abadsfsdfasd 123 一二三";

        ByteArrayInputStream is = new ByteArrayInputStream(str.getBytes());

        ByteArrayOutputStream os = new ByteArrayOutputStream();

        int i;
        while ((i = is.read()) != -1) {
            os.write(i);
        }

        System.out.println(os.toString());*/

        //-----------------

        FileInputStream is = new FileInputStream("C:\\Users\\liweiwei\\Desktop\\out.txt");
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        int len;
        while ((len = is.read()) != -1) {
            os.write(len);
        }
        System.out.println(os.toString());
        is.close();


    }
}
