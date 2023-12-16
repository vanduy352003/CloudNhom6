package hcmute.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import hcmute.entity.KhachHangEntity;
import hcmute.repository.KhachHangRepository;
import hcmute.service.IKhachHangService;

@Service
public class KhachHangServiceImpl implements IKhachHangService {
	@Autowired
	KhachHangRepository khachHangRepository;

	@Override
	public <S extends KhachHangEntity> S save(S entity) {
		return khachHangRepository.save(entity);
	}

	@Override
	public List<KhachHangEntity> findAll() {
		return khachHangRepository.findAll();
	}

	@Override
	public Page<KhachHangEntity> findAll(Pageable pageable) {
		return khachHangRepository.findAll(pageable);
	}

	@Override
	public Optional<KhachHangEntity> findById(String id) {
		return khachHangRepository.findById(id);
	}

	@Override
	public long count() {
		return khachHangRepository.count();
	}

	@Override
	public void deleteById(String id) {
		khachHangRepository.deleteById(id);
	}

	@Override
	public void delete(KhachHangEntity entity) {
		khachHangRepository.delete(entity);
	}
	
}
