package hcmute.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import hcmute.entity.NguoiQuanLyEntity;

public interface INguoiQuanLyService {

	void delete(NguoiQuanLyEntity entity);

	void deleteById(String id);

	long count();

	Optional<NguoiQuanLyEntity> findById(String id);

	Page<NguoiQuanLyEntity> findAll(Pageable pageable);

	List<NguoiQuanLyEntity> findAll();

	<S extends NguoiQuanLyEntity> S save(S entity);

}
