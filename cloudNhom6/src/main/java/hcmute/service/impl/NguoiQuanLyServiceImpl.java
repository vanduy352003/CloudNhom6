package hcmute.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import hcmute.entity.NguoiQuanLyEntity;
import hcmute.repository.NguoiQuanLyRepository;
import hcmute.service.INguoiQuanLyService;

@Service
public class NguoiQuanLyServiceImpl implements INguoiQuanLyService{
	@Autowired
	NguoiQuanLyRepository nguoiQuanLyRepository;

	@Override
	public <S extends NguoiQuanLyEntity> S save(S entity) {
		return nguoiQuanLyRepository.save(entity);
	}

	@Override
	public List<NguoiQuanLyEntity> findAll() {
		return nguoiQuanLyRepository.findAll();
	}

	@Override
	public Page<NguoiQuanLyEntity> findAll(Pageable pageable) {
		return nguoiQuanLyRepository.findAll(pageable);
	}

	@Override
	public Optional<NguoiQuanLyEntity> findById(String id) {
		return nguoiQuanLyRepository.findById(id);
	}

	@Override
	public long count() {
		return nguoiQuanLyRepository.count();
	}

	@Override
	public void deleteById(String id) {
		nguoiQuanLyRepository.deleteById(id);
	}

	@Override
	public void delete(NguoiQuanLyEntity entity) {
		nguoiQuanLyRepository.delete(entity);
	}
	
}
