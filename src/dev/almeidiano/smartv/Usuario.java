package dev.almeidiano.smartv;

public class Usuario {

    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();
        Usuario usuario = new Usuario();

        usuario.checarEstado(smartTv); // Passar a instância de dev.almeidiano.smartv.SmartTV para o método checarEstado

        smartTv.diminuirVolume();
        smartTv.status();
    }

    private void checarEstado(SmartTV smartTv) {
        if(smartTv.ligada == false) {
            System.out.println("Ligue a TV antes de fazer qualquer ação");
            System.exit(1); // Termina o programa se a TV não estiver ligada
        }
    }

}
