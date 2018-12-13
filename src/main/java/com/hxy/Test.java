package com.hxy;

import java.util.Scanner;

/**
 * @author hexy
 * @date 2018/12/1316:29
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str ;
        while (true){
            str = sc.next();
            str = str.replace("吗","");
            str = str.replace("?","!");
//            str = str.replace("？","!");
            System.out.println(str);
        }
    }
}
