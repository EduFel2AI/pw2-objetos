import java.time.LocalDate;

public class animeTeste {
    public static void main(String[] args) {
        //Classe nomeObjeto = new Classe();
        Anime meuAnime = new Anime();
        meuAnime.nome = "Boruto";
        meuAnime.dataDeLancamento = LocalDate.parse("março");
        meuAnime.classificacaoIndicativa = "16";
        meuAnime.genero = "Homem";
        meuAnime.autor = "Ozama Bin'Laden";

    }
}