package br.com.projetofinal.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.projetofinal.beans.Musica;

public interface MusicaDAO extends CrudRepository<Musica, Integer> {
	
	@Query(value= "SELECT COUNT(ID) AS TOTAL FROM tb_musica WHERE lancamento=1 AND ARTISTA_ID = :num", nativeQuery=true)
	public int findByTotalLancamento(@Param("num") int num);
	
	
	
	

}
