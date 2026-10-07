package br.com.senai.patrimonio.service;

import java.util.List;

public interface CrudeService<T, ID> {
    T salvar(T entidade);

    T BuscarPorId (ID id);

    List<T> ListarTodos();

    T atualizar(ID id,T entidade);

    void excluir(ID id);

}
