package hcmute.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import hcmute.entity.ThongTinMailKhuyenMaiEntity;
import hcmute.repository.ThongTinMailKhuyenMaiRepository;
import hcmute.service.IThongTinMailKhuyenMaiService;

@Service
public class ThongTinMailKhuyenMaiServiceImpl implements IThongTinMailKhuyenMaiService {
	@Autowired
	ThongTinMailKhuyenMaiRepository thongTinMailRepository;

	@Override
	public <S extends ThongTinMailKhuyenMaiEntity> S save(S entity) {
		return thongTinMailRepository.save(entity);
	}

	@Override
	public List<ThongTinMailKhuyenMaiEntity> findAll() {
		return thongTinMailRepository.findAll();
	}

	@Override
	public Page<ThongTinMailKhuyenMaiEntity> findAll(Pageable pageable) {
		return thongTinMailRepository.findAll(pageable);
	}

	@Override
	public Optional<ThongTinMailKhuyenMaiEntity> findById(String id) {
		return thongTinMailRepository.findById(id);
	}

	@Override
	public long count() {
		return thongTinMailRepository.count();
	}

	@Override
	public void deleteById(String id) {
		thongTinMailRepository.deleteById(id);
	}

	@Override
	public void delete(ThongTinMailKhuyenMaiEntity entity) {
		thongTinMailRepository.delete(entity);
	}
	
}
