package hcmute.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import hcmute.entity.SanPhamEntity;
import hcmute.repository.LoaiSanPhamRepository;
import hcmute.repository.SanPhamRepository;
import hcmute.service.ISanPhamService;

@Service
public class SanPhamServiceImpl implements ISanPhamService{
	@Autowired
	SanPhamRepository sanPhamRepository;

	@Override
	public <S extends SanPhamEntity> S save(S entity) {
		return sanPhamRepository.save(entity);
	}

	@Override
	public List<SanPhamEntity> findAll() {
		return sanPhamRepository.findAll();
	}

	@Override
	public Page<SanPhamEntity> findAll(Pageable pageable) {
		return sanPhamRepository.findAll(pageable);
	}

	@Override
	public Optional<SanPhamEntity> findById(String id) {
		return sanPhamRepository.findById(id);
	}

	@Override
	public long count() {
		return sanPhamRepository.count();
	}

	@Override
	public void deleteById(String id) {
		sanPhamRepository.deleteById(id);
	}

	@Override
	public void delete(SanPhamEntity entity) {
		sanPhamRepository.delete(entity);
	}
	
}
