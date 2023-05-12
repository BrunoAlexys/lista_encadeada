package br.com.unifacol.listaEncadeada.menu;

import br.com.unifacol.listaEncadeada.service.ClienteService;
import br.com.unifacol.listaEncadeada.service.FuncionarioService;
import javax.swing.*;

public class Main {
    private static ClienteService clienteService = new ClienteService();
    private static FuncionarioService funcionarioService = new FuncionarioService();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Integer menu =
                Integer.parseInt(JOptionPane.showInputDialog("\n------- Gerenciador -------" +
                        "\n|Opção 1 - Cadastrar Funcionario |" +
                        "\n|Opção 2 - Alterar Funcionario |" +
                        "\n|Opção 3 - Excluir Funcionario |" +
                        "\n|Opção 4 - Listar Funcionario |" +
                        "\n|Opção 5 - Cadastrar Cliente |" +
                        "\n|Opção 6 - Alterar Cliente |" +
                        "\n|Opção 7 - Excluir Cliente |" +
                        "\n|Opção 8 - Listar Cliente |" +
                        "\n|Opção 9 - Listar por CPF |" +
                        "\n Opção 0 - Sair "));

        switch (menu){
            case 1:
                funcionarioService.cadastrar();
                menu();
            case 2:
                funcionarioService.alterar();
                menu();
            case 3:
                funcionarioService.excluir();
                menu();
            case 4:
                funcionarioService.listar();
                menu();
            case 5:
                clienteService.cadastrar();
                menu();
            case 6:
                clienteService.alterar();
                menu();
            case 7:
                clienteService.excluir();
                menu();
            case 8:
                clienteService.listar();
                menu();
            case 9:
                clienteService.listarPorCPF();
                menu();
            case 10:
                System.exit(0);
        }
    }
}