package hcmute.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import hcmute.entity.KhachHangEntity;

public interface IKhachHangService {

	void delete(KhachHangEntity entity);

	void deleteById(String id);

	long count();

	Optional<KhachHangEntity> findById(String id);

	Page<KhachHangEntity> findAll(Pageable pageable);

	List<KhachHangEntity> findAll();

	<S extends KhachHangEntity> S save(S entity);

}
