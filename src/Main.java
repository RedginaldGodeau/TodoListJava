import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {


        ArrayList<ToDoClass> ToDoList = new ArrayList<ToDoClass>();
        Scanner scan = new Scanner(System.in);
        boolean loop = true;

        int action;

        while (loop)
        {
            System.out.println("Que voulez vous faire ?");
            System.out.println("[Q] Quitter\t [C] Ajouter une tache\t[V] Voir les taches");

            do
            {
                action = Character.toLowerCase(scan.next().charAt(0));
            } while (action != 'q' && action != 'c' && action != 'v');

            switch (action)
            {
                case 'q': // QUIT THE TODOLIST
                    loop = false;

                    break;
                case 'c': // CREATE ONE TODO
                    ToDoClass td;

                    String title;
                    String desc;

                    scan.nextLine();
                    System.out.println("Donnez un titre pour votre tache :");
                    title = scan.nextLine();
                    System.out.println("Donnez une description pour votre tache :");
                    desc = scan.nextLine();

                    td = new ToDoClass(title, desc);

                    System.out.printf("[%d] Title : %s, Desc : %s a été ajouté\n", td.GetId() ,td.GetTitle(), td.GetDesc());
                    ToDoList.add(td);

                    break;
                case 'v': // SEE ALL TODOLIST
                    for (int i = 0; i < ToDoList.size(); i++)
                        System.out.printf("[%d] Title : %s, Desc : %s\n", ToDoList.get(i).GetId() ,ToDoList.get(i).GetTitle(), ToDoList.get(i).GetDesc());
                    System.out.println("------------------------------");
                    break;
            }
        }

        System.out.println("Bye :)");
    }
}