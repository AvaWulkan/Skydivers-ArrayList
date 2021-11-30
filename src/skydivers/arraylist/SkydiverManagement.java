package skydivers.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class SkydiverManagement {

    static Scanner sc = new Scanner(System.in);

    private static ArrayList<Skydiver> skydivers = new ArrayList<>();

    public static void countLowestNrOfJumps() {
        int leastJumps = skydivers.get(0).getJumps();
        for (Skydiver skydiver : skydivers) {
            if (skydiver.getJumps() < leastJumps) {
                leastJumps = skydiver.getJumps();
            }
        }
        System.out.println("Lowest numbers of jumps: " + leastJumps);
    }

    public static void countHighestNrOfJumps() {
        int mostJumps = skydivers.get(0).getJumps();
        for (Skydiver skydiver : skydivers) {
            if (skydiver.getJumps() > mostJumps) {
                mostJumps = skydiver.getJumps();
            }
        }
        System.out.println("Highest numbers of jumps: " + mostJumps);
    }

    public static void averageNrOfJumps() {
        double sumJumps = 0;
        for (Skydiver skydiver : skydivers) {
            sumJumps += skydiver.getJumps();
        }
        double averageJumps = sumJumps / skydivers.size();
        System.out.println("Average numbers of jumps: " + averageJumps + "\n");
    }

    public static void countYoungestSkydiver() {
        int youngest = skydivers.get(0).getAge();
        for (Skydiver skydiver : skydivers) {
            if (skydiver.getAge() < youngest) {
                youngest = skydiver.getAge();
            }
        }
        System.out.println("Youngest skydiver is " + youngest + " years old");
    }

    public static void countOldestSkydiver() {
        int oldest = skydivers.get(0).getAge();
        for (Skydiver skydiver : skydivers) {
            if (skydiver.getAge() > oldest) {
                oldest = skydiver.getAge();
            }
        }
        System.out.println("Oldest skydiver is " + oldest + " years old");
    }

    public static void averageAge() {
        double sumAge = 0;
        for (Skydiver skydiver : skydivers) {
            sumAge += skydiver.getAge();
        }
        double averageAge = sumAge / skydivers.size();
        System.out.println("Average age is " + averageAge + "\n");
    }

    public static void createSkydiver() {
        System.out.print("Skydivers licensenumber: ");
        int licenseNr = sc.nextInt();
        sc.nextLine();
        for (Skydiver skydiver : skydivers) {
            if (skydiver.getLicenseNr() == licenseNr) {
                System.out.println("License number i already taken.");
                System.out.println("What do you want to do?");
                System.out.println("1. Add another skydiver");
                System.out.println("2. Go back to main menu");
                System.out.println("0. Exit");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Skydivers license number: ");
                        licenseNr = sc.nextInt();
                        sc.nextLine();
                        break;
                    case 2:
                        SkydiverMenu.mainMenu();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.print("Skydivers name: ");
        String name = sc.nextLine();
        System.out.print("Skydivers age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Skydivers number of jumps: ");
        int jumps = sc.nextInt();
        sc.nextLine();
        System.out.print("Skydivers license grade: ");
        String grade = sc.nextLine();
        System.out.print("Skydivers club: ");
        String club = sc.nextLine();

        Skydiver s = new Skydiver(licenseNr, name, age, jumps, grade, club);
        addSkydiver(s);
        System.out.println();
    }

    public static void addSkydiver(Skydiver s) {
        skydivers.add(s);
    }

    public static void printAllSkydivers() {
        for (Skydiver skydiver : skydivers) {
            System.out.println(skydiver);
        }
        System.out.println();
    }

    public static void printSkydiversByLicenseGrade() {
        System.out.print("License Grade: ");
        String licenseGrade = sc.nextLine();
        System.out.println();
        boolean matchNotFound = true;
        for (Skydiver skydiver : skydivers) {
            if (skydiver.getLicenseGrade().equalsIgnoreCase(licenseGrade)) {
                System.out.println(skydiver);
                matchNotFound = false;
            }
        }
        if (matchNotFound) {
            System.out.println("No skydiver match your input");
        }
        System.out.println();
    }

    public static void printSkydiversByClub() {
        System.out.print("Club: ");
        String club = sc.nextLine();
        System.out.println();
        boolean matchNotFound = true;
        for (Skydiver skydiver : skydivers) {
            if (skydiver.getClub().equalsIgnoreCase(club)) {
                System.out.println(skydiver);
                matchNotFound = false;
            }
        }
        if (matchNotFound) {
            System.out.println("No skydiver match your input");
        }
        System.out.println();
    }

    public static void printSkydiversByJumps() {
        System.out.println("Print all akydivers who has:");
        System.out.println("1. exactly your choosen amount of jumps");
        System.out.println("2. more then your choosen amount of jumps");
        System.out.println("3. less then your choosen amount of jumps");
        System.out.print("Your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println();
        System.out.print("Numbers of jumps: ");
        int jumps = sc.nextInt();
        sc.nextLine();
        boolean matchNotFound = true;
        System.out.println();
        switch (choice) {
            case 1:
                for (Skydiver skydiver : skydivers) {
                    if (skydiver.getJumps() == jumps) {
                        System.out.println(skydiver);
                        matchNotFound = false;
                    }
                }
                if (matchNotFound) {
                    System.out.println("No skydiver match your input");
                }
                break;
            case 2:
                for (Skydiver skydiver : skydivers) {
                    if (skydiver.getJumps() >= jumps) {
                        System.out.println(skydiver);
                        matchNotFound = false;
                    }
                }
                if (matchNotFound) {
                    System.out.println("No skydiver match your input");
                }
                break;
            case 3:
                for (Skydiver skydiver : skydivers) {
                    if (skydiver.getJumps() < jumps) {
                        System.out.println(skydiver);
                        matchNotFound = false;
                    }
                }
                if (matchNotFound) {
                    System.out.println("No skydiver match your input");
                }
                break;
        }
        System.out.println();
    }

    public static void printSkydiversByLicenseNr() {
        System.out.print("License number: ");
        int licenseNr = sc.nextInt();
        sc.nextLine();
        System.out.println();
        boolean matchNotFound = true;
        for (Skydiver skydiver : skydivers) {
            if (skydiver.getLicenseNr() == licenseNr) {
                System.out.println(skydiver);
                matchNotFound = false;
            }
        }
        if (matchNotFound) {
            System.out.println("No skydiver match your input");
        }
        System.out.println();
    }

    public static void printSkydiversByAge() {
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println();
        boolean matchNotFound = true;
        for (Skydiver skydiver : skydivers) {
            if (skydiver.getAge() == age) {
                System.out.println(skydiver);
                matchNotFound = false;
            }
        }
        if (matchNotFound) {
            System.out.println("No skydiver match your input");
        }
        System.out.println();
    }

    public static void printSkydiversByName() {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.println();
        boolean matchNotFound = true;
        for (Skydiver skydiver : skydivers) {
            if (skydiver.getName().equalsIgnoreCase(name)) {
                System.out.println(skydiver);
                matchNotFound = false;
            }
        }
        if (matchNotFound) {
            System.out.println("No skydiver match your input");
        }
        System.out.println();
    }

    public static void updateSkydiver() {

        printAllSkydivers();
        System.out.println();
        System.out.println("Which skydiver do you want to update?");
        System.out.println("License number: ");
        int licenseNr = sc.nextInt();
        sc.nextLine();
        System.out.println();
        Skydiver s = findSkydiverByLicenseNr(licenseNr);
        System.out.println();

        System.out.println("What do you want to update?");
        System.out.println("1. Name");
        System.out.println("2. Age");
        System.out.println("3. Jumps");
        System.out.println("4. License Grade");
        System.out.println("5. Club");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println();

        switch (choice) {
            case 1:
                System.out.print("New name: ");
                String name = sc.nextLine();
                s.setName(name);
                break;
            case 2:
                System.out.print("New name: ");
                int age = sc.nextInt();
                sc.nextLine();
                s.setAge(age);
                break;
            case 3:
                System.out.print("New number of jumps: ");
                int jumps = sc.nextInt();
                sc.nextLine();
                s.setJumps(jumps);
                break;
            case 4:
                System.out.print("New license grade: ");
                String grade = sc.nextLine();
                s.setLicenseGrade(grade);
                break;
            case 5:
                System.out.print("New club: ");
                String club = sc.nextLine();
                s.setClub(club);
                break;
            default:
                break;
        }
        System.out.println();

    }

    public static Skydiver findSkydiverByLicenseNr(int licenseNr) {
        for (Skydiver skydiver : skydivers) {
            if (skydiver.getLicenseNr() == licenseNr) {
                return skydiver;
            }
        }
        return null;
    }

    public static void removeSkydiver() {
        printAllSkydivers();
        System.out.println();
        System.out.println("Which skydiver do you want to delete?");
        System.out.print("License number: ");
        int licenseNr = sc.nextInt();
        sc.nextLine();
        System.out.println();
        skydivers.remove(licenseNr);
    }
}
