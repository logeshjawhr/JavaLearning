import java.util.Scanner;

public class smallestSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter k");
        int k=sc.nextInt();

        System.out.println(min(n, k));
    }
    static String min(int n,int k){
        if(n<k ||(k==1&&n>1)){
            return "-1";
        }
        if (n==2) {
            return "ab";
        }
        String s="";
        for (int i = 2; i < k; i++) {
            char ch = (char)(i + 97);
            s += ch;
        }
        String a = "ab", b = "";
        int i = 0;
        while (i < k) {
            b += a.charAt(i % 2);
            i++;
            if (n - i == k - 2) {
                for (int j = 0; j < s.length();j++) {
                    b += s.charAt(j);
                }
                break;
            }
    }
        return b;
}
}
