package Classwork5;

public class isEvenNumber {

    public static int IsEvenNumber(int number) {
        int finishNumber = (number + 20);
        int counter = 0;
        while (number < finishNumber) {
            number++;
            if((number % 2) != 0){
                continue;

            }
            System.out.println(number  + " is even");
            counter++;
            if(counter == 5) {
                break;
            }
        }
        return counter;
    }


}