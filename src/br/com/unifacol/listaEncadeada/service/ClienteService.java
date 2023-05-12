package br.com.unifacol.listaEncadeada.service;

import br.com.unifacol.listaEncadeada.entidades.Cliente;
import br.com.unifacol.listaEncadeada.repository.ClienteRepository;

import javax.swing.*;

public class ClienteService {
    private ClienteRepository clienteRepository = new ClienteRepository();

    public void cadastrar() {
        String nome = JOptionPane.showInputDialog("Nome: ");
        String cpf = JOptionPane.showInputDialog("CPF: ");
        Integer idade = Integer.valueOf(JOptionPane.showInputDialog("Idade: "));
        String email = JOptionPane.showInputDialog("Email: ");
        Integer senha = Integer.valueOf(JOptionPane.showInputDialog("Senha: "));

        Cliente cliente = new Cliente(nome, cpf, idade, email, senha);
        clienteRepository.cadastrarCliente(cliente);
        System.out.println(clienteRepository.listarClientes());
    }

    public void alterar() {
        String cpfAtual = JOptionPane.showInputDialog("CPF atual: ");

        String nome = JOptionPane.showInputDialog("Nome: ");
        String cpf = JOptionPane.showInputDialog("CPF: ");
        Integer idade = Integer.valueOf(JOptionPane.showInputDialog("Idade: "));
        String email = JOptionPane.showInputDialog("Email: ");
        Integer senha = Integer.valueOf(JOptionPane.showInputDialog("Senha: "));

        Cliente cliente = new Cliente(nome, cpf, idade, email, senha);
        clienteRepository.atualizarCliente(cpfAtual, cliente);
    }

    public void excluir() {
        String cpfAtual = JOptionPane.showInputDialog("CPF atual: ");
        clienteRepository.removerCliente(cpfAtual);
    }

    public void listar() {
        clienteRepository.listarClientes();
    }

    public void listarPorCPF() {
        String cpfAtual = JOptionPane.showInputDialog("CPF atual: ");
        clienteRepository.buscarCliente(cpfAtual);
    }
}
