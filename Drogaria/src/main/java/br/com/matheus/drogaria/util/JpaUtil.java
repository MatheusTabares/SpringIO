package br.com.matheus.drogaria.util;

public class JpaUtil {
	private static final String PERSISTENCE_UNIT = "JPA_EFICAZ_HIBERNATE";
	
	private static ThreadLocal<EntityManager> threadEntityManager = new ThreadLocal<EntityManager>();
}
