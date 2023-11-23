package AtivSomativa2;

public class Principal {

	public static void main(String[] args) {
		Livro livro = new Livro ("O pequeno principe", "Antoine de Saint-Exupéry", 250);
		System.out.println("\nLivro");
		System.out.println("Nome: "+livro.getNome());
		System.out.println("Autor: "+livro.getAutor());
		System.out.println("Paginas: "+livro.getPaginas());

	}

}
