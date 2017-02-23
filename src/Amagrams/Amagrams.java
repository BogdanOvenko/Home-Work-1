package Amagrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Богдан on 23.02.2017.
 */
public class Amagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder s = new StringBuilder(reader.readLine());

        for (int i = 0; i < s.length(); i++ ) {

            if ((i-1)!= s.lastIndexOf(" ")) {

                System.out.print(new StringBuilder(s.substring(i, s.indexOf(" ", i))).reverse() + " ");
                i = s.indexOf(" ", i);
            }
            else if((i-1)== s.lastIndexOf(" ")) {

                System.out.print(new StringBuilder(s.substring(i, s.length())).reverse() + " ");
                break;
            }

        }

    }
}
