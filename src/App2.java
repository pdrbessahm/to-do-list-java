import java.util.Scanner;
import java.util.ArrayList;



public class App2 {
    public static void main(String[] args){

        // heres how i created a array list storage
        ArrayList<String> tasks2 = new ArrayList();

        // setting up scanner and the variable needed to keep the users input from their choices 
        Scanner scanner = new Scanner(System.in);
        boolean isrunning = true;

        while(isrunning){

            System.out.println("==================================");
            System.out.println("MY FAVORITE TO-DO LIST");
            System.out.println("----------------------------------");
            System.out.println("1. Add a new task");
            System.out.println("2. View all tasks");
            System.out.println("3. Remove a task");
            System.out.println("4. Exit program");
            System.out.println("----------------------------------");
            System.out.print("Which option do you want to access? ");
        

            int option2 = scanner.nextInt();
            scanner.nextLine(); // to handle buffer problems

            switch(option2){
                case 1 -> addTask2(tasks2, scanner);
                
                case 2 -> viewTask2(tasks2, scanner);

                case 3 -> removeTask2(tasks2, scanner);

                case 4 -> isrunning = false;

                default -> System.out.print("Invalid number. Try again within the options range");
            }

        }


    }

    // creating the case 1 method
    public static void addTask2(ArrayList<String> tasks2, Scanner scanner) {
        System.out.println("----------------------------------");
        System.out.print("Type whatever you want to set: ");
        
        String usertaskInput = scanner.nextLine();
        
        tasks2.add(usertaskInput);

        System.out.println("----------------------------------");
        System.out.println("Task added successfuly");

    }

    // creating the case 2 method 
    public static void viewTask2(ArrayList<String> tasks2, Scanner scanner) {
        
        
        if(tasks2.isEmpty()) {
            System.out.println("----------------------------------");
            System.out.println("You don't have anything on the list yet");
        } else {
            System.out.println("======== MY LIST ========");
            for(int i = 0; i < tasks2.size(); i++) {
                System.out.println((i + 1) + ". " + tasks2.get(i));
            }
        }
    }

    // creatin the case 3 method

    public static void removeTask2(ArrayList<String> tasks2, Scanner scanner) {
        
        if(tasks2.isEmpty()) {
            System.out.println("----------------------------------");
            System.out.println("You can't remove something from an empty list.");
        } else {
            System.out.println("======== MY LIST ========");
            for(int i = 0; i < tasks2.size(); i++){
                System.out.println((i + 1) + ". " + tasks2.get(i));
            }
        }

        System.out.print("Which task would you like to remove? (A Number): ");
        int removedTask = scanner.nextInt();
            
        if(removedTask < 1 || removedTask > tasks2.size()) {
            System.out.println("Try to write something that actually makes sense.");
        } else {
            tasks2.remove(removedTask);
            System.out.println("----------------------------------");
            System.out.println("Removed item: \"" + removedTask + "\"" );

        }
    }
    
}


/*
 * The to-do list must have up to 4 options
 * 1. Add something to the list
 * 2. View the whole list
 * 3. Remove something from the list
 * 4. exit program
 * 
 * Set up how the interface will be displayed on the terminal
 * 
 * Create a variable to receive the users input 
 * 
 * Create a variable to store the arraylist
 * 
 * ----------------------------------------------------------
 * Once we have created de whole set up, we must separate the problem into pieces 
 * 
 * first and foremost we should implement the add a new task function to the list
 * so we have to create a method e here is my train of thought
 *  1. whats my goal? A: set something to handle the users input information about what he wants to add 
 *  2. what do i need? A: a variable to store that information and a class to update the info
 *  3. Edge cases to handle? A: none yet
 *  4. Flow idea? A: after create a mathod, output a question to receive the user input, store that information in the memory, pass a feedback and then run the list one more time at least
 * ----------------------------------------------------------
 * Now we need to create the viewTask2 method
 * 1. Whats my goal? A: create something to allow the user seeing whats on his to-do list
 * 2. What do i need? A: something that allows me to display every single task added to the list 
 * 3. Edge cases to handle: A: when i dont have anything within the list
 * 4. Flow idea? create a method passing through its arguments needed, probably gonna need a counter to read every single item from that list too 
 * ----------------------------------------------------------
 * Its time to create the most complex part of our code: the removing option
 * 1. Whats my goal? A: to remove a task previously aloccated to our list
 * 2. What do i need? A: some variable to be defined as the removed option, using tasks2.remove(i) probably, counter to display the lists option, feedback for the user 
 * 3. Edge cases to handle? A: when i dont have anything within the list, a negative number as the users choice and when the input is greater than the options
 * 4. Flow idea? A: dont even know how to start :p
 * 
 * 
 * 
 * --------------------------------------------------------
 * 
 * i nailed it. 8)
 */