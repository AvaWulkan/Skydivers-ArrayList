package skydivers.arraylist;

import java.util.Scanner;

public class SkydiverMenu {

    static Scanner sc = new Scanner(System.in);

    public static void mainMenu() {
        System.out.println("1. Add skydiver");
        System.out.println("2. Print Skydiver");
        System.out.println("3. Edit skydiver");
        System.out.println("4. Remove skydiver");
        System.out.println("5. See skydiver statistic");
        System.out.println("0. Exit");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println();

        switch (choice) {
            case 1:
                SkydiverManagement.createSkydiver();
                break;
            case 2:
                printMenu();
                break;
            case 3:
                SkydiverManagement.updateSkydiver();
                break;
            case 4:
                SkydiverManagement.removeSkydiver();
                break;
            case 5:
                statisticMenu();
                break;
            case 0:
                System.exit(0);
            default:
                break;
        }
        System.out.println();
    }

    private static void printMenu() {
        System.out.println("1. Print skydiver by name");
        System.out.println("2. Print skydiver by age");
        System.out.println("3. Print skydiver by certification number");
        System.out.println("4. Print skydiver by certification grade");
        System.out.println("5. Print skydiver by number of jumps");
        System.out.println("6. Print skydiver by club");
        System.out.println("7. Print all skidivers");
        System.out.println("9. Back to main menu");
        System.out.println("0. Exit");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println();

        switch (choice) {
            case 1:
                SkydiverManagement.printSkydiversByName();
                break;
            case 2:
                SkydiverManagement.printSkydiversByAge();
                break;
            case 3:
                SkydiverManagement.printSkydiversByLicenseNr();
                break;
            case 4:
                SkydiverManagement.printSkydiversByLicenseGrade();
                break;
            case 5:
                SkydiverManagement.printSkydiversByJumps();
                break;
            case 6:
                SkydiverManagement.printSkydiversByClub();
                break;
            case 7:
                SkydiverManagement.printAllSkydivers();
                break;
            case 9:
                mainMenu();
                break;
            case 0:
                System.exit(0);
            default:
                break;
        }
        System.out.println();
    }

    private static void statisticMenu() {
        System.out.println("1. Age statistic");
        System.out.println("2. Jump statistic");
        System.out.println("9. Back to main menu");
        System.out.println("0. Exit");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println();

        switch (choice) {
            case 1:
                SkydiverManagement.countYoungestSkydiver();
                SkydiverManagement.countOldestSkydiver();
                SkydiverManagement.averageAge();
                break;
            case 2:
                SkydiverManagement.countLowestNrOfJumps();
                SkydiverManagement.countHighestNrOfJumps();
                SkydiverManagement.averageNrOfJumps();
                break;
            case 9:
                mainMenu();
                break;
            case 0:
                System.exit(0);
            default:
                break;
        }
    }

}
