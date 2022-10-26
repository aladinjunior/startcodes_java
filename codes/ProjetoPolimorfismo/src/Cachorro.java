public class Cachorro extends Mamifero {
    private boolean dono;
    private String frase;


    public void latir() {
        System.out.println("Au! Au!");

    }

    public void rosnar() {
        System.out.println("Grrrrrr!");
    }

    public void abanar() {
        System.out.println("Abanando rabo!");
    }

    public void ignorar() {
        System.out.println("Ignorando");
    }
    public void reagir(int hora) {
        if (hora == 1 || hora <=12) {
            System.out.println("Abanando");
        } else if (hora == 13 || hora <= 17) {
            System.out.println("Abanando e Latindo");
        }else{
            System.out.println("Ignorando");
        }

    }
    public void reagir(String frase){
        if (frase == "bom garoto!") {
            System.out.println("Abanando e latindo");
        } else if (frase == "garoto mal!") {
            System.out.println("Rosnando");
        }
    }
    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("Abanando");
        }else{
            System.out.println("Rosnando e Latindo");
        }
    }
    public void reagir(Integer idade, float peso){
        if(idade <= 3 && peso <= 5){
            System.out.println("Abanando!");
        }else if(idade <= 3 && peso > 5){
            System.out.println("Latindo!");
        } else if (idade >3 && peso <= 5) {
            System.out.println("Rosnando!");
        }else{
            System.out.println("Ignorando!");
        }
    }



    public boolean getDono() {
        return dono;
    }

    public void setDono(boolean dono) {
        this.dono = dono;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
}
