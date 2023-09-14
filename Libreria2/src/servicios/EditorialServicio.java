/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import DAO.EditorialJpaController;
import entidades.Editorial;

/**
 *
 * @author Joaquin
 */
public class EditorialServicio {
    private EditorialJpaController DAO;

    public EditorialServicio() {
        DAO = new EditorialJpaController();
    }
    
    public Editorial crearEditorial(Editorial editorial){
        DAO.create(editorial);
        return editorial;
        
    }
}
