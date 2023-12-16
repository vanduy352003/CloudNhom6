package hcmute.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import hcmute.entity.DonHangEntity;

public interface IDonHangService {

	void delete(DonHangEntity entity);

	long count();

	Optional<DonHangEntity> findById(String id);

	Page<DonHangEntity> findAll(Pageable pageable);

	List<DonHangEntity> findAll();

	<S extends DonHangEntity> S save(S entity);

	void deleteById(String id);

}
