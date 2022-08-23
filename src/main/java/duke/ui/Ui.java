package duke.ui;

import duke.task.Task;
import duke.tasklist.TaskList;

public class Ui {

    final String HORIZONTAL_LINE = "______________________________________\n";

    /**
     * Print to system out string encapsulated within horizontal lines.
     *
     * @param str String to be printed
     */
    public void formatPrint(String str) {
        System.out.println(HORIZONTAL_LINE + str + "\n" + HORIZONTAL_LINE);
    }

    public void printIntroduction() {
        String firstText = "hi... I'm Karen\nWhat do you want this time?";
        formatPrint(firstText);
    }

    public void printByeMessage() {
        formatPrint("K finally, good riddance!");
    }

    public void printListMessage(TaskList list) {
        if (list.getSize() == 0) {
            formatPrint("pff there is nothing in your list");
        } else {
            System.out.println(HORIZONTAL_LINE + "Here are your dumb tasks in your list:");
            for (int i = 1; i < list.getSize() + 1; i++) {
                Task item = list.getTask(i - 1);
                System.out.println(i + ". " + item.toString());
            }
            System.out.println(HORIZONTAL_LINE);
        }
    }

    public void printMarkMessage(Task task) {
        String str = "Took you long enough to complete this duke.task:\n" + task.toString();
        formatPrint(str);
    }

    public void printUnmarkMessage(Task task) {
        String str = "Another duke.task marked as not done?? Slow indeed\n" + task.toString();
        formatPrint(str);
    }

    public void printAddTaskMessage(Task task, int size) {
        String str = "Fine, I'll add this duke.task:\n\t" + task.toString() + "\nNow you have "
                + size + " tasks in the list...";
        formatPrint(str);
    }

    public void printDeleteMessage(Task task, int size) {
        String str = "Ughh I'll remove this duke.task:\n\t" + task.toString() + "\nNow you have "
                + size + " tasks in the list...";
        formatPrint(str);
    }

    public void printUnknownMessage() {
        formatPrint("What are you saying??? Try again");
    }

    public void printErrorMessage(String str) {
        formatPrint(str);
    }

    public void showLoadingError() {
        formatPrint("Error loading data from file");
    }
}