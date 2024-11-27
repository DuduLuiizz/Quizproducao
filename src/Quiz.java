import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("UNIFAN - CENTRO UNIVERSITARIO ALFREDO NASSER");
        System.out.println("ALUNO: EDUARDO LUIZ DA SILVA");
        System.out.println("PROFESSOR: BRENNO PIMENTA");
        System.out.println(" ");
        System.out.println("RESPONDA CORRETAMENTE AS 15 PERGUNTAS SOBRE PRODUÇÃO MUSICAL!");
        System.out.println(" ");

        Questao q1 = new Questao(
                "1 - Qual é o papel principal de um engenheiro de som em uma produção musical?",
                "A- Criar a melodia da música",
                "B- Mixar e masterizar o áudio gravado",
                "C- Escrever as letras da música",
                "D- Gerenciar as redes sociais do artista",
                "E- Tocar os instrumentos durante a gravação",
                "B"
        );

        Questao q2 = new Questao(
                "2- O que significa o termo mixagem no contexto da produção musical?",
                "A- A gravação de instrumentos ao vivo",
                "B- A combinação das várias faixas de áudio em uma música",
                "C- A composição da letra",
                "D- O processo de afinar os instrumentos",
                "E- O design da capa do álbum",
                "B"
        );

        Questao q3 = new Questao(
                "3 - Qual software é amplamente utilizado para a gravação e edição de músicas digitais?",
                "A- Photoshop",
                "B- Final Cut Pro",
                "C- Ableton Live",
                "D- Microsoft Word",
                "E- AutoCAD",
                "C"
        );

        Questao q4 = new Questao(
                "4 - O que é um loop no contexto da produção musical?",
                "A- Um tipo de instrumento musical",
                "B- Uma repetição de um trecho de áudio",
                "C- A parte do áudio que é mixada",
                "D- Um software de gravação",
                "E- O processo de afinação de uma nota",
                "B"
        );

        Questao q5 = new Questao(
                "5 - Qual é a principal função de um equalizador (EQ) em uma mixagem?",
                "A- Aumentar a duração da música",
                "B- Alterar a tonalidade e o equilíbrio das frequências sonoras",
                "C- Fazer a masterização do áudio",
                "D- Criar efeitos de reverberação",
                "E- Adicionar um solo de guitarra",
                "B"
        );

        Questao q6 = new Questao(
                "6 - O que é um sintetizador?",
                "A-  Um tipo de guitarra",
                "B- Um software de edição de áudio",
                "C- Um instrumento que cria sons eletrônicos",
                "D- Um efeito usado para aumentar volume",
                "E- Um tipo de microfone",
                "C"
        );

        Questao q7 = new Questao(
                "7 - Qual é a diferença entre mixagem e masterização?",
                "A- A mixagem é para balancear a música, enquanto a masterização é para dar o som final e preparar a música para distribuição",
                "B- A masterização é feita antes da mixagem",
                "C- A mixagem envolve a gravação das faixas, enquanto a masterização é sobre efeitos",
                "D- A masterização é feita apenas no estúdio de gravação",
                "E- Não existe diferença entre as duas",
                "A"
        );

        Questao q8 = new Questao(
                "8 - Qual é o objetivo da masterização de uma música?",
                "A- Criar a melodia",
                "B- Ajustar a dinâmica e o volume final do áudio",
                "C- Gravar as vozes",
                "D- Escolher o estilo musical",
                "E- Definir a letra da música",
                "B"
        );

        Questao q9 = new Questao(
                "9 - O que é um metronome usado na gravação de música?",
                "A- Um tipo de microfone",
                "B- Um dispositivo para medir a intensidade do som",
                "C- Uma ferramenta que ajuda a manter o ritmo",
                "D- Um efeito de reverb",
                "E- Um software de gravação",
                "C"
        );

        Questao q10 = new Questao(
                "10 - O que é \"reverb\"?",
                "A- Um tipo de instrumento musical",
                "B- Um efeito que simula o eco de um som em um espaço",
                "C- A gravação da voz principal de uma música",
                "D- A mixagem de várias vozes em uma faixa",
                "E- A técnica de afinar as guitarras",
                "B"
        );

        Questao q11 = new Questao(
                "O que é um sound design na produção musical?",
                "A- A composição da melodia",
                "B- A escolha do estilo musical",
                "C- O processo de criação de novos sons e efeitos",
                "D- A gravação da voz do cantor",
                "E- A organização da lista de faixas do álbum",
                "C"
        );

        Questao q12 = new Questao(
                "O que é uma DAW (Digital Audio Workstation)?",
                "A- Um tipo de microfone de gravação",
                "B- O computador usado para compor músicas",
                "C- Um software para gravar, editar e mixar áudio",
                "D- Um instrumento eletrônico de música",
                "E- Um tipo de amplificador de guitarra",
                "C"
        );

        Questao q13 = new Questao(
                "O que é um clipping em uma gravação musical?",
                "A- Quando a faixa de áudio é muito baixa",
                "B- Quando há distorção causada por excesso de volume",
                "C- O processo de mixar a música",
                "D- A adição de efeitos ao áudio",
                "E- O uso de múltiplas faixas de áudio",
                "B"
        );

        Questao q14 = new Questao(
                "Qual instrumento musical é tipicamente usado para criar sons de bass nas produções eletrônicas?",
                "A- Piano",
                "B- Guitarra",
                "C- Baixo elétrico",
                "D- Bateria",
                "E- Sintetizador",
                "B"
        );

        Questao q15 = new Questao(
                "O que significa tempo em uma composição musical?",
                "A- A letra da música",
                "B- O estilo musical da canção",
                "C- A velocidade ou ritmo da música",
                "D- O volume da música",
                "E- A qualidade da voz do cantor",
                "C"
        );

        Questao[] questoes = {q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15};

        int acertos = 0;
        int erros = 0;
        int totalQuestao = questoes.length; // 15 questões no total

        for (Questao questaoAtual : questoes) {
            questaoAtual.escrevaQuestao();

            System.out.print("Digite a sua resposta (A/B/C/D/E): ");
            String respostaUsuario = scanner.nextLine().toUpperCase();

            if (questaoAtual.isCorreta(respostaUsuario)) {
                acertos++;
            } else {
                erros++;
            }
        }

        // Calculando a porcentagem de acertos
        double porcentagemAcertos = (acertos / (double) totalQuestao) * 100;

        System.out.println("Quiz finalizado!");
        System.out.println("Número de acertos: " + acertos);
        System.out.println("Número de erros: " + erros);
        System.out.println("Porcentagem de acertos: " + String.format("%.2f", porcentagemAcertos) + "%");

        scanner.close();
    }
}