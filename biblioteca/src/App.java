import java.util.HashMap;
import java.util.Scanner;

import biblioteca.Livro;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String,Livro> biblioteca = new HashMap<String,Livro>();
        Scanner scan = new Scanner(System.in);
        int num=1;
        int count=0;
        while(num!=0){
            System.out.println("Digite 0 para sair, 1 para cadastrar um livro, 2 para listar os livros, 3 para visualizar detalhes de um livro ou 4 para remover um livro!");
            num = scan.nextInt();
            scan.nextLine();
            String titulo;
            String autor;
            int ano;
            switch (num) {
                case 0:
                    break;
                case 1:
                    System.out.println("Digite o titulo do livro");
                    titulo = scan.nextLine();
                    System.out.println("Digite o autor do livro");
                    autor = scan.nextLine();
                    System.out.println("Digite o ano de publicação do livro");
                    ano = scan.nextInt();
                    Livro livro = new Livro(titulo, count, autor, ano);
                    biblioteca.put(titulo, livro);
                    count++;
                    break;
                case 2:
                    for (Livro livros : biblioteca.values()) {
                        System.out.println(livros);
                    }
                    break;
                case 3:
                    System.out.println("Digite o titulo do livro");
                    titulo = scan.nextLine();
                    livro = biblioteca.get(titulo);
                    if(livro==null){
                        System.out.println("Livro não foi encontrado!");
                        break;
                    }
                    System.out.println(livro.detalhado());
                    break;
                case 4:
                    System.out.println("Digite o titulo do livro");
                    titulo = scan.nextLine();
                    livro = biblioteca.remove(titulo);
                    if(livro==null){
                        System.out.println("Livro não foi encontrado!");
                        break;
                    }
                    break;
                default:
                    break;
            }
        }
        scan.close();
    }
}
