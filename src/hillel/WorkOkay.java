package hillel;

public class WorkOkay {

    public static void main(String[] args) {
        recurshionFucn(0);
    }

    public static void recurshionFucn(int number) {
        System.out.println("Number - " + number);
        System.out.println("Привет, Java!");

        if (number >= 100) {
            return;
        }
        recurshionFucn(number + 1);

    }


}
