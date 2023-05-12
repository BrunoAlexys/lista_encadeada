package br.com.unifacol.listaEncadeada.service;

import br.com.unifacol.listaEncadeada.entidades.Funcionario;
import br.com.unifacol.listaEncadeada.repository.FuncionarioRepository;

import javax.swing.*;

public class FuncionarioService {
    private FuncionarioRepository funcionarioRepository = new FuncionarioRepository();

    public void cadastrar() {
        String nome = JOptionPane.showInputDialog("Nome: ");
        String cpf = JOptionPane.showInputDialog("CPF: ");
        String email = JOptionPane.showInputDialog("Email: ");
        String telefone = JOptionPane.showInputDialog("Telefone: ");
        Double salario = Double.valueOf(JOptionPane.showInputDialog("Salrio: "));

        Funcionario funcionario = new Funcionario(nome, email, telefone, cpf, salario);

        funcionarioRepository.cadastrarFuncionario(funcionario);
    }

    public void alterar() {
        String cpfAtual = JOptionPane.showInputDialog("CPF atual: ");

        String nome = JOptionPane.showInputDialog("Nome: ");
        String cpf = JOptionPane.showInputDialog("CPF: ");
        String email = JOptionPane.showInputDialog("Email: ");
        String telefone = JOptionPane.showInputDialog("Telefone: ");
        Double salario = Double.valueOf(JOptionPane.showInputDialog("Salrio: "));

        Funcionario funcionario = new Funcionario(nome, email, telefone, cpf, salario);
        funcionarioRepository.atualizarFuncionario(cpfAtual, funcionario);
    }

    public void excluir() {
        String cpfAtual = JOptionPane.showInputDialog("CPF atual: ");
        funcionarioRepository.removerFuncionario(cpfAtual);
    }

    public void listar() {
        funcionarioRepository.listarFuncionario();
    }

    public void listarPorCPF() {
        String cpfAtual = JOptionPane.showInputDialog("CPF atual: ");
        funcionarioRepository.buscarFuncionario(cpfAtual);
    }
}
