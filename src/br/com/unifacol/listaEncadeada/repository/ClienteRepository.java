package br.com.unifacol.listaEncadeada.repository;

import br.com.unifacol.listaEncadeada.entidades.Cliente;
import br.com.unifacol.listaEncadeada.estrutura.ListaEncadeada;
import br.com.unifacol.listaEncadeada.estrutura.No;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    private ListaEncadeada<Cliente> listaClientes = new ListaEncadeada<>();

    public void cadastrarCliente(Cliente cliente) {
        listaClientes.adicionar(cliente);
    }

    public void atualizarCliente(String cpf, Cliente clienteAtualizado) {
        No<Cliente> noAtual = listaClientes.getInicio();
        while (noAtual != null) {
            Cliente cliente = noAtual.getElemento();
            if (cliente.getCpf().equals(cpf)) {
                cliente.setNome(clienteAtualizado.getNome());
                cliente.setCpf(clienteAtualizado.getCpf());
                cliente.setIdade(clienteAtualizado.getIdade());
                cliente.setEmail(clienteAtualizado.getEmail());
                cliente.setSenha(clienteAtualizado.getSenha());
                break;
            }
            noAtual = noAtual.getProximo();
        }
    }

    public void removerCliente(String cpf) {
        listaClientes.remover(buscarCliente(cpf));
    }

    public Cliente buscarCliente(String cpf) {
        No<Cliente> noAtual = listaClientes.getInicio();
        while (noAtual != null) {
            Cliente cliente = noAtual.getElemento();
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
            noAtual = noAtual.getProximo();
        }
        return null;
    }

    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        No<Cliente> noAtual = listaClientes.getInicio();
        while (noAtual != null) {
            clientes.add(noAtual.getElemento());
            noAtual = noAtual.getProximo();
        }
        return clientes;
    }
}
