package hcmute.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import hcmute.entity.ChiTietDonHangEntity;
import hcmute.repository.ChiTietDonHangRepository;
import hcmute.service.IChiTietDonHangService;

@Service
public class ChiTietDonHangServiceImpl implements IChiTietDonHangService{
	@Autowired
	ChiTietDonHangRepository chiTietDonHangRepository;

	@Override
	public List<ChiTietDonHangEntity> findAll() {
		return chiTietDonHangRepository.findAll();
	}

	@Override
	public Page<ChiTietDonHangEntity> findAll(Pageable pageable) {
		return chiTietDonHangRepository.findAll(pageable);
	}

	@Override
	public Optional<ChiTietDonHangEntity> findById(String id) {
		return chiTietDonHangRepository.findById(id);
	}

	@Override
	public long count() {
		return chiTietDonHangRepository.count();
	}

	@Override
	public void deleteById(String id) {
		chiTietDonHangRepository.deleteById(id);
	}

	@Override
	public void delete(ChiTietDonHangEntity entity) {
		chiTietDonHangRepository.delete(entity);
	}

	@Override
	public <S extends ChiTietDonHangEntity> S save(S entity) {
		return chiTietDonHangRepository.save(entity);
	}
	
	
}
