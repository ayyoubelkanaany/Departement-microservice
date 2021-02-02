package com.projet.gestionBudget.model.ws.provided.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.projet.gestionBudget.bean.Departement;
import com.projet.gestionBudget.model.ws.provided.vo.DepartementVo;

@Component
public class DepartementConverter {

	public DepartementVo toVo(Departement bean) {
		DepartementVo vo = null;
		if(bean!=null) {
			vo = new DepartementVo();
			if(bean.getRefDepartement()!=null) {
				vo.setRefDepartement(bean.getRefDepartement());
			}
			if(bean.getLibelle() != null) {
				vo.setLibelle(bean.getLibelle());
			}
			if(bean.getId() != null) {
				vo.setId(bean.getId());
			}
		}
		
		return vo;
	}
	
	public Departement toBean(DepartementVo vo) {
		Departement bean = null;
		if(vo!=null) {
			bean = new Departement();
			if(vo.getRefDepartement()!=null) {
				bean.setRefDepartement(vo.getRefDepartement());
			}
			if(vo.getLibelle() != null) {
				bean.setLibelle(vo.getLibelle());
			}
			if(vo.getId() != null) {
				bean.setId(vo.getId());
			}
		}
	
		return bean;
	}
	
	public List<DepartementVo> toVos(List<Departement> beans){
		List<DepartementVo> vos = null;
		if(beans!=null && !beans.isEmpty()) {
			vos = new ArrayList<>();
			for(int i=0;i< beans.size();i++) {
				vos.add(toVo(beans.get(i)));
			}
		}
		
		return vos;
	}
	public List<Departement> toBeans(List<DepartementVo> vos){
		List<Departement> beans = null;
		if(vos!=null && !vos.isEmpty()) {
			 beans = new ArrayList<>();
			for(int i=0;i< vos.size();i++) {
				beans.add(toBean(vos.get(i)));
			}
		}
		
		return beans;
	}
}
