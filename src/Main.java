public class Main {

    public static void main(String[] args) {
        char a1 = 'a';
        char a2 = 97;
        char a3 = '\u0061';
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);


        String str1 = "hello";
        String str2 = "java";
        String str3 = "hello";

        if (str1.equals(str2)){
            System.out.println(str1 + "&" + str2);
        }else if(str1.equals(str3)){
            System.out.println(str1 + "&" + str3);
        }

    }
}
