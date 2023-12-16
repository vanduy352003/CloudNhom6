package hcmute.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import hcmute.entity.YKienDongGopEntity;
import hcmute.repository.YKienDongGopRepository;
import hcmute.service.IYKienDongGopService;

@Service
public class YKienDongGopServiceImpl implements IYKienDongGopService{
	@Autowired
	YKienDongGopRepository yKienDongGopRepository;

	@Override
	public <S extends YKienDongGopEntity> S save(S entity) {
		return yKienDongGopRepository.save(entity);
	}

	@Override
	public List<YKienDongGopEntity> findAll() {
		return yKienDongGopRepository.findAll();
	}

	@Override
	public Page<YKienDongGopEntity> findAll(Pageable pageable) {
		return yKienDongGopRepository.findAll(pageable);
	}

	@Override
	public Optional<YKienDongGopEntity> findById(String id) {
		return yKienDongGopRepository.findById(id);
	}

	@Override
	public long count() {
		return yKienDongGopRepository.count();
	}

	@Override
	public void deleteById(String id) {
		yKienDongGopRepository.deleteById(id);
	}

	@Override
	public void delete(YKienDongGopEntity entity) {
		yKienDongGopRepository.delete(entity);
	}
	
}
