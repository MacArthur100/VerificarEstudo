public class VerificarEstudo {
    public static void main(String[] args) {
        // Vetor com os nomes
        String[] nomes = {"Jaqueline", "Pietro", "Maria", "Antônio"};

        // Percorrendo o vetor
        for (String nome : nomes) {
            // Verificando o nome e exibindo a mensagem correspondente
            switch (nome) {
                case "Jaqueline":
                    System.out.println(nome + ", você deve estudar Português.");
                    break;
                case "Pietro":
                    System.out.println(nome + ", você deve estudar Matemática.");
                    break;
                case "Maria":
                    System.out.println(nome + ", você deve estudar Biologia.");
                    break;
                case "Antônio":
                    System.out.println(nome + ", muito bem, não será necessário estudar.");
                    break;
                default:
                    System.out.println(nome + ", nome não reconhecido.");
            }
        }
    }
}
