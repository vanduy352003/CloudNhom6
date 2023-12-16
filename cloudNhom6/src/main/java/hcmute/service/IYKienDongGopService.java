package hcmute.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import hcmute.entity.YKienDongGopEntity;

public interface IYKienDongGopService {

	void delete(YKienDongGopEntity entity);

	void deleteById(String id);

	long count();

	Optional<YKienDongGopEntity> findById(String id);

	Page<YKienDongGopEntity> findAll(Pageable pageable);

	List<YKienDongGopEntity> findAll();

	<S extends YKienDongGopEntity> S save(S entity);

}
