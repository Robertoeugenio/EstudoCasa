package Lista_05_03_2018Exer3;

public class ProgramaLeilao {

    public static void main(String [] args){

        Leilao leilao = new Leilao("Lanck", 20.00);

        leilao.registrarLance("Beto", 312.40);
        leilao.registrarLance("Wender", 415.03);
        leilao.registrarLance("Sara", 554.00);

        leilao.finalizar();

       leilao.registrarLance("Cachorro Bombado rsrsr", 20.00);

    }



}