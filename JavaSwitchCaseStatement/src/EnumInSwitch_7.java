/*Java allows us to use enum in switch statement. Java enum is a class that represent the group of constants. (immutable such as final variables).
We use the keyword enum and put the constants in curly braces separated by comma.*/

import swithcase.MyWeek;

//Bellow is a Java Program to demonstrate the use of Enum in switch statement
public class EnumInSwitch_7 {
    private static int conditionStop = 3;

    public static void main(String[] args) {
        MyWeek[] DayNow = MyWeek.values();
        for (MyWeek Now : DayNow) {
            if (Now != MyWeek.Mon) {
                continue;
            }

        }
        int i=0;
        for (;i<10;i++) {
            System.out.println(i);

            if (i == 2) {
                continue;
            }
            System.out.println(i);

        }

        doSomething();

    }

    public static void doSomething() {
        System.out.println("abc");
    }
}
