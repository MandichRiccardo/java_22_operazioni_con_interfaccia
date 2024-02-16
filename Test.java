public class Test{
    public static void main(String[] args) {
        esegui();
    }
    public static void esegui(){
        System.out.println("""
                cosa vuoi fare?
                    1)un'addizione
                    2)una moltiplicazione
                    3)una divisione
                    4)terminare il programma""");
        switch (getInt()){
            default -> {
                return;
            }
            case 1 -> {
                System.out.println("inserisci in quest'ordine il primo e il secondo addendo");
                System.out.println("il risultato di questa addizione è:\t" + new Add().calcolo(getDouble(), getDouble()));
            }
            case 2 -> {
                System.out.println("inserisci in quest'ordine il primo e il secondo fattore");
                System.out.println("il risultato di questa moltiplicazione è:\t" + new Molt().calcolo(getDouble(), getDouble()));
            }
            case 3 -> {
                System.out.println("inserisci in quest'ordine il dividendo e il divisore");
                System.out.println("il risultato di questa divisione è:\t" + new Div().calcolo(getDouble(), getDouble()));
            }
        }
        esegui();
    }
    public static int getInt(){
        try {
            return new java.util.Scanner(System.in).nextInt();
        }catch (java.util.InputMismatchException e){
            System.out.println("devi inserire un numero intero");
            return getInt();
        }
    }
    public static double getDouble(){
        try {
            return new java.util.Scanner(System.in).nextInt();
        }catch (java.util.InputMismatchException e){
            System.out.println("devi inserire un numero");
            return getDouble();
        }
    }
}
