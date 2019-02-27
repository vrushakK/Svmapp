package com.svmapp.services;

import java.util.Collection;
import java.util.Map;
import com.svmapp.model.ApiResponse;
import com.svmapp.model.Entity;

public interface EntityService<T extends Entity> {

	public ApiResponse setState(String entityId,String state,Object value);
	public ApiResponse activate(String entityId);
	public ApiResponse deActivate(String entityId);
	public T insert(T entity);
	public T update(T entity);
	public ApiResponse delete(T entity);
	public ApiResponse delete(Collection<String> ids);
	public Collection<T> get(Map<String, String> query);
	public T get(String id);
}
