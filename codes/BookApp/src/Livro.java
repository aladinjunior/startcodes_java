import java.util.Random;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Construtor
    public Livro(){
        this.setAberto(false);
        this.pagAtual = 0;
    }

    //Métodos
    public void detalhes(Pessoa leitor){
        this.leitor = leitor;
        System.out.println("Leitor: "+leitor.getNome());
        System.out.println("------------------------ ");
        if (this.getAberto()){
            System.out.println("Você está lendo "+ getTitulo() + ", do autor "+ getAutor());
            System.out.println("O livro possui "+getTotPaginas() + " páginas");
            System.out.println("Você está na página "+ getPagAtual());
        }else{
            System.out.println("Impossível mostrar detalhes, o livro está fechado!");
        }


    }

    //Getters e Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
        System.out.println("Livro aberto!");

    }

    @Override
    public void fechar() {
        this.setAberto(false);
        System.out.println("Livro fechado!");
    }

    @Override
    public void folhear() {
        if (this.getAberto() == false){
            System.out.println("Impossível folhear, pois o livro está fechado!");
        }else {
            System.out.println("Folheando!");
            Random random = new Random();
            int novaPag = random.nextInt(this.getTotPaginas());
            this.setPagAtual(novaPag);
            System.out.println("Você parou na página "+novaPag);

        }

    }

    @Override
    public void voltarPag() {
        if (this.getAberto()){
            this.setPagAtual(this.getPagAtual() - 1);
        } else {
            System.out.println("Impossível voltar página, pois o livro está fechado!");
        }
    }

    @Override
    public void avanPag() {
        if (this.getAberto() == true){
            this.setPagAtual(this.getPagAtual() + 1);
        }else{
            System.out.println("Impossível avançar página, pois o livro está fechado!");
        }

    }
}
