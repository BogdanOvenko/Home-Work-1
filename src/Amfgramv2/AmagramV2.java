package Amfgramv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Богдан on 23.02.2017.
 */
public class AmagramV2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        DisjointAndReverseString(s);
    }

        public static void DisjointAndReverseString(String c) {

        for (int i = 0; i < c.length(); i++) {

            if ((i - 1) != c.lastIndexOf(" ")) {
                String v = c.substring(i, c.indexOf(" ", i));
                i = c.indexOf(" ", i);
                System.out.print(Reverse(v)+ " ");
            }
            else if((i-1)== c.lastIndexOf(" ")) {
                String v = c.substring(i, c.length());
                System.out.print(Reverse(v));
                break;
            }
        }
        }

        public static String Reverse(String a){
            String newStr = "";
            for (int i = a.length()-1; i >= 0; i--){
                newStr+=a.charAt(i);
            }
            return newStr;
        }

    }

