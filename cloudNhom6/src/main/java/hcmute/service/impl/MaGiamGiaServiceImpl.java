package hcmute.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import hcmute.entity.MaGiamGiaEntity;
import hcmute.repository.MaGiamGiaRepository;
import hcmute.service.IMaGiamGiaService;

@Service
public class MaGiamGiaServiceImpl implements IMaGiamGiaService {
	@Autowired
	MaGiamGiaRepository maGiamGiaRepository;

	@Override
	public <S extends MaGiamGiaEntity> S save(S entity) {
		return maGiamGiaRepository.save(entity);
	}

	@Override
	public List<MaGiamGiaEntity> findAll() {
		return maGiamGiaRepository.findAll();
	}

	@Override
	public Page<MaGiamGiaEntity> findAll(Pageable pageable) {
		return maGiamGiaRepository.findAll(pageable);
	}

	@Override
	public Optional<MaGiamGiaEntity> findById(String id) {
		return maGiamGiaRepository.findById(id);
	}

	@Override
	public long count() {
		return maGiamGiaRepository.count();
	}

	@Override
	public void deleteById(String id) {
		maGiamGiaRepository.deleteById(id);
	}

	@Override
	public void delete(MaGiamGiaEntity entity) {
		maGiamGiaRepository.delete(entity);
	}
	
}
