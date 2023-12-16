package hcmute.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import hcmute.entity.SanPhamEntity;

public interface ISanPhamService {

	void delete(SanPhamEntity entity);

	void deleteById(String id);

	long count();

	Optional<SanPhamEntity> findById(String id);

	Page<SanPhamEntity> findAll(Pageable pageable);

	List<SanPhamEntity> findAll();

	<S extends SanPhamEntity> S save(S entity);

}
