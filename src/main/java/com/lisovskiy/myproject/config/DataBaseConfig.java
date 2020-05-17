//package com.lisovskiy.myproject.config;
//
//import org.hibernate.jpa.HibernatePersistenceProvider;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//import java.util.Properties;
//
//@Configuration
//@EnableTransactionManagement
//@ComponentScan("com.lisovskiy.myproject")
//@EnableJpaRepositories("com.lisovskiy.myproject.repository")
//public class DataBaseConfig {
//
//    private static final String PROPERTY_NAME_DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
//    private static final String PROPERTY_NAME_DATABASE_URL = "jdbc:mysql://localhost:3306/films_db";
//    private static final String PROPERTY_NAME_DATABASE_USERNAME = "root";
//    private static final String PROPERTY_NAME_DATABASE_PASSWORD = "1111";
//
//    private static final String PROPERTY_NAME_HIBERNATE_DIALECT = "org.hibernate.dialect.MySQL8Dialect";
//    private static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "true";
//    private static final String PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN = "com.lisovskiy.myproject.entity";
//    private static final String PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO = "update";
//
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//
//        dataSource.setDriverClassName(PROPERTY_NAME_DATABASE_DRIVER);
//        dataSource.setUrl(PROPERTY_NAME_DATABASE_URL);
//        dataSource.setUsername(PROPERTY_NAME_DATABASE_USERNAME);
//        dataSource.setPassword(PROPERTY_NAME_DATABASE_PASSWORD);
//
//        return dataSource;
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//        entityManagerFactoryBean.setDataSource(dataSource());
//        entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
//        entityManagerFactoryBean.setPackagesToScan(PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN);
//
//        entityManagerFactoryBean.setJpaProperties(getHibernateProperties());
//
//        return entityManagerFactoryBean;
//    }
//
//    @Bean
//    public JpaTransactionManager transactionManager() {
//        JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
//
//        return transactionManager;
//    }
//
//    private Properties getHibernateProperties() {
//        Properties properties = new Properties();
//        properties.put("hibernate.dialect", PROPERTY_NAME_HIBERNATE_DIALECT);
//        properties.put("hibernate.show.sql", PROPERTY_NAME_HIBERNATE_SHOW_SQL);
//        properties.put("hibernate.hb2ddl.auto", PROPERTY_NAME_HIBERNATE_HBM2DDL_AUTO);
//
//        return properties;
//    }
//
//}
