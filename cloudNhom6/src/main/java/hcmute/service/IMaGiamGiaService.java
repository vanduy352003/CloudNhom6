package hcmute.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import hcmute.entity.MaGiamGiaEntity;

public interface IMaGiamGiaService {

	void delete(MaGiamGiaEntity entity);

	void deleteById(String id);

	long count();

	Optional<MaGiamGiaEntity> findById(String id);

	Page<MaGiamGiaEntity> findAll(Pageable pageable);

	List<MaGiamGiaEntity> findAll();

	<S extends MaGiamGiaEntity> S save(S entity);

}
