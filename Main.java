public class Main {
    public static void main(String[] args) {
        //create the player and enemy instances three times each
        Jugador jugador=new Jugador("Tauro", 5, "Guerrero");
        Jugador jugador1=new Jugador("Dorse", 10, "Mago");
        Jugador jugador2=new Jugador("Lancelot", 9, "Arquero");
        Enemigo enemigo=new Enemigo("Minotauro", 7, "Esqueleto");
        Enemigo enemigo1=new Enemigo("Clovedeo", 10, "Dragón");
        Enemigo enemigo2=new Enemigo("Pelayo", 12, "Orco");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        enemigo.atacar();
        enemigo.gritar();
        jugador.atacar();
        jugador.usarHabilidadEspecial();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        enemigo1.atacar();
        enemigo1.gritar();
        jugador1.atacar();
        jugador1.usarHabilidadEspecial();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        enemigo2.atacar();
        enemigo2.gritar();
        jugador2.atacar();
        jugador2.usarHabilidadEspecial();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
