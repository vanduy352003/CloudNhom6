package hcmute.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import hcmute.entity.LoaiSanPhamEntity;
import hcmute.repository.LoaiSanPhamRepository;
import hcmute.service.ILoaiSanPhamService;

@Service
public class LoaiSanPhamServiceImpl implements ILoaiSanPhamService{
	@Autowired
	LoaiSanPhamRepository loaiSanPhamRepository;

	@Override
	public <S extends LoaiSanPhamEntity> S save(S entity) {
		return loaiSanPhamRepository.save(entity);
	}

	@Override
	public List<LoaiSanPhamEntity> findAll() {
		return loaiSanPhamRepository.findAll();
	}

	@Override
	public Page<LoaiSanPhamEntity> findAll(Pageable pageable) {
		return loaiSanPhamRepository.findAll(pageable);
	}

	@Override
	public Optional<LoaiSanPhamEntity> findById(String id) {
		return loaiSanPhamRepository.findById(id);
	}

	@Override
	public long count() {
		return loaiSanPhamRepository.count();
	}

	@Override
	public void deleteById(String id) {
		loaiSanPhamRepository.deleteById(id);
	}

	@Override
	public void delete(LoaiSanPhamEntity entity) {
		loaiSanPhamRepository.delete(entity);
	}
	
}
