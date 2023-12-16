package hcmute.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import hcmute.entity.LoaiSanPhamEntity;

public interface ILoaiSanPhamService {

	void delete(LoaiSanPhamEntity entity);

	void deleteById(String id);

	long count();

	Optional<LoaiSanPhamEntity> findById(String id);

	Page<LoaiSanPhamEntity> findAll(Pageable pageable);

	List<LoaiSanPhamEntity> findAll();

	<S extends LoaiSanPhamEntity> S save(S entity);

}
