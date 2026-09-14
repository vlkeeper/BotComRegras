import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean conversando = true;
        String estado = "NORMAL";

        System.out.println("======== PARÁ LIVROS ========");
        System.out.println("Olá! Nós somos a Pará Livros.");
        System.out.println("Como posso ajudar você hoje?");

        while (conversando) {
            String mensagem = scanner.nextLine().toLowerCase();

            if (estado.equals("AGUARDANDO_NOME_LIVRO")) {
                System.out.println("Excelente! Verifiquei no acervo e temos '" + mensagem + "' disponível. O seu exemplar foi reservado para retirada no balcão.");
                estado = "NORMAL";
                continue;
            }

            if (mensagem.contains("tchau") || mensagem.contains("sair") || mensagem.contains("encerrar")) {
                System.out.println("Obrigado por visitar a Pará Livros! Boa leitura e até a próxima!");
                conversando = false;
            }
            else if (mensagem.contains("oi") || mensagem.contains("olá") || mensagem.contains("ola")) {
                System.out.println("Olá! Você pode consultar nosso acervo, horários, localização, multas, regras de doação ou reservar um livro.");
            }
            else if (mensagem.contains("acervo") || mensagem.contains("catalogo") || mensagem.contains("lista") || mensagem.contains("livros")) {
                System.out.println("Temos vários títulos em destaque no momento, como Dom Casmurro, 1984 e O Senhor dos Anéis!");
            }
            else if (mensagem.contains("horário") || mensagem.contains("horario") || mensagem.contains("funcionamento")) {
                System.out.println("Nossa biblioteca funciona de segunda a sábado, das 08h às 19h.");
            }
            else if (mensagem.contains("endereço") || mensagem.contains("endereco") || mensagem.contains("localização") || mensagem.contains("ficam")) {
                System.out.println("Ficamos localizados na Rua Belém, 67, Vila BOTanica.");
            }
            else if (mensagem.contains("multa") || mensagem.contains("taxa") || mensagem.contains("pagar")) {
                System.out.println("O empréstimo é gratuito! Porém, o atraso na devolução gera uma multa simbólica de R$ 2,00 por dia.");
            }
            else if (mensagem.contains("tem") && (mensagem.contains("quadrinho") || mensagem.contains("manga") || mensagem.contains("hq"))) {
                System.out.println("Sim, além dos livros em texto, temos uma área inteiramente dedicada a quadrinhos e mangás.");
            }
            else if (mensagem.contains("doar") || mensagem.contains("doacao") || mensagem.contains("doação")) {
                System.out.println("Aceitamos doações de livros em bom estado! Basta trazer na recepção da biblioteca.");
            }
            else if (mensagem.contains("reservar") || (mensagem.contains("emprestar") && mensagem.contains("livro"))) {
                System.out.println("Perfeito! Qual é o nome do livro que você deseja reservar?");
                estado = "AGUARDANDO_NOME_LIVRO";
            }
            else {
                System.out.println("Desculpe, não entendi sua dúvida. Posso informar sobre nosso acervo, horários, multas ou reservar um livro para você.");
            }
        }
        scanner.close();
    }
}
