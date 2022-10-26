public class App {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Aladin",19,"Masculino");
        Pessoa p1 = new Pessoa("Allan", 14, "Masculino");
        Livro l = new Livro();
        l.setLeitor(p);
        l.abrir();
        l.setTitulo("Dom Casmurro");
        l.setAutor("Machado de Assis");
        l.setTotPaginas(1000);
        l.setPagAtual(502);
        l.avanPag();
        l.avanPag();
        l.folhear();
        l.detalhes(p1);





        }
    }