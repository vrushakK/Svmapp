package com.svmapp.repo;
 
    import java.util.Collection;
	import java.util.Map;

	import org.sql2o.Sql2o;

	import com.svmapp.model.ApiResponse;
	import com.svmapp.model.Entity;
	import com.svmapp.services.EntityService;

	public class EntityServiceImpl<T extends Entity> implements EntityService<T> {

//		protected Sql2o sql2o = new Sql2o("jdbc:mysql://localhost:3306/krishna_mantra", "root", "rootadmin");
		protected Sql2o sql2o = new Sql2o("jdbc:mysql://us-cdbr-iron-east-03.cleardb.net/heroku_0383875f447e33b?reconnect=true", 
				"bcb0601c221b2d", "6a3dfa5e");

		@Override
		public ApiResponse setState(String entityId, String state, Object value) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ApiResponse activate(String entityId) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ApiResponse deActivate(String entityId) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public T insert(T entity) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public T update(T entity) {
			// TODO Auto-generated method stub
			return null;
		}
		public ApiResponse delete(Collection<String> ids) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public T get(String id) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ApiResponse delete(T entity) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Collection<T> get(Map<String, String> query) {
			// TODO Auto-generated method stub
			return null;
		}
}
