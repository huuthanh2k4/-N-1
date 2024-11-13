package test.DAO;

import java.util.List;

import test.entities.CauHinhSP;
import test.entities.Chip;
import test.entities.DanhSachSP;
import test.entities.ImgSP;

public interface GoiHam {
	public List<ImgSP> LayIMG();
	public ImgSP ChiTiet(String id);
	public DanhSachSP chiTietDS(String id);
	public List<CauHinhSP> layCauHinh();
	public List<CauHinhSP> layCauHinhSPTheoIdSP(String idSP);
	public List<Chip> chips();
}
