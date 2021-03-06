package fun.lww.test.算法;

import java.math.BigInteger;
import java.security.MessageDigest;

/*
SHA(Secure Hash Algorithm，安全散列算法），数字签名等密码学应用中重要的工具，
被广泛地应用于电子商务等信息安全领域。虽然，SHA与MD通过碰撞法都被破解了，
但是SHA仍然是公认的安全加密算法，较之MD更为安全*/
public class SHA {
    public static final String KEY_SHA = "SHA";

    public static String getResult(String inputStr) {
        BigInteger sha = null;
        System.out.println("=======加密前的数据:" + inputStr);
        byte[] inputData = inputStr.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(KEY_SHA);
            messageDigest.update(inputData);
            sha = new BigInteger(messageDigest.digest());
            System.out.println("SHA加密后:" + sha.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sha.toString();
    }

    public static void main(String args[]) {
        try {
            String inputStr = "简单加密";
            getResult(inputStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}