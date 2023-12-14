package fr.eni.Appli.Enchere.dal;

import java.util.List;

import fr.eni.Appli.Enchere.bll.bo.ArticleVendu;

public interface ArticleDAO {

	public void insert(ArticleVendu article) throws BusinessException;
	
	public void deleteById(ArticleVendu article);
	
	public List<ArticleVendu> findAll();
	
	public void modifierArticle(ArticleVendu article);
	

}
