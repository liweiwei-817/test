package fun.lww.test.io;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamTest {

    public static void main(String[] args) {

        try {
            FileInputStream is1 = new FileInputStream("C:\\Users\\liweiwei\\Desktop\\test1.txt");
            FileInputStream is2 = new FileInputStream("C:\\Users\\liweiwei\\Desktop\\test2.txt");
            FileInputStream is3 = new FileInputStream("C:\\Users\\liweiwei\\Desktop\\test3.txt");

            FileOutputStream os = new FileOutputStream("C:\\Users\\liweiwei\\Desktop\\out.txt");

            /*SequenceInputStream sis = new SequenceInputStream(is1, is2);*/

            Vector<FileInputStream> v = new Vector<FileInputStream>();
            v.add(is1);
            v.add(is2);
            v.add(is3);

            Enumeration<FileInputStream> en = v.elements();
            SequenceInputStream sis = new SequenceInputStream(en);

            int b;
            while ((b = sis.read()) != -1) {
                os.write(b);
            }

            is1.close();
            is2.close();
            is3.close();
            sis.close();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
