import java.util.Scanner;

interface Utility {
    void getDetails();

    void setDetails();
}

class Showroom implements Utility {
    String showroomName;
    String showroomAddress;
    int totalEmployees;
    int totalCarsInStock = 0;
    String managerName;

    @Override
    public void getDetails() {
        System.out.println("Showroom Name: " + showroomName);
        System.out.println("Showroom Address: " + showroomAddress);
        System.out.println("Manager Name: " + managerName);
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Total Cars In Stock: " + totalCarsInStock);
    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
        System.out.println();
        System.out.print("SHOWROOM NAME: ");
        showroomName = sc.nextLine();
        System.out.print("SHOWROOM ADDRESS: ");
        showroomAddress = sc.nextLine();
        System.out.print("MANAGER NAME: ");
        managerName = sc.nextLine();
        System.out.print("TOTAL NO OF EMPLOYEES: ");
        totalEmployees = sc.nextInt();
        System.out.print("TOTAL CARS IN STOCK: ");
        totalCarsInStock = sc.nextInt();
    }
}

class Employees extends Showroom implements Utility {
    String empId;
    String empName;
    int empAge;
    String empDepartment;

    @Override
    public void getDetails() {
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Age: " + empAge);
        System.out.println("Department: " + empDepartment);
        System.out.println("Showroom Name: " + showroomName);
    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
        System.out.println();
        System.out.print("EMPLOYEE NAME: ");
        empName = sc.nextLine();
        System.out.print("EMPLOYEE AGE: ");
        empAge = sc.nextInt();
        sc.nextLine();
        System.out.print("EMPLOYEE DEPARTMENT: ");
        empDepartment = sc.nextLine();
        empId = generateEmployeeId();
        System.out.print("SHOWROOM NAME: ");
        showroomName = sc.nextLine();
    }

    private String generateEmployeeId() {
        // Logic to generate a unique employee ID, you can modify this based on your requirements.
        return "EMP" + empName.charAt(0) + empAge;
    }
}

class Cars extends Showroom implements Utility {
    String carName;
    String carColor;
    String carFuelType;
    int carPrice;
    String carType;
    String carTransmission;

    @Override
    public void getDetails() {
        System.out.println("NAME: " + carName);
        System.out.println("COLOR: " + carColor);
        System.out.println("FUEL TYPE: " + carFuelType);
        System.out.println("PRICE: " + carPrice);
        System.out.println("CAR TYPE: " + carType);
        System.out.println("TRANSMISSION: " + carTransmission);
    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
        System.out.println();
        System.out.print("CAR NAME: ");
        carName = sc.nextLine();
        System.out.print("CAR COLOR: ");
        carColor = sc.nextLine();
        System.out.print("CAR FUEL TYPE(PETROL/DIESEL): ");
        carFuelType = sc.nextLine();
        System.out.print("CAR PRICE: ");
        carPrice = sc.nextInt();
        sc.nextLine();
        System.out.print("CAR TYPE(SEDAN/SUV/HATCHBACK): ");
        carType = sc.nextLine();
        System.out.print("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
        carTransmission = sc.nextLine();
        totalCarsInStock++;
    }
}

public class Car_Showroom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employees employee[] = new Employees[5];
        Cars car[] = new Cars[5];
        int carCounter = 0;
        int showroomCounter = 0;
        int employeesCounter = 0;
        int choice = 100;

        while (choice != 0) {
            mainMenu();
            choice = sc.nextInt();

            while (choice != 9 && choice != 0) {
                switch (choice) {
                    case 1:
                        showroom[showroomCounter] = new Showroom();
                        showroom[showroomCounter].setDetails();
                        showroomCounter++;
                        System.out.println();
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employee[employeesCounter] = new Employees();
                        employee[employeesCounter].setDetails();
                        employeesCounter++;
                        System.out.println();
                        System.out.println("2].ADD NEW EMPLOYEE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        car[carCounter] = new Cars();
                        car[carCounter].setDetails();
                        carCounter++;
                        System.out.println();
                        System.out.println("3].ADD NEW CAR");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < showroomCounter; i++) {
                            showroom[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < employeesCounter; i++) {
                            employee[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < carCounter; i++) {
                            car[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;
                }
            }
        }
    }

    static void mainMenu() {
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");
    }
}
