package com.svmapp.repo;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;
import org.sql2o.Query;

import com.svmapp.model.ApiResponse;
import com.svmapp.model.Japaflow;
import com.svmapp.model.ResponseModel;
import com.svmapp.services.JapaService;

@Repository
@Service
@Transactional
public class JapaServiceImpl extends EntityServiceImpl<Japaflow> implements JapaService {

	@Override
	public ResponseModel insertJapadetails(Japaflow japadetails) {
		// TODO Auto-generated method stub
		System.out.println(japadetails.getBooklet_language() + "-" + japadetails.getBooklet_id() + " Booklet");
		String sql = "INSERT INTO japa_count (booklet_language, booklet_id, count, date) VALUES"
				+ "(:booklet_language, :booklet_id, :count, :date)";
		try (Connection con = sql2o.open()) {
			Japaflow japaflow = getJapaDetails(japadetails.getDate(), japadetails.getBooklet_language(), japadetails.getBooklet_id());
			if(japaflow != null) {
				return new ResponseModel(ResponseModel.ERROR_JAPA_EXISTS_FOR_DATE, "You have already made an entry"
						+ "for the date. The count is " + japaflow.getCount());
			}
			
			Query query = con.createQuery(sql).addParameter("booklet_language", japadetails.getBooklet_language())
					.addParameter("booklet_id", japadetails.getBooklet_id())
					.addParameter("count", japadetails.getCount()).addParameter("date", japadetails.getDate());
			query.addToBatch();
			query.executeBatch();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseModel(200, "Your japa details for the day has been successfully added. Thank you");
	}

	@Override
	public Japaflow updateJapadetails(Japaflow japadetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Japaflow getJapaDetails(Date date, String booklet_language, String booklet_id) {
		Japaflow flow = null;
		String sql = "SELECT * FROM japa_count WHERE booklet_language = :booklet_language AND "
				+ "booklet_id = :booklet_id AND date = :date";
		String dateString = date.toString();
		System.out.println("dateSTring "+dateString);
		try (Connection con = sql2o.open()) {
			List<Japaflow> flows = con.createQuery(sql).addParameter("booklet_language", booklet_language)
					.addParameter("booklet_id", booklet_id)
					.addParameter("date", date).executeAndFetch(Japaflow.class);
			if(flows !=null && flows.size()!=0)
				flow = flows.get(0);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flow;
	}

	@Override
	public ApiResponse deleteJapadetails(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Japaflow> getJapaDetails(String booklet_language, String booklet_id) {
		List<Japaflow> flows = null;
		String sql = "SELECT * FROM japa_count WHERE booklet_language = :booklet_language AND "
				+ "booklet_id = :booklet_id ORDER BY date DESC";
		try (Connection con = sql2o.open()) {
			flows = con.createQuery(sql).addParameter("booklet_language", booklet_language)
					.addParameter("booklet_id", booklet_id).executeAndFetch(Japaflow.class);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flows;
	}

	@Override
	public int getCount(String booklet_language, String booklet_id) {
		Integer count = 0;
		String sql = "SELECT SUM(count) FROM japa_count WHERE booklet_language= :booklet_language"
				+ " AND booklet_id= :booklet_id;";
		try (Connection con = sql2o.open()) {
			count = con.createQuery(sql).addParameter("booklet_language", booklet_language)
					.addParameter("booklet_id", booklet_id).executeScalar(Integer.class);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
}