package br.com.unifacol.listaEncadeada.repository;

import br.com.unifacol.listaEncadeada.entidades.Funcionario;
import br.com.unifacol.listaEncadeada.estrutura.ListaEncadeada;
import br.com.unifacol.listaEncadeada.estrutura.No;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepository {
    private ListaEncadeada<Funcionario> funcionarioLista = new ListaEncadeada<>();

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarioLista.adicionar(funcionario);
    }

    public void atualizarFuncionario(String cpf, Funcionario funcionarioAtualizado) {
        No<Funcionario> noAtual = funcionarioLista.getInicio();
        while (noAtual != null) {
            Funcionario funcionario = noAtual.getElemento();
            if (funcionario.getCpf().equals(cpf)) {
                funcionario.setNome(funcionarioAtualizado.getNome());
                funcionario.setCpf(funcionarioAtualizado.getCpf());
                funcionario.setEmail(funcionarioAtualizado.getEmail());
                funcionario.setTelefone(funcionarioAtualizado.getTelefone());
                funcionario.setSalario(funcionarioAtualizado.getSalario());
                break;
            }
            noAtual = noAtual.getProximo();
        }
    }

    public void removerFuncionario(String cpf) {
        funcionarioLista.remover(buscarFuncionario(cpf));
    }

    public Funcionario buscarFuncionario(String cpf) {
        No<Funcionario> noAtual = funcionarioLista.getInicio();
        while (noAtual != null) {
            Funcionario funcionario = noAtual.getElemento();
            if (funcionario.getCpf().equals(cpf)) {
                return funcionario;
            }
            noAtual = noAtual.getProximo();
        }
        return null;
    }

    public List<Funcionario> listarFuncionario() {
        List<Funcionario> funcionarioList = new ArrayList<>();
        No<Funcionario> noAtual = funcionarioLista.getInicio();
        while (noAtual != null) {
            funcionarioList.add(noAtual.getElemento());
            noAtual = noAtual.getProximo();
        }
        return funcionarioList;
    }
}
