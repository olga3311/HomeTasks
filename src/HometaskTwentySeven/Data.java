package HometaskTwentySeven;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Data {

    List<Integer> numbers = new ArrayList<>();


public void add( int value){
    numbers.add(value);
}

public int reportMediumTemp (){
   int sum = 0;
   int result = 0;
    for (int i = 0; i < numbers.size(); i++) {
        sum += numbers.get(i);
        result = sum / numbers.size();
    }

   // System.out.println( result);
    return result;

}

/* public int getMaximumTemp(){
    int max = numbers.get(0);

    for (int i = 0; i < numbers.size(); i++) {
        int element = numbers.get(i);
        if (element > max) {
            max = element;
        }
    }
    System.out.println(max);
    return max;
} */

public int compareTemp(){
    if(numbers.size() < 2) return - 1;
    int last =  numbers.get(numbers.size() - 1);
    int previous = numbers.get(numbers.size() - 2);

    return last - previous;
}
//2.3) Если введеная температура превышает среднюю на 10% и повысилась тносительно предыдущего значения более, чем на 20%,
//То напишите на экран собщение "Тревога, превышение температуры"


    public int percentTempWarning(int previousMedium, int prevTemp,int currTemp){
if(numbers.size() < 2) return  -1;

int sum1 = ((currTemp - previousMedium) * 100) / previousMedium;
int sum2 = ((currTemp - prevTemp)  * 100) / prevTemp;
        System.out.println("Отклонение от медианы " + sum1 + "%, разница температуры " + sum2 + "%. ");

if ( sum1 > 10 && sum2 > 20 ){

    System.out.println(" Тревога, превышение температуры!");
}
return 0;
}


//  3.1) Рассчитайте также среднюю температуру за 10 последних измерений и
//среднюю температуру каждого 100ого измерения

public int mediumFromTen(){
   if (numbers.size() < 10){
       return -1;
   }

    int sum = 0;

    for (int i = (numbers.size() - 10); i < numbers.size(); i++) {
        sum += numbers.get(i);
    }
    return sum / 10;
}


public int mediumTempForEachHundred(){
    int element = 0;
    int sum = 0;
    int counter = 0;

    if (numbers.size() < 100) return  - 1;
    for ( int i = 0; i < numbers.size(); i++){
      if (i % 100 == 0){
          counter++;
          sum += numbers.get(i);
      }
    }
    return sum / counter;
}
}