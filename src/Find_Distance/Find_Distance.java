package Find_Distance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Богдан on 23.02.2017.
 */
public class Find_Distance {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        System.out.println("Введуть ряд цілих чисел. Після введення ");

        //Заповнення масива чилами
        while (true){
            try {
                String s = reader.readLine();
                if (s.isEmpty()) break;
                numbers.add(Integer.parseInt(s));
            }
            catch(IOException e){
                System.out.println("Помилка вводу цілого числа. Будь ласка, введіть ціле число");
            }
            catch(NumberFormatException a){
                System.out.println("Помилка вводу цілого числа. Будь ласка, введіть ціле число");
            }
        }
        int firstIndex = 0, secondIndex = 0;
        int firstMin = numbers.get(0);
        int secondMin = numbers.get(0);
        //Знаходження першого мінімального числа
        for (int i = 0; i < numbers.size(); i++ ){
            if (numbers.get(i) < firstMin){
                firstMin = numbers.get(i);
                firstIndex = i;
            }
        }
        //знаходження другого мінімального числа
        for (int i = 0; i < numbers.size(); i++ ){
            if ((numbers.get(i) < secondMin) && (firstIndex != i) ){
                secondMin = numbers.get(i);
                secondIndex = i;
            }
        }
        System.out.println("Перше мнінмальне число " + firstMin + " Знаходиться в позиції " + firstIndex);
        System.out.println("Друге мнінмальне число " + secondMin + " Знаходиться в позиції " + secondIndex);
        System.out.println("Відстань між числами " + Math.abs(secondIndex-firstIndex));


    }
}
