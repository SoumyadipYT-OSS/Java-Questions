package Important_Questions_in_java.Assignment8;

import java.util.Scanner;
@SuppressWarnings("ALL")
class Area {
    protected static void return_Area(float length, float breadth){
        float area = 0.0f;
        area = length * breadth;
        System.out.println("Area of the rectangle is: "+area);
    }
}


@SuppressWarnings("ALL")
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        float l = sc.nextFloat();
        System.out.print("Enter breadth: ");
        float b = sc.nextFloat();

        Area area = new Area();
        area.return_Area(l,b);
    }
}