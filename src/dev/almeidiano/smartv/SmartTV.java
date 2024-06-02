package dev.almeidiano.smartv;

public class SmartTV {
    // Método `print` estático para poder ser chamado no método `main`
    public static void print(String stringValue) {
        System.out.println(stringValue);
    }

    boolean ligada = false;
    int canal = 1;
    int volume = 0;

    public void mudarCanal(int novoCanal) {
        if(novoCanal > 1 && novoCanal < 100) {
            canal = novoCanal;
            print("Canal atual: " + canal);
        }else print("Este canal não existe. Defina um canal entre 1 e 100.");
    }

    public void ligar() {
        ligada = true;
        print("Estado da TV: " + ligada);
    }

    public void desligar() {
        ligada = false;
        print("Estado da TV: " + ligada);
    }

    public void aumentarVolume() {

        if(volume == 100) {
            print("O volume já está no máximo.");
            return;
        }

        volume++;
        print("Volume atual: " + volume);
    }

    public void diminuirVolume() {

        if(volume == 0) {
            print("O volume já está zerado.");
            return;
        }

        volume--;
        print("Volume atual: " + volume);
    }

    public void status() {
        print("Status atual da TV: ");
        print("Ligado: "+ ligada);
        print("Canal: "+ canal);
        print("Volume: "+ volume);
    }
}
