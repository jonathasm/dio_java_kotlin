public class Iphone {

    private final ReprodutorMusical reprodutorMusical;
    private final AparelhoTelefonico aparelhoTelefonico;
    private final NavegadorInternet navegadorInternet;

    public Iphone() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    public static class ReprodutorMusical {

        public void tocar() {
        }

        public void pausar() {
        }

        public void selecionarMusica(String musica) {
        }
    }

    public static class AparelhoTelefonico {

        public void ligar(String numero) {
        }

        public void atender() {
        }

        public void iniciarCorreioVoz() {
        }
    }

    public static class NavegadorInternet {

        public void exibirPagina(String url) {
        }

        public void adicionarNovaAba() {
        }

        public void atualizarPagina() {
        }
    }
}
