package br.com.embraer.shipdocs.repository;

import br.com.embraer.shipdocs.model.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, String> {
}
