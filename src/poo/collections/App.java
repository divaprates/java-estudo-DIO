package poo.collections;

import poo.collections.list.CarrinhoDeCompras;
import poo.collections.list.ListaTarefa;
import poo.collections.list.OrdenacaoPessoa;
import poo.collections.list.SomaNumeros;
import poo.collections.map.Dicionario;
import poo.collections.map.Livraria;
import poo.collections.set.Agenda;
import poo.collections.set.ConjuntoPalavrasUnicas;

public class App {
    public static void main(String args[]) {
        ListaTarefa tarefas = new ListaTarefa();
        tarefas.adicionarTarefa("Caminhar");
        tarefas.adicionarTarefa("beber água");
        tarefas.adicionarTarefa("ler um livro");
        tarefas.adicionarTarefa("Caminhar");

        System.out.println(tarefas.obterNumeroTotal());
        tarefas.obterDescricoes();
        tarefas.removerTarefa("Caminhar");
        tarefas.obterDescricoes();

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("maçã", 10.12, 2);
        carrinho.adicionarItem("copo americano", 2.00, 5);
        carrinho.adicionarItem("maçã", 12.12, 3);

        System.out.println(carrinho.calcularValorTotal());
        carrinho.exibirItens();
        carrinho.removerItem("maçã");
        carrinho.exibirItens();

        //  Soma números
        System.out.println("\nSoma Números");

        SomaNumeros numeros = new SomaNumeros();
        numeros.adicionarNumero(12);
        numeros.adicionarNumero(38);
        numeros.adicionarNumero(64);
        numeros.adicionarNumero(89);

        System.out.println("Total: " + numeros.calcularSoma());
        System.out.println("Maior número: " + numeros.encontrarMaiorNumero());
        System.out.println("Maior número: " + numeros.encontrarMenorNumero());
        System.out.println("Maior número: " + numeros.exibirNumeros());
        numeros.ordenarAscendente();
        System.out.println(numeros.exibirNumeros());
        numeros.ordenarDescendente();
        System.out.println(numeros.exibirNumeros());


        //  Ordenar Pessoas
        System.out.println("\nOrdenar Pessoas");
        OrdenacaoPessoa pessoas = new OrdenacaoPessoa();
        pessoas.adicionarPessoas("Lua", 12, 1.78);
        pessoas.adicionarPessoas("Sol", 18, 1.60);
        pessoas.adicionarPessoas("Flor", 17, 1.64);
        pessoas.adicionarPessoas("Mar", 15, 1.70);

        pessoas.exibirPessoas();
        System.out.println("\nOrdenar por altura");
        System.out.println(pessoas.ordenarPorAltura());
        System.out.println("\nOrdenar por idade");
        System.out.println(pessoas.ordernarPorIdade());

        // Set
        // Conjunto de Palavras Únicas
        System.out.println("\nConjunto de Palavras Únicas");
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();
        conjuntoPalavras.adicionarPalavra("bolacha");
        conjuntoPalavras.adicionarPalavra("melância");
        conjuntoPalavras.adicionarPalavra("café");
        conjuntoPalavras.adicionarPalavra("abacate");
        conjuntoPalavras.adicionarPalavra("abacate");
        conjuntoPalavras.exibirPalavrasUnicas();
        conjuntoPalavras.removerPalavra("bolacha");
        conjuntoPalavras.exibirPalavrasUnicas();
        System.out.println("melância: " + conjuntoPalavras.verificarPalavra("melância"));
        System.out.println("Total: " + conjuntoPalavras.contarPalavras());

        // Agenda de contatos
        System.out.println("\nAgenda de contatos");
        Agenda agendaContatos = new Agenda();

        // Adicionando contatos à agenda
        agendaContatos.adicionarContato("João", "123456789", 8);
        agendaContatos.adicionarContato("Maria", "987654321", 4);
        agendaContatos.adicionarContato("Maria Fernandes","55555555", 6);
        agendaContatos.adicionarContato("Ana","88889999", 1);
        agendaContatos.adicionarContato("Fernando","77778888", 9);
        agendaContatos.adicionarContato("Carolina","55555555", 5);

        // Exibindo os contatos no conjunto (deve estar vazio)
        agendaContatos.exibirContatos();
        System.out.println("Encontar Maria: " + agendaContatos.buscar("Maria"));

        System.out.println("Ordenados por nome: \n" + agendaContatos.exibirContatosPorNome());
        System.out.println("Ordenados por numero: \n" + agendaContatos.exibirContatosPorNumero());

        // Map - Dicionário
        System.out.println("\nMap - Dicionário");
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");
        dicionario.exibirPalavras();

        System.out.println("Java: " + dicionario.pesquisarPorPalavra("java"));
        dicionario.removerPalavra("java");
        dicionario.exibirPalavras();

        dicionario.adicionarPalavra("python", "Linguagem de programação de alto nível conhecida por sua simplicidade e legibilidade.");
        dicionario.adicionarPalavra("ruby", "Linguagem de programação interpretada e de script, conhecida por sua simplicidade e produtividade.");
        System.out.println("O dicionário possui " + dicionario.exibirContagemPalavras() + " palavras!");

        // Map - ordenação
        // Livraria
        System.out.println("\nLivraria");
        Livraria livraria = new Livraria();
        livraria.adicionarLivro("1", "O Senhor dos Anéis", "J.R.R. Tolkien", 12.54d);
        livraria.adicionarLivro("2", "Harry Potter e a Pedra Filosofal", "J.K. Rowling", 9.65d);
        livraria.adicionarLivro("3", "Cem Anos de Solidão", "Gabriel García Márquez", 35.89d);
        livraria.adicionarLivro("4", "1984", "George Orwell", 65.89d);
        livraria.adicionarLivro("5", "Dom Quixote", "Miguel de Cervantes", 31.87d);
        livraria.adicionarLivro("6", "Animais Fantásticos", "J.K. Rowling", 15.65d);
        
        livraria.exibirLivors();
        livraria.removerLivro("1984");

        livraria.exibirLivors();

        System.out.println("\nOrdenados por preço: ");
        System.out.println(livraria.exibirLivrosOrdenadosPorPreco());
        System.out.println("\nOrdenados por autor: ");
        System.out.println(livraria.exibirLivrosOrdenadosPorAutor());
        
        System.out.println("\nLivros de J.K. Rowling");
        System.out.println(livraria.pesquisarLivrosPorAutor("J.K. Rowling"));

        System.out.println("\nLivro mais barato: ");
        System.out.println(livraria.obterLivroMaisBarato());

        System.out.println("\nLivro mais caro: ");
        System.out.println(livraria.obterLivroMaisCaro());
    }
}
