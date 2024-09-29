import java.util.Scanner;

public class main {
    public static String[] todos = new String[10];
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        todos[0] = "Belajar";
        todos[1] = "Menggambar";
        todos[2] = "Berdoa";
        showToDoList();
        System.out.println("Length todos : " + todos.length);
    }

    public static void showToDoList() {
        System.out.println("TODO LIST");
        for (int i = 0; i < todos.length; i++) {
            String todo = todos[i];
            if (todo != null) {
                System.out.println(i + 1) + ". " + todo;
            }
        }
    }

    public static void addToDoList(String todo) {
       // check is full
        Boolean isFull = true;
        for (int i = 0; i < todos.length; i++)
            if (todos[i] == null) {
                isFull = false;
                break;
            }
    }




        for (int i = 0; i < todos.length; i++) {
            if (todos[i] == null) {
                todos[i] = todo;
                break;

            }
        }
    }
}
