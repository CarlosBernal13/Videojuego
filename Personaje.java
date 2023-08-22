class Personaje{
    // create the variables to be filled
    private String nombre;
    private int nivel;
    // create the constructor
    public Personaje(String nombre,int nivel){
        this.nombre=nombre;
        this.nivel=nivel;
    } 
    // set the getter and setter methods
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getNivel(){
        return nivel;
    }
    public void setNivel(int nivel){
        this.nivel=nivel;
    }
    // create the attack() method
    public void atacar(){
        System.out.println(nombre+" nivel "+nivel+" ataca");
    }
}