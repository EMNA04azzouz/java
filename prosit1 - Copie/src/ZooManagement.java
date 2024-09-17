import java.util.Scanner;
//instruction 1
public class ZooManagement {
    int nbrCages=20;
    String ZooName = "myzoo";
    public static void main(String[] args)
    {
        ZooManagement Zm =new ZooManagement();
        System.out.println(Zm.ZooName + "comporte" + Zm.nbrCages + "cages");
        Scanner scanner = new Scanner(System.in);
        System.out.print("nombre de cages:");
        if (scanner.hasNextInt()) {
            Zm.nbrCages = scanner.nextInt();
        } else {
            System.out.println("Veuillez entrer un nombre valide.");
            return;
        }
        scanner.nextLine();
        System.out.print("Entrez le nom du zoo:");
        Zm.ZooName = scanner.nextLine();
        System.out.println(Zm.ZooName + " comporte " + Zm.nbrCages + " cages");
        scanner.close();
    }
}



