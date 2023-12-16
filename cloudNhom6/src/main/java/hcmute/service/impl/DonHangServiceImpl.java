package hcmute.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import hcmute.entity.DonHangEntity;
import hcmute.repository.DonHangRepository;
import hcmute.service.IDonHangService;

@Service
public class DonHangServiceImpl implements IDonHangService{

	@Autowired
	DonHangRepository donHangRepository;

	@Override
	public <S extends DonHangEntity> S save(S entity) {
		return donHangRepository.save(entity);
	}

	@Override
	public List<DonHangEntity> findAll() {
		return donHangRepository.findAll();
	}

	@Override
	public Page<DonHangEntity> findAll(Pageable pageable) {
		return donHangRepository.findAll(pageable);
	}

	@Override
	public Optional<DonHangEntity> findById(String id) {
		return donHangRepository.findById(id);
	}

	@Override
	public long count() {
		return donHangRepository.count();
	}

	@Override
	public void deleteById(String id) {
		donHangRepository.deleteById(id);
	}

	@Override
	public void delete(DonHangEntity entity) {
		donHangRepository.delete(entity);
	}
	
	
}
