import java.util.Scanner;

public class TestDemo {
//    public static void main(String[] args){
//        //编写 HelloWorld 程序
//        System.out.println("HelloWorld!");
//    }


//    public static void main(String[] args) {
//        //编写(录入）一个程序，实现 a+b+c的平均值
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//        int sum = a+b+c;
//        int avg = sum/3;
//        System.out.println(avg);
//    }


//    public static void main(String[] args) {
//        //计算半径为3米圆的周长和面积，并打印输出;
//        int r = 3;//半径为3
//        float area,perimeter;//定义面积和周长
//        final float PI = 3.14f;//定义圆周率PI=3.14
//        perimeter = 2*PI*r;
//        area = PI*r*r;
//        System.out.println("圆的周长是"+perimeter);
//        System.out.println("圆的面积是"+area);
//    }


    public static void main(String[] args) {
        //给定一个年份，判断其是否为闰年（判断闰年的条件为“若年份能被400整除，或能被4整除但不能被100整除，该年份为闰年）。
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scan.nextInt();
            if(year%4==0&&year%100!=0){
                System.out.println(year+"是闰年");
            }
            if(year%400==0){
                System.out.println(year+"是闰年");
            }else {
                System.out.println(year+"不是闰年");
            }
            scan.close();
        }

}
