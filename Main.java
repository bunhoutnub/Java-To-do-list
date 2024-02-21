/**
 * This program is a simple console-based to-do list application. Users can add tasks, view tasks, mark tasks as completed, and remove tasks.
 * @author Bunhout Nub
 * @version 0.1(Feb 20, 2024)
 */

package ToDoList;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  // list to store tasks.
  private static ArrayList<String> tasks = new ArrayList<>();
  // scanner object to reads user input.
  private static Scanner scanner = new Scanner(System.in);

  /**
   * Main method to start the to-do list application.
   * @param args The command-line arguments.
   */
  public static void main(String[] args){
    System.out.println("\nWelcome to Todo List Menu!");
    while (true){
      System.out.println("\n------------\n1) Add Task\n2) View Tasks\n3) Mark Task as Completed\n4) Remove Task\n5) Exit\n");
      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();
      scanner.nextLine();

      switch(choice){
        case 1:
        addTask();
        break;

        case 2: 
        viewTasks();
        break;

        case 3: 
        markAsCompleted();
        break;

        case 4: 
        removeTask();
        break;

        case 5:
        System.out.print("Exiting...!");
        System.exit(0);

        default:
        System.out.println("Please enter a number between 1 and 5!");
      }

    } 
  }
  // Add a new task to the list.
  private static void addTask(){
    System.out.print("Enter a task: ");
    String task = scanner.nextLine().trim();
    tasks.add(task); 
    System.out.println("Task added successfully!");
  }

  // Display the list of tasks.
  private static void viewTasks(){
    if (tasks.isEmpty()){
      System.out.println("No tasks added!");
    } else {
      System.out.print("Your Task:\n");
      for (int i = 0; i < tasks.size(); i++ ){
        System.out.println((i + 1) + ". " + tasks.get(i));
      }
    }
  }

  // Mark a task as completed
  private static void markAsCompleted(){
    if (tasks.isEmpty()){
      System.out.print("No tasks added yet!");
    } else {
      System.out.print("Enter a number to mark as completed: ");
      int taskNum = scanner.nextInt();
      if (taskNum < 1 || taskNum > tasks.size()){
        System.out.print("Invalid task number!");
      } else {
        String task = tasks.get(taskNum - 1);
        System.out.print("Marking task: \""+ task +"\" as completed");
        tasks.remove(task);
      }
    }
  }

  // Remove a task form the list. 
  private static void removeTask(){
    if(tasks.isEmpty()){
      System.out.print("No tasks added yet!");
    } 
      System.out.print("Enter a task number to remove: ");
      int taskNum = scanner.nextInt();
    if (taskNum < 1 || taskNum > tasks.size()){
      System.out.print("Invalid task number!");
    } else {
      String removeTask = tasks.remove(taskNum - 1);
      System.out.print("Removed: "+removeTask);
    }
  }
}
  