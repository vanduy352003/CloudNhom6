package hcmute.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import hcmute.entity.ThongTinMailKhuyenMaiEntity;

public interface IThongTinMailKhuyenMaiService {

	void delete(ThongTinMailKhuyenMaiEntity entity);

	void deleteById(String id);

	long count();

	Optional<ThongTinMailKhuyenMaiEntity> findById(String id);

	Page<ThongTinMailKhuyenMaiEntity> findAll(Pageable pageable);

	List<ThongTinMailKhuyenMaiEntity> findAll();

	<S extends ThongTinMailKhuyenMaiEntity> S save(S entity);

}
