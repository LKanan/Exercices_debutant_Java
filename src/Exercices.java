//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercices {
    public void ex1(){
        int nbre;
        System.out.println("Entrez un nombre entre 1 et 3");
        nbre=4;
        while (nbre<1 || nbre>3){
            System.out.println("Saisise erronnée");
            nbre=2;
        }
    }
    public void ex2(){
        int nbre;
        System.out.println("Entrez un nombre entre 10 et 20");
        nbre=25;
        while (nbre < 10 || nbre > 20) {
            if (nbre<10){
                System.out.println("Plus grand !");
            }
            else if(nbre>20){
                System.out.println("Plus petit");
            }
            nbre=12;
        }
    }
    public void ex3(){
        int nbre;
        System.out.println("Entrez un nombre !");
        nbre=4;
        System.out.println("Les 10 nombres suivants sont :");
        while (nbre<14){
            nbre+=1;
            System.out.println(nbre);
        }
    }
    public void ex4(){
        int nbre;
        System.out.println("Entrez un nombre !");
        nbre=4;
        System.out.println("Les 10 nombres suivants sont :");
        for(int i=5; i<=nbre+10;i++){
            System.out.println(i);
        }
    }
    public void ex5(){
        int nbre;
        System.out.println("Entrez un nombre");
        nbre=6;
        System.out.println("La table de multiplication de ce nombre est :");
        for (int i=1;i<=10;i++){
            System.out.println(nbre+" * "+i+" = "+ nbre*i);
        }
    }
    public void ex6(){
        int nbre;
        int somme;
        System.out.println("Entrez un nombre");
        nbre=5;
        somme=0;
        for (int i=1; i<=5;i++){
            somme+=i;
        }
        System.out.println("La somme est "+somme);
    }
    public void ex7(){
        int nbre;
        int factorielle;
        System.out.println("Entrez un nombre :");
        nbre=5;
        factorielle=1;
        for(int i=2;i<=5;i++){
            factorielle*=i;
        }
        System.out.println("La factorielle est "+ factorielle);
    }
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Exercices exercice = new Exercices();
        exercice.ex7();
    }
}