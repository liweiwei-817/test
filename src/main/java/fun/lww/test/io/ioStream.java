package fun.lww.test.io;

import java.io.*;

public class ioStream {

    public static void main(String[] args) throws IOException {

        String str = "123abc一二三";

        ByteArrayInputStream bais = new ByteArrayInputStream(str.getBytes());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int i;
        while ((i = bais.read()) != -1) {
            baos.write(i);
        }
        System.out.println(baos);

        CharArrayReader chr = new CharArrayReader(str.toCharArray());
        CharArrayWriter caw = new CharArrayWriter();
        int a;
        while ((a = chr.read()) != -1) {
            caw.write(a);
        }
        System.out.println(caw);

        StringReader sr = new StringReader(str);
        StringWriter sw = new StringWriter();
        int b;
        while ((b = sr.read()) != -1) {
            sw.write(b);
        }
        System.out.println(sw);



    }
}
