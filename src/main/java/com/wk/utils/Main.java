package com.wk.utils;

import java.util.Scanner;

/**
 * Created by root on 18-7-28.
 */
public class Main {
    public static void main(String[] args){
        String domain = "";
        String cookies = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入domain：\n");
        domain = scanner.nextLine();
        System.out.println("请输入cookies：\n");
        cookies = scanner.nextLine();
        System.out.println(CookiesToJson.getJsonFromCookies(domain,cookies));
    }
}
