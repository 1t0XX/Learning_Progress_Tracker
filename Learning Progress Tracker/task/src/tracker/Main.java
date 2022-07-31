package tracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Learning Progress Tracker");
        StudentManager sm = new StudentManager();
        boolean stop = false;

        while (!stop) {
            String input = scanner.nextLine();
            if (hasInput(input)) {
                switch (Command.valueFrom(input)) {
                    case ADD_STUDENTS:
                        sm.addStudentCommand();
                        break;
                    case LIST:
                        sm.listStudentCommand();
                        break;
                    case ADD_POINTS:
                        sm.addPointCommand();
                        break;
                    case FIND:
                        sm.findStudentCommand();
                        break;
                    case STATISTICS:
                        Course.calculateStatisticsCommand();
                        break;
                    case NOTIFY:
                        Course.notifyCompletedCourseCommand();
                        break;
                    case BACK:
                        System.out.println("Enter 'exit' to exit the program.");
                        break;
                    case EXIT:
                        stop = true;
                        break;
                    default:
                        System.out.println("Unknown command.");
                }
            } else {
                System.out.println("No input.");
            }
        }
        System.out.println("Bye!");
    }

    private static boolean hasInput(String input) {
        return !input.isBlank(); // if blank, return false
    }
}