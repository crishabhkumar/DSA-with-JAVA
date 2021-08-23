package com.rishabh;

import java.util.Scanner;

public class AllinOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the shape name:");
        String Geo = input.next();
        float area = 0;
        float perimeter = 0;
        switch (Geo) {
            case "Circle":
                System.out.print("Enter the radius:");
                float r = input.nextFloat();
                area = 3.14f * r * r;
                perimeter = 2 * 3.14f * r;
                System.out.println("Area is:" + area);
                System.out.println("Perimeter is:" + perimeter);
                break;
            case "Rectangle":
                System.out.print("Enter the length of Rectangle:");
                float l = input.nextFloat();
                System.out.print("Enter the breadth of Rectangle:");
                float b = input.nextFloat();
                area = l * b;
                perimeter = 2 * (l + b);
                System.out.println("Area of Rectangle:" + area);
                System.out.println("Perimeter is:" + perimeter);
                break;
            case "Triangle":
                System.out.print("Enter the height of Triangle:");
                float height = input.nextFloat();
                System.out.print("Enter the length of base:");
                int base = input.nextInt();
                area = 0.5f * base * height;
                System.out.println("Area of Triangle is:" + area);
                break;
            case "Equilateral Triangle":
                System.out.print("Enter the side of triangle:");
                float side = input.nextFloat();
                area = 0.433f * side * side;        //root3/4 = 0.433
                perimeter = 3*side;
                System.out.println("Area of Equilateral Triangle is:" + area);
                System.out.println("Perimeter of Equilateral Triangle is:"+ perimeter);
                break;
            case "Isosceles Triangle ":
                System.out.print("Enter the height of Triangle:");
                height = input.nextInt();
                System.out.print("Enter the length of base:");
                base = input.nextInt();
                area = 0.5f * base * height;
                System.out.println("Area of Isosceles Triangle is:" + area);
                break;
            case "Rhombus":
                System.out.print("Enter diagonal d1:");
                float d1 = input.nextFloat();
                System.out.print("Enter diagonal d2:");
                float d2 = input.nextFloat();
                area = 0.5f * d1 * d2;
                perimeter = (float) (2 * Math.sqrt(d1*d1 + d2*d2));
                System.out.println("Area of Rhombus is:"+area);
                System.out.println("Perimeter of Rhombus is:"+perimeter);
                break;
            case "Parallelogram":
                System.out.print("Enter base:");
                base = input.nextInt();
                System.out.print("Enter the height:");
                height = input.nextInt();
                area = base * height;
                System.out.println("Area of parallelogram is:"+area);
                break;
            case "Square":
                System.out.print("Enter the side of Square:");
                side = input.nextFloat();
                area = side*side;
                perimeter = 4* side;
                System.out.println("Area of Square is:"+area);
                System.out.println("Perimeter of square is:"+perimeter);
                break;
            case "Cone":
                System.out.print("Enter the Radius of base:");
                r = input.nextFloat();
                System.out.print("Enter the height of cone:");
                height = input.nextFloat();
                float volume = (3.14f * r *r * height)/3;
                System.out.println("Volume of cone is:"+volume);
                break;
            case "Prism":
                System.out.println("Please enter the base area of prism:");
                area = input.nextFloat();
                System.out.print("Enter the height of prism:");
                height = input.nextFloat();
                volume = area * height;
                System.out.println("Volume of prism is:"+volume);
                break;
            case "Cylinder":
                System.out.print("Enter the base radius of cylinder:");
                r = input.nextFloat();
                System.out.print("Enter the height of cylinder:");
                height = input.nextFloat();
                float csa = 2 * 3.14f * r * height;
                volume = 3.14f * r * r * height;
                System.out.println("CSA of cylinder is:"+csa);
                System.out.println("Volume of cylinder is:"+volume);
                break;
            case "Sphere":
                System.out.print("Enter the radius of sphere:");
                r = input.nextFloat();
                volume = 1.33f * 3.14f * r * r * r;
                System.out.println("Volume of sphere is:"+volume);
                break;
            case "Pyramid":
                System.out.print("Enter the base length of pyramid:");
                l = input.nextFloat();
                System.out.print("Enter the base width of pyramid:");
                b = input.nextFloat();
                System.out.print("Enter the height of pyramid");
                height = input.nextFloat();
                volume = (l * b * height) / 3;
                System.out.println("Volume of Pyramid is:"+volume);
                break;
            case "Cube":
                System.out.print("Enter the side of cube");
                side = input.nextFloat();
                volume = side * side * side;
                area = 6 * side * side;
                System.out.println("Volume of Cube is:"+volume);
                System.out.println("Surface area of Cube is:"+area);
                break;
            default:
                System.out.print("Please Try again!!!");
                break;
        }
    }
}
