import java.util.Scanner;
import java.util.ArrayList;



public class App {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;


        while(running) {
            System.out.println("============================");
            System.out.println("PEDRO'S TO-DO LIST");
            System.out.println("---------------------");
            System.out.println("1. Add a Task");
            System.out.println("2. View all Tasks");
            System.out.println("3. Remove a Task");
            System.out.println("4. Exit");
            System.out.println("============================");

            int option = scanner.nextInt();
            scanner.nextLine();

            // option to add a task

            // option to view all tasks

            // option to remove a task


            switch (option) {

                case 1 -> addTask(tasks, scanner);

                case 2 -> viewTask(tasks);

                case 3 -> removeTask(tasks, scanner);

                case 4 -> running = false;
                    
                default -> System.out.print("Invalid Number");
                   
            }

        }

    }

    // quick reminder: public because it can be used where we want to
    // quick reminder: static because allows us to call a method without creating an object
    // quick reminder: void because it just doesnt return anything but this task we are creating
    // quick reminder: within the arguments we want to pass everything we want to use that are actually somewhere else

    public static void addTask(ArrayList<String> tasks, Scanner scanner) {

        // need a input for the user write a task
        System.out.print("Enter a new task: ");

        // creating a varible to store that value using nextLine to avoid buffer problems
        String newTask = scanner.nextLine();

        // calling a Java method adding the new task into the tasks array
        tasks.add(newTask);

        // confirmation to the user 
        System.out.println("Task added succesfully");
    }

    public static void viewTask(ArrayList<String> tasks) {

        // first of all we need to check whether the list is empty or not
        if(tasks.isEmpty()) {
            System.out.println("You don't have any tasks yet.");
        } else {

            // if not empty, we must display the user's list
            System.out.println("===== YOUR TASKS =====");

            // now we need a counter because we have to display all the tasks no matter the situation
            // btw we are using .size because tasks is not a method, but a property of arrays and doenst have a length property within
            for(int i = 0; i < tasks.size(); i++) {

                // we have to display the list the same way as we do on the first run
                // the i + 1 its because arrays starts by 0 to N. But we dont do the same in the real world so we have to tell that to the computer
                // the last part is a java method to display the content of that specific index (arraylist.get(index))
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void removeTask(ArrayList<String> tasks, Scanner scanner) {

        System.out.println("Enter the number you want to remove: ");
        int userChoice = scanner.nextInt();
        scanner.nextLine(); // to clean the buffer



        if(tasks.isEmpty()) {
            System.out.println("You don't have any tasks yet to remove.");
        } else {
            System.out.print("===== YOUR TASKS =====");
            for(int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }

        if(userChoice < 1 || userChoice > tasks.size()) {
            System.out.println("Invalid task number: ");
        } else {
            String removed = tasks.remove(userChoice - 1);
            System.out.println("Removed: \""+ removed +"\"");
        }
        
    }

}
