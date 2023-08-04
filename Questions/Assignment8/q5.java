package Important_Questions_in_java.Assignment8;

@SuppressWarnings("ALL")
class Employee {
    private static float finalSalary;
    private static float salary;
    private static float workingHourPerDay;

    protected void getInformation(float salary, float workingHour) {
        this.salary = salary;
        this.workingHourPerDay = workingHour;
    }

    protected static void Add_Salary() {
        if (salary < 500) {
            salary += salary;
        }
        System.out.println("New updated salary: "+salary+"$");
    }

    protected static void Add_Work() {
        if (workingHourPerDay > 6) {
            salary += 5;
        }
        if (workingHourPerDay <= 1)
            System.out.println("Working hour: "+workingHourPerDay+" hour");
        System.out.println("Working hour: "+workingHourPerDay+" hours");
        System.out.println("Updating salary: "+salary+"$");
    }
}


@SuppressWarnings("ALL")
public class q5 {
    public static void main(String[] args) {
        System.out.println("Employee name: ABC");
        Employee e1 = new Employee();
        e1.getInformation(490,5);
        e1.Add_Salary();
        e1.Add_Work();

        System.out.println("\nEmployee name: SS");
        Employee e2 = new Employee();
        e2.getInformation(820,8);
        e2.Add_Salary();
        e2.Add_Work();
    }
}