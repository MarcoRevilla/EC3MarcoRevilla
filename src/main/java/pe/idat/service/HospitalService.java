package pe.idat.service;

import java.util.List;

import pe.idat.model.Hospital;

public interface HospitalService {
	void guardar(Hospital hospital);
	void actualizar(Hospital hospital);
	void eliminar(Integer id);
	List<Hospital> listar();
	Hospital obtener(Integer id);
}
