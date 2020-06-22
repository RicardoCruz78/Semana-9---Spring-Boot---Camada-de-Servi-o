package br.com.ricardo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ricardo.model.Veiculo;

@Repository
public interface VeiculosRepository extends JpaRepository <Veiculo, Long> {
}
