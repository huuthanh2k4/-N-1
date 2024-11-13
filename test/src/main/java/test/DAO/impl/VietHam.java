package test.DAO.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import test.DAO.GoiHam;
import test.entities.CauHinhSP;
import test.entities.Chip;
import test.entities.DanhSachSP;
import test.entities.ImgSP;
@Repository
public class VietHam implements GoiHam{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<ImgSP> LayIMG() {
		Session session = sessionFactory.openSession();
		try {
			List list = session.createQuery("from ImgSP").list();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

	@Override
	public ImgSP ChiTiet(String id) {
		Session session = sessionFactory.openSession();
		try {
			ImgSP imgSP = session.get(ImgSP.class, id);
			return imgSP;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

	@Override
	public List<CauHinhSP> layCauHinh() {
		Session session = sessionFactory.openSession();
		try {
			List list = session.createQuery("from CauHinhSP").list();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

	@Override
	public DanhSachSP chiTietDS(String idSP) {
		Session session = sessionFactory.openSession();
	    try {
	        DanhSachSP danhSachSP = session.get(DanhSachSP.class, idSP);
	        return danhSachSP;
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        session.close();
	    }
	    return null;
	}

	@Override
	public List<CauHinhSP> layCauHinhSPTheoIdSP(String idSP) {
	    Session session = sessionFactory.openSession();
	    try {
	        String hql = "FROM CauHinhSP WHERE idSP = :idSP";
	        Query<CauHinhSP> query = session.createQuery(hql, CauHinhSP.class);
	        query.setParameter("idSP", idSP);
	        return query.getResultList(); 
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        session.close();
	    }
	    return null;
	}

	@Override
	public List<Chip> chips() {
		Session session = sessionFactory.openSession();
		try {
			List list = session.createQuery("from Chip").list();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}
	

}
