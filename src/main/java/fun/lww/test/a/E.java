package fun.lww.test.a;

public class E {

    public static String getMaxSubString(String a,String b){
        //max min  这里面是表示确保max：表示最大长度，min：表示最小长度
        String max = "";String min = "";
        max = (a.length()>b.length()?a:b);
        min = max == a?b:a;
        //一层循环是表示最短字符串从最大长度到慢慢变小
        for(int x = 0;x<min.length();x++){
            //这一层循环表示的是，从最大到最小的字符串，每一种要循环多少次
            for (int y = 0,z = min.length() -x; z != min.length()+1;y++,z++ ) {
                String temp = min.substring(y,z);
                if(max.contains(temp)){
                    return temp;
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {

        String a = "nihaohelloworldohhh";
        String b = "ghelloworldb";

        System.out.println(getMaxSubString(b,a));


    }
}
