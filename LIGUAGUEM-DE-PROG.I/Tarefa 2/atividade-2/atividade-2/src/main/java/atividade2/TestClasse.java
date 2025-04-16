package atividade2;

import java.util.Scanner;


public class TestClasse{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 1;
        while(opcao  > 0){
            System.out.println("========================");
            System.out.println("Classes:       ");
            System.out.println("1 - Pessoas ");
            System.out.println("2 - Carros");
            System.out.println("3 - Animais");
            System.out.println("4 - Instrumentos");
            System.out.println("5 - Marmitas");
            System.out.println("6 - Plantas");
            System.out.println("7 - Livros");
            System.out.println("8 - Times De Futebol");
            System.out.println("9 - Cadernos");
            System.out.println("10 - Fruta ");
            System.out.println("0 - Sair");
            System.out.println("========================");
            opcao = entrada.nextInt();
            entrada.nextLine();
        switch (opcao){
            case 1:
                Pessoa John = new Pessoa("John", 'M', 19);
                John.andar();
                John.sentar();
                John.comer();
                System.out.println("");
                break;
                
            case 2:
                //Carros
                Carro FordKa =  new Carro("Fordka","Ford", 0, false);
                FordKa.ligarCarro();

                //MÉTODO PARA ACELERAR O CARRO
                System.out.println("Acelerar? [S/N]");
                String acelerarCarro = entrada.nextLine().toUpperCase();
                if(acelerarCarro.equals("S")) {
                FordKa.acelerar(10, 100);
                }

                //MÉTODO PARA FREIAR O CARRO
                 System.out.println("Deseja freiar? [S/N]");
                 String resp = entrada.nextLine().toUpperCase();
                 if(resp.equals("S")){
                 FordKa.freiar(5);
                 }
                System.out.println("");
                break;

            case 3:
                //Animais
                Animal gato = new Animal("Gato","Frajola","Mamífero", 2,"arranhar", "correndo");
                gato.mostrarInformacaoAnimal();
                gato.Beber();
                gato.movimentar();
                System.out.println("");
                break;

            case 4:
                //Instrumentos musicais
                Instrumento guitarra = new Instrumento("guitarra", false, 0, "src\\instrumentoSom\\guitarra.wav");
                guitarra.ligarInstrumento();
                System.out.println("O valor do volume: ");
                int limiteVolume = entrada.nextInt();
                guitarra.aumentarVolume(limiteVolume);

                System.out.println("Abaixar o volume para: ");
                int volumeAbaixado = entrada.nextInt();

                guitarra.abaixarVolume(volumeAbaixado, limiteVolume);

                guitarra.perguntarParaTocar(entrada);
                if(entrada.nextLine().toUpperCase().equals("S")){
                    guitarra.tocarSom();
                }
                System.out.println("");
                break;

            case 5:
                // Marmita
                Marmita m1 = new Marmita();
                System.out.println("Nome da Marmita: ");
                String nomeMarmita = entrada.nextLine();
                m1.setnomeMarmita(nomeMarmita);
                m1.adicionarIngredientes(entrada);
                System.out.println("-----------");
                System.out.println("Lista de Ingredientes: ");
                System.out.println(m1.getnomeMarmita());
                m1.exibirIngredientes();
                System.out.println("-----------");
                m1.finalizarMarmita("FritaS");

                break;

            case 6:
                // Planta
                // Pedir os dados da planta ao usuário
                System.out.println("Digite o nome da planta: ");
                String nomePlanta = entrada.nextLine();

                System.out.println("Digite o tipo da planta (ex: Arbusto lenhoso): ");
                String tipoPlanta = entrada.nextLine();

                System.out.println("Digite a cor da planta: ");
                String corPlanta = entrada.nextLine();

                // Criando a planta com as informações fornecidas pelo usuário
                Planta pl1 = new Planta(nomePlanta, tipoPlanta, corPlanta);

                // Verificando o nível de água da planta
                pl1.verificarONivelAgua(entrada);

                // Se o nível de água for 0, regar a planta
                if (pl1.getNivelAgua() == 0) {
                    System.out.println(pl1.getNome() + " precisa de água!");
                    pl1.regar(entrada);  // Regar a planta
                } else {
                    System.out.println(pl1.getNome() + " já tem água.");
                }

                // Exibindo informações da planta
                pl1.mostrarInformacaoPlanta();
                break;


            case 7:
                // Criar uma nova série
                Serie serie1 = new Serie();

                // Inserir os dados da série
                serie1.inserirDados(entrada);

                // Exibir as informações da série
                serie1.exibirSerie();
                System.out.println("");

                // Exibir os atores favoritos
                serie1.exibirAtores();
                break;

            case 8:
                TimeDeBasquete partida = new TimeDeBasquete( "Chicago Bulls", " PayCom Center", "Oklahoma City Thunde");
                partida.perguntarOPlacar(entrada);
                partida.mostrarPlacar();
                break;

            case  9:
            // Pedir informações do livro
            System.out.println("Digite o nome do livro: ");
            String nomeLivro = entrada.nextLine();

            System.out.println("Digite a cor da capa do livro: ");
            String corLivro = entrada.nextLine();

            System.out.println("Digite o número de páginas do livro: ");
            int numPaginas = entrada.nextInt();
            entrada.nextLine();  // Limpar o buffer do Scanner

            System.out.println("Digite o tipo do livro: ");
            String tipoLivro = entrada.nextLine();

            // Criar o objeto Livro com os dados fornecidos pelo usuário
            Livro livro1 = new Livro(nomeLivro, corLivro, numPaginas, tipoLivro);

            // Executar a interação com o livro
            livro1.interagirComLivro(entrada);
            break;


            case 10:
                Fruta fruta1 = new Fruta("Pera", "Verde", "Fruta", "S"); // Fruta pode ser comida
                fruta1.verificarEstado(entrada);  // Pergunta se está podre e age conforme o estado
                fruta1.estado();  // Exibe o estado da fruta
                break;

            case 0:
                System.out.println("Saindo....");
                break;

            default:
                System.out.println("Opção inválida!");
                break;
    }

    }
        entrada.close();
}
}
