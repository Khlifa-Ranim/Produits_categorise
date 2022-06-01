package com.ranim.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ranim.produits.entities.Categorie;
import com.ranim.produits.repos.CategorieRepository;

@Service
public class CategorieServicelmpl implements CategorieService {

	@Autowired
	private CategorieRepository CategorieRepository;

	@Override
	public List<Categorie> findAll() {
		return CategorieRepository.findAll();
	}

	@Override
	public Categorie saveCategorie(Categorie c) {
		return CategorieRepository.save(c);
	}

	@Override
	public Categorie updateCategorie(Categorie c) {
		return CategorieRepository.save(c);
	}

	@Override
	public void deleteCategorie(Categorie c) {
		CategorieRepository.delete(c);
	}

	@Override
	public void deleteCategorieById(Long idCat) {
		CategorieRepository.deleteById(idCat);
	}

	@Override
	public Categorie getCategorie(Long idCat) {
		return CategorieRepository.findById(idCat).get();
	}

	@Override
	public Page<Categorie> getAllCategoriesParPage(int page, int size) {
		return CategorieRepository.findAll(PageRequest.of(page, size)) ;	
		}

}