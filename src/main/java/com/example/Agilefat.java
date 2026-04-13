package com.example;

public class Agilefat {
    static public String str1 = "M. adhavan-by adihesh";
    static public String str2 = "life-by ranveer";
    static public String str3 = "man-by gauresh";

    public static void main(String[] args) {

        String result_1 = listingLogic();
        System.out.println("Listing available books: \n");
        System.out.println(result_1);

        String result_2 = lending("M. adhavan-by adihesh");
        System.out.println("Lending: \n");
        System.out.println(result_2);

    }

    static public String listingLogic()
    {
        String result = str1+str2+str3;
        return result;
    }

    static public String lending(String book)
    {
        if (book == str1) 
        {
            return (book+"-lended");    
        }
        else if (book == str2) 
        {
            return(book+"-lended");    
        }
        else if (book == str3) 
        {
            return(book+"-lended");    
        }
        else
        {
            return("none");
        }
    }
    
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
