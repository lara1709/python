import java.util.ArrayList;
import java.util.Scanner;
public class NameList {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");
        namesList.add("David");
        namesList.add("Eve");
        namesList.add("Frank");
        namesList.add("Grace");
        namesList.add("Hannah");
        namesList.add("Ian");
        namesList.add("Jack");

System.out.println("Original List: " + namesList);

Scanner scanner = new Scanner(System.in);

System.out.print("Enter the position (0-10) where you want to add a new name: ");
int positionToAdd = scanner.nextInt();
scanner.nextLine(); // Consume the newline character
System.out.print("Enter the name to add: ");
String newName = scanner.nextLine();

if (positionToAdd >= 0 && positionToAdd <= namesList.size()) {
namesList.add(positionToAdd, newName);
System.out.println("List after adding " + newName + " at position " + positionToAdd + ": " + namesList);
} else {
System.out.println("Invalid position.");
}