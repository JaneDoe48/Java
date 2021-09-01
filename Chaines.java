public class Chaines {
    public static void main(String[] args) {
    String film = new String("Midsommar");
    char lettre = film.charAt(film.length()-1);
    if(lettre=='e'){
        System.out.println("mot féminin : «mot»");
    }
    else{
        System.out.println("mot masculin : «mot»");
    }
    System.out.println(film.contains("s"));
    }
}