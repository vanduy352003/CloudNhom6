package hcmute.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import hcmute.entity.ChiTietDonHangEntity;

public interface IChiTietDonHangService {

	void delete(ChiTietDonHangEntity entity);

	void deleteById(String id);

	long count();

	Optional<ChiTietDonHangEntity> findById(String id);

	Page<ChiTietDonHangEntity> findAll(Pageable pageable);

	List<ChiTietDonHangEntity> findAll();

	<S extends ChiTietDonHangEntity> S save(S entity);

}
