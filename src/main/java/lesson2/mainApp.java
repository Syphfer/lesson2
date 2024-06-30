package lesson2;
//for i - цикл, можно вкладывать цикл в цикл
//while, do while - тоже относятся к циклам, но на это пока забить
//switch (case 1 > break;)- для замены if, else if, else
//() - - аргумент в методе
public class mainApp {
    public static void main(String[] args) {
        System.out.println(sum(10, 10));
        isPositiveOrNegative(0);
        System.out.println(negativeTrue(-1));
        printWordManyTimes("Java", 10);
    }

    public static boolean sum(int a, int b) {
        int result = a + b;
        if (result >= 10 && result <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
public static boolean negativeTrue(int a) {
if (a < 0) {
    return true;
} else {
    return false;
}
}
public static void printWordManyTimes (String word, int a){
    for (int i = 0; i < a; i++) {
        System.out.print("Java\t");
    }
}
}

//пятую задачу сделаю позже