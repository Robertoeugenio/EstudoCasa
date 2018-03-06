package Lista_05_03_2018Exer1_Angoti;

public class Sistema {
	
	    public static void main(String[] Args){
	        Filme f1 = new Filme("Batman");
	        Filme f2 = new Filme("X-MEN");
	        Filme f3 = new Filme("Hulk");
	        Filme f4 = new Filme("IRON MAN");

	        Cliente c1 = new Cliente("Joao", " ");
	        Cliente c2 = new Cliente("Paulo", " ");

	        c1.emprestar(f1);
	        c1.emprestar(f3);
	        c2.emprestar(f2);
	        c2.emprestar(f4);

	        imprimeFilmesEmprestados(c1);
	        imprimeFilmesEmprestados(c2);

	        c1.devolver(f1);
	        c1.devolver(f3);
	        c2.devolver(f2);
	        c2.devolver(f4);

	        imprimeFilmesEmprestados(c1);
	        imprimeFilmesEmprestados(c2);

	        c1.emprestar(f2);
	        c1.emprestar(f4);
	        c2.emprestar(f1);
	        c2.emprestar(f3);
	        c2.emprestar(f4);

	        imprimeFilmesEmprestados(c1);
	        imprimeFilmesEmprestados(c2);
	    }

	    private static void imprimeFilmesEmprestados(Cliente c) {
	        System.out.println("Cliente " + c.getNome() + " -------------------");
	        for (Filme f: c.getEmprestados()) {
	            System.out.println(f.getNome());
	        }

	        if (c.getEmprestados().size() == 0) {
	            System.out.println("Nao tem nenhum filme alugado!");
	        }
	        System.out.println();
	    }

}
