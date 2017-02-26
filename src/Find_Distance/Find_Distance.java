package Find_Distance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Богдан on 23.02.2017.
 */
public class Find_Distance {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Введіть ряд цілих чисел. Після введення натисніть ENTER");

        numbers = AddingToArray(numbers);
        FindDistance(numbers);

    }
    public static ArrayList<Integer> AddingToArray(ArrayList<Integer> numbers) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Заповнення масива чилами
        while (true) {
            try {
                String s = reader.readLine();
                if (s.isEmpty()) break;
                numbers.add(Integer.parseInt(s));
            } catch (IOException e) {
                System.out.println("Помилка вводу");
            } catch (NumberFormatException a) {
                System.out.println("Помилка вводу цілого числа. Будь ласка, введіть ціле число");
            }
        }
        return numbers;
    }


    public static void FindDistance(ArrayList<Integer> numbers){
        if ((numbers.size()==1)) {
            System.out.print("Ви введи одне число");
        }
        else if(numbers.size() == 0){
            System.out.println("Ви не ввели жодного числа");
        }
        else{
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
            if (firstIndex == 0){
                secondIndex = 1;
                secondMin = numbers.get(1);
            }
            //знаходження другого мінімального числа
            for (int i = 0; i < numbers.size(); i++ ){
                if((numbers.get(i) == firstMin) && (i==firstIndex)){
                    continue;
                }
                else if ((numbers.get(i)==firstMin) && (firstIndex != i)){
                    secondMin = firstMin;
                    secondIndex = i;
                    break;
                }
                else if ((numbers.get(i) < secondMin) && (secondMin>firstMin)){
                    secondMin = numbers.get(i);
                    secondIndex = i;
                }
            }
            System.out.println("Перше мнінмальне число " + firstMin + " Знаходиться в позиції " + firstIndex);
            System.out.println("Друге мнінмальне число " + secondMin + " Знаходиться в позиції " + secondIndex);
            System.out.println("Відстань між числами " + Math.abs(secondIndex-firstIndex));
        }
    }
}
