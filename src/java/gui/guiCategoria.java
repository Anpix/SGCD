package gui;

// @author Anpix

import dao.CategoriaFacade;
import java.util.List;
import model.Categoria;

public class guiCategoria {
    private Categoria categoria;
    private List<Categoria> categorias;
    private CategoriaFacade daoCategoria;

    public guiCategoria() {
    }
    
    
    
    public String iniciar(){
        reloadDB();
        categoria = new Categoria();
        return "frmCategoria";
    }
    
    public String gravar(){
        daoCategoria.create(categoria);
        reloadDB();
        return "frmCategoria";
    }
    
    public void salvar(){
        daoCategoria.edit(categoria);
        reloadDB();
    }
    
    public void criar(Categoria cat){
        daoCategoria.create(cat);
    }
    

    
    public String novo(){
        categoria = new Categoria();
        return "cadCategoria";
    }
    
    public String alterar(Categoria cat){
        categoria = cat;
        return "altCategoria";
    }
    
    public String excluir(Categoria cat){
        daoCategoria.remove(cat);
        reloadDB();
        return "frmCategoria";
    }
    
    private void reloadDB(){
        categorias = daoCategoria.findAll();
    }
}
