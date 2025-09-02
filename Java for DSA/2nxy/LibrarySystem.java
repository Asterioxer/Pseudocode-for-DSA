import java.util.ArrayList;
import java.util.List;
import java.util.*;
// Interface for library items
interface LibraryItem {
void checkOut();
void returnItem();
void displayDetails();
}
// Class representing a Book
class Book implements LibraryItem {
private String title;
private String author;
private boolean isCheckedOut;
public Book(String title, String author) {
this.title = title;
this.author = author;
this.isCheckedOut = false;
}
@Override
public void checkOut() {
if (!isCheckedOut) {
isCheckedOut = true;
System.out.println("You checked out the book: " + title);
} else {
System.out.println("The book is already checked out.");
}
}
@Override
public void returnItem() {
if (isCheckedOut) {
isCheckedOut = false;
System.out.println("You returned the book: " + title);
} else {
System.out.println("The book was not checked out.");
}
}
@Override
public void displayDetails() {
System.out.println("Book Title: " + title + ", Author: " + author +
", Status: " + (isCheckedOut ? "Checked Out" : "Available"));
}
}
// Class representing a Magazine
class Magazine implements LibraryItem {
private String title;
private int issueNumber;
private boolean isCheckedOut;
public Magazine(String title, int issueNumber) {
this.title = title;
this.issueNumber = issueNumber;
this.isCheckedOut = false;
}
@Override
public void checkOut() {
if (!isCheckedOut) {
isCheckedOut = true;
System.out.println("You checked out the magazine: " + title + " (Issue " + issueNumber + ")");
} else {
System.out.println("The magazine is already checked out.");
}
}
@Override
public void returnItem() {
if (isCheckedOut) {
isCheckedOut = false;
System.out.println("You returned the magazine: " + title + " (Issue " + issueNumber + ")");
} else {
System.out.println("The magazine was not checked out.");
}
}
@Override
public void displayDetails() {
System.out.println("Magazine Title: " + title + ", Issue Number: " + issueNumber +
", Status: " + (isCheckedOut ? "Checked Out" : "Available"));
}
}
// Main class to run the library system
public class LibrarySystem {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
List<LibraryItem> items = new ArrayList<>();
// Adding sample items to the library
items.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
items.add(new Magazine("National Geographic", 2023));
items.add(new Book("1984", "George Orwell"));
boolean running = true;
while (running) {
System.out.println("\nLibrary System Menu:");
System.out.println("1. Display All Items");
System.out.println("2. Check Out Item");
System.out.println("3. Return Item");
System.out.println("4. Exit");
System.out.print("Your choice: ");
int choice = scanner.nextInt();
scanner.nextLine(); // Consume newline character
switch (choice) {
case 1:
System.out.println("\nLibrary Items:");
for (LibraryItem item : items) {
item.displayDetails();
}
break;
case 2:
System.out.print("Enter the title of the item to check out: ");
String checkOutTitle = scanner.nextLine();
checkOutItem(items, checkOutTitle);
break;
case 3:
System.out.print("Enter the title of the item to return: ");
String returnTitle = scanner.nextLine();
returnItem(items, returnTitle);
break;
case 4:
running = false;
System.out.println("Exiting the library system. Goodbye!");
break;
default:
System.out.println("Invalid choice. Please try again.");
}
}
scanner.close();
}
private static void checkOutItem(List<LibraryItem> items, String title) {
for (LibraryItem item : items) {
if (item instanceof Book && ((Book) item).getTitle().equalsIgnoreCase(title)) {
item.checkOut();
return;
} else if (item instanceof Magazine && ((Magazine) item).getTitle().equalsIgnoreCase(title)) {
item.checkOut();
return;
}
}
System.out.println("Item not found or already checked out.");
}
private static void returnItem(List<LibraryItem> items, String title) {
for (LibraryItem item : items) {
if (item instanceof Book && ((Book) item).getTitle().equalsIgnoreCase(title)) {
item.returnItem();
return;
} else if (item instanceof Magazine && ((Magazine) item).getTitle().equalsIgnoreCase(title)) {
item.returnItem();
return;
}
}
System.out.println("Item not found or was not checked out.");
}
} 

