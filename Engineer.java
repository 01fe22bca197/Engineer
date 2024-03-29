public class Engineer {
    String name = "Arpitha";
    String id = "01fe22bca197";
    int Salary = 10000;

    public void displaydetails() {
        System.out.println("Name=" + name);
        System.out.println("Id is" + id);
        System.out.println("Salary is" + Salary);
    }

    public static void main(String[] args) {
        Engineer e = new Engineer();
        e.displaydetails();
    }
}
