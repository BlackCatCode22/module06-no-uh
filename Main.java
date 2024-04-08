import java.io.*;
import java.nio.Buffer;
import java.util.*;


public class Main {
    public static void main(String[] args) {


        ArrayList<Animal> animals = new ArrayList<>();

        ArrayList<String> hyenaNames = new ArrayList<>();

        ArrayList<String> lionNames = new ArrayList<>();

        ArrayList<String> tigerNames = new ArrayList<>();

        ArrayList<String> bearNames = new ArrayList<>();


        String filePath = "/Users/no-uh/CIT-63 Spring 24/Java/Zookeepers Challenge/animalNames.txt";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);

                if (line.contains("Hyena")) {
                    scanner.nextLine();
                    String[] hyenaNamesArray = scanner.nextLine().split(", ");

                    for (String name : hyenaNamesArray)
                        System.out.println(name);
                    for (String name : hyenaNamesArray)
                        hyenaNames.add(name);

                    String firstHyena = hyenaNames.remove(0);
                    System.out.println("First hyena is: " + firstHyena);

                    firstHyena = hyenaNames.remove(0);

                    String secondHyena = hyenaNames.remove(1);
                    System.out.println("Second hyena is: " + secondHyena);

                    secondHyena = hyenaNames.remove(1);

                    String thirdHyena = hyenaNames.remove(2);
                    System.out.println("Third hyena is: " + thirdHyena);

                    thirdHyena = hyenaNames.remove(2);

                    String fourthHyena = hyenaNames.remove(3);
                    System.out.println("Fourth hyena is: " + fourthHyena);

                    fourthHyena = hyenaNames.remove(3);
                }

                if (line.contains("Lion")) {
                    scanner.nextLine();
                    String[] lionNamesArray = scanner.nextLine().split(", ");

                    for (String name : lionNamesArray)
                        System.out.println(name);
                    for (String name : lionNamesArray)
                        lionNames.add(name);

                    String firstLion = lionNames.remove(0);
                    System.out.println("First lion is: " + firstLion);

                    firstLion = lionNames.remove(0);

                    String secondLion = lionNames.remove(1);
                    System.out.println("Second lion is: " + secondLion);

                    secondLion = lionNames.remove(1);

                    String thirdLion = lionNames.remove(2);
                    System.out.println("Third lion is: " + thirdLion);

                    thirdLion = lionNames.remove(2);

                    String fourthLion = lionNames.remove(3);
                    System.out.println("Fourth lion is: " + fourthLion);

                    fourthLion = lionNames.remove(3);

                }

                if (line.contains("Bear")) {
                    scanner.nextLine();
                    String[] bearNamesArray = scanner.nextLine().split(", ");

                    for (String name : bearNamesArray)
                        System.out.println(name);
                    for (String name : bearNamesArray)
                        bearNames.add(name);

                    String firstBear = bearNames.remove(0);
                    System.out.println("First bear is: " + firstBear);

                    firstBear = bearNames.remove(0);

                    String secondBear = bearNames.remove(1);
                    System.out.println("Second bear is: " + secondBear);

                    secondBear = bearNames.remove(1);

                    String thirdBear = bearNames.remove(2);
                    System.out.println("Third bear is: " + thirdBear);

                    thirdBear = bearNames.remove(2);

                    String fourthBear = bearNames.remove(3);
                    System.out.println("Fourth bear is: " + fourthBear);

                    fourthBear = bearNames.remove(3);
                }

                if (line.contains("Tiger")) {
                    scanner.nextLine();
                    String[] tigerNamesArray = scanner.nextLine().split(", ");

                    for (String name : tigerNamesArray)
                        System.out.println(name);
                    for (String name : tigerNamesArray)
                        tigerNames.add(name);

                    String firstTiger = tigerNames.remove(0);
                    System.out.println("First tiger is: " + firstTiger);

                    firstTiger = tigerNames.remove(0);

                    String secondTiger = tigerNames.remove(1);
                    System.out.println("Second tiger is: " + secondTiger);

                    secondTiger = tigerNames.remove(1);

                    String thirdTiger = tigerNames.remove(2);
                    System.out.println("Third tiger is: " + thirdTiger);

                    thirdTiger = tigerNames.remove(2);

                    String fourthTiger = tigerNames.remove(3);
                    System.out.println("Fourth tiger is: " + fourthTiger);

                    fourthTiger = tigerNames.remove(3);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}