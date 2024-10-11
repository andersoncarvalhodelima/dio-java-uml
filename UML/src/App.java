public class App {
    public static void main(String[] args) throws Exception {
       iPhone iphoneNovo = new iPhone();

       iphoneNovo.selecionarMusica("Bruno e Marrone - 24 Horas de amor");
       iphoneNovo.tocar();
       iphoneNovo.pausar();

       iphoneNovo.ligar("Ex mulher");
       iphoneNovo.atender();
       iphoneNovo.iniciarCorreioVoz();

       iphoneNovo.exibirPagina("www.festadebarretos.com");
       iphoneNovo.adicionarNovaAba();
       iphoneNovo.atualizarPagina();
    }
}
