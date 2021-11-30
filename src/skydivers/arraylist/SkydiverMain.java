package skydivers.arraylist;

public class SkydiverMain {

    static boolean loop = true;

    public static void main(String[] args) {

        loadDb();
        while (loop) {
            startProgram();
        }

    }

    private static void loadDb() {
        Skydiver s1 = new Skydiver(25298, "Ava", 29, 53, "A", "Aros");
        Skydiver s2 = new Skydiver(25299, "Linda", 32, 90, "A", "Aros");
        Skydiver s3 = new Skydiver(25300, "Sebastian", 12, 893, "D", "Sfk");
        Skydiver s4 = new Skydiver(25301, "Jackiie", 29, 1012, "D", "Aros");
        Skydiver s5 = new Skydiver(25302, "Gustav", 37, 120, "B", "Aros");
        Skydiver s6 = new Skydiver(25303, "Elin", 17, 3, "Student", "Sf");
        Skydiver s7 = new Skydiver(25304, "Calle", 31, 136, "B", "Öfk");
        Skydiver s8 = new Skydiver(25305, "Henrik", 23, 1, "Student", "Aros");
        Skydiver s9 = new Skydiver(25306, "Åsa", 48, 172, "C", "Aros");

        SkydiverManagement.addSkydiver(s1);
        SkydiverManagement.addSkydiver(s2);
        SkydiverManagement.addSkydiver(s3);
        SkydiverManagement.addSkydiver(s4);
        SkydiverManagement.addSkydiver(s5);
        SkydiverManagement.addSkydiver(s6);
        SkydiverManagement.addSkydiver(s7);
        SkydiverManagement.addSkydiver(s8);
        SkydiverManagement.addSkydiver(s9);
    }

    private static void startProgram() {
        SkydiverMenu.mainMenu();
    }

}
