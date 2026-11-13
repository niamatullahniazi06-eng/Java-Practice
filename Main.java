
public class Main {
    public static void main(String[] args) {


        //1.1 (Display three messages) Write a program that displays Welcome
        //to Java, Welcome to Computer Science, and Programming is fun.

        System.out.println("welcome to java");
        System.out.println("Welcome to Computer Science");
        System.out.println("program is fun");

        System.out.println("________________________________________________________________________________");

       // 1.2 (Display five messages) Write a program that displays Welcome to Java five times.
        System.out.println("welcome to java");
        System.out.println("welcome to java");
        System.out.println("welcome to java");
        System.out.println("welcome to java");
        System.out.println("welcome to java");


        System.out.println("________________________________________________________________________________");
        // Write this kind code

        System.out.println("a a^2 a^3");
        System.out.println("1 1 1");
        System.out.println("2 4 8");
        System.out.println("3 9 27");
        System.out.println("4 16 64");


        System.out.println("________________________________________________________________________________");
      //  1.5 (Compute expressions) Write a program that displays the result of
        System.out.println((9.5*4.5)-(2.5*3)/(45.5- 3.5));

        System.out.println("________________________________________________________________________________");

        //  1.6 (Summation of a series) Write a program that displays the result of

        System.out.println(1+2+3+4+5+6+7+8+9);

        System.out.println("________________________________________________________________________________");
        // (Approximate p) p can be computed using the following formula:
        System.out.println(4*(1-1.0/3+1.0/5-1.0/7+1.0/9- 1.0/11+1.0/13));

        System.out.println("________________________________________________________________________________");

        // (Area and perimeter of a circle) Write a program that displays the area and perimeter of a circle
       // that has a radius of 5.5 using the following formulas:

        double radius=5.5;
        double pi=3.14;
        System.out.println("the perimeter of a circle: "+2*pi*radius);
        System.out.println("the area of circle: "+radius*radius*pi);


        System.out.println("________________________________________________________________________________");

        //(Area and perimeter of a rectangle) Write a program that displays the area
        //and perimeter of a rectangle with a width of 4.5 and a height of 7.9

        double width=4.5;
        double hight=7.9;
        double area=width*hight;
        double perimeter=2*width*hight;
        System.out.println("area:"+area);
        System.out.println("perimeter:"+perimeter);

        System.out.println("________________________________________________________________________________");

        // (Average speed in miles) Assume that a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a
       // program that displays the average speed in miles per hour. (Note: 1 mile is equal to 1.6 kilometers.)

        double kilometers = 14;
        double miles = kilometers / 1.6;
        double minutes = 45 + 30.0 / 60;
        double hours = minutes / 60;
        double speed = miles / hours;
        System.out.println("Average speed = " + speed + " miles per hour");

       // (Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. Write a
       // program that displays the average speed in kilometers per hour. (Note: 1 mile is equal to 1.6 kilometers.)

        System.out.println("________________________________________________________________________________");
        double miles2 = 24;
        double kilometers2 = miles2 * 1.6;
        double hours2 = 1 + 40.0 / 60 + 35.0 / 3600;
        double speed2 = kilometers2 / hours2;
        System.out.println("Average speed = " + speed2 + " kilometers per hour");

    }
}
