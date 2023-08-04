package Important_Questions_in_java.Assignment9;
/*
    write a java program to show single inheritance, multilevel inheritance,
    hierarchical inheritance and hybrid inheritance.
*/

import java.util.Scanner;

/*
        We know there are two types of class concept in inheritance. Those are called as:
        (i) (Base/Parent/Super) class
        (ii) (Derived/Child/Sub) class


        __Single Inheritance__
        When one parent class is being derived by a single child class, then it is called
        'single inheritance'.

        __Multi-level Inheritance__
        Let, there are three classes, they are A,B and C. Now A is the parent class, B and C are child
        classes. Now A is derived by class B and next B will be derived by class C. This
        is called Multi-level Inheritance.

        __Hierarchical Inheritance__
        It is a type of inheritance in which one class is derived by multiple child classes.
        It makes also a Hierarchical chain like Binary Tree.

        __Hybrid Inheritance__
        Combination of two or more type of inheritance to design a program,
        that is called 'hybrid inheritance'
*/
@SuppressWarnings("ALL")
class SingleInheritance {
    static int a=0, b=0;
    private static class A {
        protected static void input() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            a = sc.nextInt();
            System.out.print("Enter second number: ");
            b = sc.nextInt();
        }
        protected static void add() {
            System.out.println("Addition: "+(a+b));
        }
    }   // class complete of A

    protected static class B {
        static int c=0;
        protected static void getData() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter no.: ");
            c = sc.nextInt();
        }
        static void display() {
            System.out.println("Addition: "+(a+b+c));
        }
    } // class complete of B
}  // class complete of single inheritance class




@SuppressWarnings("ALL")
class Multi_LevelInheritance {
    private static class A {
        static int a=0;
        static void input() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            a = sc.nextInt();
        }
    }   // complete of class A

    private static class B extends A {
        static int b=0;
        static void getData() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter no: ");
            b = sc.nextInt();
        }
    }   // complete of class B

    protected static class C extends B {
        static void add() {
            System.out.println("Addition: "+(a+b));
        }
    }   // complete of class C
}   // complete of Multi-level class




@SuppressWarnings("ALL")
class HierarchicalInheritance {
    private static class A {
        static int a, b;
        static void input() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first no: ");
            a = sc.nextInt();
            System.out.print("Enter second no: ");
            b = sc.nextInt();
        }
    }

    protected static class B extends A {
        static void add() {
            System.out.println("Addition: "+(a+b));
        }
    }

    protected static class C extends A {
        static void subtract() {
            System.out.println("Subtract: "+(a-b));
        }
    }
}




@SuppressWarnings("ALL")
class HybridInheritance {
    private static class Parent1 {
        static void print() {
            System.out.println("This is parent1 class.");
        }
    }
    private static class Parent2 {
        static void print() {
            System.out.println("This is parent2 class.");
        }
    }

    protected static class Child1 extends Parent1 {
        static void print() {
            System.out.println("This is child1 class.");
        }
    }
    protected static class Child2 extends Parent2 {
        static void print() {
            System.out.println("This is child2 class.");
        }
    }
    protected static class Child3 extends Child2 {
        static void print() {
            System.out.println("This is child3 class");
        }
    }
}




@SuppressWarnings("ALL")
public class q7 {
    public static void main(String[] args) {
        SingleInheritance.B bs = new SingleInheritance.B();
        Multi_LevelInheritance.C cs = new Multi_LevelInheritance.C();
        HierarchicalInheritance.B bh = new HierarchicalInheritance.B();
        HierarchicalInheritance.C ch = new HierarchicalInheritance.C();
        HybridInheritance.Child1 hh = new HybridInheritance.Child1();
        HybridInheritance.Child3 hh1 = new HybridInheritance.Child3();

        bs.getData();
        bs.display();

        cs.getData();
        cs.add();

        bh.input();
        bh.add();
        ch.input();
        ch.subtract();

        hh.print();
        hh1.print();
    }
}