package com.prituladima;

import java.util.regex.Pattern;

public class NoRegExp {

    public static void main(String[] args) {

        String test = "abcdddjdfkjbfddddfgh";
        String subTest = "[a-z0-9]dd";
//        test.indexOf(subTest, ind + 1)

        //prituladima@gmail.com
        //prituladima@gmail.com
        //prituladima@gmail.com
        //prituladima@gmail.com
        //prituladima@gmail.com
        //prituladima@gmail.com



        //? {0,1}
//        System.out.println(Pattern.compile("abc(dd){0,10}fgh").matcher(test).matches());

        int n = 200;

        String regExp = String.format("abc(%s){0,%d}fgh", subTest, n);
        System.out.println(regExp);
        System.out.println(Pattern.compile(regExp).matcher(test).matches());


        //@gmail.com
        //@family.google.uk
        //@family.google.uk
        String reg = "[a-zA-Z_0-9]{1,1}[a-zA-Z_0-9.!]{1,35}@([a-z]{2,5}\\.){1,5}[a-z]{2,10}";
//        String email = "pritula_dima@@g.com";
        String email = "prituladima@gmail.com prituladima@gmail.com prituladima@gmail.com prituladima@gmail.com";
        Pattern pattern = Pattern.compile(reg);
        System.out.println("Email " + pattern.matcher(email).matches());

        String regPhone = "(\\+\\d{2})?-(\\(\\d{3}\\))-(\\d{3})-(\\d{4})";
        String phone = "+12-(648)-348-3632";
        System.out.println("Phone " + Pattern.compile(regPhone).matcher(phone).matches());


        //ISO date 2021-02-17T18:51:14+00:00
        //ISO date 2021-02-17



//        int n = 10;
        for (int i = 0; i < test.length(); i++) {
            char ch = test.charAt(i);

            if (subTest.length() <= test.length() - i) {

                boolean match = true;
                for (int j = 0; j < subTest.length(); j++) {

                    match &= subTest.charAt(j) == test.charAt(i + j);

                    if(!match) {
                        break;
                    }
                }
                if(match) {
                    System.out.printf("Pos %d\n", i);
                    i += (subTest.length() - 1);
//                    return;
                }
            }


        }

    }

}
