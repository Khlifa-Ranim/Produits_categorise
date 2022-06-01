package com.ranim.produits.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.ranim.produits.entities.Categorie;

public interface CategorieService {
	List<Categorie> findAll();

	Categorie saveCategorie(Categorie c);

	Categorie updateCategorie(Categorie c);

	void deleteCategorie(Categorie c);

	void deleteCategorieById(Long id);

	Categorie getCategorie(Long idCat);

	Page<Categorie> getAllCategoriesParPage(int page, int size);
}
