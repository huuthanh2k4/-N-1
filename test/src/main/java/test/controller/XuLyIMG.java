package test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import test.DAO.GoiHam;
import test.entities.CauHinhSP;
import test.entities.DanhSachSP;
import test.entities.ImgSP;
@Controller
public class XuLyIMG {
	@Autowired
	private GoiHam goiHam;
	
	@RequestMapping(value = {"/","list"})
	public String listImg (Model model) {
	    List<ImgSP> imgSPs = goiHam.LayIMG();
	    model.addAttribute("imgSPs", imgSPs); // Thay "a" thành "imgSPs"
	    return "list"; 
	}
	
	@RequestMapping("/chitiet")
	public String chiTiet(@RequestParam("id")String id,Model model) {
		
	    
	    List<CauHinhSP> hinhSPs = goiHam.layCauHinh();
	    model.addAttribute("CH1", hinhSPs);

		return "chiTiet";
	}

	
}
