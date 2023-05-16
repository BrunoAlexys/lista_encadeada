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
                Integer.parseInt(JOptionPane.showInputDialog(new StringBuilder().append("\n------- Gerenciador -------").append("\n|Opção 1 - Cadastrar Funcionario |").append("\n|Opção 2 - Alterar Funcionario |").append("\n|Opção 3 - Excluir Funcionario |").append("\n|Opção 4 - Listar Funcionario |").append("\nOpção 5 - listar funcionario por CPF").append("\n|Opção 6 - Cadastrar Cliente |").append("\n|Opção 7 - Alterar Cliente |").append("\n|Opção 8 - Excluir Cliente |").append("\n|Opção 9 - Listar Cliente |").append("\n|Opção 10 - Listar cliente por CPF |").append("\n Opção 0 - Sair ").toString()));

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
                funcionarioService.listarPorCPF();
                menu();
            case 6:
                clienteService.cadastrar();
                menu();
            case 7:
                clienteService.alterar();
                menu();
            case 8:
                clienteService.excluir();
                menu();
            case 9:
                clienteService.listar();
                menu();
            case 10:
                clienteService.listarPorCPF();
                menu();
            case 11:
                System.exit(0);
                JOptionPane.showMessageDialog(null,"Volte sempre!");
        }
    }
}